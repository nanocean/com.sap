package com.sap;

import java.util.Scanner;

public class IfTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

//    int a = 10;
//    int b = 20;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    
    while (!sc.hasNextInt())
    {
      System.out.print("Enter 1st number: ");
      sc.next();
    }
    
    int num1 = sc.nextInt();

    System.out.print("Enter 2nd number: ");
    
    while (!sc.hasNextInt())
    {
      System.out.print("Enter 2nd number: ");
      sc.next();
    }
    
    int num2 = sc.nextInt();

    if (num1 > num2) {
      System.out.println(num1 + " > " + num2);
    } else if (num1 == num2) {
      System.out.println(num1 + " = " + num2);
    } else {
      System.out.println(num1 + " < " + num2);
    }
    
  }

}
