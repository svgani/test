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
 * @date 21-Dec-2017 9:14:34 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicketCost implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -7456616848211361563L;
  
  private String currencyCode;
  
  private Long amount;
  
  private Long discountPercent;

  /**
   * @return the currencyCode
   */
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * @param currencyCode the currencyCode to set
   */
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * @return the amount
   */
  public Long getAmount() {
    return amount;
  }

  /**
   * @param amount the amount to set
   */
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   * @return the discountPercent
   */
  public Long getDiscountPercent() {
    return discountPercent;
  }

  /**
   * @param discountPercent the discountPercent to set
   */
  public void setDiscountPercent(Long discountPercent) {
    this.discountPercent = discountPercent;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    return "TicketCost [currencyCode=" + currencyCode + ", amount=" + amount + ", discountPercent="
        + discountPercent + "]";
  }
  
}
