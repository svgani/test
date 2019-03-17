package com.nxp.hcedemomws.dto;

import java.io.Serializable;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Products implements Serializable {

	private static final long serialVersionUID = 3410765211455512087L;
	@Size(max = 40, message = "mifare.monorail.ticket.id.length")
	private String spProductReference;

	private String productTypeId;

	private ProductMetadata productMetadata;

	/**
	 * @return the productTypeId
	 */
	public String getProductTypeId() {
		return productTypeId;
	}

	/**
	 * @param productTypeId
	 *            the productTypeId to set
	 */
	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}

	/**
	 * @return the productMetadata
	 */
	public ProductMetadata getProductMetadata() {
		return productMetadata;
	}

	/**
	 * @param productMetadata
	 *            the productMetadata to set
	 */
	public void setProductMetadata(ProductMetadata productMetadata) {
		this.productMetadata = productMetadata;
	}

	/**
	 * @return the spProductReferenceId
	 */
	public String getSpProductReference() {
		return spProductReference;
	}

	/**
	 * @param spProductReferenceId
	 *            the spProductReferenceId to set
	 */
	public void setSpProductReference(String spProductReference) {
		this.spProductReference = spProductReference;
	}

	@Override
	public String toString() {
		return "Products [spProductReference=" + spProductReference + ", productTypeId=" + productTypeId
				+ ", productMetadata=" + productMetadata + "]";
	}

}
