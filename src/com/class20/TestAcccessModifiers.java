package com.class20;

public class TestAcccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers obj=new AccessModifiers();
		obj.palindrome("madam"); //accesing public method
		
		obj.samePackage(1000); //accessing protected method
		
		//obj.getWordsFromString we can not access to this class because is private class		
	}

}
