package com.sap;

public class ScoreList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int korean, english, math, sum;
		float average;
		korean = 87;
		english = 99;
		math = 82;
		
		sum = korean + english + math;
		average = sum/(float)3;
		
		System.out.println("����\t����\t����\t����\t���");
		System.out.printf("%-8d%-8d%-8d%-8d%-8.2f", korean, english, math, sum, average);
	}

}
