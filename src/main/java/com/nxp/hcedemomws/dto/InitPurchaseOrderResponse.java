package com.nxp.hcedemomws.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InitPurchaseOrderResponse implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 2630816077541559254L;
  
  private String responseCode;
  
  private String responseMsg;
  
  private String m2gReference;
  
  private String intentURL;

  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public String getResponseMsg() {
    return responseMsg;
  }

  public void setResponseMsg(String responseMsg) {
    this.responseMsg = responseMsg;
  }

  public String getM2gReference() {
    return m2gReference;
  }

  public void setM2gReference(String m2gReference) {
    this.m2gReference = m2gReference;
  }

  public String getIntentURL() {
    return intentURL;
  }

  public void setIntentURL(String intentURL) {
    this.intentURL = intentURL;
  }
  
  

}
