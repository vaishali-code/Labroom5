package com.revature.app.bank;

public class AccountType {
	  private int typeId; // primary key
	  private String type = Type.Checking.toString(); // not null, unique
	  
	  enum Type {
		  Checking,
		  Savings
	  }
}
