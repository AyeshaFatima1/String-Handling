package com.stringMethods1;

public class Example4 {

	public static void main(String[] args) {
		
		/**
		 * contains(CharSequence s):
		 * 
		 * Returns true if and only if this string contains the 
		 * specified sequence of char values.
		 * 
		 */
			
		  String text="Welcome to String Methods";
	  
	  System.out.println(text.contains("to"));
	  
	  System.out.println(text.contains("To"));
	  
	  System.out.println(text.contains("string"));
	}

}
