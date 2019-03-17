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
 * @date 21-Dec-2017 9:09:46 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseDetails implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -2631123155893821958L;

  private String purchaseReceiptNumber;
  
  private String purchaseTime;
  
  private TicketCost ticketCost;
  
  private String purchaseMethod;
  
  private String repurchaseUrl;

  /**
   * @return the purchaseReceiptNumber
   */
  public String getPurchaseReceiptNumber() {
    return purchaseReceiptNumber;
  }

  /**
   * @param purchaseReceiptNumber the purchaseReceiptNumber to set
   */
  public void setPurchaseReceiptNumber(String purchaseReceiptNumber) {
    this.purchaseReceiptNumber = purchaseReceiptNumber;
  }

  /**
   * @return the purchaseTime
   */
  public String getPurchaseTime() {
    return purchaseTime;
  }

  /**
   * @param purchaseTime the purchaseTime to set
   */
  public void setPurchaseTime(String purchaseTime) {
    this.purchaseTime = purchaseTime;
  }

  /**
   * @return the ticketCost
   */
  public TicketCost getTicketCost() {
    return ticketCost;
  }

  /**
   * @param ticketCost the ticketCost to set
   */
  public void setTicketCost(TicketCost ticketCost) {
    this.ticketCost = ticketCost;
  }

  /**
   * @return the purchaseMethod
   */
  public String getPurchaseMethod() {
    return purchaseMethod;
  }

  /**
   * @param purchaseMethod the purchaseMethod to set
   */
  public void setPurchaseMethod(String purchaseMethod) {
    this.purchaseMethod = purchaseMethod;
  }

  /**
   * @return the repurchaseUrl
   */
  public String getRepurchaseUrl() {
    return repurchaseUrl;
  }

  /**
   * @param repurchaseUrl the repurchaseUrl to set
   */
  public void setRepurchaseUrl(String repurchaseUrl) {
    this.repurchaseUrl = repurchaseUrl;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    return "PurchaseDetails [purchaseReceiptNumber=" + purchaseReceiptNumber + ", purchaseTime="
        + purchaseTime + ", ticketCost=" + ticketCost + ", purchaseMethod=" + purchaseMethod
        + ", repurchaseUrl=" + repurchaseUrl + "]";
  }
  
}
