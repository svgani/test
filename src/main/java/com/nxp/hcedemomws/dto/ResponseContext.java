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
 * @date 19-Sep-2017 10:38:36 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseContext implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -3187654828185394904L;

  private String requestId;

  private String responseCode;

  private String responseMessage;

  /**
   * @return the responseCode
   */
  public String getResponseCode() {
    return responseCode;
  }

  /**
   * @return the requestId
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * @param resMes
   */
  public void setResponseMessage(String resMes) {
    this.responseMessage = resMes;
  }

  /**
   * @param requestId
   *            the requestId to set
   */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * @param resCode
   */
  public void setResponseCode(String resCode) {
    this.responseCode = resCode;
  }

  /**
  * @return
  */
  public String getResponseMessage() {
    return responseMessage;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(">>> ResponseContext [");
    builder.append(super.toString());
    builder.append(", requestId=");
    builder.append(requestId);
    builder.append(", responseCode=");
    builder.append(responseCode);
    builder.append(", responseMessage=");
    builder.append(responseMessage);
    builder.append("]");
    return builder.toString();
  }

}
