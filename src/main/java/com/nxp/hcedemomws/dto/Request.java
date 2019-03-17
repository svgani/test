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
 * @date 12-Apr-2017 12:05:19 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Request implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 4115625380059961431L;
  
  private Long createdBy;
  
  private String requestID;
  
  private String timeZone;
  
  private String walletID;

  private Integer pageNumber;

  private Integer pageSize;

  /**
   * @return the requestID
   */
  public String getRequestID() {
    return requestID;
  }

  /**
   * @param requestID the requestID to set
   */
  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }

  /**
   * @return the timeZone
   */
  public String getTimeZone() {
    return timeZone;
  }

  /**
   * @param timeZone the timeZone to set
   */
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   * @return the walletID
   */
  public String getWalletID() {
    return walletID;
  }

  /**
   * @param walletID the walletID to set
   */
  public void setWalletID(String walletID) {
    this.walletID = walletID;
  }

  /**
   * @return the pageNumber
   */
  public Integer getPageNumber() {
    return pageNumber;
  }

  /**
   * @param pageNumber
   *          the pageNumber to set
   */
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   * @return the pageSize
   */
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * @param pageSize
   *          the pageSize to set
   */
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * @return the createdBy
   */
  public Long getCreatedBy() {
    return createdBy;
  }

  /**
   * @param createdBy the createdBy to set
   */
  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(" >>> Request [");
    builder.append(super.toString());
    builder.append(", createdBy=");
    builder.append(createdBy);
    builder.append(", requestID=");
    builder.append(requestID);
    builder.append(", timeZone=");
    builder.append(timeZone);
    builder.append(", walletID=");
    builder.append(walletID);
    builder.append(", pageNumber=");
    builder.append(pageNumber);
    builder.append(", pageSize=");
    builder.append(pageSize);
    builder.append("]");
    return builder.toString();
  }
  
  

}
