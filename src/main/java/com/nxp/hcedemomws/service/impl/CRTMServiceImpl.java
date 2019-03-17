package com.nxp.hcedemomws.service.impl;

import org.apache.http.entity.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.nxp.hcedemomws.dto.InitPurchaseOrderRequest;
import com.nxp.hcedemomws.dto.InitPurchaseOrderResponse;
import com.nxp.hcedemomws.rest.ConfigBean;
import com.nxp.hcedemomws.service.CRTMService;
import com.nxp.hcedemomws.util.Utils;
import com.nxp.hcedemomws.util.JsonUtil;

@Service("crtmService")
public class CRTMServiceImpl implements CRTMService {

  private static final String CONTENT_TYPE = "Content-Type";

  public static Logger logger = LoggerFactory.getLogger(CRTMServiceImpl.class);

  @Autowired
  Utils utils;

  @Autowired
  public ConfigBean configBean;

  @Override
  public InitPurchaseOrderResponse processInitPurchaseOrder(InitPurchaseOrderRequest initPurchaseOrderRequest) throws Exception {
    InitPurchaseOrderResponse initPurchaseOrderResponse = new InitPurchaseOrderResponse();;
    logger.info("Entering :: CRTMServiceImpl :: processInitPurchaseOrder method");
    try {
      RestTemplate restTemplate = utils.buildRestTemplateFactory(true);
      MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
      headers.add(CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
      
      logger.info("#Seglan InitPurchaseOrder API URL >>>>>>>: " + configBean.getCrtmInitPurchaseOrderUrl());
      logger.info("#InitPurchaseOrder API Request Body:" + JsonUtil.toJSON(initPurchaseOrderRequest));      
      HttpEntity<String> entity = new HttpEntity<>(JsonUtil.toJSON(initPurchaseOrderRequest), headers);
      logger.info("################## Calling Seglan InitPurchaseOrder API ############################");
      ResponseEntity<InitPurchaseOrderResponse> response = restTemplate.postForEntity(configBean.getCrtmInitPurchaseOrderUrl(), entity, InitPurchaseOrderResponse.class);
      logger.info("################## End of Seglan InitPurchaseOrder API ############################");
      if (response.getStatusCode().is2xxSuccessful()) {
        initPurchaseOrderResponse = response.getBody();
        if(response.getBody().getResponseCode().equals("00")){
          logger.info("#Got Success Response from Seglan service for InitPurchaseOrder API");
          logger.info("#InitPurchaseOrder API Response:" + JsonUtil.toJSON(initPurchaseOrderResponse));
        }else{
          logger.info("#Got Failure Response from Seglan service for InitPurchaseOrder API");
          logger.info("#InitPurchaseOrder API Response:" + JsonUtil.toJSON(initPurchaseOrderResponse));
        }
      }else{
        logger.info("#Got Failure Http status code from seglan service");
        initPurchaseOrderResponse.setResponseCode("9002");
        initPurchaseOrderResponse.setResponseMsg("Received Failure Http Status code");
      }
    } catch (Exception e) {
      logger.error("#Error occured while processing InitPurchaseOrder API", e);
      initPurchaseOrderResponse.setResponseCode("9001");
      initPurchaseOrderResponse.setResponseMsg("Unable to process your request");
    }
    logger.info("Exiting :: CRTMServiceImpl :: processInitPurchaseOrder method");
    return initPurchaseOrderResponse;
  }

}
