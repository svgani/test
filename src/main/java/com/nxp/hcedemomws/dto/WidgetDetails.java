package com.nxp.hcedemomws.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WidgetDetails implements Serializable {
   
  /**
   * 
   */
  private static final long serialVersionUID = -8998927816201488787L;

  private String name;

  private String widgetID;

  private String location;

  private String serviceProviderID;

  private String serviceProvider;

  private String serviceType;

  private String expDate;

  private String termsAndConditions;

  private String thumbnailImage;

  private String segment;

  private String termsAndConditionsURL;

  private String imageURL;

  private String currency;

  private String price;

  private String acceptedLocations;

  private Boolean authenticationRequired;

  private Boolean topupAllowed;

  private List<UserInputs> authUserInputs;

  private List<UserInputs> topupUserInputs;
  
  private String description;
  
  private String aid;
  
  private String ptoReferenceId;
  
  private String overlayTextColor;
  
  private String imgaeStaticContentID;
  
  private String cardBackgroundColor;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getWidgetID() {
    return widgetID;
  }

  public void setWidgetID(String widgetID) {
    this.widgetID = widgetID;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getServiceProviderID() {
    return serviceProviderID;
  }

  public void setServiceProviderID(String serviceProviderID) {
    this.serviceProviderID = serviceProviderID;
  }

  public String getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(String serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public String getExpDate() {
    return expDate;
  }

  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }

  public String getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  public String getThumbnailImage() {
    return thumbnailImage;
  }

  public void setThumbnailImage(String thumbnailImage) {
    this.thumbnailImage = thumbnailImage;
  }

  public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }

  public String getTermsAndConditionsURL() {
    return termsAndConditionsURL;
  }

  public void setTermsAndConditionsURL(String termsAndConditionsURL) {
    this.termsAndConditionsURL = termsAndConditionsURL;
  }

  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Boolean getAuthenticationRequired() {
    return authenticationRequired;
  }

  public void setAuthenticationRequired(Boolean authenticationRequired) {
    this.authenticationRequired = authenticationRequired;
  }
  
  public String getAcceptedLocations() {
	  return acceptedLocations;
  }
  
  public void setAcceptedLocations(String acceptedLocations) {
	  this.acceptedLocations = acceptedLocations;
  }

  public Boolean getTopupAllowed() {
    return topupAllowed;
  }

  public void setTopupAllowed(Boolean topupAllowed) {
    this.topupAllowed = topupAllowed;
  }

  public List<UserInputs> getAuthUserInputs() {
    return authUserInputs;
  }

  public void setAuthUserInputs(List<UserInputs> authUserInputs) {
    this.authUserInputs = authUserInputs;
  }

  public List<UserInputs> getTopupUserInputs() {
    return topupUserInputs;
  }

  public void setTopupUserInputs(List<UserInputs> topupUserInputs) {
    this.topupUserInputs = topupUserInputs;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAid() {
    return aid;
  }

  public void setAid(String aid) {
    this.aid = aid;
  }

  public String getPtoReferenceId() {
    return ptoReferenceId;
  }

  public void setPtoReferenceId(String ptoReferenceId) {
    this.ptoReferenceId = ptoReferenceId;
  }

  public String getOverlayTextColor() {
    return overlayTextColor;
  }

  public void setOverlayTextColor(String overlayTextColor) {
    this.overlayTextColor = overlayTextColor;
  }

  public String getImgaeStaticContentID() {
	  return imgaeStaticContentID;
  }

  public void setImgaeStaticContentID(String imgaeStaticContentID) {
	  this.imgaeStaticContentID = imgaeStaticContentID;
  }
  
  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(" >>> WidgetDetails [");
    builder.append(super.toString());
    builder.append(", name=");
    builder.append(name);
    builder.append(", widgetID=");
    builder.append(widgetID);
    builder.append(", location=");
    builder.append(location);
    builder.append(", serviceProviderID=");
    builder.append(serviceProviderID);
    builder.append(", serviceProvider=");
    builder.append(serviceProvider);
    builder.append(", serviceType=");
    builder.append(serviceType);
    builder.append(", expDate=");
    builder.append(expDate);
    builder.append(", termsAndConditions=");
    builder.append(termsAndConditions);
    builder.append(", thumbnailImage=");
    builder.append(thumbnailImage);
    builder.append(", segment=");
    builder.append(segment);
    builder.append(", termsAndConditionsURL=");
    builder.append(termsAndConditionsURL);
    builder.append(", imageURL=");
    builder.append(imageURL);
    builder.append(", currency=");
    builder.append(currency);
    builder.append(", price=");
    builder.append(price);
    builder.append(", acceptedLocations=");
    builder.append(acceptedLocations);
    builder.append(", authenticationRequired=");
    builder.append(authenticationRequired);
    builder.append(", topupAllowed=");
    builder.append(topupAllowed);
    builder.append(", authUserInputs=");
    builder.append(authUserInputs);
    builder.append(", topupUserInputs=");
    builder.append(topupUserInputs);
    builder.append(", description=");
    builder.append(description);
    builder.append(", ptoReferenceId=");
    builder.append(ptoReferenceId);
    builder.append(", overlayTextColor=");
    builder.append(overlayTextColor);
    builder.append("]");
    return builder.toString();
  }

  public String getCardBackgroundColor() {
    return cardBackgroundColor;
  }

  public void setCardBackgroundColor(String cardBackgroundColor) {
    this.cardBackgroundColor = cardBackgroundColor;
  }


}
