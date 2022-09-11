package com.aboutStringBufferAndStringBuilder;

public class Example1 {

  public static void main(String[] args) {
	  
     StringBuffer name = new StringBuffer("Neha");
		
		System.out.println(name);
		
		System.out.println("======================");
		
		name.append("Fatima");//adding some value to the existing string object
		
		System.out.println(name);
		
		System.out.println("======================");
		
		name.append(" is my best friend.");//adding some value to the existing string object
		
		System.out.println(name);
			
		
	}

}
