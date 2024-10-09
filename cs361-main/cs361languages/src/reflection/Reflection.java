/**
 * 
 */
package reflection;

/**
 * @author Stephen Yearwood 
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

import circle.ColoredCircle;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
		{
			throw new IllegalArgumentException("Object passesd is null");
		}
		Class<?> temp = o.getClass();
		StringBuilder chain = new StringBuilder("Inheritance chain:");
		while(temp != null)
		{
			chain.append(temp.getName());
			temp = temp.getSuperclass();
			if(temp != null)
			{
				chain.append(" inherits from ");
			}
		}
		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		System.out.println(chain);
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		System.out.println("Methods:  ");
		for(Method temp : m)
		{
			System.out.println(temp);
		}
		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		System.out.println("Test 1!");
		String Test1 = "Test Text";
		r.correspondingClass(Test1);
		r.inheritanceChain(Test1);
		r.listMethods(Test1);
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete		
		System.out.println("Test 2!");
		ColoredCircle Test2 = new ColoredCircle();
		r.correspondingClass(Test2);
		r.inheritanceChain(Test2);
		r.listMethods(Test2);
	}

}
