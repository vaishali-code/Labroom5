package com.revature.model;

public class PremiumAccount {
	String acctStatus = "n/a";
	String ownerName = "n/a";
	int acctAge = 0;
	int purchaseNum = 0;
	long acctNum = 0;
	
	public static void main(String []args) {
      PremiumAccount sally = new PremiumAccount("active", "Sally", 60, 15, 555322);
	      sally.printAccountInfo();
	      sally.premiumPerk();
   
		}
	
	public PremiumAccount (String acctStatus, String ownerName, int acctAge, int purchaseNum, long acctNum){
		this.acctStatus = acctStatus;
		this.ownerName = ownerName;
		this.acctAge = acctAge;
		this.acctNum = acctNum;
		if (purchaseNum < 0 ) {
			System.out.println("You cannot have negative purchases.");
		}
		else this.purchaseNum = purchaseNum;
	}
	
	
	public void printAccountInfo(){
		if (this.acctStatus.equals("active")) {
		System.out.println("Account can be modified");
		}
		else System.out.println("Account is angry and stuck.");
	}
	
	public void premiumPerk (){
		if (this.acctAge > 59) {
			System.out.println("You are old and we are gonna save you with some benefits");
		}
		else System.out.println("You are young enough to spend some money, no benefits yet.");
	}
	
}
