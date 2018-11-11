package com.naughtycodes.app.main.runs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.naughtycodes.app.main.runs.Car;

public class LookAtFuctionalInterface  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> list = loadData();
		List<String> grad10th = Arrays.asList("10th_name_1","10th_name_2","10th_name_3");
		List<String> grad11th = Arrays.asList("11th_name_11","11th_name_12","11th_name_13");
		List<String> grad12th = Arrays.asList("12th_name_21","12th_name_22","12th_name_23");
		
		// Functional Interface
		FunctionalInterface fi = ()->{
			System.out.println("Calling Functional Interface");
		};
		fi.callFunctionalInterface();
		
		// list.forEach(c -> System.out.println(c.toString()));
		list.stream()
			.parallel()
			.filter(c -> (c.getModel().contains("_5") && c.getColor().contains("C")))
			.filter(c -> String.valueOf(c.getWeels()).contains("5"))
			.collect(Collectors.toList())
			.forEach(c -> System.out.println(c.toString()));
		
		// Select words having "2" and convert there id from String to Integer
		System.out.println(
			Stream.of(grad10th,grad11th,grad12th)
				.flatMap(l -> l.stream())
				.filter(l -> l.contains("2"))
				.map(l -> Integer.parseInt((l.split("_")[2])))
				.collect(Collectors.toList())
		);       
	
	}
	
	public static List<Car> loadData() {
		List<Car> list = new ArrayList<Car>();
		for(int i=0; i<=10; i++) {
			list.add(new Car(i,"Modal_"+i,"Color_"+i));
		}
		
		return list;
	}

}
