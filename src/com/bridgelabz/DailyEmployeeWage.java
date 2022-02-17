package com.bridgelabz;

public class DailyEmployeeWage {
	public static void main(String[] args) {
		double attendance = Math.floor(Math.random() * 2);
		int wages;
		if (attendance == 1) {
			wages = 160;
			System.out.println(" Employee is present. \n Wages Earned = " + wages);
		} else {
			wages = 0;
			System.out.println(" Employess is absent. \n Wages Earned = " + wages);
		}
	}
}
