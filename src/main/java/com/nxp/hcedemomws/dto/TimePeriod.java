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
 * @date 21-Dec-2017 9:20:26 AM
 * @version 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimePeriod implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2469136425083887214L;

	private String timeUnit;

	private Long value;

	/**
	 * @return the timeUnit
	 */
	public String getTimeUnit() {
		return timeUnit;
	}

	/**
	 * @param timeUnit
	 *            the timeUnit to set
	 */
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

	/**
	 * @return the value
	 */
	public Long getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(Long value) {
		this.value = value;
	}

	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "TimePeriod [timeUnit=" + timeUnit + ", value=" + value + "]";
	}

}
