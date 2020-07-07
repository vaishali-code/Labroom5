package com.revature.app.bank;

import com.revature.app.bank.AccountStatus.Status;

public class Account {
	  private int accountId; // primary key
	  private double balance = 0;  // not null
	  private AccountStatus status;
	  private AccountType type;
}