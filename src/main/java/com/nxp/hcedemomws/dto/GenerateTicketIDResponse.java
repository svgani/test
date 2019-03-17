package com.nxp.hcedemomws.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateTicketIDResponse implements Serializable {

	private static final long serialVersionUID = -2370897592189377850L;
	private List<TicketReferenceData> ticketReferences;

	private ResponseContext responseContext;

	public List<TicketReferenceData> getTicketReferences() {
		return ticketReferences;
	}

	public void setTicketReferences(List<TicketReferenceData> ticketReferences) {
		this.ticketReferences = ticketReferences;
	}

	public ResponseContext getResponseContext() {
		return responseContext;
	}

	public void setResponseContext(ResponseContext responseContext) {
		this.responseContext = responseContext;
	}

}
