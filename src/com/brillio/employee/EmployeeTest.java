package com.brillio.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName="Brillio"; // Calling Static variable
		
		Employee e1 = Employee.getEmployeeInstance();
		System.out.println(e1);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.empId = 101;
		emp1.empName = "John";
		// emp1.companyName="Brillio"; // Common Record for all Object , so we'll make it Static
		emp1.empSal=5000;
		
		emp2.empId= 102;
		emp2.empName= "Peter";
		// emp2.companyName= "Brillio";
		emp2.empSal=6000;
		
		emp3.empId= 103;
		emp3.empName= "Mark";
		// emp3.companyName= "Brillio";
		emp3.empSal=8000;
		
		//Employee.displayEmpoyeeDetails(emp1); // Calling Method which has class Argument, so passing Object Refernce
		//Employee.displayEmpoyeeDetails(emp2);
		//Employee.displayEmpoyeeDetails(emp3);
		
		emp2.printEmployeeDetails(); // Calling Non-static method-Much easier
		emp1.printEmployeeDetails();
		emp3.printEmployeeDetails();
		
		
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(Employee.companyName);
		System.out.println(emp1.empSal);
		System.out.println("--------------------");
		
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(Employee.companyName);
		System.out.println(emp2.empSal);
		System.out.println("--------------------");
		
		System.out.println(emp3.empId);
		System.out.println(emp3.empName);
		// System.out.println(emp3.companyName); // Non-Static 
		System.out.println(Employee.companyName); // Static
		System.out.println(emp3.empSal);
		System.out.println("--------------------");
		
	}

}
