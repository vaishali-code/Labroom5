package com.revature.model;

public class Store{

	String storeName; //Name of the store
	String storeLocation;
	int inventory;
	int employees; 
	float shippingTime;
	
	public Store (int employees, int inventory, String storeName, String storeLocation) {
		if((employees>0)&&(inventory>0)) {
		this.employees = employees;
		this.inventory = inventory;
		this.storeName = storeName;
		this.storeLocation = storeLocation;
		}
		else System.out.println("Invalid input. Try again.");
	
	}
	public Store() {}

	public static float shippingCalculation(float shippingTime, int employees) {
	if (employees < 1) {
		return shippingTime;
	}
	else	return shippingTime/employees;
	}
	
		
	
	
	public static void main(String []args) {
		

          	
		Store boutique = new Store();
		boutique.storeName = "Christina's Chic Boutique";
		boutique.storeLocation = "Los Angeles";
		boutique.inventory = 500; 
		boutique.employees = 3;
		boutique.shippingTime = 7;
		
		System.out.println(shippingCalculation (boutique.shippingTime,boutique.employees));
	    boutique.storeCity("Chicago");
	    System.out.println(boutique.storeLocation);
	    
	}
	
}
