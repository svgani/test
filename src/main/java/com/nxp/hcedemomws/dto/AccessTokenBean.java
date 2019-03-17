package com.nxp.hcedemomws.dto;

public class AccessTokenBean {
  
  private String scope;
  private String token_type;
  private String access_token;
  private Long expires_in;
  private String refresh_token;
  
  public AccessTokenBean() {
    
  }
  
  /**
   * @return the scope
   */
  public String getScope() {
    return scope;
  }
  /**
   * @param scope the scope to set
   */
  public void setScope(String scope) {
    this.scope = scope;
  }
  /**
   * @return the token_type
   */
  public String getToken_type() {
    return token_type;
  }
  /**
   * @param token_type the token_type to set
   */
  public void setToken_type(String token_type) {
    this.token_type = token_type;
  }
  /**
   * @return the access_token
   */
  public String getAccess_token() {
    return access_token;
  }
  /**
   * @param access_token the access_token to set
   */
  public void setAccess_token(String access_token) {
    this.access_token = access_token;
  }
  /**
   * @return the expires_in
   */
  public Long getExpires_in() {
    return expires_in;
  }
  /**
   * @param expires_in the expires_in to set
   */
  public void setExpires_in(Long expires_in) {
    this.expires_in = expires_in;
  }
  /**
   * @return the refresh_token
   */
  public String getRefresh_token() {
    return refresh_token;
  }
  /**
   * @param refresh_token the refresh_token to set
   */
  public void setRefresh_token(String refresh_token) {
    this.refresh_token = refresh_token;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "AccessTokenBean [scope=" + scope + ", token_type=" + token_type + ", access_token=" + access_token + ", expires_in=" + expires_in + ", refresh_token=" + refresh_token
      + "]";
  }
  
  
  
  
  
}
