package com.class17;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task3 obj=new Task3();
		obj.palindrome("madam");
	}
	
	void palindrome(String text) {
		String reverse="";
		for(int i=text.length()-1; i>=0;i--) {
			reverse=reverse+text.charAt(i);
		
	}
		if(reverse.equals(text)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palidrome");
		}

		
		    
	}

}
