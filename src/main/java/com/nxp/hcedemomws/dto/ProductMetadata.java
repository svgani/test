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
 * @date Sep 28, 2017 1:50:55 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductMetadata implements Serializable {

	private static final long serialVersionUID = -6902466617955151803L;

	private CardArtAssets cardArtAssets;

	private TransitAgencyData transitAgencyData;

	private TransitAgencyApp transitAgencyApp;

	private DigitizationOptions digitizationOptions;

	private String displayTosUrl;

	private String ticketType;

	private String displayPtoTicketId;

	private PurchaseDetails purchaseDetails;

	private String refundWebsiteUrl;

	private TicketValidityParameters ticketValidityParameters;

	private String privacyPolicyUrl;

	/**
	 * @return the cardArtAssets
	 */
	public CardArtAssets getCardArtAssets() {
		return cardArtAssets;
	}

	/**
	 * @param cardArtAssets
	 *            the cardArtAssets to set
	 */
	public void setCardArtAssets(CardArtAssets cardArtAssets) {
		this.cardArtAssets = cardArtAssets;
	}

	/**
	 * @return the transitAgencyData
	 */
	public TransitAgencyData getTransitAgencyData() {
		return transitAgencyData;
	}

	/**
	 * @param transitAgencyData
	 *            the transitAgencyData to set
	 */
	public void setTransitAgencyData(TransitAgencyData transitAgencyData) {
		this.transitAgencyData = transitAgencyData;
	}

	/**
	 * @return the transitAgencyApp
	 */
	public TransitAgencyApp getTransitAgencyApp() {
		return transitAgencyApp;
	}

	/**
	 * @param transitAgencyApp
	 *            the transitAgencyApp to set
	 */
	public void setTransitAgencyApp(TransitAgencyApp transitAgencyApp) {
		this.transitAgencyApp = transitAgencyApp;
	}

	/**
	 * @return the digitizationOptions
	 */
	public DigitizationOptions getDigitizationOptions() {
		return digitizationOptions;
	}

	/**
	 * @param digitizationOptions
	 *            the digitizationOptions to set
	 */
	public void setDigitizationOptions(DigitizationOptions digitizationOptions) {
		this.digitizationOptions = digitizationOptions;
	}

	/**
	 * @return the displayTosUrl
	 */
	public String getDisplayTosUrl() {
		return displayTosUrl;
	}

	/**
	 * @param displayTosUrl
	 *            the displayTosUrl to set
	 */
	public void setDisplayTosUrl(String displayTosUrl) {
		this.displayTosUrl = displayTosUrl;
	}

	/**
	 * @return the refundWebsiteUrl
	 */
	public String getRefundWebsiteUrl() {
		return refundWebsiteUrl;
	}

	/**
	 * @param refundWebsiteUrl
	 *            the refundWebsiteUrl to set
	 */
	public void setRefundWebsiteUrl(String refundWebsiteUrl) {
		this.refundWebsiteUrl = refundWebsiteUrl;

	}

	/**
	 * @return the ticketType
	 */
	public String getTicketType() {
		return ticketType;
	}

	/**
	 * @param ticketType
	 *            the ticketType to set
	 */
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	/**
	 * @return the displayPtoTicketId
	 */
	public String getDisplayPtoTicketId() {
		return displayPtoTicketId;
	}

	/**
	 * @param displayPtoTicketId
	 *            the displayPtoTicketId to set
	 */
	public void setDisplayPtoTicketId(String displayPtoTicketId) {
		this.displayPtoTicketId = displayPtoTicketId;
	}

	/**
	 * @return the ticketValidityParameters
	 */
	public TicketValidityParameters getTicketValidityParameters() {
		return ticketValidityParameters;
	}

	/**
	 * @param ticketValidityParameters
	 *            the ticketValidityParameters to set
	 */
	public void setTicketValidityParameters(TicketValidityParameters ticketValidityParameters) {
		this.ticketValidityParameters = ticketValidityParameters;
	}

	/**
	 * @return the purchaseDetails
	 */
	public PurchaseDetails getPurchaseDetails() {
		return purchaseDetails;
	}

	/**
	 * @param purchaseDetails
	 *            the purchaseDetails to set
	 */
	public void setPurchaseDetails(PurchaseDetails purchaseDetails) {
		this.purchaseDetails = purchaseDetails;
	}

	/**
	 * 
	 * @return privacyPolicyUrl
	 */
	public String getPrivacyPolicyUrl() {
		return privacyPolicyUrl;
	}

	/**
	 * 
	 * @param privacyPolicyUrl
	 */
	public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
		this.privacyPolicyUrl = privacyPolicyUrl;
	}

	/**
	 * @return
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TicketMetadata [");
		builder.append(super.toString());
		builder.append(", cardArtAssets=");
		builder.append(cardArtAssets);
		builder.append(", transitAgencyData=");
		builder.append(transitAgencyData);
		builder.append(", transitAgencyApp=");
		builder.append(transitAgencyApp);
		builder.append(", digitizationOptions=");
		builder.append(digitizationOptions);
		builder.append(", displayTosUrl=");
		builder.append(displayTosUrl);
		builder.append(", refundWebsiteUrl=");
		builder.append(refundWebsiteUrl);
		builder.append(", purchaseDetails=");
		builder.append(purchaseDetails);
		builder.append("]");
		return builder.toString();
	}
}
