package com.paynet.logics;

public class GradeSystem {

	public static void main(String[] args) {

		int mark = 75;

		if (mark >= 90) {
			System.out.println("A");
		} else if (mark >= 80 && mark <= 89) {
			System.out.println("B");
		} else if (mark >= 60 && mark <= 79) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

		System.out.println("end");
	}

}
