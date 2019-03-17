package com.nxp.hcedemomws.dto;

import java.util.List;

public class GetServiceProvidersResponse extends OemResponse {

  private static final long serialVersionUID = 1009115022412341468L;

  private List<ServiceProviderDetails> spList;

  /**
   * @return the spList
   */
  public List<ServiceProviderDetails> getSpList() {
    return spList;
  }

  /**
   * @param spList
   *          the spList to set
   */
  public void setSpList(List<ServiceProviderDetails> spList) {
    this.spList = spList;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(">> GetServiceProvidersResponse [");
    builder.append(super.toString());
    builder.append(", spList=");
    builder.append(spList == null ? "NULL" : spList.toString());
    builder.append("]");
    return builder.toString();
  }

  
}
