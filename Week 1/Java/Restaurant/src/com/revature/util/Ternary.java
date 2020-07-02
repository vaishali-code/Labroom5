package com.revature.util;

public class Ternary {

	/*
	 * Sometimes you want to perform an action, but only
	 * under certain conditions.
	 */
	
	public static void main(String...args) {
		
		int num = 10;
		
		/*
		 * We conditionally assign a new value to "num".
		 * We have a boolean expression (num < 20) that 
		 * evaluates to "true" or "false". We then use
		 * the "?" to precede our two different options
		 * for assignment.
		 * 
		 * The first option is the assignment that will
		 * occur if the boolean express is true.
		 * 
		 * The second option is the assignment that will
		 * occur if the boolean expression is false.
		 */
		num = (num < 20) ? 5 : 6;
		
//		if(num < 20) {
//			num = 5;
//		} else if(num > 20){
//			num = 6;
//		}
		
		System.out.println(num);
		
		/*
		 * An aside: If you want to negate a boolean 
		 * expression's value, use the "!" symbol.
		 */
		boolean b = true;
		
		b = !b; //b now is "false"
		
		System.out.println(b);
	}
}
