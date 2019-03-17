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
 * @date 26-Sep-2017 11:16:04 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcknowledgeTransitBundleRequest extends OemRequest {

  /**
   * 
   */
  private static final long serialVersionUID = 1889612911634383211L;
  
  private String digitalCardId;
  
  private String transitBundleId;
  
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
	 * @return the transitBundleId
	 */
	public String getTransitBundleId() {
		return transitBundleId;
	}

	/**
	 * @param transitBundleId
	 *            the transitBundleId to set
	 */
	public void setTransitBundleId(String transitBundleId) {
		this.transitBundleId = transitBundleId;
	}

	  @Override
	  public String toString() {
		  StringBuilder sb = new StringBuilder();
		  sb.append(">>> AcknowledgeTransitBundleRequest [");
		  sb.append(super.toString());
		  sb.append(", digitalCardId=");
		  sb.append(digitalCardId);
		  sb.append(", transitBundleId=");
		  sb.append(transitBundleId);
		  sb.append("]");
		  return sb.toString();

	  }
	 
}
