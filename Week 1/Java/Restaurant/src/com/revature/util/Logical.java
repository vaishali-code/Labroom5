package com.revature.util;

public class Logical {

	int x = -9;
	int y = 0;
	int z = 8;
	
	/*
	 * When we talk about logical operators, we are referring
	 * to the "&" (and) and "|" (or) operators.
	 */
	
	public static void main(String...args) {
		
		Logical l = new Logical();
		
		//Logical AND
		
		if(true & true) { //true & true is "true"
			System.out.println("true");
		}
		
		if(false & true) { //true & false is "false"
			System.out.println("false");
		}
		
		if(false & false) { //false & false is "false"
			System.out.println("false");
		}
		
		if(l.y > l.x & l.y < l.z) {
			System.out.println("Y is less than x and greater than z.");
		}
		
		//Logical OR
		
		if(true | true) { //true
			System.out.println("true");
		}
		
		if(true | false) { //true
			System.out.println("true");
		}
		
		if(false | false) { //false
			System.out.println("false");
		}
		
		if(l.x > l.y | l.y < l.z) {
			System.out.println("At least one of these things is true.");
		}
		
		//There are also variations of the logical operators referred to as
		//"short circuit" operators.
		
		/*
		 * These are different from our standard logical
		 * operators in that they do not evaluate both
		 * operands if they don't have to.
		 * 
		 * Short circuit operators use double symbols:
		 * 
		 * && -> and
		 * || -> or
		 */
		
		if(false && true) { //In this case, the "true" is never evaluated as it's not necessary.
			
		}
		
		if(true || false) {
			
		}
	}
}
