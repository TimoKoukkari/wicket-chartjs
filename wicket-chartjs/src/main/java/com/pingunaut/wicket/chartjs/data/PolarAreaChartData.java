package com.pingunaut.wicket.chartjs.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PolarAreaChartData extends SimpleColorValueChartData {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = -5122104387810776812L;

	public PolarAreaChartData(Integer value, String color) {
		super(value, color);
	}

}
