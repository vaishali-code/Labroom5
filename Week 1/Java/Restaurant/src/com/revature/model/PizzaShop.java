package com.revature.model;

public class PizzaShop {

	int numEmployees;
	String name;
	int budget;
	
	public PizzaShop(int numEmployees, String name, int budget) {
		super();
		this.numEmployees = numEmployees;
		this.name = name;
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
	
	

	public static void main(String... args) {
		Pizza cheese = new Pizza(10, "Cheese", 10.0f);
		Pizza veggie = new Pizza(17, "Veggie", 11.07f);
		Pizza sausage = new Pizza(89, "Sausage", 9.87f);
		Pizza alfredo = new Pizza(1, "Alfredo", 34.2f);

		PizzaShop christinas = new PizzaShop(10, "Christina's", 1000000);

		System.out.println("======Order 1=======");
		christinas.acceptPizzaOrders(cheese);
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