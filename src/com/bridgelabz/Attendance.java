package com.bridgelabz;

public class Attendance {
	public static void main(String[] args) {

		double attendance = Math.floor((Math.random() * 10) % 2);

		if (attendance == 1) {

			System.out.println(" Employee is present. ");
		} else {
			System.out.println(" Employee is absent. ");
		}
	}

}
