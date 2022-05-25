package com.brillio.employee;

public class Employee {

	public int empId; // Non-static Variable
	public String empName;
	public double empSal;
	// public String companyName; // Non-Static As of now , But make static because it is common Record
	
	public static String companyName; // Static Variable
	
	public static void displayEmpoyeeDetails(Employee e) // Class type Argument , Call can be Return type as well
	{
		System.out.println(e.empId);
		System.out.println(e.empName);
		System.out.println(e.empSal);
		System.out.println(Employee.companyName);
		System.out.println("................");
	}
	
	public void printEmployeeDetails() // Non-static Method - Fast and easy
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
		System.out.println(Employee.companyName);
		System.out.println("................");
	}
	
	public static Employee getEmployeeInstance()
	{
		Employee e = new Employee();
		return e;
		
	}
}
