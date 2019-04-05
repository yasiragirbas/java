package com.class17;

public class NoMainMethot {
	
	
	//Its readeble but is not exucutible because the main method is nor present 
	
	
	String str;
	int num;
	
	
	
	void hello() {
		System.out.println("Hello");
		
	}
	void bye() {
		System.out.println("Bye");
	}
	
	public static void main(String[] args) {//method signature
		
		NoMainMethot obj=new NoMainMethot();//method body
		obj.hello();//we calling a method hello
		obj.bye();
	}
	
	void howAreYou() {
		System.out.println("How are you");
		
	}
	
	
}
