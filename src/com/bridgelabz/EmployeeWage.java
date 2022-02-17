package com.bridgelabz;

public class EmployeeWage {
	public static void main(String[] args) {

		int wages = 20;
		int Monthly_Working_Days = 20;
		int totalhrs=0;
		
		for(int i=0; i<=20; i++) {
		int attendance = (int) Math.floor((Math.random() * 3));
		switch (attendance) {
		case 0:
			int empHrs = 4;
			System.out.println("Employee is Present and done Part Time");
			 totalhrs += empHrs;
			break;
		case 1:
			int empHr = 8;
			System.out.println("Employee is Present and done Full Time");
		      totalhrs += empHr;
			break;
		case 2:
			System.out.println("Employee is Absent ");
			break;
		}  
		} System.out.println(" \n The Monthly Wage is : " + totalhrs*wages);
	}
}
