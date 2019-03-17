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
 * @date 21-Dec-2017 9:19:18 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicketValidityParameters implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -8997663398882413048L;
  
  private TimePeriod validityPeriod;

  private String expiryTime;
  
  private Integer numberOfTrips;

  /**
   * @return the validityPeriod
   */
  public TimePeriod getValidityPeriod() {
    return validityPeriod;
  }

  /**
   * @param validityPeriod the validityPeriod to set
   */
  public void setValidityPeriod(TimePeriod validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

  /**
   * @return the expiryTime
   */
  public String getExpiryTime() {
    return expiryTime;
  }

  /**
   * @param expiryTime the expiryTime to set
   */
  public void setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    return "TicketValidityParameters [validityPeriod=" + validityPeriod + ", expiryTime="
        + expiryTime + "]";
  }

  /**
   * @return the numberOfTrips
   */
  public Integer getNumberOfTrips() {
    return numberOfTrips;
  }

  /**
   * @param numberOfTrips the numberOfTrips to set
   */
  public void setNumberOfTrips(Integer numberOfTrips) {
    this.numberOfTrips = numberOfTrips;
  }
}
