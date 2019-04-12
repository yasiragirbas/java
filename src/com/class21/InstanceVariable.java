package com.class21;

public class InstanceVariable {
	
	String name="John";// creating Instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name="Anna";//Creating local variable
    System.out.println(name);
    name="olga";
    System.out.println(name);
    
    InstanceVariable obj=new InstanceVariable();
    System.out.println(obj.name);
    obj.name="Jack";
    System.out.println(obj.name);
    
    InstanceVariable obj1=new InstanceVariable();
    System.out.println(obj1.name);
    ;
		
	}
	
	public void hello() {
		System.out.println("Hello "+name);
		
	}

}
