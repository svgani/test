package com.nxp.hcedemomws.dto;

public class GetServiceProvidersRequest extends OemRequest {

  private static final long serialVersionUID = -6142760985327260841L;

  private String location;

  private String spName;
  
  private String pageNumber;

  private String pageSize;

  /**
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * @param location
   *          the location to set
   */
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * @return the spName
   */
  public String getSpName() {
    return spName;
  }

  /**
   * @param spName
   *          the spName to set
   */
  public void setSpName(String spName) {
    this.spName = spName;
  }

  public String getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  public String getPageSize() {
    return pageSize;
  }

  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(" >>> GetServiceProvidersRequest [");
    builder.append(super.toString());
    builder.append(", location=");
    builder.append(location);
    builder.append(", spName=");
    builder.append(spName);
    builder.append("]");
    return builder.toString();
  }

}
