package com.pingunaut.wicket.chartjs.chart.impl;

import com.pingunaut.wicket.chartjs.chart.AbstractDataSetChart;
import com.pingunaut.wicket.chartjs.chart.IBar;
import com.pingunaut.wicket.chartjs.data.BarChartData;
import com.pingunaut.wicket.chartjs.data.sets.BarDataSet;
import com.pingunaut.wicket.chartjs.options.BarChartOptions;

public class Bar extends AbstractDataSetChart<BarChartData<BarDataSet>, BarChartOptions, BarDataSet> implements IBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -332976997065056554L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
	 */
	@Override
	public BarChartOptions getOptions() {
		if (options == null) {
			options = new BarChartOptions();
		}
		return options;
	}

	@Override
	public BarChartData<BarDataSet> getData() {
		if (data == null) {
			data = new BarChartData<BarDataSet>();
		}
		return data;
	}
}
