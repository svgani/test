/**
 * 
 */
package com.nxp.hcedemomws.dto;

import java.io.Serializable;

/**
 *
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 15-Jan-2018 1:14:10 PM
 * @version 1.0
 */
public class TicketRequest extends OemRequest implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 6618171948832734750L;

  private String digitalTicketId;
  
  private String digitalCardId;

  public String getDigitalTicketId() {
    return digitalTicketId;
  }

  public void setDigitalTicketId(String digitalTicketId) {
    this.digitalTicketId = digitalTicketId;
  }
  
  public String getDigitalCardId() {
	  return digitalCardId;
  }
  
  public void setDigitalCardId(String digitalCardId) {
	  this.digitalCardId = digitalCardId;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("TicketRequest [OemRequest=");
    builder.append(super.toString());
    builder.append(", digitalTicketId=");
    builder.append(digitalTicketId);
    builder.append(", digitalCardId=");
    builder.append(digitalCardId);
    builder.append("]");
    return builder.toString();
  }


}
