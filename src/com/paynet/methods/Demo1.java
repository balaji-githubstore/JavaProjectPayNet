package com.paynet.methods;

public class Demo1 {

	
	
	public static void main(String[] args) {

		int radius = 10;
		double result= Area.areaOfCircle(20);
		System.out.println(result);
		
		result= Area.areaOfRectangle(10, 20);
		System.out.println(result);		
		
		String name=Area.getAuthorName();
		System.out.println(name);
		
		Area.printClassPurpose();

		//creating object for type Area
		Area obj=new Area(); //allocate the memory
		
		result=obj.areaOfTriangle(25, 1);
		System.out.println(result);
		
		System.out.println(obj.areaOfTriangle(25, 1));
	}

}



