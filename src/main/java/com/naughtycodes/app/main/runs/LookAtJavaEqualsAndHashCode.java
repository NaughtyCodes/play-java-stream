package com.naughtycodes.app.main.runs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class LookAtJavaEqualsAndHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Person> p = new HashSet<Person>();
		LookAtJavaEqualsAndHashCode run = new LookAtJavaEqualsAndHashCode();
		run.loadData(p);

	}
	
	public void loadData(HashSet<Person> p) {
		
		for(int i = 0; i <= 1; i++) {
			p.add(new Person(i, "Name_"+i, "Some description_"+i, i));
		}
		
		p.add(new Person(0, "Name_"+0, "Some description_"+0, 0));
		
		for(Person t : p)
			System.out.println(t.hashCode()+" ::: "+t.toString());
		
		
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

//		if(tObj instanceof Person){
//			return id == tObj.id 
//					&& ( name == tObj.name || (name != null && name.equals(tObj.getName()) ))
//					&& ( description == tObj.description || (description != null && description.equals(tObj.getDescription())) )
//					&& ( age == tObj.age);
//		} else {
//			return false;
//		}
		

		
//		System.out.println(id+" "+name+" "+description+" "+age);
//		System.out.println(tObj.toString());
		
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

//	@Override
//	public int hashCode()
//	   {
//        int hashcode = 0;
//        hashcode = id*20;
//        hashcode += name.hashCode();
//        return hashcode;
//	   }

	
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