/**
 * 
 */
package com.nxp.hcedemomws.rest;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nxp.hcedemomws.constants.Constants;
import com.nxp.hcedemomws.dto.DeviceDetails;
import com.nxp.hcedemomws.dto.DigitizationContext;
import com.nxp.hcedemomws.dto.GetServiceProvidersRequest;
import com.nxp.hcedemomws.dto.GetServiceProvidersResponse;
import com.nxp.hcedemomws.dto.GetWidgetsRequest;
import com.nxp.hcedemomws.dto.GetWidgetsResponse;
import com.nxp.hcedemomws.dto.RequestContext;
import com.nxp.hcedemomws.dto.SPDetails;
import com.nxp.hcedemomws.dto.SPResponse;
import com.nxp.hcedemomws.dto.SPWidgetDetails;
import com.nxp.hcedemomws.dto.SPWidgetsResponse;
import com.nxp.hcedemomws.dto.ServiceProviderDetails;
import com.nxp.hcedemomws.dto.WidgetDetails;
import com.nxp.hcedemomws.util.Utils;
import com.nxp.hcedemomws.util.JsonUtil;

/**
 * @author nxa30710
 *
 */

@RestController
@RequestMapping(value = "/")
public class ServiceProviderController {

  @Autowired
  public ConfigBean configBean;
  
  @Autowired
  Utils utils;

  public static Logger LOG = LoggerFactory.getLogger(ServiceProviderController.class);

  // 34PH9NHNTJ
  @RequestMapping(value = "wallets/{walletId}/serviceproviders", method = RequestMethod.GET)
  public SPResponse serviceProviders(@PathVariable(value = "walletId") String walletId) {
    LOG.info("#serviceProviders() service is called");
    LOG.info("mifareServiceBaseUrl:" + configBean.getMifareServiceBaseUrl());
    List<SPDetails> list = new ArrayList<>();
    SPResponse spResponse = null;
    GetServiceProvidersRequest request = new GetServiceProvidersRequest();
    RequestContext requestContext = new RequestContext();
    requestContext.setCorrelationId("" + System.currentTimeMillis());
    requestContext.setRequesterId(walletId);
    requestContext.setRequestId("" + System.currentTimeMillis());
    requestContext.setTimeZone("GMT-8:00");
    request.setRequestContext(requestContext);
    DigitizationContext dc = new DigitizationContext();
    dc.setWalletId(walletId);
    request.setDigitizationContext(dc);
    String result = "#Error occuring during Ping API invocation";
    try {
      GetServiceProvidersResponse pr = utils.postRequest(request, configBean, configBean.getNXP_MIFARE_SPLIST_URI(), GetServiceProvidersResponse.class);
      if (pr.getSpList() != null) {
        List<ServiceProviderDetails> spList = pr.getSpList();
        for (ServiceProviderDetails t : spList) {
        	/** Excluding LVMR and NTT service Providers */
          if(!(t.getServiceProviderID().equals(Constants.LVMR_SP_ID) || t.getServiceProviderID().equals(Constants.NTT_SP_ID))){	
	          SPDetails sp = SPDetails.builder().serviceProviderID(t.getServiceProviderID()).spName(t.getSpName())
	            .location(t.getLocation()).spLogoURL("/test")
	            .tosURL(URLEncoder.encode(t.getTosURL() == null ? "" : t.getTosURL(), "UTF-8")).build();
	          list.add(sp);
          }
        }
        spResponse = SPResponse.builder().status("success").spDetails(list).build();
      } else {
        spResponse = SPResponse.builder().status("success").spDetails(list).build();
      }
      result = JsonUtil.toJSON(pr);
      LOG.info("#Got Response:" + result);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      LOG.info("#Error occurred during mifare service providers service call" + e);
      spResponse = SPResponse.builder().status("failed").spDetails(null).build();
    }
    return spResponse;
  }

  @RequestMapping(value = "wallets/{walletId}/serviceproviders/{serviceproviderid}/widgets", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public SPWidgetsResponse widgets(@PathVariable(value = "walletId") String walletId,
    @PathVariable(value = "serviceproviderid") String serviceProviderId) {
    LOG.info("#serviceProviders() service is called");
    SPWidgetsResponse spWidgetsResponse = null;
    GetWidgetsRequest request = new GetWidgetsRequest();
    RequestContext requestContext = new RequestContext();
    requestContext.setCorrelationId("" + System.currentTimeMillis());
    requestContext.setRequesterId(walletId);
    requestContext.setRequestId("" + System.currentTimeMillis());
    requestContext.setTimeZone("GMT-8:00");
    request.setRequestContext(requestContext);
    DigitizationContext dc = new DigitizationContext();
    dc.setWalletId(walletId);
    request.setDigitizationContext(dc);
    DeviceDetails dd = new DeviceDetails();
    dd.setOs("ANDROID");
    dd.setType("MOBILE");
    dd.setName("nokia8");
    request.setDeviceDetails(dd);
    request.setServiceProviderID(serviceProviderId);
    String result = "#Error occuring during Ping API invocation";
    try {
      // GetWidgetsResponse pr = PTOHttpClientUtils.postRequest(request, null,
      // "", GetWidgetsResponse.class);
      GetWidgetsResponse pr = utils.postRequest(request, configBean, configBean.getMifareServiceWidgetsUrl(), GetWidgetsResponse.class);
      result = JsonUtil.toJSON(pr);
      List<SPWidgetDetails> list = new ArrayList<>();
      if (pr.getWidgetList() != null) {
        for (WidgetDetails t : pr.getWidgetList()) {
          if (serviceProviderId.equals(t.getServiceProviderID())) {
            list.add(SPWidgetDetails.builder().serviceProviderID(t.getServiceProviderID())
              .widgetID(t.getPtoReferenceId()).imageURL(t.getImageURL()).expDate(t.getExpDate())
              .currency(t.getCurrency()).price(t.getPrice()).serviceProvider(t.getServiceProvider())
              .serviceType(t.getServiceType()).name(t.getName()).build());
          }
        }
        spWidgetsResponse = SPWidgetsResponse.builder().status("success").spWidgetDetails(list).build();
        LOG.info("#Got Response:" + result);
      } else {
        spWidgetsResponse = SPWidgetsResponse.builder().status("success").spWidgetDetails(list).build();
      }
    } catch (Exception e) {
      // TODO Auto-generated catch block
      LOG.info("#Error occurred during mifare service providers service call" + e);
      spWidgetsResponse = SPWidgetsResponse.builder().status("failed").spWidgetDetails(null).build();
    }
    return spWidgetsResponse;
  }

}
