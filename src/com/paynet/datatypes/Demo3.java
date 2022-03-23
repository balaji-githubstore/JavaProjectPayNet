package com.paynet.datatypes;

public class Demo3 {
	
	public static void main(String[] args) {
		
		float a=10.123456789f;
		double b=10.123456789;
		System.out.println(b);
		
//		b=a; // float to double // implicit conversion // will not lead to dataloss
	
		a=(float)b; // double to float // might lead to data loss
		System.out.println(a);
		
		int z=130;
		
		byte x=(byte) z;
		
		System.out.println(x);
	}

}
