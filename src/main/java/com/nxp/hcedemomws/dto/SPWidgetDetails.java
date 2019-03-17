package com.nxp.hcedemomws.dto;

public class SPWidgetDetails {
   
  private String name;
  private String widgetID;
  private String location;
  private String serviceProviderID;
  private String serviceProvider;
  private String serviceType;
  private String expDate;
  private String imageURL;
  private String currency;
  private String price;
  private Boolean authenticationRequired;
  private Boolean topupAllowed;
  
  public SPWidgetDetails(Builder builder) {
    this.name=builder.name;
      this.widgetID=builder.widgetID;
      this.location=builder.location;
      this.serviceProviderID=builder.serviceProviderID;
      this.serviceProvider=builder.serviceProvider;
      this.serviceType=builder.serviceType;
      this.expDate=builder.expDate;
      this.imageURL=builder.imageURL;
      this.currency=builder.currency;
      this.price=builder.price;
      this.authenticationRequired=builder.authenticationRequired;
      this.topupAllowed=builder.topupAllowed;
  }
  
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the widgetID
   */
  public String getWidgetID() {
    return widgetID;
  }

  /**
   * @param widgetID the widgetID to set
   */
  public void setWidgetID(String widgetID) {
    this.widgetID = widgetID;
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
   * @return the serviceProvider
   */
  public String getServiceProvider() {
    return serviceProvider;
  }

  /**
   * @param serviceProvider the serviceProvider to set
   */
  public void setServiceProvider(String serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  /**
   * @return the serviceType
   */
  public String getServiceType() {
    return serviceType;
  }

  /**
   * @param serviceType the serviceType to set
   */
  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  /**
   * @return the expDate
   */
  public String getExpDate() {
    return expDate;
  }

  /**
   * @param expDate the expDate to set
   */
  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }

  /**
   * @return the imageURL
   */
  public String getImageURL() {
    return imageURL;
  }

  /**
   * @param imageURL the imageURL to set
   */
  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  /**
   * @return the currency
   */
  public String getCurrency() {
    return currency;
  }

  /**
   * @param currency the currency to set
   */
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * @return the price
   */
  public String getPrice() {
    return price;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * @return the authenticationRequired
   */
  public Boolean getAuthenticationRequired() {
    return authenticationRequired;
  }

  /**
   * @param authenticationRequired the authenticationRequired to set
   */
  public void setAuthenticationRequired(Boolean authenticationRequired) {
    this.authenticationRequired = authenticationRequired;
  }

  /**
   * @return the topupAllowed
   */
  public Boolean getTopupAllowed() {
    return topupAllowed;
  }

  /**
   * @param topupAllowed the topupAllowed to set
   */
  public void setTopupAllowed(Boolean topupAllowed) {
    this.topupAllowed = topupAllowed;
  }
  
  

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "SPWidgetDetails [name=" + name + ", widgetID=" + widgetID + ", location=" + location + ", serviceProviderID=" + serviceProviderID + ", serviceProvider="
      + serviceProvider + ", serviceType=" + serviceType + ", expDate=" + expDate + ", imageURL=" + imageURL + ", currency=" + currency + ", price=" + price
      + ", authenticationRequired=" + authenticationRequired + ", topupAllowed=" + topupAllowed + "]";
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String name;
    private String widgetID;
    private String location;
    private String serviceProviderID;
    private String serviceProvider;
    private String serviceType;
    private String expDate;
    private String imageURL;
    private String currency;
    private String price;
    private Boolean authenticationRequired;
    private Boolean topupAllowed;
    
    public Builder name(String val) {
      this.name = val;
      return this;
    }
    
    public Builder widgetID(String val) {
      this.widgetID = val;
      return this;
    }
    
    public Builder location(String val) {
      this.location = val;
      return this;
    }
    
    public Builder serviceProviderID(String val) {
      this.serviceProviderID = val;
      return this;
    }
    
    public Builder serviceProvider(String val) {
      this.serviceProvider = val;
      return this;
    }
    
    public Builder serviceType(String val) {
      this.serviceType = val;
      return this;
    }
    
    public Builder expDate(String val) {
      this.expDate = val;
      return this;
    }
    
    public Builder imageURL(String val) {
      this.imageURL = val;
      return this;
    }
    
    public Builder currency(String val) {
      this.currency = val;
      return this;
    }
    
    public Builder price(String val) {
      this.price = val;
      return this;
    }
    
    public Builder authenticationRequired(Boolean val) {
      this.authenticationRequired = val;
      return this;
    }
    
    public Builder topupAllowed(Boolean val) {
      this.topupAllowed = val;
      return this;
    }
    
    public SPWidgetDetails build() {
      return new SPWidgetDetails(this);
    }
    
  }
  
}
