/**
 * 
 */
package com.nxp.hcedemomws.dto;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 19-Sep-2017 10:48:06 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransitBundle implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -7289919926340401656L;

  private String bundleId;

  private Long expirationTimestamp;

  private String isoAid;

  private String transitCardPayload;

  private Map<String, Object> transitKeySet;
  
  private String ptoConfigurations;


  /**
   * @return the bundleId
   */
  public String getBundleId() {
    return bundleId;
  }


  /**
   * @param bundleId the bundleId to set
   */
  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  /**
   * @return the expirationTimestamp
   */
  public Long getExpirationTimestamp() {
    return expirationTimestamp;
  }

  /**
   * @param expirationTimestamp the expirationTimestamp to set
   */
  public void setExpirationTimestamp(Long expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
  }

  /**
   * @return the isoAid
   */
  public String getIsoAid() {
    return isoAid;
  }


  /**
   * @param isoAid the isoAid to set
   */
  public void setIsoAid(String isoAid) {
    this.isoAid = isoAid;
  }


  /**
   * @return the transitCardPayload
   */
  public String getTransitCardPayload() {
    return transitCardPayload;
  }


  /**
   * @param transitCardPayload the transitCardPayload to set
   */
  public void setTransitCardPayload(String transitCardPayload) {
    this.transitCardPayload = transitCardPayload;
  }


  /**
   * @return the transitKeySet
   */
  public Map<String, Object> getTransitKeySet() {
    return transitKeySet;
  }

  /**
   * @param transitKeySet the transitKeySet to set
   */
  public void setTransitKeySet(Map<String, Object> transitKeySet) {
    this.transitKeySet = transitKeySet;
  }


  /**
   * @return the ptoConfigurations
   */
  public String getPtoConfigurations() {
    return ptoConfigurations;
  }


  /**
   * @param ptoConfigurations the ptoConfigurations to set
   */
  public void setPtoConfigurations(String ptoConfigurations) {
    this.ptoConfigurations = ptoConfigurations;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("TransitBundle [bundleId=");
    sb.append(bundleId);
    sb.append(", expirationTimestamp=");
    sb.append(expirationTimestamp);
    sb.append(", isoAid=");
    sb.append(isoAid);
    sb.append(", ptoConfigurations=");
    sb.append(ptoConfigurations);
    sb.append(", transitKeySet=");
    sb.append(transitKeySet);
    sb.append("]");
    return sb.toString();
  }

}
