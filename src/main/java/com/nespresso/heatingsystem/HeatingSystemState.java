package com.nespresso.heatingsystem;

enum HeatingSystemState {
	ON,
	OFF;
	
	public void writeUsing(final Writer writer) {
		writer.write(this.toString());
	}

}
