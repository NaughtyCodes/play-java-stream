package com.naughtycodes.app.main.runs;

public class Car {

	private int weels;
	private String model;
	private String color;
	
	
	public Car(int weels, String model, String color) {
		super();
		this.weels = weels;
		this.model = model;
		this.color = color;
	}


	@Override
	public String toString() {
		return "Car [weels=" + weels + ", model=" + model + ", color=" + color + "]";
	}

	
	
}
