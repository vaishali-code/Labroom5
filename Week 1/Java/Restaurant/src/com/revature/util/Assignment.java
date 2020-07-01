package com.revature.util;

public class Assignment {
	
	//the reference var1 of type int points to a value of 9
	int var1 = 9; //I have assigned a value to a reference.
	int var2; //This is a variable declaration with no assignment
	
	public static void main(String...args) {
		//local variables are REQUIRED to be initialized (assigned
		//a value) before you use them. A local variable is a variable
		//that is declared within a method.
		int var3 = 3;
		
		Assignment assign = new Assignment();
		System.out.println(var3 + 2);
		
		/*
		 * There are some specialized versions of the assignment
		 * operator that are convenient (though not required). They
		 * are coupled with arithmetic operators.
		 */
		
		var3 += 4; //var3 = var3 + 4;
		System.out.println(var3); //var3 is now 7
		var3 -= 4; //var3 = var3 - 4;
		var3 *= 4; //var3 = var3 * 4;
		var3 /= 4; //var3 = var3 / 4;
	}
}
