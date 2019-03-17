package com.nxp.hcedemomws.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenerateProductIDRequest implements Serializable {

	private static final long serialVersionUID = 6431829595695196261L;

	@Valid
	private RequestContextV1 requestContext;

	@Valid
	private List<Products> products;

	/*
	 * @Size(max = 64, message = "mifare.monorail.email.length", groups =
	 * SizeCheck.class)
	 * 
	 * @Pattern(regexp = Constants.REGEX_EMAIL_VALIDATION, message =
	 * "mifare.monorail.email.invalid", groups = RegexCheck.class) private String
	 * emailID;
	 */

	public List<Products> getProducts() {
		return products;
	}

	public void setProductOrders(List<Products> products) {
		this.products = products;
	}

	/*
	 * public String getEmailID() { return emailID; }
	 * 
	 * public void setEmailID(String emailID) { this.emailID = emailID; }
	 */

	public RequestContextV1 getRequestContext() {
		return requestContext;
	}

	public void setRequestContext(RequestContextV1 requestContext) {
		this.requestContext = requestContext;
	}

	@Override
	public String toString() {
		return "GenerateProductIDRequest [products=" + products + ", requestContext=" + requestContext + "]";
	}

}
