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
 * @date Sep 28, 2017 1:48:12 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransitAgencyApp implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1352737346577079713L;

  private String packageName;
  private String action;
  private String intentExtraText;

  /**
   * @return the packageName
   */
  public String getPackageName() {
    return packageName;
  }

  /**
   * @param packageName the packageName to set
   */
  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  /**
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * @param action the action to set
   */
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * @return the intentExtraText
   */
  public String getIntentExtraText() {
    return intentExtraText;
  }

  /**
   * @param intentExtraText the intentExtraText to set
   */
  public void setIntentExtraText(String intentExtraText) {
    this.intentExtraText = intentExtraText;
  }

  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append("TransitAgencyApp [packageName=");
	  sb.append(packageName);
	  sb.append(", action=");
	  sb.append(action);
	  sb.append(", intentExtraText=");
	  sb.append(intentExtraText);
	  sb.append("]");
	  return sb.toString();

  }

}
