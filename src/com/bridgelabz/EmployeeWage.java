package com.bridgelabz;

public class EmployeeWage {
	public static void main(String[] args) {
		final int PART_TIME = 1;
		final int FULL_TIME = 2;
		final int PART_TIME_HOURS = 4;
		final int FULL_TIME_HOURS = 8;

		int wage = 0;
		int days = 0;
		int hours = 0;
		int no_of_days = 20;
		int max_hours_in_month = 100;
		int wages_per_hour = 20;

		while (days < no_of_days && hours < max_hours_in_month) {
			int attendance = (int) Math.floor((Math.random() * 10) % 3);

			switch (attendance) {

			case PART_TIME:
				if (hours + PART_TIME_HOURS > 100) {
					break;
				}
				hours += PART_TIME_HOURS;
				days++;
				break;
			case FULL_TIME:
				if (hours + FULL_TIME_HOURS > 100) {
					break;
				}
				hours += FULL_TIME_HOURS;
				days++;
				break;
			}
		}

		wage = hours * wages_per_hour;

		System.out.println(" TOTAL WAGES= " + wage);
		System.out.println(" TOTAL WORKING DAYS = " + days);
		System.out.println(" TOTAL WORKING HOURS = " + hours);

	}
}
