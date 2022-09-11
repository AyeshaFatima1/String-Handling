package com.stringMethods3;

public class Example7 {

	public static void main(String[] args) {
	
		/**
		 * toCharArray():
		 * 
		 * Converts this string to a new character array.
		 */

	String text="Welcome to India";
	
	System.out.println(text);
	
	char characters[]=text.toCharArray();
	
	for(char character:characters ) {
	
		System.out.println(character);
		
		}
	}
}
