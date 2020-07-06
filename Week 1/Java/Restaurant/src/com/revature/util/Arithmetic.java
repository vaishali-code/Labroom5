package com.revature.util;

public class Arithmetic {

	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		//Note that when you use the division operator,
		//it returns the floor of the two numbers you're dividing!
		return x / y;
	}
	
	public int preIncrementByOne(int x) {
		return ++x; //preincrement operator
	}
	
	public int postIncrementByOne(int x) {
		return x++; //postincrement operator
	}
	
	public static void main(String...args) {
		Arithmetic calc = new Arithmetic();
		
		int sum = calc.add(3, 5);
		System.out.println(sum); //sum is 8
		
		int result = calc.divide(8, 5);
		System.out.println(result); //the result is "1"
		
		System.out.println("===========IncrementByOne============");
		System.out.println(calc.preIncrementByOne(8));
		
		System.out.println("===========PostIncrementByOne============");
		System.out.println(calc.postIncrementByOne(8));
		
		System.out.println(sum++); //This will print sum and then increment it!
		System.out.println(sum);
	}
}
