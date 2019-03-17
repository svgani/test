package com.nxp.hcedemomws.dto;

public class AckTicketPurchaseResponse {

  public String status;
  private String affectedDigitalTicketId;
  
 

  private AckTicketPurchaseResponse(Builder builder) {
    this.status = builder.status;
    this.affectedDigitalTicketId = builder.affectedDigitalTicketId;
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
   * @return the affectedDigitalTicketId
   */
  public String getAffectedDigitalTicketId() {
    return affectedDigitalTicketId;
  }

  /**
   * @param affectedDigitalTicketId the affectedDigitalTicketId to set
   */
  public void setAffectedDigitalTicketId(String affectedDigitalTicketId) {
    this.affectedDigitalTicketId = affectedDigitalTicketId;
  }
  
  

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "AckTicketPurchaseResponse [status=" + status + ", affectedDigitalTicketId=" + affectedDigitalTicketId + "]";
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    
    public String status;
    private String affectedDigitalTicketId;

    public Builder status(String val) {
      this.status = val;
      return this;
    }

    public Builder affectedDigitalTicketId(String val) {
      this.affectedDigitalTicketId = val;
      return this;
    }

    public AckTicketPurchaseResponse build() {
      return new AckTicketPurchaseResponse(this);
    }
  }

}
