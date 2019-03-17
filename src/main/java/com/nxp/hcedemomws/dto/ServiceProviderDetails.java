package com.nxp.hcedemomws.dto;

public class ServiceProviderDetails {

  private String spName;

  private String location;

  private String serviceType;

  private String serviceProviderID;
  
  private String domainName;
  
  private String persoType;
  
  private String segment;
  
  private String tosURL;
  
  private String privacyPolicyURL;

  public String getSpName() {
    return spName;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getServiceType() {
    return serviceType;
  }

  public String getServiceProviderID() {
    return serviceProviderID;
  }

  public void setSpName(String spName) {
    this.spName = spName;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public void setServiceProviderID(String serviceProviderID) {
    this.serviceProviderID = serviceProviderID;
  }

  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public String getPersoType() {
    return persoType;
  }

  public void setPersoType(String persoType) {
    this.persoType = persoType;
  }

  public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }

  public String getTosURL() {
    return tosURL;
  }

  public void setTosURL(String tosURL) {
    this.tosURL = tosURL;
  }

  public String getPrivacyPolicyURL() {
    return privacyPolicyURL;
  }

  public void setPrivacyPolicyURL(String privacyPolicyURL) {
    this.privacyPolicyURL = privacyPolicyURL;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(" >>> ServiceProviderDetails [");
    builder.append(super.toString());
    builder.append(", spName=");
    builder.append(spName);
    builder.append(", location=");
    builder.append(location);
    builder.append(", serviceType=");
    builder.append(serviceType);
    builder.append(", serviceProviderID=");
    builder.append(serviceProviderID);
    builder.append(", domainName=");
    builder.append(domainName);
    builder.append(", persoType=");
    builder.append(persoType);
    builder.append(", segment=");
    builder.append(segment);
    builder.append(", tosURL=");
    builder.append(tosURL);
    builder.append("]");
    return builder.toString();
  }
  
  

}
