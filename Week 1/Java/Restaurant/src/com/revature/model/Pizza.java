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
	
	int diameter = 0; //diameter of pizza in inches
	String topping = "n/a"; //pizza topping type
	float price; //you DON'T have to initialize this with a value
	
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
		/*
		 * When assigning a value to a float, if you
		 * use a floating point value on the right side,
		 * you must follow it with an "f".
		 */
		pepperoni.price = 34.0f;
		
		Pizza sausage = new Pizza(); //yet another Pizza object
		sausage.diameter = 50;
		sausage.topping = "Sausage";
		sausage.price = 17.0f;
		
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
	}
}

class AnotherClass{
	
}