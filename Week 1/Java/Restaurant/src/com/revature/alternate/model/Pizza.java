package com.revature.alternate.model;

/*
 * If you want to import all of the classes from a package,
 * use the "*" wildcard symbol.
 * 
 * Note that Java prioritizes more specific imports.
 * 
 * If, for instance, I import com.revature.util.Arithmetic
 * and I import another class (that does not exist in this
 * application) called com.revature.otherpackage.* AND a class
 * called Arithmetic exists in this package as well, Java will
 * use the explicitly imported Arithmetic rather than the one that
 * would have been imported using the * symbol.
 */

/*
 * import statements go after the package declaration
 * and before our class definition.
 * 
 * Imports are for classes - NOT packages. You import classes.
 */

import com.revature.util.Arithmetic;
import com.revature.util.Logical;

/*
 * If you want to import a static member of a class, you must use
 * a static import.
 */

import static com.revature.model.Coffee.staticCoffeeMethod;

public class Pizza {

	/*
	 * I can have two classes called "Pizza" as long as they
	 * are in different packages. This is because Java uses
	 * fully qualified class names to differentiate classes
	 * from each other.
	 * 
	 * Fully Qualified class name of original pizza class:
	 * 
	 * com.revature.model.Pizza
	 * 
	 * Fully qualified class name of this version of pizza class:
	 * 
	 * com.revature.alternate.model.Pizza
	 */
	
	public static void main(String...args) {
		Pizza p = new Pizza();
		/*
		 * If you do not have to use the fully qualified class
		 * name, don't as it is bad practice.
		 */
		com.revature.model.Pizza p2 = new com.revature.model.Pizza();
		
		/*
		 * What if I want to use our Arithmetic class? It's in a different
		 * package. This means I need to import it.
		 */
		
		Arithmetic a = new Arithmetic();
		Logical l = new Logical();
		
		/*
		 * This class is not importable as I created it in
		 * the default package.
		 */
//		NotImportable ni = new NotImportable();
		
		//Using a static import
		
		staticCoffeeMethod();
	}
}
