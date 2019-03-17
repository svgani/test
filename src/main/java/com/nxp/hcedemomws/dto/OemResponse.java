package com.nxp.hcedemomws.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 *
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 19-Sep-2017 9:18:06 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OemResponse implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 8529290290974430128L;
  
  private ResponseContext responseContext;
  
  private String encryptedResponsePayload;

  /**
   * @return the responseContext
   */
  public ResponseContext getResponseContext() {
    return responseContext;
  }

  /**
   * @param responseContext the responseContext to set
   */
  public void setResponseContext(ResponseContext responseContext) {
    this.responseContext = responseContext;
  }

  /**
   * @return the encryptedResponsePayload
   */
  public String getEncryptedResponsePayload() {
    return encryptedResponsePayload;
  }

  /**
   * @param encryptedResponsePayload the encryptedResponsePayload to set
   */
  public void setEncryptedResponsePayload(String encryptedResponsePayload) {
    this.encryptedResponsePayload = encryptedResponsePayload;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append("OemResponse [responseContext=");
	  sb.append(responseContext == null ? "NULL" : responseContext.toString());
	  sb.append(", encryptedResponsePayload=");
	  sb.append(encryptedResponsePayload);
	  sb.append("]");
	  return sb.toString();
  }

}
