package com.naughtycodes.app.main.runs;

public class LookAtSingletonPattern {
	
	public static void main(String[] args) {
	
		SingletonObject so1 = SingletonObject.getInstance();
		System.out.println(so1.hashCode());
		SingletonObject so2 = SingletonObject.getInstance();
		System.out.println(so2.hashCode());
		SingletonObject so3 = SingletonObject.getInstance();
		System.out.println(so3.hashCode());
		
	}

}
