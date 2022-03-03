package com.vasanth.oops;

public class Dog extends Animal{
	
	private String favoritefood;
	
	Dog(int legs,String name, String favoritefood)
	{
		super(legs,name);
		this.setFavoritefood(favoritefood);
		super.eat();
	}

	public String getFavoritefood() {
		return favoritefood;
	}

	public void setFavoritefood(String favoritefood) {
		this.favoritefood = favoritefood;
	}
	
	@Override
	public void eat()
	{
		System.out.println("Eating "+favoritefood);
	}
	
	public static void eat(String food)
	{
		System.out.println("Eating "+food);
	}

}
