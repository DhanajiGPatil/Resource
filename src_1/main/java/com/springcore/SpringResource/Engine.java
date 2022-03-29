package com.springcore.SpringResource;

public class Engine {

	private int model_no;

	@Override
	public String toString() {
		return "Engine [model_no=" + model_no + "]";
	}

	public int getModel_no() {
		return model_no;
	}

	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	
	
}
