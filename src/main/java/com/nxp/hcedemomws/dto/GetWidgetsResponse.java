package com.nxp.hcedemomws.dto;

import java.util.List;

public class GetWidgetsResponse extends OemResponse {

	private static final long serialVersionUID = 3639529446650357705L;

	private List<WidgetDetails> widgetList;

	public List<WidgetDetails> getWidgetList() {
		return widgetList;
	}

	public void setWidgetList(List<WidgetDetails> widgetList) {
		this.widgetList = widgetList;
	}
	
  @Override
  public String toString() {
    StringBuilder sbGetWidgetsResponse = new StringBuilder();
    sbGetWidgetsResponse.append(" >>> GetWidgetsResponse [");
    sbGetWidgetsResponse.append(super.toString());
    sbGetWidgetsResponse.append("widgetList =");
    if (widgetList != null) {
      for (WidgetDetails widget : widgetList) {
        if (widget != null) {
          sbGetWidgetsResponse.append(widget.toString()).append("~");
        }
      }
    }
    sbGetWidgetsResponse.append("]");
    return sbGetWidgetsResponse.toString();
  }

}
