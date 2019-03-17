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
 * @date 19-Sep-2017 11:55:23 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PingRequest extends OemRequest implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -5562384687312013480L;

  private String encryptedRequestPayload;

  /**
   * @return the encryptedRequestPayload
   */
  public String getEncryptedRequestPayload() {
    return encryptedRequestPayload;
  }

  /**
   * @param encryptedRequestPayload the encryptedRequestPayload to set
   */
  public void setEncryptedRequestPayload(String encryptedRequestPayload) {
    this.encryptedRequestPayload = encryptedRequestPayload;
  }
  
  /**
   * @return
   */
  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append(" PingRequest [");
	  sb.append(super.toString());
	  sb.append("encryptedRequestPayload=");
	  sb.append(encryptedRequestPayload);
	  sb.append("]");
	  return sb.toString();
  }
}
