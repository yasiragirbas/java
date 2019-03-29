package com.class12;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Syntax";
		int lengthOfString=str.length();
		
		System.out.println(lengthOfString);
		
		String str1="Syntax Technologies";
		
		int lengthOf2Srtring=str1.length();
		System.out.println(lengthOf2Srtring);
		
		String str3="Hello";
		
	     String newString=str3.toUpperCase();
	     System.out.println(newString);
		
	     String str4="Hello";
	     String str5="hello";
	     
	     Boolean a=str4.equals(str5);
	     System.out.println(a);
	  
	     String b="Chrome";
	     String c="chorome";
	     
	     Boolean d=b.equalsIgnoreCase(b);
	     System.out.println(d);
	}

}
