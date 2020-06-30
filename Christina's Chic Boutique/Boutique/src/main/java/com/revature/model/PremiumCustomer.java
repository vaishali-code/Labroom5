package com.revature.model;

public class PremiumCustomer {

	String name;
	String address;
	String phoneNumber;
	int age;
	float rewardPoints;
	
	//Constructor
	public PremiumCustomer (String name, String address, 
							String phoneNumber, int age,
							float rewardPoints ) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.rewardPoints = rewardPoints;
	}
	
	//Changing customer's infos
	public void setName (String newName) {
		this.name = newName;
	}
	public void setAddress (String newAddress) {
		this.address= newAddress;
	}
	public void setPhoneNumber (String newPhoneNumber) {
		this.phoneNumber= newPhoneNumber;
	}
	public void setAge (int newAge) {
		this.age = newAge;
	}
	public void setRewardPoints (float newRewardPoints) {
		this.rewardPoints = newRewardPoints;
	}
	
	public float customerReward () {
	

		System.out.println(this.rewardPoints * 0.10f);
		return (this.rewardPoints * 0.10f);
		
	}
	
	public static void main (String [] args) {
		
		PremiumCustomer customer = new PremiumCustomer ("Christina", 
														"12345 Revature Drive, CA93125 Pacoima",
														"123-456-7890", 25, 100);
		customer.customerReward();
	}
}
