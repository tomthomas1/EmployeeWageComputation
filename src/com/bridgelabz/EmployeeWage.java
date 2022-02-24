package com.bridgelabz;

public class EmployeeWage {
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	
	private final String company;
	private final int empRate;
	private final int numOFDays;
	private final int maxHours;
	private int empWagePerMonth;

	
	public EmployeeWage(String company, int empRate, int numOFDays, int maxHours) {                //creating constructor for input of data
		this.company = company;
		this.empRate = empRate;
		this.numOFDays = numOFDays;
		this.maxHours = maxHours;
	}
	public void calculateEmpWageForCompany() {
		int empHrs=0,totalWorkingdays=0, totalEmpHours = 0;
				
		while(totalEmpHours <= maxHours && totalWorkingdays < numOFDays) {
			
			totalWorkingdays ++;
			int empType = (int)Math.floor(Math.random() * 10) % 3;
			
			switch(empType) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			
			totalEmpHours += empHrs;
			int empWagePerDay = empHrs * empRate;
			empWagePerMonth += empWagePerDay;
			System.out.println("Emp Wage Per Day : "+empWagePerDay);
		}
	}
		
		@Override
		public String toString() {
			return "Emp Wage Per Month for Company " + company + " is : " + empWagePerMonth;
		}

	
	public static void main(String[] args) {    
		System.out.println("----- Welcome to Employee Wage Computation! -----");
		EmployeeWage tata = new EmployeeWage("TATA", 20, 2, 10);                                //  calculating the wage for all company. We have created the object of the company
		EmployeeWage reliance = new EmployeeWage("RELIANCE", 40, 5, 20);
		tata.calculateEmpWageForCompany();
		System.out.println(tata);
		reliance.calculateEmpWageForCompany();
		System.out.println(reliance);

		
	
	}

}