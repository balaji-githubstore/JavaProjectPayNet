package com.paynet.oops;

class Father
{
	public int fAge=60;
	public void fatherStyle()
	{
		System.out.println("fatherStyle");
	}
}

class Child extends	Father
{
	public int cAge=30;
	public void childStyle()
	{
		System.out.println("childStyle");
	}
	
}

public class InheritanceConcepts {

	public static void main(String[] args) {

		Child cObj=new Child();
		cObj.fatherStyle();
		cObj.childStyle();

	}

}
