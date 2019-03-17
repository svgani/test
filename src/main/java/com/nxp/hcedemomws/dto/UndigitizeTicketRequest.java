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
 * @date Sep 28, 2017 11:20:31 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UndigitizeTicketRequest extends TicketRequest implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -3591780600800982773L;

  private String ticketUndigitizationReason;
  
  private TransitBundle transitBundle;

  /**
   * @return the ticketUndigitizationReason
   */
  public String getTicketUndigitizationReason() {
    return ticketUndigitizationReason;
  }

  /**
   * @param ticketUndigitizationReason the ticketUndigitizationReason to set
   */
  public void setTicketUndigitizationReason(String ticketUndigitizationReason) {
    this.ticketUndigitizationReason = ticketUndigitizationReason;
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
    StringBuilder builder = new StringBuilder();
    builder.append(" >>> UndigitizeTicketRequest [");
    builder.append(super.toString());
    builder.append(", digitalCardId=");
    builder.append(getDigitalCardId());
    builder.append(", digitalTicketId=");
    builder.append(getDigitalTicketId());
    builder.append(", ticketUndigitizationReason=");
    builder.append(ticketUndigitizationReason);
    builder.append("]");
    return builder.toString();
  }


}
