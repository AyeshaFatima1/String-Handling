package com.stringMethods3;

public class Example4 {

	public static void main(String[] args) {

		/**
		 * split(String regex):
		 * 
		 * Splits this string around matches of the given regular expression.
		 * 
		 */
			
	String text="Welcome to India, Welcome to Mumbai";
	
	System.out.println(text);
	
	String words[]=text.split("\\s");
	
	for(String word:words) {
		
		System.out.println(word);
		
	}
	
	}

}
