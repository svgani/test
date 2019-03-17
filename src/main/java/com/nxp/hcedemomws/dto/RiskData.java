package com.nxp.hcedemomws.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskData implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 7545597299069260631L;

  private String clientType;

  private String latitudeNoDecimals;

  private String longitudeNoDecimals;
  
  private String ipAddress;
  
  private String riskAlgorithmVersion;
  
  private Integer deviceScore;
  
  private Integer accountScore;
  
  private Integer walletAccountTenureWeeks;
  
  private Integer gaiaAccountTenureWeeks;
  
  private String osVersion;
  
  private String networkOperator;
  
  private String networkType;
  
  private String deviceTimezone;
  
  /**
   * @return the clientType
   */
  public String getClientType() {
    return clientType;
  }

  /**
   * @param clientType the clientType to set
   */
  public void setClientType(String clientType) {
    this.clientType = clientType;
  }

  /**
   * @return the latitudeNoDecimals
   */
  public String getLatitudeNoDecimals() {
    return latitudeNoDecimals;
  }

  /**
   * @param latitudeNoDecimals the latitudeNoDecimals to set
   */
  public void setLatitudeNoDecimals(String latitudeNoDecimals) {
    this.latitudeNoDecimals = latitudeNoDecimals;
  }

  /**
   * @return the longitudeNoDecimals
   */
  public String getLongitudeNoDecimals() {
    return longitudeNoDecimals;
  }

  /**
   * @param longitudeNoDecimals the longitudeNoDecimals to set
   */
  public void setLongitudeNoDecimals(String longitudeNoDecimals) {
    this.longitudeNoDecimals = longitudeNoDecimals;
  }

  /**
   * @return the ipAddress
   */
  public String getIpAddress() {
    return ipAddress;
  }

  /**
   * @param ipAddress the ipAddress to set
   */
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * @return the riskAlgorithmVersion
   */
  public String getRiskAlgorithmVersion() {
    return riskAlgorithmVersion;
  }

  /**
   * @param riskAlgorithmVersion the riskAlgorithmVersion to set
   */
  public void setRiskAlgorithmVersion(String riskAlgorithmVersion) {
    this.riskAlgorithmVersion = riskAlgorithmVersion;
  }

  /**
   * @return the deviceScore
   */
  public Integer getDeviceScore() {
    return deviceScore;
  }

  /**
   * @param deviceScore the deviceScore to set
   */
  public void setDeviceScore(Integer deviceScore) {
    this.deviceScore = deviceScore;
  }

  /**
   * @return the accountScore
   */
  public Integer getAccountScore() {
    return accountScore;
  }

  /**
   * @param accountScore the accountScore to set
   */
  public void setAccountScore(Integer accountScore) {
    this.accountScore = accountScore;
  }

  /**
   * @return the walletAccountTenureWeeks
   */
  public Integer getWalletAccountTenureWeeks() {
    return walletAccountTenureWeeks;
  }

  /**
   * @param walletAccountTenureWeeks the walletAccountTenureWeeks to set
   */
  public void setWalletAccountTenureWeeks(Integer walletAccountTenureWeeks) {
    this.walletAccountTenureWeeks = walletAccountTenureWeeks;
  }

  /**
   * @return the gaiaAccountTenureWeeks
   */
  public Integer getGaiaAccountTenureWeeks() {
    return gaiaAccountTenureWeeks;
  }

  /**
   * @param gaiaAccountTenureWeeks the gaiaAccountTenureWeeks to set
   */
  public void setGaiaAccountTenureWeeks(Integer gaiaAccountTenureWeeks) {
    this.gaiaAccountTenureWeeks = gaiaAccountTenureWeeks;
  }

  /**
   * @return the osVersion
   */
  public String getOsVersion() {
    return osVersion;
  }

  /**
   * @param osVersion the osVersion to set
   */
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  /**
   * @return the networkOperator
   */
  public String getNetworkOperator() {
    return networkOperator;
  }

  /**
   * @param networkOperator the networkOperator to set
   */
  public void setNetworkOperator(String networkOperator) {
    this.networkOperator = networkOperator;
  }
  

  /**
   * @return the networkType
   */
  public String getNetworkType() {
    return networkType;
  }

  /**
   * @param networkType the networkType to set
   */
  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }

  /**
   * @return the deviceTimezone
   */
  public String getDeviceTimezone() {
    return deviceTimezone;
  }

  /**
   * @param deviceTimezone the deviceTimezone to set
   */
  public void setDeviceTimezone(String deviceTimezone) {
    this.deviceTimezone = deviceTimezone;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("RiskData [clientType=");
    builder.append(clientType);
    builder.append(", latitudeNoDecimals=");
    builder.append(latitudeNoDecimals);
    builder.append(", longitudeNoDecimals=");
    builder.append(longitudeNoDecimals);
    builder.append(", riskAlgorithmVersion=");
    builder.append(riskAlgorithmVersion);
    builder.append(", deviceScore=");
    builder.append(deviceScore);
    builder.append(", accountScore=");
    builder.append(accountScore);
    builder.append(", walletAccountTenureWeeks=");
    builder.append(walletAccountTenureWeeks);
    builder.append(", gaiaAccountTenureWeeks=");
    builder.append(gaiaAccountTenureWeeks);
    builder.append(", osVersion=");
    builder.append(osVersion);
    builder.append(", networkOperator=");
    builder.append(networkOperator);
    builder.append(", networkType=");
    builder.append(networkType);
    builder.append(", deviceTimezone=");
    builder.append(deviceTimezone);
    builder.append(", ipAddress=");
    builder.append(ipAddress);
    builder.append("]");
    return builder.toString();
  }

}
