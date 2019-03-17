/**
 * 
 */
package com.nxp.hcedemomws.dto;

import java.io.Serializable;

/**
 *
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 19-Sep-2017 11:58:50 AM
 * @version 1.0
 */
public class PingResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8829010144017113790L;

	private ResponseContext responseContext;

	/**
	 * @return the responseContext
	 */
	public ResponseContext getResponseContext() {
		return responseContext;
	}

	/**
	 * @param responseContext
	 *            the responseContext to set
	 */
	public void setResponseContext(ResponseContext responseContext) {
		this.responseContext = responseContext;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PingResponse [responseContext=");
		sb.append(responseContext == null ? "NULL" : responseContext.toString());
		sb.append("]");
		return sb.toString();

	}

}
