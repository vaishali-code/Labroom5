package com.revature.model;

/*
 * We've created this so that coffee can inherit from it as coffee
 * is a drink as well!
 */
public class Drink {

	/*
	 * These fields are protected so that they can be
	 * inherited by classes which extend "Drink"
	 */
	protected int temperature; //in Fahrenheit
	protected int calories;
	protected int size; //in ounces
	
	/*
	 * A no-args constructor
	 */
	public Drink() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * A constructor using fields.
	 */
	public Drink(int temperature, int calories, int size) {
		super();
		this.temperature = temperature;
		this.calories = calories;
		this.size = size;
	}
	
	/*
	 * Getters and setters for my fields.
	 */
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	/*
	 * Let's create a method that emulates a drink being spilled!
	 */
	
	public void spillDrink() {
		System.out.println("Ooops! I spilled my drink!");
	}
	
	/*
	 * When used with a method, the final keyword will prevent this
	 * method from being overridden in a child class.
	 */
	public final void refill() {
		System.out.println("Refill me, please!");
	}
	
	/*
	 * override the hashCode method
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + size;
		result = prime * result + temperature;
		return result;
	}
	
	/*
	 * override the equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drink other = (Drink) obj;
		if (calories != other.calories)
			return false;
		if (size != other.size)
			return false;
		if (temperature != other.temperature)
			return false;
		return true;
	}
	
	//override the toString method
	@Override
	public String toString() {
		return "Drink [temperature=" + temperature + ", calories=" + calories + ", size=" + size + "]";
	}
	
	
}
