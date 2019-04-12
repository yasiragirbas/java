package com.class21;

public class Employee {
     public int eID;
     int salary;
     public static String ceo="Sumair";
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee();
		emp1.eID=0001;
		emp1.salary=8000;
		
		Employee emp2=new Employee();
		emp2.eID=0002;
		emp2.salary=6000;
		
		emp1.CEO();
		emp2.CEO();
		
		

	}
	
	public void CEO() {
		System.out.println("Ceo "+ceo+ "\nThe employee with eID "+eID+" has the salary "+salary);
	}
	

}
