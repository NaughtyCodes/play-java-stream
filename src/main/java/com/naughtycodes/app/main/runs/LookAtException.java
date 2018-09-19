package com.naughtycodes.app.main.runs;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class LookAtException {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		child c = new child();
		c.doSomeThing();
		
//		Integer[][] ints = { { 1, 2, 3 }, { null }, { 7, 8, 9 } };
//		System.out.println("value = " + ints[1][0].intValue());
		
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(i -> {
		    if (i == 0) {
		        throw new IllegalArgumentException("Zero not allowed");
		    }
		    System.out.println(Math.PI / i);
		});
		
	}

}

class parent {
	
	public void doSomeThing() throws IOException, ParseException {
		System.out.println("Parent Method Calling");
	}
	
}

class child extends parent {
	
//	public void doSomeThing() {
//		System.out.println("Child Method Calling");
//	}
	
}