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
public class RequestContextV1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8490332262818206481L;

	private String requestId;

	private String serviceProviderId;

	private String correlationId;

	/**
	 * @return the requesterId
	 */
	public String getServiceProviderId() {
		return serviceProviderId;
	}

	/**
	 * @param requesterId
	 *            the requesterId to set
	 */
	public void setServiceProviderId(String serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
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
		sb.append(", serviceProviderId=");
		sb.append(serviceProviderId);
		sb.append(", correlationId=");
		sb.append(correlationId);
		sb.append("]");
		return sb.toString();
	}

}
