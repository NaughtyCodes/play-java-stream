package com.naughtycodes.app.main.runs;

public class LookAtBuilderPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new CarBuilder()
				.setWeels(5)
				.setColor("White").getCar();
		System.out.println(c.toString());

	}

}

