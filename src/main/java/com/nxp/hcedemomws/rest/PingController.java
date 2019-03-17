/**
 * 
 */
package com.nxp.hcedemomws.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nxp.hcedemomws.dto.DigitizationContext;
import com.nxp.hcedemomws.dto.PingRequest;
import com.nxp.hcedemomws.dto.RequestContext;
import com.nxp.hcedemomws.util.Utils;

/**
 * @author nxa30710
 *
 */

@RestController
@RequestMapping(value = "/ping")
public class PingController {

  @Autowired
  public ConfigBean configBean;
  
  @Autowired
  Utils utils;
  
  @Value("${nxp.mifare.oem.ping.url}")
  public String NXP_MIFARE_OEM_PING_URI;
  @Value("${nxp.mifare.service.base.url}")
  public String mifareServiceBaseUrl;
  @Value("${nxp.mifare.wallet.user.type}")
  public String mifareWalletUserType;
  @Value("${nxp.mifare.wallet.client.id}")
  public String mifareWalletClientId;
  @Value("${nxp.mifare.wallet.client.secret}")
  public String mifareWalletClientSecret;
  @Value("${nxp.mifare.wallet.oauth.basic.auth.password}")
  public String mifareWalletOauthBasicAuthPassword;

  @Value("${nxp.mifare.oauth.refresh.service.url}")
  public String mifareWalletRefreshURL;
  @Value("${nxp.mifare.wallet.oauth.basic.auth.username}")
  public String mifareWalletOauthBasicUserName;
  @Value("${nxp.mifare.wallet.oauth.service.url}")
  public String mifareWalletOauthServiceUrl;

  public static Logger LOG = LoggerFactory.getLogger(PingController.class);

  // @Value("${nxp.mifare.service.base.url}")
  // private String mifareServiceBaseUrl;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String ping() {
    LOG.info("#Ping() service is called");
        LOG.info("mifareServiceBaseUrl:" + mifareServiceBaseUrl);
    PingRequest request = new PingRequest();
    RequestContext requestContext = new RequestContext();
    requestContext.setCorrelationId("" + System.currentTimeMillis());
    requestContext.setRequesterId("784JBRFIWX");
    requestContext.setRequestId("" + System.currentTimeMillis());
    requestContext.setTimeZone("GMT-8:00");
    request.setRequestContext(requestContext);
    DigitizationContext dc = new DigitizationContext();
    dc.setWalletId("784JBRFIWX");
    request.setDigitizationContext(dc);
    String result = "Ping returns, ";
    // String result = "#mifare wallet service is up and running";
    // result += " mifareWalletOauthServiceUrl:" + mifareWalletOauthServiceUrl;
    try {
      // PingResponse pr = PTOHttpClientUtils.postRequest(request, buildMifareServiceOAuth2Config(),
      // NXP_MIFARE_OEM_PING_URI, PingResponse.class);
      // if (pr != null) {
      // result = JsonUtil.toJSON(pr);
      // } else {
      // result = "#Error occurred during ping response";
      // }
          LOG.info("#Got Response:" + result);
//      String basicAuthHeader = mifareWalletClientId + ":" + mifareWalletClientSecret;
//      String accessToken = Utils.fetchAccessToken(mifareServiceBaseUrl + mifareWalletOauthServiceUrl,
//        String.valueOf(Base64.getEncoder().encodeToString(basicAuthHeader.getBytes())), mifareWalletOauthBasicUserName, mifareWalletOauthBasicAuthPassword);
      String accessToken = utils.fetchAccessToken(configBean);
      if (accessToken != null) {
        result += "accessToken:" + accessToken;
      } else {
        result += "#Error occuring during Ping API invocation";
      }
    } catch (Exception e) {
      LOG.info("#Error occurred duirng invocation of service", e);
    }
    return result;
  }

}
