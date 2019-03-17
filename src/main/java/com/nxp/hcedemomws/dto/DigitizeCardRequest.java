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
 * @date 21-Sep-2017 10:08:29 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DigitizeCardRequest extends OemRequest implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -1102531232054658437L;

  private String transitAgencyId;

  private DeviceData deviceData;

  /**
   * @return the transitAgencyId
   */
  public String getTransitAgencyId() {
    return transitAgencyId;
  }

  /**
   * @param transitAgencyId the transitAgencyId to set
   */
  public void setTransitAgencyId(String transitAgencyId) {
    this.transitAgencyId = transitAgencyId;
  }

  /**
   * @return the deviceData
   */
  public DeviceData getDeviceData() {
    return deviceData;
  }

  /**
   * @param deviceData the deviceData to set
   */
  public void setDeviceData(DeviceData deviceData) {
    this.deviceData = deviceData;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append(">>> DigitizeCardRequest [");
	  sb.append(super.toString());
	  sb.append(", transitAgencyId=");
	  sb.append(transitAgencyId);
	  sb.append(", deviceData=");
	  sb.append(deviceData == null ? "NULL" : deviceData.toString());
	  sb.append("]");
	  return sb.toString();

  }

}
