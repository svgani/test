package com.nxp.hcedemomws.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SPWidgetsResponse {
  
  public String status;
  public List<SPWidgetDetails> spWidgetDetails;
  
  private SPWidgetsResponse(Builder builder) {
    this.status = builder.status;
    this.spWidgetDetails = builder.spWidgetDetails;
  }

  /**
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * @param status the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }

 
  public static Builder builder() {
    return new Builder();
  }
  
  /**
   * @return the spWidgetDetails
   */
  public List<SPWidgetDetails> getSpWidgetDetails() {
    return spWidgetDetails;
  }

  /**
   * @param spWidgetsDetails the spWidgetsDetails to set
   */
  public void setSpWidgetDetails(List<SPWidgetDetails> spWidgetDetails) {
    this.spWidgetDetails = spWidgetDetails;
  }
  

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "SPWidgetsResponse [status=" + status + ", spWidgetDetails=" + spWidgetDetails + "]";
  }

  public static class Builder  {
    public String status;
    public List<SPWidgetDetails> spWidgetDetails;
    
    public Builder status(String val) {
      this.status = val;
      return this;
    }
    public Builder spWidgetDetails(List<SPWidgetDetails> val) {
      this.spWidgetDetails = val;
      return this;
    }
    
    public SPWidgetsResponse build() {
      return new SPWidgetsResponse(this);
    }
  }

  
}
