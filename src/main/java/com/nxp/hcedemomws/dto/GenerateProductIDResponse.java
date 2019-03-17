package com.nxp.hcedemomws.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class GenerateProductIDResponse implements Serializable {

	private static final long serialVersionUID = -2370897592189377850L;

	private ResponseContext responseContext;

	private List<TicketReferenceDataV1> references;

	private String cardUid;

	private String ptoConfigurations;

	/**
	 * @return the references
	 */
	public List<TicketReferenceDataV1> getReferences() {
		return references;
	}

	/**
	 * @param references
	 *            the references to set
	 */
	public void setReferences(List<TicketReferenceDataV1> references) {
		this.references = references;
	}

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
	//
	// /**
	// * @return the cardUid
	// */
	// public String getCardUid() {
	// return cardUid;
	// }
	//
	// /**
	// * @param cardUid
	// * the cardUid to set
	// */
	// public void setCardUid(String cardUid) {
	// this.cardUid = cardUid;
	// }
	//
	// /**
	// * @return the ptoConfigurations
	// */
	// public String getPtoConfigurations() {
	// return ptoConfigurations;
	// }
	//
	// /**
	// * @param ptoConfigurations
	// * the ptoConfigurations to set
	// */
	// public void setPtoConfigurations(String ptoConfigurations) {
	// this.ptoConfigurations = ptoConfigurations;
	// }

	@Override
	public String toString() {
		return "GenerateProductIDResponse [references=" + references + ", responseContext=" + responseContext + "]";
	}

}
