
package com.nxp.hcedemomws.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse implements Serializable {
  
  private BaseResponse(Builder builder) {
    this.status = builder.status;
    this.result = builder.result;
  }

  private String status;
  private String result;
  
  
  
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
   * @return the result
   */
  public String getResult() {
    return result;
  }



  /**
   * @param result the result to set
   */
  public void setResult(String result) {
    this.result = result;
  }

  
  


  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "BaseResponse [status=" + status + ", result=" + result + "]";
  }



  public static Builder builder() {
    return new Builder();
  }



  public static class Builder {
    
    private String status;
    private String result;
    
    public Builder status(String val) {
      this.status = val;
      return this;
    }
    
    public Builder result(String val) {
      this.result = val;
      return this;
    }
    
    public BaseResponse build() {
      return new BaseResponse(this);
    }
  }

}
