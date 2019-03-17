package com.nxp.hcedemomws.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
*
* << Add Comments Here >>
*
* @author NXP
* @date 21-Sep-2017 10:08:29 AM
* @version 1.0
*/

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DigitizeTicketRequest extends OemRequest implements Serializable {

  private static final long serialVersionUID = 3593760544685302032L;

  private String digitalCardId;

  private TransitBundle transitBundle; 

  private String ticketId;

  private RiskData riskData;

  /**
   * @return the digitalCardId
   */
  public String getDigitalCardId() {
    return digitalCardId;
  }

  /**
   * @param digitalCardId the digitalCardId to set
   */
  public void setDigitalCardId(String digitalCardId) {
    this.digitalCardId = digitalCardId;
  }

  /**
   * @return the ticketId
   */
  public String getTicketId() {
    return ticketId;
  }

  /**
   * @param ticketId the ticketId to set
   */
  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  /**
   * @return the riskData
   */
  public RiskData getRiskData() {
    return riskData;
  }

  /**
   * @param riskData the riskData to set
   */
  public void setRiskData(RiskData riskData) {
    this.riskData = riskData;
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
   * @return
   */
  @Override
  public String toString() {
    StringBuilder sbDigTicketReq = new StringBuilder();
    sbDigTicketReq.append(" >>> DigitizeTicketRequest [");
    sbDigTicketReq.append(super.toString());
    sbDigTicketReq.append(", digitalCardId=");
    sbDigTicketReq.append(digitalCardId);
    sbDigTicketReq.append(", ticketId=");
    sbDigTicketReq.append(ticketId);
    sbDigTicketReq.append(", transitBundle=");
    sbDigTicketReq.append(transitBundle);
    sbDigTicketReq.append(", riskData=");
    sbDigTicketReq.append(riskData);
    sbDigTicketReq.append("]");
    return sbDigTicketReq.toString();
  }

  
}

