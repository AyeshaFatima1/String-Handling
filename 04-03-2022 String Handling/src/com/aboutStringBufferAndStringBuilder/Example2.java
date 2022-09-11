package com.aboutStringBufferAndStringBuilder;

public class Example2 {

  public static void main(String[] args) {
	  
     StringBuilder name = new StringBuilder("Neha");
		
		System.out.println(name);
		
		System.out.println("======================");
		
		name.append("Fatima");//adding some value to the existing string object
		
		System.out.println(name);
		
		System.out.println("======================");
		
		name.append(" is my best friend.");//adding some value to the existing string object
		
		System.out.println(name);
			
		
	}

}
