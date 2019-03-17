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
public class DigitizeTicketResponse extends OemResponse {

  /**
   * 
   */
  private static final long serialVersionUID = -5085871925653845911L;

  private String digitalTicketId;
  
  private TransitBundle transitBundle;

  /**
   * @return the digitalTicketId
   */
  public String getDigitalTicketId() {
    return digitalTicketId;
  }

  /**
   * @param digitalTicketId the digitalTicketId to set
   */
  public void setDigitalTicketId(String digitalTicketId) {
    this.digitalTicketId = digitalTicketId;
  }

  /**
   * @param transitBundle the transitBundle to set
   */
  public void setTransitBundle(TransitBundle transitBundle) {
    this.transitBundle = transitBundle;
  }
  
  /**
   * @return the transitBundle
   */
  public TransitBundle getTransitBundle() {
    return transitBundle;
  }

  @Override
  public String toString() {
	  StringBuilder sbDigitizeTicketResp = new StringBuilder();
	  sbDigitizeTicketResp.append(">>> DigitizeTicketResponse [");
	  sbDigitizeTicketResp.append(super.toString());
	  sbDigitizeTicketResp.append(", digitalTicketId=");
	  sbDigitizeTicketResp.append(digitalTicketId);
	  sbDigitizeTicketResp.append(", transitBundle=");
	  sbDigitizeTicketResp.append(transitBundle == null ? "NULL" : transitBundle.toString());
	  sbDigitizeTicketResp.append("]");
	  return sbDigitizeTicketResp.toString();

  }

}
