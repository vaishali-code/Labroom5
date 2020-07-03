package com.revature.model;

import java.util.Arrays;

public class PizzaShop /*extends Object is redundant in this case*/ {

	//Instance Scope (inside of the class, but outside of our methods.
	private int numEmployees;
	private String name;
	private int budget;
	/*
	 * This is the syntax for creating an array.
	 * You you have a reference type for each object/value
	 * inside of the array.
	 * 
	 * "pies" is the reference variable.
	 * 
	 * The [] symbol denotes that it is an array. Note
	 * that Java is not too picky about where you place it.
	 * 
	 * The {} itself is the initialization of the array.
	 * 
	 * Note that you cannot change the size of an array. So
	 * if you initialize an array with nothing, you're stuck
	 * with that size.
	 */
//	(MOST COMMON) Pizza pies[] = {}; //creates an array with nothing in it
//	Pizza pies[] = new Pizza[4]; //creates an array with nothing in it but reserves 4 spaces
	Pizza pies[] = new Pizza[] {
			new Pizza(10, "Cheese", 10.0f), 
			new Pizza(20, "Veggie", 8.09f),
			new Pizza(30, "Sausage", 7.54f),
			new Pizza(21, "Pepperoni", 21.33f)
			};
	
	public PizzaShop(int numEmployees, String name, int budget) {
		super();
		this.numEmployees = numEmployees;
		this.name = name;
		this.budget = budget;
	}
	
	/*
	 * Because our data members are now private, we need some
	 * way of allowing read and write access to those data
	 * members. In order to do this, we need getters and
	 * setters.
	 * 
	 * The naming conventions for getters and setter is:
	 * 
	 * getFieldName
	 * setFieldName
	 */
	
	public int getNumEmployees() {
		return this.numEmployees;
	}
	
	public void setNumEmployees(int numEmployees) {
		
		if(numEmployees < 0) {
			System.out.println("You're wrong. Impossible.");
		} else {
			this.numEmployees = numEmployees;
		}	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		//Put custom logic here.
		this.name = name;
	}
	
	public int getBudget() {
		return this.budget;
	}
	
	public void setBudget(int budget) {
		//Custom logic here.
		this.budget = budget;
	}

	public void acceptPizzaOrders(Pizza p1) {
		System.out.println("You have ordered a " + p1.topping + " pizza.");
	}

	public void acceptPizzaOrders(Pizza p1, Pizza p2) {
		System.out.println("You have ordered a " + p1.topping + " pizza.");
		System.out.println("You have ordered a " + p2.topping + " pizza.");
	}

	/*
	 * Let's use variable arguments instead to accept our Pizza orders. This will
	 * allow us to pass ANY number of pizzas to the method.
	 * 
	 * Note that you can only have ONE variable argument in your list of parameters.
	 * 
	 * Note also that if you use varargs, the variable argument must be the last
	 * parameter.
	 */
	public void acceptPizzaOrders(Pizza... p) {
		// Let's add a condition that limits the number of pizzas
		// you can order.
		if (p.length > 5)
			System.out.println("That's too many pizzas.");
		else {
			for (Pizza pie : p) {
				System.out.println("You have ordered a " + pie.topping + " pizza.");
			}
		}
	}

	/*
	 * This method cuts a pizza into a certain number of slices based on its
	 * diameter.
	 */
	public int cutPizza(Pizza pie) {

		/*
		 * We are going to observe the pizza's diameter and make a decision about how to
		 * cut that pizza based on the diameter.
		 */
		switch (pie.diameter) {
		// If the diameter is 20, perform the actions that follow.
		case 20:
			return 10;
		case 40:
			return 20;
		case 60:
			return 30;
		/*
		 * The default specifies that if the diameter is not
		 * 20 or 40 (or any other cases listed above), we will
		 * return a value 8 slices.
		 */
		default:
			return 8;
		}
	}
	
	public void employeeCount() {
		/*
		 * If you want to perform a task a certain number
		 * of times, you will want to use a for loop!
		 */
		
		for(int i = 1; i <= this.numEmployees; i++) {
			//This works once for every employee that
			//works at my pizza shop.
			System.out.println("Employee " + i + " is on the clock!");
		}
	}
	
	/*
	 * This method tracks whether or not the pizza shop is
	 * open by keeping track of the number of employees that
	 * are still present at the shop. When the number of
	 * employees is 0, the shop is no longer open for
	 * business.
	 */
	public void hoursOfOperation() {
		/*
		 * We will use a while loop to perform an action
		 * while there are still employees in the shop.
		 */
		
		while(this.numEmployees > 0) {
			System.out.println("We're still open!");
			this.numEmployees--; //Modify numEmployees so that we can eventually terminate loop!
		}
		
		System.out.println("We're closed!");
	}
	
	/*
	 * This method allows us to hire a certain number of
	 * employees. That number is passed into the method.
	 */
	public void hireEmployees(int newEmployees) {
		
		/*
		 * A do-while loop is guaranteed to run at least once,
		 * even if the while statement evaluates to false.
		 */
		do {
			this.numEmployees++; //increment employees by 1
		}while(newEmployees > 0);
	}
	
	public void printMenu() {
		//Loop scope
		for(int i = 0; i < pies.length; i++) {
			System.out.println(pies[i].topping + ": $" + pies[i].price);
		}
	}

	/*
	 * We'll go ahead and override the "toString" method.
	 * This method returns a String representation of your
	 * object.
	 */
	
	@Override
	public String toString() {
		return "PizzaShop [numEmployees=" + numEmployees + ", name=" + name + ", budget=" + budget + ", pies="
				+ Arrays.toString(pies) + "]";
	}
	
	/*
	 * The equals method is also inherited from the Object class.
	 * This method provides a way of comparing two objects based
	 * on the values of their data members.
	 */
	
	@Override
	public boolean equals(Object obj) {
		/*
		 * Interestingly enough, the default implementation of 
		 * the equals method compares reference equality.
		 */
//		if (this == obj)
//			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PizzaShop other = (PizzaShop) obj;
		if (budget != other.budget)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numEmployees != other.numEmployees)
			return false;
		if (!Arrays.equals(pies, other.pies))
			return false;
		return true;
	}
	
	/*
	 * The hashCode method is used by Java in order to more easily
	 * lookup objects in memory. It generates a hash code for each
	 * object and compartmentalizes it based on the returned hash code.
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + budget;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numEmployees;
		result = prime * result + Arrays.hashCode(pies);
		return result;
	}

	public static void main(String... args) {
		Pizza cheese = new Pizza(10, "Cheese", 10.0f);
		Pizza veggie = new Pizza(17, "Veggie", 11.07f);
		Pizza sausage = new Pizza(89, "Sausage", 9.87f);
		Pizza alfredo = new Pizza(1, "Alfredo", 34.2f);
		
		cheese.price = 45.03f; //I can directly access this price as I'm in the same package and it has default access

		PizzaShop christinas = new PizzaShop(10, "Christina's", 1000000);
		PizzaShop bobbys = new PizzaShop(8, "Bobby's", 100);
		PizzaShop pizzaShop = new PizzaShop(10, "Christina's", 1000000);
		
		System.out.println("=======Reference Equality======");
		//reference equality
		System.out.println(christinas == bobbys);
		System.out.println(christinas == pizzaShop);
		
		System.out.println("========Object Equality Using equals method");
		//comparison using equals
		System.out.println(christinas.equals(bobbys));
		System.out.println(christinas.equals(pizzaShop));
		
		System.out.println("======Order 1=======");
		
		/*
		 * So how do I access the pies in my pizza array?
		 * Arrays have zero-based indices. In other words,
		 * the first pizza actually has an index of "0".
		 * 
		 * This means that the valid indices for an array are:
		 * 
		 * 0 to (length - 1)
		 * 
		 * Note that in this example, the length of our array
		 * is 4, and the indices are 0, 1, 2, and 3
		 */
		
		System.out.println("=========PIZZA SHOP INFO=========");
		System.out.println(christinas);
		System.out.println("=====VIEW OUR MENU=====");
		christinas.printMenu();
		christinas.acceptPizzaOrders(christinas.pies[0]);
		System.out.println("=======Order 2=======");
		christinas.acceptPizzaOrders(cheese, veggie);
		System.out.println("=======Order 3========");
		christinas.acceptPizzaOrders(cheese, veggie, alfredo, sausage);
		System.out.println("=========Order 4===========");
		christinas.acceptPizzaOrders(cheese, cheese, cheese, veggie, veggie, veggie);
		
		System.out.println("======Let's Cut Up Some Pizzas!======");
		System.out.println(christinas.cutPizza(veggie));
		
		System.out.println("========Employee Roll Call!========");
		christinas.employeeCount();
		
		System.out.println("==========Hours Of Operations=======");
		christinas.hoursOfOperation();
		
		System.out.println("==============Hire Employees=============");
		christinas.hireEmployees(-2);
		System.out.println(christinas.numEmployees);
	}

}