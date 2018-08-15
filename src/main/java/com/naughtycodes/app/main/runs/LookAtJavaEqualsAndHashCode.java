package com.naughtycodes.app.main.runs;

public class LookAtJavaEqualsAndHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Person {
	
	private int id;
	private String name;
	private String description;
	private int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int id, String name, String description, int age) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}