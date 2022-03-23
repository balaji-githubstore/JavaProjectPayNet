package com.paynet.datatypes;

public class Demo2 {

	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		
		int result= a+b;
		System.out.println(result);
		
		result = a-b;
		System.out.println(result);
		
		//muliply 
		result =a*b;
		System.out.println(result);
		
		//division
		result =a/b;
		System.out.println(result);
		
		
		double output =(double)a/b;  //explicit conversion  
		System.out.println(output);
		
		//division - reminder
		
		result=a%b;
		System.out.println(result);
		
		System.out.println((double)22/7);
		System.out.println(22/(double)7);
		System.out.println(22.0/7);
		System.out.println(22/7.0);
		
	}
}



