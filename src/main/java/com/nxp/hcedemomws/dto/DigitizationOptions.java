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
 * @date Sep 28, 2017 1:49:19 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DigitizationOptions implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 4118750466585413709L;

  private boolean digitizationAllowed;
  private String earliestDigitizationTime;
  private Integer numDigitizationsLeft;
  private String digitizationBlockingReason;

  /**
   * @return the digitizationAllowed
   */
  public boolean isDigitizationAllowed() {
    return digitizationAllowed;
  }

  /**
   * @param digitizationAllowed the digitizationAllowed to set
   */
  public void setDigitizationAllowed(boolean digitizationAllowed) {
    this.digitizationAllowed = digitizationAllowed;
  }

  /**
   * @return the earliestDigitizationTime
   */
  public String getEarliestDigitizationTime() {
    return earliestDigitizationTime;
  }

  /**
   * @param earliestDigitizationTime the earliestDigitizationTime to set
   */
  public void setEarliestDigitizationTime(String earliestDigitizationTime) {
    this.earliestDigitizationTime = earliestDigitizationTime;
  }

  /**
   * @return the numDigitizationsLeft
   */
  public Integer getNumDigitizationsLeft() {
    return numDigitizationsLeft;
  }

  /**
   * @param numDigitizationsLeft the numDigitizationsLeft to set
   */
  public void setNumDigitizationsLeft(Integer numDigitizationsLeft) {
    this.numDigitizationsLeft = numDigitizationsLeft;
  }

  /**
   * @return the digitizationBlockingReason
   */
  public String getDigitizationBlockingReason() {
    return digitizationBlockingReason;
  }

  /**
   * @param digitizationBlockingReason the digitizationBlockingReason to set
   */
  public void setDigitizationBlockingReason(String digitizationBlockingReason) {
    this.digitizationBlockingReason = digitizationBlockingReason;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("DigitizationOptions [digitizationAllowed=");
      sb.append(digitizationAllowed);
      sb.append(", earliestDigitizationTime=");
      sb.append(earliestDigitizationTime);
      sb.append(", numDigitizationsLeft=");
      sb.append(numDigitizationsLeft);
      sb.append(", digitizationBlockingReason=");
      sb.append(digitizationBlockingReason);
      sb.append("]");
      return sb.toString();

  }
  
}
