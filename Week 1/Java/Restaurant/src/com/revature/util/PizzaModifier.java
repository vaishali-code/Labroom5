package com.revature.util;

import com.revature.model.Pizza;

public class PizzaModifier extends Pizza{

	public static void main(String...args) {
		
		Pizza p = new Pizza(10, "Sausage", 10.f);
		p.diameter = 45; //we can directly modify this field anywhere it is public
		PanPizza pp = new PanPizza(); //child class of Pizza; just teasing inheritance		
	
		//For protected access, the reference type must correspond
		//to the type that has protected access to the field or method.
		
		PizzaModifier pm = new PizzaModifier();
		pm.topping = "New Topping - Alfredo";
		
		/*
		 * You CANNOT access a private field outside of
		 * the class in which it was declared!
		 */
//		p.secretIngredient = "none of my business";
	}
}

class PanPizza extends Pizza{
	
	int childFriendliness = 0;
	
	public void beSmallPizza() {
	}
	
	
}
