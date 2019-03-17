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
 * @date 16-Sep-2017 8:08:03 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestContext implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8490332262818206481L;

	private String requestId;
	
	private String requesterId;

	private String correlationId;

	private String timeZone;

	/**
	 * @return the requesterId
	 */
	public String getRequesterId() {
		return requesterId;
	}

	/**
	 * @param requesterId
	 *            the requesterId to set
	 */
	public void setRequesterId(String requesterId) {
		this.requesterId = requesterId;
	}
	
	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}
	
	/**
	 * @param requestId
	 *            the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * @return the timeZone
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone
	 *            the timeZone to set
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	
	/**
	 * @return the correlationId
	 */
	public String getCorrelationId() {
		return correlationId;
	}
	
	/**
	 * @param correlationId
	 *            the correlationId to set
	 */
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

  /**
   * @return
   */
  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append("RequestContext [requestId=");
	  sb.append(requestId);
	  sb.append(", requesterId=");
	  sb.append(requesterId);
	  sb.append(", correlationId=");
	  sb.append(correlationId);
	  sb.append(", timeZone=");
	  sb.append(timeZone);
	  sb.append("]");
	  return sb.toString();
  }

}
