package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyService implements EmployeeInterface{
	ArrayList<CompanyEmpWage> CompanyList = new ArrayList<CompanyEmpWage>();	
	Scanner scan = new Scanner(System.in);
	
     //method to add company. We are calling the method getinfo and the computing the employee wage
	public void addCompany() {
		CompanyEmpWage s = getInfo();                     //the output of getInfo is saved in variable s
		EmpWageBuilder.computeEmployeeWage(s);             //then we run the method computeEmployeeWage and pass the output s to it. 
		CompanyList.add(s);                           //we add the result in ArrayList
	}
	
	//to display the ArrayList
	public void printCompany() {
		
		System.out.println(CompanyList);
		}
	
	//method to take input form the user
	public CompanyEmpWage getInfo() {
		System.out.print("\n\n Please enter the name of the company: ");
		String name = scan.next();
		
		System.out.print(" Please enter the max num of working days in a month: ");
		int no_of_days = scan.nextInt();
		
		System.out.print(" Please enter the max num of working hours in a month: ");
		int max_hours_in_month = scan.nextInt();
		
		System.out.print(" Please enter the wages per hour: ");
		int wages_per_hour = scan.nextInt();
		
		return new CompanyEmpWage(name, no_of_days, max_hours_in_month, wages_per_hour);    //we are passing the value to constructor
	}
	
	//to compute compant wage
	public void CompanyWage() {
		
		System.out.println(" Please enter the name of the company: ");
		String name = scan.next();
		
		for (CompanyEmpWage companyEmpWage : CompanyList) {
			if(companyEmpWage.getName().equals(name)) {               //if the company name exists in list
				System.out.println("The total wages for this company: " + companyEmpWage.getWage());   // we have used the getters to get the wage value
				return;
			}
		}
		
		System.out.println(" Company of this name does not exist!");
	}
}