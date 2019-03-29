package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*we have seven days a week
		 * if days are from 1-5 -->weekday
		 * if days are from 6-7 --> weekend
		 * otherwise not a valid day
		 */
		
		int day=5;
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is weekday");
		}else if(day==6 || day==7){
			System.out.println("it is weekend");
		}else {
			System.out.println("Not a valoid day");
		}
		
	}

}
