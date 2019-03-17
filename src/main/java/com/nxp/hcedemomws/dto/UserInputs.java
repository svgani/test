package com.nxp.hcedemomws.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInputs implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -5917131598778812250L;

  private String label;

  private String paramName;

  private InputType type;

  private List<String> values;

  private InputDataType dataType;

  private String minLength;

  private String maxLength;

  private Boolean mandatory;

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getParamName() {
    return paramName;
  }

  public void setParamName(String paramName) {
    this.paramName = paramName;
  }

  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public InputDataType getDataType() {
    return dataType;
  }

  public void setDataType(InputDataType dataType) {
    this.dataType = dataType;
  }

  public String getMinLength() {
    return minLength;
  }

  public void setMinLength(String minLength) {
    this.minLength = minLength;
  }

  public String getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(String maxLength) {
    this.maxLength = maxLength;
  }

  public Boolean getMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public InputType getType() {
    return type;
  }

  public void setType(InputType type) {
    this.type = type;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(" >>> UserInputs [");
    builder.append(super.toString());
    builder.append(", label=");
    builder.append(label);
    builder.append(", paramName=");
    builder.append(paramName);
    builder.append(", values=");
    builder.append(values);
    builder.append(", dataType=");
    builder.append(dataType);
    builder.append(", minLength=");
    builder.append(minLength);
    builder.append(", maxLength=");
    builder.append(maxLength);
    builder.append(", mandatory=");
    builder.append(mandatory);
    builder.append("]");
    return builder.toString();
  }

  
}
