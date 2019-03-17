/**
 * 
 */
package com.nxp.hcedemomws.util;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Base64;

import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.TrustStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.nxp.hcedemomws.dto.AccessTokenBean;
import com.nxp.hcedemomws.rest.ConfigBean;
import com.nxp.hcedemomws.util.JsonUtil;

/**
 * @author nxa30710
 *
 */
@Component
public class Utils {

  public static Logger LOG = LoggerFactory.getLogger(Utils.class);

  /**
   * @param url
   * @param basicAuthHeaderValue
   * @param clientId
   * @param clientSecret
   * @return
   */
  public String fetchAccessToken(String url, String basicAuthHeaderValue, String clientId, String clientSecret) {
    LOG.info("#fetchAccessToken() is called with url:" + url + ", basicAuthHeaderValue:" + basicAuthHeaderValue + ", clientId:" + clientId + ", clientSecret:" + clientSecret);
    String token = null;
    RestTemplate restTemplate = null;
    if(url.startsWith("https")) {
      restTemplate = this.buildRestTemplateFactory(true);
    } else {
      restTemplate = this.buildRestTemplateFactory(false);
    }
    MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
    headers.add("Content-Type", "application/x-www-form-urlencoded");
    headers.add("Authorization", "Basic " + basicAuthHeaderValue);

    MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
    map.add("grant_type", "password");
    map.add("username", clientId);
    map.add("password", clientSecret);

    HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
    LOG.info("#endpoint url:" + url);
    
    ResponseEntity<AccessTokenBean> response = restTemplate.postForEntity(url, request, AccessTokenBean.class);
    LOG.info("#response:" + response);
    if (response.getStatusCode().is2xxSuccessful()) {
      AccessTokenBean accessTokenBean = response.getBody();
      token = accessTokenBean.getAccess_token();
      LOG.info("#accessToken Response:");
    } else {
      LOG.info("#Error occurred during accessToken response");
    }
    return token;
  }

  public String fetchAccessToken(ConfigBean configBean) {
    LOG.info("#fetchAccessToken() is called with config:" );
    String token = null;
    RestTemplate restTemplate = null;
    if(configBean.getMifareServiceBaseUrl().startsWith("https")) {
      restTemplate = buildRestTemplateFactory(true);
    } else {
      restTemplate = buildRestTemplateFactory(false);
    }
    MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
    headers.add("Content-Type", "application/x-www-form-urlencoded");
    String basicAuthHeader = configBean.getMifareWalletClientId() + ":" + configBean.getMifareWalletClientSecret();
    headers.add("Authorization", "Basic " + String.valueOf(Base64.getEncoder().encodeToString(basicAuthHeader.getBytes())));
    MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
    map.add("grant_type", "password");
    map.add("username", configBean.getMifareWalletOauthBasicUserName());
    map.add("password", configBean.getMifareWalletOauthBasicAuthPassword());

    HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
    LOG.info("#endpoint url:" + configBean.getMifareServiceBaseUrl() + configBean.getMifareWalletOauthServiceUrl());
    ResponseEntity<AccessTokenBean> response = restTemplate.postForEntity(configBean.getMifareServiceBaseUrl() + configBean.getMifareWalletOauthServiceUrl(), request,
      AccessTokenBean.class);
    LOG.info("#response:" + response);
    if (response.getStatusCode().is2xxSuccessful()) {
      AccessTokenBean accessTokenBean = response.getBody();
      token = accessTokenBean.getAccess_token();
      LOG.info("#accessToken Response:" );
    } else {
      LOG.info("#Error occurred during accessToken response");
    }
    return token;
  }

  public <T extends Object> T postRequest(Object request, ConfigBean configBean, String requestUrl, Class<T> response) {
    T resultantObject = null;
    RestTemplate restTemplate = null;
    MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
    headers.add("Content-Type", "application/json");
    String bearerToken = fetchAccessToken(configBean);
      LOG.info("#bearerToken:" + bearerToken);
    headers.add("Authorization", "Bearer " + bearerToken);
    if(configBean.getMifareServiceBaseUrl().startsWith("https")) {
      restTemplate = buildRestTemplateFactory(true);
    } else {
      restTemplate = buildRestTemplateFactory(false);
    }
      LOG.info("#endpoint url:" + configBean.getMifareServiceBaseUrl()+requestUrl);
    HttpEntity<String> entity = new HttpEntity<>(JsonUtil.toJSON(request), headers);
    ResponseEntity<T> response1 = restTemplate.postForEntity(configBean.getMifareServiceBaseUrl()+requestUrl, entity, response);
    if (response1.getStatusCode().is2xxSuccessful()) {
     LOG.info("#Got Response:" + response1.getBody());
      resultantObject = response1.getBody();
    }
    return resultantObject;
  }
  
  public <T extends Object> T postRequestWithAbsoluteURL(Object request, ConfigBean configBean, String requestUrl, Class<T> response) {
    T resultantObject = null;
    RestTemplate restTemplate = null;
    MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
    headers.add("Content-Type", "application/json");
    String bearerToken = fetchAccessToken(configBean);
      LOG.info("#bearerToken:" + bearerToken);
    headers.add("Authorization", "Bearer " + bearerToken);
       LOG.info("#endpoint url:" + requestUrl);
    if(requestUrl.startsWith("https")) {
      restTemplate = buildRestTemplateFactory(true);
    } else {
      restTemplate = buildRestTemplateFactory(false);
    }
    HttpEntity<String> entity = new HttpEntity<>(JsonUtil.toJSON(request), headers);
    ResponseEntity<T> response1 = restTemplate.postForEntity(requestUrl, entity, response);
    if (response1.getStatusCode().is2xxSuccessful()) {
     LOG.info("#Got Response:" + response1.getBody());
      resultantObject = response1.getBody();
    }
    return resultantObject;
  }
  
  /**
   * @param sslContext
   */
  public RestTemplate buildRestTemplateFactory(boolean isSSL) {
    RestTemplate restTemplate = null;
    if (isSSL) {
      TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
      SSLContext sslContext = null;
      try {
        sslContext = org.apache.http.ssl.SSLContexts.custom()
          .loadTrustMaterial(null, acceptingTrustStrategy).build();
      } catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);
      CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
      HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
      requestFactory.setHttpClient(httpClient);
      restTemplate = new RestTemplate(requestFactory);
    } else {
      restTemplate = new RestTemplate();
    }
    return restTemplate;
  }

}
