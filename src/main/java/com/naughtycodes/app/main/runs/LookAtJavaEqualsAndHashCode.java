package com.naughtycodes.app.main.runs;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class LookAtJavaEqualsAndHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> p = new ArrayList<Person>();
		LookAtJavaEqualsAndHashCode run = new LookAtJavaEqualsAndHashCode();
		run.loadData(p);

	}
	
	public void loadData(List<Person> p) {
		
		for(int i = 0; i <= 1; i++) {
			p.add(new Person(i, "Name_"+i, "Some description_"+i, i));
		}
		
		p.add(new Person(0, "Name_"+0, "Some description_"+0, 0));
		
		for(Person t : p)
			System.out.println(t.toString());
		
		
	}

}

class Person {
	
	private int id;
	private String name;
	private String description;
	private int age;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) {
			return true;
		}
		
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Person tObj = (Person) obj;

//		return id == tObj.id 
//				&& ( name == tObj.name || (name != null && name.equals(tObj.getName()) ))
//				&& ( description == tObj.description || (description != null && description.equals(tObj.getDescription())) )
//				&& ( age == tObj.age);
		
		System.out.println(this.id+" "+this.name+" "+this.description+" "+this.age);
		System.out.println(tObj.toString());
		
	    return new EqualsBuilder()
	    		.append(id, tObj.id)
	    	    .append(name, tObj.name)
	    	    .append(description, tObj.description)
	    	    .append(age, tObj.age)
	    	    .isEquals();

	}
	
	@Override
	public int hashCode()
	   {
	      return new HashCodeBuilder()
	         .append(id)
	         .append(name)
	         .append(description)
	         .append(age)
	         .toHashCode();
	   }
	
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", description=" + description + ", age=" + age + "]";
	}
	
	
}