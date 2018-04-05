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
		
		System.out.println("±¹¾î\t¿µ¾î\t¼öÇĞ\tÃÑÁ¡\tÆò±Õ");
		System.out.printf("%-8d%-8d%-8d%-8d%-8.2f", korean, english, math, sum, average);
	}

}
