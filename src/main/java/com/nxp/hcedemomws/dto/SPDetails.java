package com.nxp.hcedemomws.dto;

public class SPDetails {

  private String serviceProviderID;
  private String spName;
  private String location;
  private String spLogoURL;
  private String tosURL;

  private SPDetails() {

  }

  public SPDetails(Builder builder) {
    this.serviceProviderID = builder.serviceProviderID;
    this.spName = builder.spName;
    this.location = builder.location;
    this.spLogoURL = builder.spLogoURL;
    this.tosURL = builder.tosURL;
  }

  /**
   * @return the serviceProviderID
   */
  public String getServiceProviderID() {
    return serviceProviderID;
  }

  /**
   * @param serviceProviderID the serviceProviderID to set
   */
  public void setServiceProviderID(String serviceProviderID) {
    this.serviceProviderID = serviceProviderID;
  }

  /**
   * @return the spName
   */
  public String getSpName() {
    return spName;
  }

  /**
   * @param spName the spName to set
   */
  public void setSpName(String spName) {
    this.spName = spName;
  }

  /**
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * @param location the location to set
   */
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * @return the spLogoURL
   */
  public String getSpLogoURL() {
    return spLogoURL;
  }

  /**
   * @param spLogoURL the spLogoURL to set
   */
  public void setSpLogoURL(String spLogoURL) {
    this.spLogoURL = spLogoURL;
  }
  
  

  /**
   * @return the tosURL
   */
  public String getTosURL() {
    return tosURL;
  }

  /**
   * @param tosURL the tosURL to set
   */
  public void setTosURL(String tosURL) {
    this.tosURL = tosURL;
  }
  
  

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "SPDetails [serviceProviderID=" + serviceProviderID + ", spName=" + spName + ", location=" + location + ", spLogoURL=" + spLogoURL + ", tosURL=" + tosURL + "]";
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {

    private String serviceProviderID;
    private String spName;
    private String location;
    private String spLogoURL;
    private String tosURL;

    public Builder serviceProviderID(String val) {
      this.serviceProviderID = val;
      return this;
    }
    
    public Builder spName(String val) {
      this.spName = val;
      return this;
    }

    public Builder location(String val) {
      this.location = val;
      return this;
    }

    public Builder spLogoURL(String val) {
      this.spLogoURL = val;
      return this;
    }
    
    public Builder tosURL(String val) {
      this.tosURL = val;
      return this;
    }

    public SPDetails build() {
      return new SPDetails(this);
    }

  }

}
