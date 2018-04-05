package com.sap;

import java.util.Scanner;

public class SwitchCaseTest {

  static int asdf;
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Scanner sc = new Scanner(System.in);
    String name;
    int score;

    
    System.out.println("이름을 입력하세요: ");
    
    sc = new Scanner(System.in);
    name = sc.next();
    
    if (name == "")
    {
      System.out.println("잘못된 값입니다.");
      return;
    }

    System.out.println("점수를 입력하세요: ");

    if (!sc.hasNextInt())
    {
      System.out.println("잘못된 값입니다.");
      return;
    }
    
    score = sc.nextInt();
    
    if (score > 100 || score < 0)
    {
      System.out.println("잘못된 값입니다.");
      return;
    }
    
    int result;
    result = score / 10;
    String grade;
    
    switch (result) {
    case 9:
      grade = "A+";
      break;
    case 8:
      grade = "B+";
      break;
    case 7:
      grade = "C+";
      break;
    case 6:
      grade = "D+";
      break;
    case 5:
      grade = "E+";
      break;
    default:
      grade = "F+";
      break;
    }
    
    System.out.println("이름\t점수\t학점");
    System.out.printf("%s\t%d\t%s", name, score, grade);

    
    
  }

}
