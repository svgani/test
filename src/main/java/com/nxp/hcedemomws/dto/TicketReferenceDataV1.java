package com.nxp.hcedemomws.dto;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicketReferenceDataV1 implements Serializable {

	private static final long serialVersionUID = -7912669103782058590L;

	private String spProductReference;
	private String m2gReference;
	private String intentURL;

	/**
	 * @return the spProductReference
	 */
	public String getSpProductReference() {
		return spProductReference;
	}

	/**
	 * @param spProductReference
	 *            the spProductReference to set
	 */
	public void setSpProductReference(String spProductReference) {
		this.spProductReference = spProductReference;
	}

	/**
	 * @return the m2gReference
	 */
	public String getM2gReference() {
		return m2gReference;
	}

	/**
	 * @param m2gReference
	 *            the m2gReference to set
	 */
	public void setM2gReference(String m2gReference) {
		this.m2gReference = m2gReference;
	}

	/**
	 * @return the intentURL
	 */
	public String getIntentURL() {
		return intentURL;
	}

	/**
	 * @param intentURL
	 *            the intentURL to set
	 */
	public void setIntentURL(String intentURL) {
		this.intentURL = intentURL;
	}

	@Override
	public String toString() {
		return "TicketReferenceData [spProductReference=" + spProductReference + ", m2gReference=" + m2gReference
				+ ", intentURL=" + intentURL + "]";
	}

}
