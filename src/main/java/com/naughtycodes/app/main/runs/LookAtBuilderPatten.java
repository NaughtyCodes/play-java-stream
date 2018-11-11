package com.naughtycodes.app.main.runs;

public class LookAtBuilderPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new CarBuilder()
				.setWeels(5)
				.setColor("White").getCar();
		
		Car c2 = new CarBuilder()
				.setWeels(5).getCar();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}

