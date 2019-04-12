package com.class20;

public class TaskSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a method createEmail()
		 * Based on provided user name, lastName and email type,
		 * your method should return complete email adress
		 * johnsnow@gmail.com
		 * johnsnow@yahoo.com
		 */
		TaskSame obj=new TaskSame();
		String email=obj.createEmail("John", "alley", "gmail");
		System.out.println(email);

	}
	
	String createEmail(String name, String lastName, String emailType) {
		String email= name+lastName+"@"+emailType+"com";
		return email;
	}

}
