package com.class21;



public class Car {
	public String color;
	public static int totalCars;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1=new Car();		
		car1.color="White";
		Car.totalCars++;
		
		Car car2=new Car();
        car2.color="Clack";
        Car.totalCars++;
        System.out.println("Total car we made is "+totalCars);
	}

}
