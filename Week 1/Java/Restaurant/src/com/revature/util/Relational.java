package com.revature.util;

import com.revature.model.Pizza;

public class Relational {
	
	/*
	 * Sometimes we want to compare two values. Is, for example,
	 * the value on the left greater than the value on the right?
	 * Well, that's the purpose of using relational operators!
	 */
	
	int x = 8;
	int y = 89;
	int z = -4;
	int a = 8;
	
	public static void main(String...args) {
		
		Relational r = new Relational();
		
		/*
		 * When using relational operators, a boolean value
		 * of "true" or "false" is returned.
		 * 
		 * "r.x > r.y" is a "boolean expression".
		 */
		System.out.println(r.x > r.y); //false
		System.out.println(r.x < r.y); //true
		System.out.println(r.x >= r.a); //true
		System.out.println(r.x <= r.a); //true
		
		/*
		 * There is another operator that is used to compare
		 * values in Java: ==
		 * 
		 * Be careful, however, as this only measures the
		 * equality of values when used with primitives!
		 */
		
		System.out.println(r.x == r.a); //true
		
		/*
		 * The == operator DOES NOT compare equality for
		 * objects in Java!
		 * 
		 * When used with objects, == checks for reference
		 * equality. In other words, do both references
		 * point to the same object in memory?
		 */
		
		Pizza p1 = new Pizza(10, "Cheese", 10.99f);
		Pizza p2 = new Pizza(10, "Cheese", 10.99f);
		
		System.out.println(p1 == p2); //false
	}
}
