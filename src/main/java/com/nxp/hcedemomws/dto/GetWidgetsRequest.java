package com.nxp.hcedemomws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetWidgetsRequest extends OemRequest {

  private static final long serialVersionUID = 3386616567972477620L;

  private String location;

  private String serviceProviderID;

  private DeviceDetails deviceDetails;

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getServiceProviderID() {
    return serviceProviderID;
  }

  public void setServiceProviderID(String serviceProviderID) {
    this.serviceProviderID = serviceProviderID;
  }

  public DeviceDetails getDeviceDetails() {
    return deviceDetails;
  }

  public void setDeviceDetails(DeviceDetails deviceDetails) {
    this.deviceDetails = deviceDetails;
  }
  
  @Override
	public String toString() {
		StringBuilder sbGetWidgetsRequest = new StringBuilder();
		sbGetWidgetsRequest.append(" >>> GetWidgetsRequest [");
		sbGetWidgetsRequest.append(super.toString());
		sbGetWidgetsRequest.append(" location=");
		sbGetWidgetsRequest.append(location);
		sbGetWidgetsRequest.append(" serviceProviderID=");
		sbGetWidgetsRequest.append(serviceProviderID);
		sbGetWidgetsRequest.append(" deviceDetails=");
		sbGetWidgetsRequest.append(deviceDetails.toString());
		sbGetWidgetsRequest.append("]");
		return sbGetWidgetsRequest.toString();
	}

}
