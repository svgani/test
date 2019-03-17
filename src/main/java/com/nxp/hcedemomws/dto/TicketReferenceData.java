package com.nxp.hcedemomws.dto;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicketReferenceData implements Serializable {

	private static final long serialVersionUID = -7912669103782058590L;

	private String ticketId;

	private String ticketReference;

	private String intentURL;

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketReference() {
		return ticketReference;
	}

	public void setTicketReference(String ticketReference) {
		this.ticketReference = ticketReference;
	}

	public String getIntentURL() {
		return intentURL;
	}

	public void setIntentURL(String intentURL) {
		this.intentURL = intentURL;
	}

}
