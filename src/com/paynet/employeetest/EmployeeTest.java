package com.paynet.employeetest;

import com.paynet.employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName="PayNet";
		
		Employee emp1=new Employee();
		Employee emp2=new Employee(10.2);

		Employee emp3= Employee.getEmployeeInstance();
		
		emp1.empId=101;
		emp1.empName="John";
		emp1.empSalary=8000;
		
		//load emp2 detail
		emp2.empId=102;
		emp2.empName="Peter";
		emp2.empSalary=5000;
		
		emp3.empId=103;
		emp3.empName="Paul";
		emp3.empSalary=6000.25;
		
		emp2.printEmployeeDetails();
		emp1.printEmployeeDetails();
		
		emp3.printEmployeeDetails();
		
		
//		emp1.printEmployeeDetails();
		
		

	}

}
