/**
 * 
 */
package com.nxp.hcedemomws.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * << Add Comments Here >>
 *
 * @author NXP
 * @date Sep 28, 2017 1:47:09 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransitAgencyData implements Serializable {
  
  /**
   * 
   */
  
  private static final long serialVersionUID = -620270219209678042L;
  
  private String transitAgency;
  
  private String transitAgencyDisplayName;
  
  private String transitAgencyLogoStaticContentId;
  
  private String transitAgencySupportPhoneNumber;
  
  private String transitAgencyWebsiteUrl;
  
  private String transitAgencyEmail;

  /**
   * @return the transitAgency
   */
  public String getTransitAgency() {
    return transitAgency;
  }

  /**
   * @param transitAgency the transitAgency to set
   */
  public void setTransitAgency(String transitAgency) {
    this.transitAgency = transitAgency;
  }

  /**
   * @return the transitAgencyDisplayName
   */
  public String getTransitAgencyDisplayName() {
    return transitAgencyDisplayName;
  }

  /**
   * @param transitAgencyDisplayName the transitAgencyDisplayName to set
   */
  public void setTransitAgencyDisplayName(String transitAgencyDisplayName) {
    this.transitAgencyDisplayName = transitAgencyDisplayName;
  }

  /**
   * @return the transitAgencyLogoStaticContentId
   */
  public String getTransitAgencyLogoStaticContentId() {
    return transitAgencyLogoStaticContentId;
  }

  /**
   * @param transitAgencyLogoStaticContentId the transitAgencyLogoStaticContentId to set
   */
  public void setTransitAgencyLogoStaticContentId(String transitAgencyLogoStaticContentId) {
    this.transitAgencyLogoStaticContentId = transitAgencyLogoStaticContentId;
  }

  /**
   * @return the transitAgencySupportPhoneNumber
   */
  public String getTransitAgencySupportPhoneNumber() {
    return transitAgencySupportPhoneNumber;
  }

  /**
   * @param transitAgencySupportPhoneNumber the transitAgencySupportPhoneNumber to set
   */
  public void setTransitAgencySupportPhoneNumber(String transitAgencySupportPhoneNumber) {
    this.transitAgencySupportPhoneNumber = transitAgencySupportPhoneNumber;
  }

  /**
   * @return the transitAgencyWebsiteUrl
   */
  public String getTransitAgencyWebsiteUrl() {
    return transitAgencyWebsiteUrl;
  }

  /**
   * @param transitAgencyWebsiteUrl the transitAgencyWebsiteUrl to set
   */
  public void setTransitAgencyWebsiteUrl(String transitAgencyWebsiteUrl) {
    this.transitAgencyWebsiteUrl = transitAgencyWebsiteUrl;
  }

  /**
   * @return the transitAgencyEmail
   */
  public String getTransitAgencyEmail() {
    return transitAgencyEmail;
  }

  /**
   * @param transitAgencyEmail the transitAgencyEmail to set
   */
  public void setTransitAgencyEmail(String transitAgencyEmail) {
    this.transitAgencyEmail = transitAgencyEmail;
  }
  
  
  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(" >>> TransitAgencyData [");
    builder.append(super.toString());
    builder.append(", transitAgency=");
    builder.append(transitAgency);
    builder.append(", transitAgencyDisplayName=");
    builder.append(transitAgencyDisplayName);
    builder.append(", transitAgencyLogoStaticContentId=");
    builder.append(transitAgencyLogoStaticContentId);
    builder.append("]");
    return builder.toString();
  }
  
}
