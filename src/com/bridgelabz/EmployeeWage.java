package com.bridgelabz;

public class EmployeeWage {
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;

	// method to compute employee wage
	public static int calculateEmpWageForCompany(String company, int empRate, int numOFDays, int maxHours) {

		System.out.println("\n ----- Welcome to Employee Wage Computation! -----");
		int empHrs = 0, empWagePerMonth = 0, totalWorkingdays = 0, totalEmpHours = 0;

		while (totalEmpHours <= maxHours && totalWorkingdays < numOFDays) { // condition

			totalWorkingdays++;
			int empType = (int) Math.floor(Math.random() * 10) % 3; // random fun to check if employee is doing full
																	// time or part time

			switch (empType) {
			case IS_FULL_TIME:
				empHrs = 8;
				System.out.println("Employee has done a Full Time");
				break;
			case IS_PART_TIME:
				empHrs = 4;
				System.out.println("Employee has done a Part Time");
				break;
			default:
				empHrs = 0;
				System.out.println("Employee was Absent");
			}
			// to calculate the employee wage
			totalEmpHours += empHrs;
			int empWagePerDay = empHrs * empRate;
			empWagePerMonth += empWagePerDay;
			System.out.println("Emp Wage Per Day : " + empWagePerDay);
		}

		System.out.println("Emp Wage Per Month for Company " + company + " is Rs." + empWagePerMonth);
		return empWagePerMonth; // to return the wage
	}

	public static void main(String[] args) {
		// calling the method with parameter input
		calculateEmpWageForCompany("TATA", 30, 3, 30);
		calculateEmpWageForCompany("Reliance", 20, 4, 40);

	}

}