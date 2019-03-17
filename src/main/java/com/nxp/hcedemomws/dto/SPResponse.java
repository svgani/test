package com.nxp.hcedemomws.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SPResponse {

  public String status;
  public List<SPDetails> spDetails;
  
  private SPResponse(Builder builder) {
    this.status = builder.status;
    this.spDetails = builder.spDetails;
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

  /**
   * @return the spDetails
   */
  public List<SPDetails> getSpDetails() {
    return spDetails;
  }

  /**
   * @param spDetails the spDetails to set
   */
  public void setSpDetails(List<SPDetails> spDetails) {
    this.spDetails = spDetails;
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder  {
    public String status;
    public List<SPDetails> spDetails;
    
    public Builder status(String val) {
      this.status = val;
      return this;
    }
    public Builder spDetails(List<SPDetails> val) {
      this.spDetails = val;
      return this;
    }
    
    public SPResponse build() {
      return new SPResponse(this);
    }
  }

}
