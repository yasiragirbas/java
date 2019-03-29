package com.class12;

public class StringManupulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Good morning, students!";
		boolean a=str.contains("morning");
		System.out.println(a);
		
		String present="Welcome, Asel";
		
		boolean flag=present.contains("Welcome,");
        		
		System.out.println(flag);
				
		
	  String str1="syntax";
	  Boolean d=str1.startsWith("s");
	  System.out.println(d);
	
	  Boolean x=str1.endsWith("y");
	
	  System.out.println(x);
	  
	  //is emty or not
	  
	  String str2="kklp";
	  Boolean k =str2.isEmpty();
	  System.out.println(k);
	  
	  //
	  String str3="Hello ";
	  String str4="Ali!";
	  System.out.println(str3+str4);
	  
	  System.out.println(str3.concat(str4));
	  
	  //
	  
	  String expected="You may qualfy for a multi-policy discount";
	  String actual="   You may qualfy for a multi-policy discount";
	  
	  System.out.println(expected.equals(actual));
	  
	  actual=actual.trim();
	  System.out.println(expected.equals(actual));
			  
		
	}

}
