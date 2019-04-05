package com.class17;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a method that will take 2 parameters as a numbers and prints which number is larger
		
		task1 obj=new task1();
		obj.larger(100, 500);
		

	}
	
	void larger(int a, int b) {
		if(a>b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("b is larger than a");
		}
	}

}
