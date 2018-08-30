package com.naughtycodes.app.main.runs;

public class CarBuilder {
	
	private int weels;
	private String model;
	private String color;
	
	public CarBuilder setWeels(int weels) {
		this.weels = weels;
		return this;
	}
	
	public CarBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	
	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	
	public Car getCar() {
		return new Car(weels,model,color);
	}

	

}
