package com.sap;

import java.util.Scanner;

public class Practice7 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
//    1.
//    int[] score = new int[5];
//    int total = 0;
//    float ave = 0.0f;
//    
//    for (int i = 0; i < score.length; i++) {
//      score[i] = (int)(Math.random() * 101);
//    }
//
//    for (int i = 0; i < score.length; i++) {
//      total += score[i];
//
//      if (i == 0)
//        System.out.print("점수는 : " + score[i]);
//      else
//        System.out.print("," + score[i]);
//    }
//
//    System.out.println("");
//    
//    ave = total / (float)score.length;
//    
//    System.out.printf("총점은 %d, 평균은 %5.2f\n", total, ave);
    
    
//    2.
//    double[] score = new double[5];
//    double max = 0.0, min = 0.0;
//
//    for (int i = 0; i < score.length; i++) {
//      score[i] = Math.random();
//    }
//    
//    for (int i = 0; i < score.length; i++) {
//      
//      for (int j = 0; j < score.length - (i + 1); j++) {
//        
//        if (score[j] > score[j + 1])
//        {
//          double tmp = 0.0;
//          tmp = score[j + 1];
//          score[j + 1] = score[j];
//          score[j] = tmp;
//        }
//      }
//    }
//
//    for (int i = 0; i < score.length; i++) {
//      System.out.println(score[i]);
//    }
//    
//    max = score[score.length - 1];
//    min = score[0];
//    
//    System.out.printf("최대값은 %f, 최소값은 %f", max, min);

    
//    3.
//    int[] score = new int[5];
//
//    for (int i = 0; i < score.length; i++) {
//      int sign = (int) (Math.random() * 2);
//      
//      score[i] = ((sign == 0) ? -1 : 1) * (int) (Math.random() * 101);
//    }
//
//    for (int i = 0; i < score.length; i++) {
//      if (i == 0)
//        System.out.print("숫자는 : " + score[i]);
//      else
//        System.out.print("," + score[i]);
//    }
//
//
//    for (int i = 0; i < score.length; i++) {
//      if (i == 0)
//        System.out.print("절대값은 : " + Math.abs(score[i]));
//      else
//        System.out.print("," + Math.abs(score[i]));
//    }
    
    
//    4.
    
    
//    5.
//    int num1 = 0, num2 = 0;
//    
//    Scanner sc = new Scanner(System.in);
//
//    do {
//      sc = new Scanner(System.in);
//      System.out.println("숫자1을 입력해주세요. : ");
//    } while (!sc.hasNextInt());
//
//    num1 = sc.nextInt();
//
//    do {
//      sc = new Scanner(System.in);
//      System.out.println("숫자2를 입력해주세요. : ");
//    } while (!sc.hasNextInt());
//
//    num2 = sc.nextInt();
//    
//    if (num1 > num2)
//      System.out.printf("최대값은 %d, 최소값은 %d", num1, num2);
//    else
//      System.out.printf("최대값은 %d, 최소값은 %d", num2, num1);
    
    
//    6.
//  int num1 = 0;
//  
//  Scanner sc = new Scanner(System.in);
//
//  do {
//    sc = new Scanner(System.in);
//    System.out.println("숫자1을 입력해주세요. : ");
//  } while (!sc.hasNextInt());
//
//  num1 = sc.nextInt();
//  
//  if (num1 > 0)
//    System.out.println("양수");
//  else if (num1 < 0)
//    System.out.println("음수");
//  else
//    System.out.println("0");
    
    
//    7.
//    for (int x = 0; x < 4; x++) {
//        
//      for (int y = 4; y > 2; y--) {
//        
//        System.out.println(x + "\t" + y);
//      }
//      
//      if (x == 1)
//        x++;
//    }
    
    
//    8.
//    boolean 1
//    char 2
//    byte 1
//    short 2
//    int 4
//    long 8
//    float 4
//    double 8
//    
    
    
//    9.
//    4)
    
    
//    10.
//    1 -> 4 -> 2 -> 3
    
    
//    11.
//    String name, address, birthday;
//    
//    Scanner sc;
//
//    do {
//      sc = new Scanner(System.in);
//      System.out.println("이름을 입력해주세요. : ");
//    } while (!sc.hasNext());
//    
//    name = sc.next();
//
//    do {
//      sc = new Scanner(System.in);
//      System.out.println("주소를 입력해주세요. : ");
//    } while (!sc.hasNext());
//    
//    address = sc.next();
//
//    do {
//      sc = new Scanner(System.in);
//      System.out.println("생일을 입력해주세요. : ");
//    } while (!sc.hasNext());
//    
//    birthday = sc.next();
//    
//    System.out.printf("이름: %s, 주소: %s, 생일: %s", name, address, birthday);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }

}
