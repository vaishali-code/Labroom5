package com.revature.util;

public class Wrappers {

	private int a = 8;
	private Integer a2 = new Integer(8); //wrapper
	private short s = 9;
	private Short s2 = new Short((short) 8);
	private long l = 3432323243242L;
	private Long l2 = new Long(434344344323L);
	private boolean b = true;
	private Boolean b2 = new Boolean(true);
	private char c = '4';
	private Character c2 = new Character('c');
	private byte by = 5;
	private Byte by2 = new Byte((byte) 4);
	
	
	public static void main(String...args) {
		
		Wrappers w = new Wrappers();
		/*
		 * Things to note:
		 * 
		 * 1) Primitives, as they are not objects, do not have 
		 * methods associated with them while instances of wrapper
		 * classes do have methods.
		 * 
		 * 2) Primitives are minimal, so if you don't need all of
		 * the additional functionality afforded by using an object,
		 * stick to using the primitive.
		 */
		
		short num1 = 4;
		short num2 = 8;
		
		/*
		 * Side note: When performing math with primitive data
		 * types such as short (which are 16 bits in size),
		 * the result will be "promoted" to an int. In other
		 * words, you must store your result in an int.
		 */
//		short num3 = num1 + num2;
		
		int num3 = num1 + num2;
		
	}
}
