package com.revature.app.bank;

public class Role {
	  private int roleId; // primary key
	  private String role = Authority.Standard.toString(); // not null, unique
	  
	  enum Authority {
		  Standard,
		  Premium,
		  Employee,
		  Admin
	  }
}
