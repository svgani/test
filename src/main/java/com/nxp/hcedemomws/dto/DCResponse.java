
/**
 * 
 */
package com.nxp.hcedemomws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 21-Sep-2017 10:14:34 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DCResponse {

  /**
   * 
   */
  private static final long serialVersionUID = -8388066258740474381L;
  
  private String status;

  private String digitalCardId;

  
  private TransitBundle transitBundle;

  
  
  /**
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * @param status the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * @return the digitalCardId
   */
  public String getDigitalCardId() {
    return digitalCardId;
  }

  /**
   * @return the transitBundle
   */
  public TransitBundle getTransitBundle() {
    return transitBundle;
  }

  /**
   * @param transitBundle the transitBundle to set
   */
  public void setTransitBundle(TransitBundle transitBundle) {
    this.transitBundle = transitBundle;
  }

  /**
   * @param digitalCardId the digitalCardId to set
   */
  public void setDigitalCardId(String digitalCardId) {
    this.digitalCardId = digitalCardId;
  }
  
  

  /**
   * @return
   */
  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append(">>> DigitizeCardResponse [");
	  sb.append(super.toString());
	  sb.append(", digitalCardId=");
	  sb.append(digitalCardId);
	  sb.append(", transitBundle=");
	  sb.append(transitBundle == null ? "NULL" : transitBundle.toString());
	  sb.append("]");
	  return sb.toString();

  }

}
