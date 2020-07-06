package com.revature.model;

import com.revature.exception.CoffeeNotCaffeinatedEnoughException;
import com.revature.exception.UncheckedCoffeeException;

/*
 * This class's design follows a design pattern known as the
 * "Java Bean" design pattern. A Java Bean has a no-args
 * constructor, a constructor using fields, overrides 
 * hashCode, equals, and toString, has getters and setters.
 */

/*
 * When a class is final, it CANNOT be extended!
 */
public final class Coffee extends Drink {

	private String roastType;
	private int caffeine;
	/*
	 * When using the final keyword with a reference, it denotes that the reference
	 * must always point to the same value or object in memory.
	 * 
	 * If a reference is final, you must initialize it when you declare it or in the
	 * constructor.
	 */
	private final String brand;
	private String flavor;
	/*
	 * This field is static, which means that I don't need a copy of the Coffee
	 * class to access it.
	 * 
	 * All instances of this class share this. A new copy of this will NOT be
	 * created whenever we create a new instance of the class.
	 */
	private static int numCupsOrdered;

	public Coffee() {
		numCupsOrdered++;
		this.brand = "Generic";
	}

	public Coffee(String roastType, int caffeine, String brand, String flavor) {
		this.roastType = roastType;
		this.caffeine = caffeine;
		this.brand = brand;
		this.flavor = flavor;
		numCupsOrdered++;
	}

	/*
	 * Because every field is private, we now need getters and setters in order to
	 * access our data members.
	 */

	public String getRoastType() {
		return roastType;
	}

	public void setRoastType(String roastType) throws CoffeeNotCaffeinatedEnoughException {
		if(roastType.equals("dark roast")) {
			/*
			 * If you do not want to catch the exception right here,
			 * you can throw it to the caller. You can use the "throws"
			 * keyword to do this.
			 */
			throw new CoffeeNotCaffeinatedEnoughException("More caffeine please!");
		}
		this.roastType = roastType;
	}

	public int getCaffeine() {
		return caffeine;
	}

	/*
	 * We've refactored this method so that if the caffeine
	 * content is too low, we throw an exception!
	 * 
	 * Because the exception we created is a checked exception,
	 * we must handle it!
	 */
	public void setCaffeine(int caffeine) {
		if (caffeine < 100) {
			try { //you can have 1 try block
				throw new CoffeeNotCaffeinatedEnoughException("Not enough caffeine in this coffee!");
			} //You can catch as many exceptions as you please 
			catch (CoffeeNotCaffeinatedEnoughException e) {
				//This is the point where we try to get back on track
				//in our application by addressing the underlying issue.
				//It's also a place to gather some information about the
				//exception.
				e.printStackTrace();
			}
			//you can have 0 to 1 finally blocks
			finally {
				//This always executes!
				System.out.println("I always execute!");
			}
		}
		this.caffeine = caffeine;
	}

	public String getBrand() {
		return brand;
	}

	/*
	 * The setter is now broken as brand is final, which means that we can't point
	 * the reference anywhere else.
	 */
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	/*
	 * burns your mouth toppings for coffee energizes you size of the cup makes you
	 * crash
	 */

	/*
	 * This method generates a coffee's crash level based on its caffeine content.
	 */
	public void calculateCrashLevel() {
		System.out.println("Crash Level: " + this.caffeine / 10);
	}

	/*
	 * Now let's overload calculateCrashLevel! In order to successfully overload a
	 * method, you must change either the number of parameters or the type of the
	 * parameters.
	 */

	public void calculateCrashLevel(int numCups) {
		System.out.println("Crash Level: " + numCups * (this.caffeine / 10));
	}

	public void calculateCrashLevel(int numCups, int espressoShots) {
		System.out.println("Crash Level: " + numCups * (this.caffeine / (10 * 0.3 * espressoShots)));
	}

	/*
	 * Let's override the spillDrink method as the original implementation that was
	 * inherited is too generic.
	 * 
	 * Note that you cannot reduce the visibility of an overridden method. In other
	 * words, if the method was public, you cannot make it "protected" or "private"
	 * or anything more restrictive.
	 * 
	 * You also should not change the return type to something of a different type!
	 */

	@Override
	public void spillDrink() {
		System.out.println("Ouch! I spilled my coffee!");
	}

	/*
	 * This is an example of overloading a method that has been inherited!
	 */
	public void spillDrink(String message) {
		System.out.println(message);
	}

	/*
	 * This is NOT allowed as the refill method is final. I cannot override it!
	 */
//	public void refill() {
//		
//	}

	/*
	 * You can also use static with methods!
	 */

	public static void staticCoffeeMethod() {
		System.out.println("I'm a static method in the coffee class!");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + caffeine;
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + ((roastType == null) ? 0 : roastType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (caffeine != other.caffeine)
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (roastType == null) {
			if (other.roastType != null)
				return false;
		} else if (!roastType.equals(other.roastType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coffee [roastType=" + roastType + ", caffeine=" + caffeine + ", brand=" + brand + ", flavor=" + flavor
				+ "]";
	}

	public static void main(String... args) {
		
		// Coffee 1
		Coffee c = new Coffee("medium", 74, "Folgers", "Hazelnut");
		c.setCaffeine(1);
		c.setCaffeine(101);
		
		/*
		 * The main method must handle the exception as it was
		 * thrown to the caller by the setRoastType method!
		 */
		try {
			c.setRoastType("dark roast");
		}
		/*
		 * Make sure that the most specific exceptions are
		 * handled first!
		 */
		catch (CoffeeNotCaffeinatedEnoughException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		c.calculateCrashLevel();
		c.calculateCrashLevel(3);
		c.calculateCrashLevel(3, 2);

		c.spillDrink();
		c.spillDrink("Ouch!");

		Drink d = new Drink();
		/*
		 * This is referred to as "covariance". This is when we set a reference to the
		 * super equal to an instance of a child class.
		 * 
		 * Note that the methods and fields that you have access to are determined by
		 * the reference type (Drink in this case) whereas the versions of the methods
		 * that will be invoked are determined by the object (instance).
		 */
		Drink d2 = new Coffee();

		d2.spillDrink();
//		d2.spillDrink("ouch"); DOES NOT COMPILE

		// Coffee 2
		Coffee c2 = (Coffee) d2; // acceptable downcasting

		// Throws a ClassCastException because the underlying object
		// that d points to was never an instance of Coffee.
//		Coffee c3 = (Coffee) d;

		/*
		 * We can access this field without using an instance of the class as it is
		 * static and belongs to the entire class. In other words, I can use the class
		 * name to access the field.
		 */
		System.out.println(Coffee.numCupsOrdered);
	}

}

//Look what happens when we try to extend the Coffee class!

//class CoffeeIceCream extends Coffee {
//	
//}
