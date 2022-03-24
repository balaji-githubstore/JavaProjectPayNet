package com.paynet.datatypes;

public class Demo6TwoDim {

	public static void main(String[] args) {
		
		String[] colors = new String[3];
		colors[0] = "red";
		colors[1] = "green";
		colors[2] = "yellow";
		
		String[] cols= {"red","green","yellow"};
		
		String[][] main=new String[4][3];
		
		main[0][0]="john";
		main[0][1]="john123";
		main[0][2]="Invalid credentials";
		
		main[1][0]="peter";
		main[1][1]="peter123";
		main[1][2]="Invalid credentials";
		
		main[2][0]="Paul";
		main[2][1]="paul123";
		main[2][2]="Invalid credentials";
		
		main[3][0]="mark";
		main[3][1]="mark123";
		main[3][2]="Invalid credentials";
		
		String[][] mainz= {{"john","john123","Invalid credentials"},{"peter","john123","Invalid credentials"},{"john","john123","Invalid credentials"},{"john","john123","Invalid credentials"}};
		System.out.println(mainz[1][0]);
	}
}
