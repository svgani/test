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
 * @date 21-Sep-2017 10:09:34 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceData implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 4248206557329344964L;
  
  private String deviceId;
  
  private String phoneNumber;
  
  private String brand;
  
  private String manufacturer;
  
  private String model;
  
  private String nickname;
  

  /**
   * @return the deviceId
   */
  public String getDeviceId() {
    return deviceId;
  }

  /**
   * @param deviceId the deviceId to set
   */
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  /**
   * @return the phoneNumber
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * @param phoneNumber the phoneNumber to set
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * @return the brand
   */
  public String getBrand() {
    return brand;
  }

  /**
   * @param brand the brand to set
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * @return the manufacturer
   */
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * @param manufacturer the manufacturer to set
   */
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * @return the model
   */
  public String getModel() {
    return model;
  }

  /**
   * @param model the model to set
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * @return the nickname
   */
  public String getNickname() {
    return nickname;
  }

  /**
   * @param nickname the nickname to set
   */
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append(">>>>>> DeviceData [deviceId=");
	  sb.append(deviceId);
	  sb.append(", brand=");
	  sb.append(brand);
	  sb.append(", manufacturer=");
	  sb.append(manufacturer);
	  sb.append(", model=");
	  sb.append(model);
	  sb.append(", nickname=");
	  sb.append(nickname);
	  sb.append(", phoneNumber=");
	  sb.append(phoneNumber);
	  sb.append("]");
	  return sb.toString();
  }

}
