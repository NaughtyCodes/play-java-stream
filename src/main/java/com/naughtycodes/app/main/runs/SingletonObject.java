package com.naughtycodes.app.main.runs;

public class SingletonObject {
	
	private String name;
	private static SingletonObject singletonObject;
	
	private SingletonObject() {}

	public static SingletonObject getInstance() {
		
		if(singletonObject != null) {
			return singletonObject;
		} else {
			singletonObject = new SingletonObject();
			return singletonObject;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
}
