package com.revature.alternate.model;

public class Pizza {

	/*
	 * I can have two classes called "Pizza" as long as they
	 * are in different packages. This is because Java uses
	 * fully qualified class names to differentiate classes
	 * from each other.
	 * 
	 * Fully Qualified class name of original pizza class:
	 * 
	 * com.revature.model.Pizza
	 * 
	 * Fully qualified class name of this version of pizza class:
	 * 
	 * com.revature.alternate.model.Pizza
	 */
	
	public static void main(String...args) {
		Pizza p = new Pizza();
		/*
		 * If you do not have to use the fully qualified class
		 * name, don't as it is bad practice.
		 */
		com.revature.model.Pizza p2 = new com.revature.model.Pizza();
	}
}
