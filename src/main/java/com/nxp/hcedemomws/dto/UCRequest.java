
package com.nxp.hcedemomws.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UCRequest implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -8583383715301451258L;

  private String digitalCardId;

  private String digitizedCardStatus;
  
  private TransitBundle transitBundle;

  private String cardUndigitizationReason;
  
  /**
     * @return the digitalCardId
     */
  public String getDigitalCardId() {
    return digitalCardId;
  }

  /**
   * @param digitalCardId the digitalCardId to set
   */
  public void setDigitalCardId(String digitalCardId) {
    this.digitalCardId = digitalCardId;
  }
  
  /**
   * @return the digitizedCardStatus
   */
  public String getDigitizedCardStatus() {
    return digitizedCardStatus;
  }

  /**
   * @param digitizedCardStatus the digitizedCardStatus to set
   */
  public void setDigitizedCardStatus(String digitizedCardStatus) {
    this.digitizedCardStatus = digitizedCardStatus;
  }

  /**
   * @return the cardUndigitizationReason
   */
  public String getCardUndigitizationReason() {
    return cardUndigitizationReason;
  }

  /**
   * @param cardUndigitizationReason the cardUndigitizationReason to set
   */
  public void setCardUndigitizationReason(String cardUndigitizationReason) {
    this.cardUndigitizationReason = cardUndigitizationReason;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(">>> UpdateCardStatusRequest [");
      sb.append(super.toString());
      sb.append(", digitalCardId=");
      sb.append(digitalCardId);
      sb.append(", digitizedCardStatus=");
      sb.append(digitizedCardStatus);
      sb.append(", reason=");
      sb.append(cardUndigitizationReason);
      sb.append("]");
      return sb.toString();

  }

  /**
   * @return the transitBundle
   */
  public TransitBundle getTransitBundle() {
    return transitBundle;
  }

  /**
   * @param transitBundle the transitBundle to set
   */
  public void setTransitBundle(TransitBundle transitBundle) {
    this.transitBundle = transitBundle;
  }

}
