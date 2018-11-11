package com.naughtycodes.app.main.runs;

public final class LookAtFinal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FinalExample.class.getName());
		
	}

}


final class FinalExample {
	
	public static final String a = "one sample";
	public static final String b = "one sample";
	
	private FinalExample() {}

	public static final String getA() {
		return a;
	}

	public static final String getB() {
		return b;
	}	
	
}