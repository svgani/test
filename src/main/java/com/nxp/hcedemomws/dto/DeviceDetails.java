/**
 * 
 */
package com.nxp.hcedemomws.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 12-Apr-2017 12:21:57 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceDetails implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -4496203674190865359L;

  private String name;

  private String serialNumber;

  private String type;

  private String os;

  private String imei;

  private String msisdn;
  
  private String osVersion;

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name
   *          the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the serialNumber
   */
  public String getSerialNumber() {
    return serialNumber;
  }

  /**
   * @param serialNumber
   *          the serialNumber to set
   */
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  /**
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * @param type
   *          the type to set
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * @return the os
   */
  public String getOs() {
    return os;
  }

  /**
   * @param os
   *          the os to set
   */
  public void setOs(String os) {
    this.os = os;
  }

  /**
   * @return the imei
   */
  public String getImei() {
    return imei;
  }

  /**
   * @param imei
   *          the imei to set
   */
  public void setImei(String imei) {
    this.imei = imei;
  }

  /**
   * @return the msisdn
   */
  public String getMsisdn() {
    return msisdn;
  }

  /**
   * @param msisdn
   *          the msisdn to set
   */
  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(" >>> DeviceDetails [");
    builder.append(super.toString());
    builder.append(", name=");
    builder.append(name);
    builder.append(", serialNumber=");
    builder.append(serialNumber);
    builder.append(", type=");
    builder.append(type);
    builder.append(", os=");
    builder.append(os);
    builder.append(", msisdn=");
    builder.append(msisdn);
    builder.append(", osVersion=");
    builder.append(osVersion);
    builder.append(", imei=");
    builder.append(imei);
    builder.append("]");
    return builder.toString();
  }


}
