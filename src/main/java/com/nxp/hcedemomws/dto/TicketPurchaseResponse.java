package com.nxp.hcedemomws.dto;

public class TicketPurchaseResponse {

  public String status;
  private String ticketId;
  private String digitalCardId;
  private String digitalTicketId;
  private TransitBundle transitBundle;

  private TicketPurchaseResponse(Builder builder) {
    this.status = builder.status;
    this.ticketId = builder.ticketId;
    this.digitalCardId = builder.digitalCardId;
    this.digitalTicketId = builder.digitalTicketId;
    this.transitBundle = builder.transitBundle;
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
   * @return the ticketId
   */
  public String getTicketId() {
    return ticketId;
  }

  /**
   * @param ticketId the ticketId to set
   */
  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  /**
   * @return the digitalTicketId
   */
  public String getDigitalTicketId() {
    return digitalTicketId;
  }

  /**
   * @param digitalTicketId the digitalTicketId to set
   */
  public void setDigitalTicketId(String digitalTicketId) {
    this.digitalTicketId = digitalTicketId;
  }

  /**
   * @return the transitBundle
   */
  public TransitBundle getTransitBundle() {
    return transitBundle;
  }

  /**
   * @param transitBundle the transitBundle to set
   */
  public void setTransitBundle(TransitBundle transitBundle) {
    this.transitBundle = transitBundle;
  }

  /**
   * @return the digitalCardId
   */
  public String getDigitalCardId() {
    return digitalCardId;
  }

  /**
   * @param digitalCardId the digitalCardId to set
   */
  public void setDigitalCardId(String digitalCardId) {
    this.digitalCardId = digitalCardId;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "TicketPurchaseResponse [status=" + status + ", ticketId=" + ticketId + ", digitalCardId=" + digitalCardId + ", digitalTicketId=" + digitalTicketId + ", transitBundle="
      + transitBundle + "]";
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    
    public String status;
    private String ticketId;
    private String digitalCardId;
    private String digitalTicketId;
    private TransitBundle transitBundle;
    
    public Builder status(String val) {
      this.status = val;
      return this;
    }
    
    public Builder ticketId(String val) {
      this.ticketId = val;
      return this;
    }
    
    public Builder digitalCardId(String val) {
      this.digitalCardId = val;
      return this;
    }

    public Builder digitalTicketId(String val) {
      this.digitalTicketId = val;
      return this;
    }

    public Builder transitBundle(TransitBundle val) {
      this.transitBundle = val;
      return this;
    }

    public TicketPurchaseResponse build() {
      return new TicketPurchaseResponse(this);
    }
  }

}
