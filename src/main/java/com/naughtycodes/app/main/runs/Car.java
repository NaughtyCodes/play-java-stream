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

	public final int getWeels() {
		return weels;
	}

	public final String getModel() {
		return model;
	}

	public final String getColor() {
		return color;
	}

	public final void setWeels(int weels) {
		this.weels = weels;
	}

	public final void setModel(String model) {
		this.model = model;
	}

	public final void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [weels=" + weels + ", model=" + model + ", color=" + color + "]";
	}

	
	
}
