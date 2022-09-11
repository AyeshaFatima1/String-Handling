package com.stringMethods1;

public class Example2 {

	public static void main(String[] args) {
		/**
		 * compareTo(String anotherString):
		 * 
		 * Compares two strings lexicographically.
		 * 
		 * =======================================================
		 * 
		 * compareToIgnoreCase(String str):
		 * 
		 * Compares two strings lexicographically, ignoring case differences.
		 * 
		 */		
		
		
		String text1="Ayesha";//A-65
		
		String text2="Fatima";//F-70
		
		String text3="ayesha";//a-97
		
	  System.out.println(text1.compareTo(text2));//65-70=-5
	  
	  System.out.println(text1.compareTo(text3));//65-97=-32
	  
	  System.out.println(text2.compareTo(text3));//70-97=-27
	  
	  System.out.println("=================================");
	  
	  System.out.println(text1.compareToIgnoreCase(text3));//0
	}

}
