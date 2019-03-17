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
 * @date Sep 28, 2017 11:20:44 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UndigitizeTicketResponse extends OemResponse {

  /**
   * 
   */
  private static final long serialVersionUID = 8605059918647842911L;
  
  private TransitBundle transitBundle;
  
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
    builder.append(" >>> UndigitizeTicketResponse [");
    builder.append(super.toString());
    builder.append("transitBundle=");
    builder.append(transitBundle);
    builder.append("]");
    return builder.toString();
  }
}
