package com.paynet.employee;

public class Employee {
	public int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	public Employee()
	{
		System.out.println("Object Created");
		System.out.println("Browser launch");
		System.out.println("----------------");
	}
	

	public Employee(int count)
	{
		System.out.println("Object Created");
		System.out.println("Browser launch");
		System.out.println("----------------");
	}
	
	public Employee(double count)
	{
		System.out.println("Object Created");
		System.out.println("Browser launch");
		System.out.println("----------------");
	}
	
	public Employee(int a, double b)
	{
		System.out.println("Object Created");
		System.out.println("Browser launch");
		System.out.println("----------------");
	}
	
	public Employee(double a, int b)
	{
		System.out.println("Object Created");
		System.out.println("Browser launch");
		System.out.println("----------------");
	}
	
	public void printEmployeeDetails()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("--------------------------------------------");
	}
	
	public static Employee getEmployeeInstance()
	{
		Employee emp=new Employee();
		return emp;
	}
	
	

}
