package com.class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		int stringlength=str.length();
		System.out.println(stringlength);
		
		MethodWithReturnValue obj=new MethodWithReturnValue();
		
		String day=obj.whatIsADay();
		

	}
	
	void whatIsADay() {
		
		return "Thursday";
	}

}
