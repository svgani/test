package com.nxp.hcedemomws.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigBean {

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

  @Value("${nxp.mifare.getsplist.url}")
  public String NXP_MIFARE_SPLIST_URI;
  @Value("${nxp.mifare.getwidgetslist.url}")
  private String mifareServiceWidgetsUrl;
  
  @Value("${nxp.monorail.service.base.url}")
  public String MONORAIL_BASE_URI;
  @Value("${nxp.monorail.generate.ticket.url}")
  public String MONORAIL_GENERATE_TICKET_REFERENCE_URI;
  @Value("${nxp.mifare.digitize.card.url}")
  public String MIFARE_DIGITIZE_CARD_URL;
  @Value("${nxp.mifare.undigitize.card.url}")
  public String MIFARE_UNDIGITIZE_CARD_URL;
  @Value("${nxp.mifare.digitize.ticket.url}")
  public String MIFARE_DIGITIZE_TICKET_URL;
  @Value("${nxp.mifare.digitize.ticket.ack.url}")
  public String MIFARE_DIGITIZE_TICKET_ACK_URL;
  @Value("${nxp.mifare.undigitize.ticket.url}")
  public String MIFARE_UNDIGITIZE_TICKET_URL;
  @Value("${nxp.digitize.service.base.url}")
  public String DIGITIZE_BASE_URI;
  @Value("${nxp.mifare.generate.product.reference.url}")
  public String GENERATE_PRODUCT_REFERENCE;  
  
  @Value("${nxp.mifare.pto.crtm.service.init.purchase.order.url}")
  public String crtmInitPurchaseOrderUrl;
  
  @Value("${nxp.mifare.pto.crtm.sp.id}")
  public String crtmServiceProviderId;

  /**
   * @return the nXP_MIFARE_OEM_PING_URI
   */
  public String getNXP_MIFARE_OEM_PING_URI() {
    return NXP_MIFARE_OEM_PING_URI;
  }

  /**
   * @param nXP_MIFARE_OEM_PING_URI the nXP_MIFARE_OEM_PING_URI to set
   */
  public void setNXP_MIFARE_OEM_PING_URI(String nXP_MIFARE_OEM_PING_URI) {
    NXP_MIFARE_OEM_PING_URI = nXP_MIFARE_OEM_PING_URI;
  }

  /**
   * @return the mifareServiceBaseUrl
   */
  public String getMifareServiceBaseUrl() {
    return mifareServiceBaseUrl;
  }

  /**
   * @param mifareServiceBaseUrl the mifareServiceBaseUrl to set
   */
  public void setMifareServiceBaseUrl(String mifareServiceBaseUrl) {
    this.mifareServiceBaseUrl = mifareServiceBaseUrl;
  }

  /**
   * @return the mifareWalletUserType
   */
  public String getMifareWalletUserType() {
    return mifareWalletUserType;
  }

  /**
   * @param mifareWalletUserType the mifareWalletUserType to set
   */
  public void setMifareWalletUserType(String mifareWalletUserType) {
    this.mifareWalletUserType = mifareWalletUserType;
  }

  /**
   * @return the mifareWalletClientId
   */
  public String getMifareWalletClientId() {
    return mifareWalletClientId;
  }

  /**
   * @param mifareWalletClientId the mifareWalletClientId to set
   */
  public void setMifareWalletClientId(String mifareWalletClientId) {
    this.mifareWalletClientId = mifareWalletClientId;
  }

  /**
   * @return the mifareWalletClientSecret
   */
  public String getMifareWalletClientSecret() {
    return mifareWalletClientSecret;
  }

  /**
   * @param mifareWalletClientSecret the mifareWalletClientSecret to set
   */
  public void setMifareWalletClientSecret(String mifareWalletClientSecret) {
    this.mifareWalletClientSecret = mifareWalletClientSecret;
  }

  /**
   * @return the mifareWalletOauthBasicAuthPassword
   */
  public String getMifareWalletOauthBasicAuthPassword() {
    return mifareWalletOauthBasicAuthPassword;
  }

  /**
   * @param mifareWalletOauthBasicAuthPassword the mifareWalletOauthBasicAuthPassword to set
   */
  public void setMifareWalletOauthBasicAuthPassword(String mifareWalletOauthBasicAuthPassword) {
    this.mifareWalletOauthBasicAuthPassword = mifareWalletOauthBasicAuthPassword;
  }

  /**
   * @return the mifareWalletRefreshURL
   */
  public String getMifareWalletRefreshURL() {
    return mifareWalletRefreshURL;
  }

  /**
   * @param mifareWalletRefreshURL the mifareWalletRefreshURL to set
   */
  public void setMifareWalletRefreshURL(String mifareWalletRefreshURL) {
    this.mifareWalletRefreshURL = mifareWalletRefreshURL;
  }

  /**
   * @return the mifareWalletOauthBasicUserName
   */
  public String getMifareWalletOauthBasicUserName() {
    return mifareWalletOauthBasicUserName;
  }

  /**
   * @param mifareWalletOauthBasicUserName the mifareWalletOauthBasicUserName to set
   */
  public void setMifareWalletOauthBasicUserName(String mifareWalletOauthBasicUserName) {
    this.mifareWalletOauthBasicUserName = mifareWalletOauthBasicUserName;
  }

  /**
   * @return the mifareWalletOauthServiceUrl
   */
  public String getMifareWalletOauthServiceUrl() {
    return mifareWalletOauthServiceUrl;
  }

  /**
   * @param mifareWalletOauthServiceUrl the mifareWalletOauthServiceUrl to set
   */
  public void setMifareWalletOauthServiceUrl(String mifareWalletOauthServiceUrl) {
    this.mifareWalletOauthServiceUrl = mifareWalletOauthServiceUrl;
  }

  /**
   * @return the nXP_MIFARE_SPLIST_URI
   */
  public String getNXP_MIFARE_SPLIST_URI() {
    return NXP_MIFARE_SPLIST_URI;
  }

  /**
   * @param nXP_MIFARE_SPLIST_URI the nXP_MIFARE_SPLIST_URI to set
   */
  public void setNXP_MIFARE_SPLIST_URI(String nXP_MIFARE_SPLIST_URI) {
    NXP_MIFARE_SPLIST_URI = nXP_MIFARE_SPLIST_URI;
  }

  /**
   * @return the mifareServiceWidgetsUrl
   */
  public String getMifareServiceWidgetsUrl() {
    return mifareServiceWidgetsUrl;
  }

  /**
   * @param mifareServiceWidgetsUrl the mifareServiceWidgetsUrl to set
   */
  public void setMifareServiceWidgetsUrl(String mifareServiceWidgetsUrl) {
    this.mifareServiceWidgetsUrl = mifareServiceWidgetsUrl;
  }
  
  

  /**
   * @return the mONORAIL_BASE_URI
   */
  public String getMONORAIL_BASE_URI() {
    return MONORAIL_BASE_URI;
  }

  /**
   * @param mONORAIL_BASE_URI the mONORAIL_BASE_URI to set
   */
  public void setMONORAIL_BASE_URI(String mONORAIL_BASE_URI) {
    MONORAIL_BASE_URI = mONORAIL_BASE_URI;
  }

  /**
   * @return the mONORAIL_GENERATE_TICKET_REFERENCE_URI
   */
  public String getMONORAIL_GENERATE_TICKET_REFERENCE_URI() {
    return MONORAIL_GENERATE_TICKET_REFERENCE_URI;
  }

  /**
   * @param mONORAIL_GENERATE_TICKET_REFERENCE_URI the mONORAIL_GENERATE_TICKET_REFERENCE_URI to set
   */
  public void setMONORAIL_GENERATE_TICKET_REFERENCE_URI(String mONORAIL_GENERATE_TICKET_REFERENCE_URI) {
    MONORAIL_GENERATE_TICKET_REFERENCE_URI = mONORAIL_GENERATE_TICKET_REFERENCE_URI;
  }

  /**
   * @return the mIFARE_DIGITIZE_CARD_URL
   */
  public String getMIFARE_DIGITIZE_CARD_URL() {
    return MIFARE_DIGITIZE_CARD_URL;
  }

  /**
   * @param mIFARE_DIGITIZE_CARD_URL the mIFARE_DIGITIZE_CARD_URL to set
   */
  public void setMIFARE_DIGITIZE_CARD_URL(String mIFARE_DIGITIZE_CARD_URL) {
    MIFARE_DIGITIZE_CARD_URL = mIFARE_DIGITIZE_CARD_URL;
  }

  /**
   * @return the mIFARE_UNDIGITIZE_CARD_URL
   */
  public String getMIFARE_UNDIGITIZE_CARD_URL() {
    return MIFARE_UNDIGITIZE_CARD_URL;
  }

  /**
   * @param mIFARE_UNDIGITIZE_CARD_URL the mIFARE_UNDIGITIZE_CARD_URL to set
   */
  public void setMIFARE_UNDIGITIZE_CARD_URL(String mIFARE_UNDIGITIZE_CARD_URL) {
    MIFARE_UNDIGITIZE_CARD_URL = mIFARE_UNDIGITIZE_CARD_URL;
  }

  /**
   * @return the mIFARE_DIGITIZE_TICKET_URL
   */
  public String getMIFARE_DIGITIZE_TICKET_URL() {
    return MIFARE_DIGITIZE_TICKET_URL;
  }

  /**
   * @param mIFARE_DIGITIZE_TICKET_URL the mIFARE_DIGITIZE_TICKET_URL to set
   */
  public void setMIFARE_DIGITIZE_TICKET_URL(String mIFARE_DIGITIZE_TICKET_URL) {
    MIFARE_DIGITIZE_TICKET_URL = mIFARE_DIGITIZE_TICKET_URL;
  }

  /**
   * @return the mIFARE_DIGITIZE_TICKET_ACK_URL
   */
  public String getMIFARE_DIGITIZE_TICKET_ACK_URL() {
    return MIFARE_DIGITIZE_TICKET_ACK_URL;
  }

  /**
   * @param mIFARE_DIGITIZE_TICKET_ACK_URL the mIFARE_DIGITIZE_TICKET_ACK_URL to set
   */
  public void setMIFARE_DIGITIZE_TICKET_ACK_URL(String mIFARE_DIGITIZE_TICKET_ACK_URL) {
    MIFARE_DIGITIZE_TICKET_ACK_URL = mIFARE_DIGITIZE_TICKET_ACK_URL;
  }

  /**
   * @return the mIFARE_UNDIGITIZE_TICKET_URL
   */
  public String getMIFARE_UNDIGITIZE_TICKET_URL() {
    return MIFARE_UNDIGITIZE_TICKET_URL;
  }

  /**
   * @param mIFARE_UNDIGITIZE_TICKET_URL the mIFARE_UNDIGITIZE_TICKET_URL to set
   */
  public void setMIFARE_UNDIGITIZE_TICKET_URL(String mIFARE_UNDIGITIZE_TICKET_URL) {
    MIFARE_UNDIGITIZE_TICKET_URL = mIFARE_UNDIGITIZE_TICKET_URL;
  }

  /**
   * @return the dIGITIZE_BASE_URI
   */
  public String getDIGITIZE_BASE_URI() {
    return DIGITIZE_BASE_URI;
  }

  /**
   * @param dIGITIZE_BASE_URI the dIGITIZE_BASE_URI to set
   */
  public void setDIGITIZE_BASE_URI(String dIGITIZE_BASE_URI) {
    DIGITIZE_BASE_URI = dIGITIZE_BASE_URI;
  }

  /**
   * @return the gENERATE_PRODUCT_REFERENCE
   */
  public String getGENERATE_PRODUCT_REFERENCE() {
    return GENERATE_PRODUCT_REFERENCE;
  }

  /**
   * @param gENERATE_PRODUCT_REFERENCE the gENERATE_PRODUCT_REFERENCE to set
   */
  public void setGENERATE_PRODUCT_REFERENCE(String gENERATE_PRODUCT_REFERENCE) {
    GENERATE_PRODUCT_REFERENCE = gENERATE_PRODUCT_REFERENCE;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "ConfigBean [NXP_MIFARE_OEM_PING_URI=" + NXP_MIFARE_OEM_PING_URI + ", mifareServiceBaseUrl=" + mifareServiceBaseUrl + ", mifareWalletUserType=" + mifareWalletUserType
      + ", mifareWalletClientId=" + mifareWalletClientId + ", mifareWalletClientSecret=" + mifareWalletClientSecret + ", mifareWalletOauthBasicAuthPassword="
      + mifareWalletOauthBasicAuthPassword + ", mifareWalletRefreshURL=" + mifareWalletRefreshURL + ", mifareWalletOauthBasicUserName=" + mifareWalletOauthBasicUserName
      + ", mifareWalletOauthServiceUrl=" + mifareWalletOauthServiceUrl + ", NXP_MIFARE_SPLIST_URI=" + NXP_MIFARE_SPLIST_URI + ", mifareServiceWidgetsUrl=" + mifareServiceWidgetsUrl
      + ", MONORAIL_BASE_URI=" + MONORAIL_BASE_URI + ", MONORAIL_GENERATE_TICKET_REFERENCE_URI=" + MONORAIL_GENERATE_TICKET_REFERENCE_URI + ", MIFARE_DIGITIZE_CARD_URL="
      + MIFARE_DIGITIZE_CARD_URL + ", MIFARE_UNDIGITIZE_CARD_URL=" + MIFARE_UNDIGITIZE_CARD_URL + ", MIFARE_DIGITIZE_TICKET_URL=" + MIFARE_DIGITIZE_TICKET_URL
      + ", MIFARE_DIGITIZE_TICKET_ACK_URL=" + MIFARE_DIGITIZE_TICKET_ACK_URL + ", MIFARE_UNDIGITIZE_TICKET_URL=" + MIFARE_UNDIGITIZE_TICKET_URL + ", DIGITIZE_BASE_URI="
      + DIGITIZE_BASE_URI + ", GENERATE_PRODUCT_REFERENCE=" + GENERATE_PRODUCT_REFERENCE + "]";
  }

  public String getCrtmInitPurchaseOrderUrl() {
    return crtmInitPurchaseOrderUrl;
  }

  public void setCrtmInitPurchaseOrderUrl(String crtmInitPurchaseOrderUrl) {
    this.crtmInitPurchaseOrderUrl = crtmInitPurchaseOrderUrl;
  }

  public String getCrtmServiceProviderId() {
    return crtmServiceProviderId;
  }

  public void setCrtmServiceProviderId(String crtmServiceProviderId) {
    this.crtmServiceProviderId = crtmServiceProviderId;
  }

 
}
