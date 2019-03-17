package com.nxp.hcedemomws.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.nxp.hcedemomws.dto.InitPurchaseOrderRequest;
import com.nxp.hcedemomws.dto.InitPurchaseOrderResponse;
import com.nxp.hcedemomws.rest.ConfigBean;
import com.nxp.hcedemomws.util.Utils;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource("classpath:application.properties")
public class CRTMServiceImplTest {

  @MockBean
  Utils utils;

  @Autowired
  CRTMServiceImpl crtmServiceImpl;

  @MockBean
  RestTemplate restTemplate;

  @Autowired
  ConfigBean configBean;
  
  InitPurchaseOrderRequest initPurchaseOrderRequest = new InitPurchaseOrderRequest();
  
  @Before
  public void setUp(){
    initPurchaseOrderRequest.setDeviceId("1234");
    initPurchaseOrderRequest.setGoogleAccountId("test@gmail.com");
    initPurchaseOrderRequest.setProduct("testProduct");
  }

  @Test
  public void testProcessInitPurchaseOrderWithSuccess() throws Exception {
    Mockito.when(utils.buildRestTemplateFactory(true)).thenReturn(restTemplate);
    InitPurchaseOrderResponse response = new InitPurchaseOrderResponse();
    response.setResponseCode("00");
    response.setM2gReference("Test-12345");
    ResponseEntity<InitPurchaseOrderResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    Mockito.when(restTemplate.postForEntity(Mockito.anyString(), Mockito.anyObject(),
      Mockito.any(Class.class))).thenReturn(responseEntity);
    InitPurchaseOrderResponse initPurchaseOrderResponse = crtmServiceImpl.processInitPurchaseOrder(initPurchaseOrderRequest);
    Assert.assertNotNull(initPurchaseOrderResponse);
    Assert.assertEquals("ResponseCode doesn't match", "00", initPurchaseOrderResponse.getResponseCode());
  }

  @Test
  public void testProcessInitPurchaseOrderWithServiceNotAvailable() throws Exception {
    Mockito.when(utils.buildRestTemplateFactory(true)).thenReturn(restTemplate);
    InitPurchaseOrderResponse response = new InitPurchaseOrderResponse();
    response.setResponseCode("99");
    response.setResponseMsg("Service Not Available");
    ResponseEntity<InitPurchaseOrderResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    Mockito.when(restTemplate.postForEntity(Mockito.anyString(), Mockito.anyObject(),
      Mockito.any(Class.class))).thenReturn(responseEntity);
    InitPurchaseOrderResponse initPurchaseOrderResponse = crtmServiceImpl.processInitPurchaseOrder(initPurchaseOrderRequest);
    Assert.assertNotNull(initPurchaseOrderResponse);
    Assert.assertEquals("ResponseCode doesn't match", "99", initPurchaseOrderResponse.getResponseCode());
  }

  @Test
  public void testProcessInitPurchaseOrderWithBadRequest() throws Exception {
    Mockito.when(utils.buildRestTemplateFactory(true)).thenReturn(restTemplate);
    InitPurchaseOrderResponse response = new InitPurchaseOrderResponse();
    ResponseEntity<InitPurchaseOrderResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    Mockito.when(restTemplate.postForEntity(Mockito.anyString(), Mockito.anyObject(),
      Mockito.any(Class.class))).thenReturn(responseEntity);
    InitPurchaseOrderResponse initPurchaseOrderResponse = crtmServiceImpl.processInitPurchaseOrder(initPurchaseOrderRequest);
    Assert.assertNotNull(initPurchaseOrderResponse);
    Assert.assertEquals("ResponseCode doesn't match", "9002", initPurchaseOrderResponse.getResponseCode());
  }

  @Test
  public void testProcessInitPurchaseOrderWithException() throws Exception {
    Mockito.when(utils.buildRestTemplateFactory(true)).thenReturn(restTemplate);
    InitPurchaseOrderResponse response = new InitPurchaseOrderResponse();
    ResponseEntity<InitPurchaseOrderResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    Mockito.when(restTemplate.postForEntity(Mockito.anyString(), Mockito.anyObject(),
      Mockito.any(Class.class))).thenThrow(RestClientException.class);
    InitPurchaseOrderResponse initPurchaseOrderResponse = crtmServiceImpl.processInitPurchaseOrder(initPurchaseOrderRequest);
    Assert.assertNotNull(initPurchaseOrderResponse);
    Assert.assertEquals("ResponseCode doesn't match", "9001", initPurchaseOrderResponse.getResponseCode());
  }

}
