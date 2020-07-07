package com.revature.app.bank;

public class AccountStatus {
	  private int statusId; // primary key
	  private String status = Status.Pending.toString(); // not null, unique
	  
	  enum Status {
		  Pending,
		  Open,
		  Closed,
		  Denied
	  }
}
