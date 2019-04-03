package com.class16;

public class car {

	
	String make, model, color;
	int door, wheels;
	
	public static void main(String[] args) {
		
		
		car car1=new car();
		//1object
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Red";
		car1.door=4;
		car1.wheels=4;
		System.out.println("Car "+car1.make+ " has "+car1.wheels+" whells" );
		//define behaviour 
		car1.drive();
		car1.reverse();
		car1.stop();
		
	
		
		//2object
		car car2=new car();
		car2.make="Tesla";
		car2.model="X";
		car2.color="Black";
		car2.door=4;
		car2.wheels=4;
		System.out.println("My car is "+car2.color+" "+car2.make);
		//begaviours
		car2.drive();
		car2.reverse();
		car2.stop();
		
	}
	void drive() {
		System.out.println("Car can drive");
	}
	void reverse() {
		System.out.println("Car can reverse");
	}
    void stop() {
    	System.out.println("Car can stop");
    }
}
