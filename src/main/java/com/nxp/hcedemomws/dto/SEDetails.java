/**
 * 
 */
package com.nxp.hcedemomws.dto;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 12-Apr-2017 12:26:52 PM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SEDetails implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 3625211644525332000L;

  private String id;

  private Map<String, String> seCapabilities;

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id
   *          the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the seCapabilities
   */
  public Map<String, String> getSeCapabilities() {
    return seCapabilities;
  }

  /**
   * @param seCapabilities
   *          the seCapabilities to set
   */
  public void setSeCapabilities(Map<String, String> seCapabilities) {
    this.seCapabilities = seCapabilities;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(" >>> SEDetails [");
    builder.append(super.toString());
    builder.append(", id=");
    builder.append(id);
    builder.append(", seCapabilities=");
    builder.append(seCapabilities);
    builder.append("]");
    return builder.toString();
  }
  
  

}
