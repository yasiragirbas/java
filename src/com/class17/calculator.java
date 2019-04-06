package com.class17;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculator obj=new calculator();
		
		obj.sub(10, 5);
		obj.div(10, 2);
		obj.mult(14, 2);
		
		
		
		
	}
	private void sub(int a, int b) {
		System.out.println(a+b);
			
		}
	public void div(int a, int b) {
		System.out.println(a/b);
	}
	void mult(int a, int b) {
		System.out.println(a*b);
	}
}
