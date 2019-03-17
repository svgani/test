/**
 * 
 */
package com.nxp.hcedemomws.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 12-Apr-2017 12:08:35 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -8577115779634648714L;

  private String status;

  private String statusMessage;

  private String requestID;
  
  private String errorCode;

  private String errorMessage;
  
  private Integer totalNoOfRows;
  
  private List<? extends Serializable> responseList;

  /**
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * @param status
   *          the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * @return the statusMessage
   */
  public String getStatusMessage() {
    return statusMessage;
  }

  /**
   * @param statusMessage
   *          the statusMessage to set
   */
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  /**
   * @return the requestID
   */
  public String getRequestID() {
    return requestID;
  }

  /**
   * @param requestID
   *          the requestID to set
   */
  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }

  
  /**
   * @return the errorCode
   */
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * @param errorCode
   *          the errorCode to set
   */
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * @return the errorMessage
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * @param errorMessage
   *          the errorMessage to set
   */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * @return the totalNoOfRows
   */
  public Integer getTotalNoOfRows() {
    return totalNoOfRows;
  }

  /**
   * @param totalNoOfRows the totalNoOfRows to set
   */
  public void setTotalNoOfRows(Integer totalNoOfRows) {
    this.totalNoOfRows = totalNoOfRows;
  }
  
  public List<?> getResponseList() {
    return responseList;
  }

  public void setResponseList(List responseList) {
    this.responseList = responseList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(">>> Response [");
		builder.append(super.toString());
		builder.append(", status=");
		builder.append(status);
		builder.append(", statusMessage=");
		builder.append(statusMessage);
		builder.append(", requestID=");
		builder.append(requestID);
		builder.append(", errorCode=");
		builder.append(errorCode);
		builder.append(", errorMessage=");
		builder.append(errorMessage);
		builder.append(", totalNoOfRows=");
		builder.append(totalNoOfRows);
		builder.append(", responseList=");
		builder.append(responseList == null ? "NULL" : responseList.toString());
		builder.append("]");
		return builder.toString();
	}
}
