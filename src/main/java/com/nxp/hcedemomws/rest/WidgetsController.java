/**
 * 
 */
package com.nxp.hcedemomws.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nxp.hcedemomws.dto.DeviceDetails;
import com.nxp.hcedemomws.dto.DigitizationContext;
import com.nxp.hcedemomws.dto.GetWidgetsRequest;
import com.nxp.hcedemomws.dto.GetWidgetsResponse;
import com.nxp.hcedemomws.dto.RequestContext;
import com.nxp.hcedemomws.util.Utils;
import com.nxp.hcedemomws.util.JsonUtil;

/**
 * @author nxa30710
 *
 */

@RestController
@RequestMapping(value = "/")
public class WidgetsController {

  public static Logger LOG = LoggerFactory.getLogger(WidgetsController.class);
//  OAuthConfigurationData configurationData;
//  Properties configuration;
//   @Value("${nxp.mifare.getwidgetslist.url}")
//   private String mifareServiceWidgetsUrl;
  @Autowired
  public ConfigBean configBean;
  
  @Autowired
  Utils utils;

  @RequestMapping(value = "wallets/{walletId}/widgets", method = RequestMethod.GET)
  public String widgets(@PathVariable(value = "walletId") String walletId) {
    LOG.info("#serviceProviders() service is called");
    GetWidgetsRequest request = new GetWidgetsRequest();
    RequestContext requestContext = new RequestContext();
    requestContext.setCorrelationId(""+System.currentTimeMillis());
    requestContext.setRequesterId(walletId);
    requestContext.setRequestId(""+System.currentTimeMillis());
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
    String result = "#Error occuring during Ping API invocation";
    try {
      GetWidgetsResponse pr = utils.postRequest(request, configBean,
        configBean.getMifareServiceWidgetsUrl(), GetWidgetsResponse.class);
      result = JsonUtil.toJSON(pr);
      LOG.info("#Got Response:" + result);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      LOG.info("#Error occurred during mifare service providers service call" + e);
    }
    return result;
  }
  

//  private OAuthConfigurationData buildMifareServiceOAuth2Config() {
//    configurationData = new OAuthConfigurationData();
//    configurationData.setBasicUserType(configuration.getProperty("nxp.mifare.wallet.user.type"));
//    configurationData.setBsicClientId(configuration.getProperty("nxp.mifare.wallet.client.id"));
//    configurationData.setBsicClientSecret(configuration.getProperty("nxp.mifare.wallet.client.secret"));
//    configurationData
//      .setMifServiceBaseUrl(configuration.getProperty("nxp.mifare.service.base.url"));
//    configurationData
//      .setOauthPassword(configuration.getProperty("nxp.mifare.wallet.oauth.basic.auth.password"));
//    configurationData
//      .setOauthRefreshServiceUrl(configuration.getProperty("nxp.mifare.oauth.refresh.service.url"));
//    configurationData
//      .setOauthUserName(configuration.getProperty("nxp.mifare.wallet.oauth.basic.auth.username"));
//    configurationData.setParamUserType(configuration.getProperty("nxp.mifare.wallet.param.user.type"));
//    configurationData
//      .setTokenBaseServiceUrl(configuration.getProperty("nxp.mifare.service.base.url"));
//    configurationData
//      .setTokenOAuthServiceUrl(configuration.getProperty("nxp.mifare.wallet.oauth.service.url"));
//    return configurationData;
//  }

}
