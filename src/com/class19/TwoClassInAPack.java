package com.class19;

class X{
	
	protected int i=1221;
	void methodOfX() {
		System.out.println(i);
		
	}
}

public class TwoClassInAPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		X x=new X();
		
		System.out.println(x.i);
		x.methodOfX();

	}

}
