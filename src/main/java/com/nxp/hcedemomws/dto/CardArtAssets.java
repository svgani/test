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
 * @date Sep 28, 2017 1:46:27 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardArtAssets implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -3600133760649821170L;

  private String cardArtStaticContentId;
  private String cardOverlayTextColor;
  private String cardBackgroundColor;

  /**
   * @return the cardArtStaticContentId
   */
  public String getCardArtStaticContentId() {
    return cardArtStaticContentId;
  }

  /**
   * @param cardArtStaticContentId the cardArtStaticContentId to set
   */
  public void setCardArtStaticContentId(String cardArtStaticContentId) {
    this.cardArtStaticContentId = cardArtStaticContentId;
  }

  /**
   * @return the cardOverlayTextColor
   */
  public String getCardOverlayTextColor() {
    return cardOverlayTextColor;
  }

  /**
   * @param cardOverlayTextColor the cardOverlayTextColor to set
   */
  public void setCardOverlayTextColor(String cardOverlayTextColor) {
    this.cardOverlayTextColor = cardOverlayTextColor;
  }

  /**
   * @return the cardBackgroundColor
   */
  public String getCardBackgroundColor() {
    return cardBackgroundColor;
  }

  /**
   * @param cardBackgroundColor the cardBackgroundColor to set
   */
  public void setCardBackgroundColor(String cardBackgroundColor) {
    this.cardBackgroundColor = cardBackgroundColor;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(" >>> CardArtAssets [");
    builder.append(super.toString());
    builder.append(", cardOverlayTextColor=");
    builder.append(cardOverlayTextColor);
    builder.append(", cardBackgroundColor=");
    builder.append(cardBackgroundColor);
    builder.append("]");
    return builder.toString();
  }


}
