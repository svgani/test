/**
 * 
 */
package com.nxp.hcedemomws.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 19-Sep-2017 10:46:50 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OemRequest implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1889712911634383211L;

  private RequestContext requestContext;
  
  private DigitizationContext digitizationContext;

  /**
   * @return the requestContext
   */
  public RequestContext getRequestContext() {
    return requestContext;
  }

  /**
   * @param requestContext the requestContext to set
   */
  public void setRequestContext(RequestContext requestContext) {
    this.requestContext = requestContext;
  }

  /**
   * @return the digitizationContext
   */
  public DigitizationContext getDigitizationContext() {
    return digitizationContext;
  }

  /**
   * @param digitizationContext the digitizationContext to set
   */
  public void setDigitizationContext(DigitizationContext digitizationContext) {
    this.digitizationContext = digitizationContext;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append("OemRequest [requestContext=");
	  sb.append(requestContext == null ? "NULL" : requestContext.toString());
	  sb.append(", digitizationContext=");
	  sb.append(digitizationContext == null ? "NULL" : digitizationContext.toString());
	  sb.append("]");
	  return sb.toString();
  }
  
  
  
}
