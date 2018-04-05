package com.sap;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test0001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        StringTokenizer strToken = new StringTokenizer(n, " ");
        System.out.println(strToken.countTokens());
		
		
	}

}
