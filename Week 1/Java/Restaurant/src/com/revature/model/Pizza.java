package com.revature.model;

//This is a single line comment!

/*
 * This a multiline comment.
 * So I can write on multiple lines!
 */

/*
 * You can only have ONE public class per file, and
 * the name of that class should match the file name.
 */
public class Pizza{
	
	/*
	 * Let's define some properties of our pizza!
	 */
	
	public int diameter = 0; //diameter of pizza in inches
	protected String topping = "n/a"; //pizza topping type
	/*default*/ float price; //you DON'T have to initialize this with a value
	private String secretIngredient = "some formula";
	
	/*
	 * Let's create our own constructor for the Pizza class. 
	 */
	
	//A "no-args" constructor.
	public Pizza() {
		super(); //This is a call to the Object class's constructor.
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((secretIngredient == null) ? 0 : secretIngredient.hashCode());
		result = prime * result + ((topping == null) ? 0 : topping.hashCode());
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
		Pizza other = (Pizza) obj;
		if (diameter != other.diameter)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (secretIngredient == null) {
			if (other.secretIngredient != null)
				return false;
		} else if (!secretIngredient.equals(other.secretIngredient))
			return false;
		if (topping == null) {
			if (other.topping != null)
				return false;
		} else if (!topping.equals(other.topping))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pizza [diameter=" + diameter + ", topping=" + topping + ", price=" + price + ", secretIngredient="
				+ secretIngredient + "]";
	}

	//A constructor using fields
	public Pizza(int diameter, String topping, float price) {
		this.diameter = diameter;
		this.topping = topping;
		this.price = price;
	}
	
	/*
	 * In order to create a method, we must define a method
	 * signature. A method signature contains:
	 * 
	 * An Access Modifier
	 * A Return Type (void, int, Object...)
	 * A Name For the Method
	 * A(n) (Optional) List of Parameters
	 * A Potential List of Exceptions The Method Might Throw
	 */
	
	/*
	 * This method returns the calorie count for
	 * a pizza based on its diameter.
	 */
	public void printPizzaNutrition() {
		System.out.println("This pizza's topping is:" +
				this.topping + " and its calories are:" 
				+ this.diameter * 10);
	}
	
	/*
	 * Let's define a method that returns a value and defines 
	 * one parameter.
	 */
	
	public float addTopping(String extraTopping) {
		if(extraTopping.equals("spinach")) {
			return this.price + 1.0f;
		}
		else return this.price + 5.0f;
	}
	
	/*
	 * In fact, primitive data types have default values if
	 * no value is supplied. Numeric types, for instance,
	 * default to 0 or 0.0 while boolean for example defaults
	 * to "false".
	 */
	
	/*
	 * This is the traditional signature for a main
	 * method in Java. The main method serves as the
	 * entrypoint into your application.
	 * 
	 * In other words, your Java application begins
	 * running right here!
	 */
	public static void main(String []args) {
		/*
		 * This is a statement (terminated with a 
		 * ";"). A statement gives an instruction to
		 * the computer.
		 */
		
		//This is the creation of a Pizza object.
		//It is an instance of the Pizza class.
		
		/*
		 * In this case, "Pizza" is the reference type.
		 * It specifies that the "pepperoni" reference
		 * variable should point to a pizza object in memory.
		 */
		Pizza pepperoni = new Pizza();
//		pepperoni = 8; DOES NOT COMPILE
		pepperoni.diameter = 30;
		pepperoni.topping = "Pepperoni";
		pepperoni.price = 34.0f;
		pepperoni.printPizzaNutrition(); //invoke method
		
		/*
		 * The addTopping method returns a value to the caller.
		 * The caller is the main method in this case as this
		 * method (addTopping) is called within the main method.
		 * 
		 * We can store the value for later or immediately pass the
		 * value to another method.
		 */

		float recalculatedPrice = pepperoni.addTopping("spinach");
		System.out.println(pepperoni.addTopping("bacon"));
		/*
		 * Note that we did not modify the underlying
		 * price of the pizza.
		 */
		System.out.println(pepperoni.price);
		/*
		 * When assigning a value to a float, if you
		 * use a floating point value on the right side,
		 * you must follow it with an "f".
		 */
	
		
		Pizza sausage = new Pizza(); //yet another Pizza object
		sausage.diameter = 50;
		sausage.topping = "Sausage";
		sausage.price = 17.0f;
		sausage.printPizzaNutrition();
		
		Pizza supreme = new Pizza(10, "Supreme", 25.0f);
		supreme.printPizzaNutrition();
		
		/*
		 * What if we wanted to cast our pizza's diameter
		 * into a different data type?
		 */
		
		short newPrice = (short) sausage.diameter;
		
		//WILL NOT WORK AS THE TYPES ARE NOT COMPATIBLE
//		boolean isTrue = true;
//		int isTrueNum = (int) isTrue;
		
		//It is valid to point one reference to
		//whatever value another reference points
		//to.
		short priceAgain = newPrice;
		
		/*
		 * Currently, we can directly any member of the Pizza
		 * class. In other words...
		 */
		
		pepperoni.diameter = -90; //This is not how we want to use this data member...
	}
}

class AnotherClass{
	
}