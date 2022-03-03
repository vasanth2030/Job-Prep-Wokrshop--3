package com.vasanth.oops;

public class Animal {
	private String name;
	private int legs;
	
	Animal()
	{
		
	}
	
	Animal(int legs, String name)
	{
		this.legs=legs;
		this.name=name;
	}

	
	public void eat()
	{
		System.out.println("Eating..");
	}
	
	
	public void sleep()
	{
		System.out.println("Sleeping..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
}
