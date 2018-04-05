package com.sap;

import java.util.Scanner;

public class ForTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // int sum = 0;
    //
    // for (int i = 0; i <= 10; i++) {
    // sum += i;
    // }
    //
    // System.out.println("sum: " + sum);

    // for (int i = 1; i <= 9; i++) {
    //// System.out.printf("7 * %d = %d\n", i, 7*i);
    // System.out.println("7 * " + i +" = "+ (7*i));

    // for (int i = 0; i < 10; i++) {
    //
    // for (int j = 2; j < 10; j++) {
    //
    // if (i == 0)
    // System.out.print(j + "th calc ");
    // else
    // System.out.printf("%d * %d = %d\t", j, i, i*j);
    // }
    //
    // System.out.println("");
    // }

//    Scanner sc = new Scanner(System.in);
//    int num;
//    
//    System.out.print("몇 단? ");
//    
//    num = sc.nextInt();
//    
//    for (int i = 1; i <= 9; i++) {
//      System.out.printf(num + " * %d = %d\n", i, num * i);
////      System.out.println(num + " * " + i + " = " + (num * i));
//    }
    
    
//    문제? 1934부터 2934까지의 자연수의 합을 구하시오. While문과 for문으로 각각 구현하시오.
    
    final int A = 1934, B = 2934;
    int sum1 = 0;
    int sum2 = 0;
    
    int a = A, b = B;
    
    while (true) {
      
      sum1 += a;
      
      if (a == B)
        break;
      
      a++;
      
    }
    
    a = A;
    b = B;
    
    for (int i = 0; a + i <= b; i++) {
      
      sum2 += (a + i);
    }
    
    System.out.println(A + "부터 " + B + "까지 자연수의 합은 " + sum1 + " 이지 않을까?");
    System.out.println(A + "부터 " + B + "까지 자연수의 합은 " + sum2 + " 이지 않을까?");
    
    
  }

}
