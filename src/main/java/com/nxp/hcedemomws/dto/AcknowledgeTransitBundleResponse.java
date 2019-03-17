
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
public class AcknowledgeTransitBundleResponse extends OemResponse {

  /**
   * 
   */
  private static final long serialVersionUID = -8388011258740474381L;
  
  private String affectedDigitalTicketId;
  
  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append(">>> AcknowledgeTransitBundleResponse [");
	  sb.append(super.toString());
	  sb.append(", affectedDigitalTicketId: ");
	  sb.append(affectedDigitalTicketId);
	  sb.append("]");
	  return sb.toString();

  }

  /**
   * @return the affectedDigitalTicketId
   */
  public String getAffectedDigitalTicketId() {
    return affectedDigitalTicketId;
  }

  /**
   * @param affectedDigitalTicketId the affectedDigitalTicketId to set
   */
  public void setAffectedDigitalTicketId(String affectedDigitalTicketId) {
    this.affectedDigitalTicketId = affectedDigitalTicketId;
  }

}
