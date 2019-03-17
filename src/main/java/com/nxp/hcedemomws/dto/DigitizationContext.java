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
 * @date 16-Sep-2017 8:12:57 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DigitizationContext implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -2525660462322950712L;
  
  private String walletId;

  /**
   * @return the walletId
   */
  public String getWalletId() {
    return walletId;
  }

  /**
   * @param walletId the walletId to set
   */
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append("DigitizationContext [walletId=");
	  sb.append(walletId);
	  sb.append("]");
	  return sb.toString();
  }

}
