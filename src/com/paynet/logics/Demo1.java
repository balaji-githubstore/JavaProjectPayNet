package com.paynet.logics;

public class Demo1 {

	public static void main(String[] args) {
		
		int num=-10;
		
		if(num>0)
		{
			System.out.println("The given number is positive "+num);
		}
		else if(num==0)
		{
			System.out.println("The given number is zero");
		}
		else
		{
			System.out.println("The given number is negative "+num);
		}
		
		int pageNumber=120;
		
		if(pageNumber>=100)
		{
			if(pageNumber<=200)
			{
				System.out.println("Yes! it's between 100 & 200");
			}
		}
		
		if(pageNumber>=100 && pageNumber<=200)
		{
			System.out.println("Yes! it's between 100 & 200");
		}
		
		
		
		

	}

}





