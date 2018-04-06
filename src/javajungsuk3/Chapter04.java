package javajungsuk3;

import java.util.Scanner;

public class Chapter04 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
//    1.
//  if (x > 10 && x < 20)
//    if (ch != ' ' && ch != '  ')
//    if (ch == 'x' || ch == 'X')
//    if (ch >= '0' && ch <= '9')
//    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
//    if ((year % 400 == 0) || (year % 4 ==0 && year % 100 != 0))
//    if (!powerOn)
//    if (str == "yes")
//    String str = "asdf";
//    if (str.equals("asdf"))
//      System.out.println("adsfasdfasdf");
    
//    2.
//    int sum = 0;
//    for (int i = 1; i <= 20; i++)
//    {
//      if (i % 2 != 0 && i % 3 != 0)
//        sum += i;
//    }
//    
//    System.out.println(sum);
////    73
//    
    
//    3.
//    int sum = 0;
//    for (int i = 1; i <= 10; i++)
//    {
//      int tsum = 0;
//      for (int j = 1; j <= i; j++) {
//        tsum += j;
//      }
//      
//      sum += tsum;
//    }
//    System.out.println(sum);
////    220
    
//    4.
//    int i = 1, sum = 0;
//    while (true) {
//      
//      sum += i * ((i % 2 == 0) ? -1: 1);
//
//      if (sum >= 100) {
//        System.out.println("i가 " + i + " 일 때, 합이 100 이상(sum=" + sum + ")");
//        break;
//      }
//
//      i++;
//    }
////    i가 199 일 때, 합이 100 이상(sum=100)
    
    
    // 5.
//    int i = 0;
//    
//    while (i <= 10) {
//      
//      int j = 0;
//      while (j <= i) {
//        System.out.print("*");
//        j++;
//      }
//
//      System.out.println();
//      i++;
//    }
    
//    6.
//    for (int i = 1; i <= 6; i++) {
//      for (int j = 1; j <= 6; j++) {
//        
//        if (i + j == 6)
//          System.out.println(i + " + " + j + " 합이 6");
//        
//      } 
//    }
//    
////    1 + 5 합이 6
////    2 + 4 합이 6
////    3 + 3 합이 6
////    4 + 2 합이 6
////    5 + 1 합이 6
    
//    7.
//    int value = (int)(Math.random() * 6) + 1;
    
//    8.
//    for (int x = 0; x <= 10; x++)
//    {
//      for (int y = 0; y <= 10; y++)
//      {
//        if (2 * x + 4 * y == 10)
//        {
//          System.out.println("x=" + x + ", y=" + y);
//          
//        }
//        
//      }
//      
//    }
    
//    9.
//    String str = "12345";
//    int sum = 0;
//    for (int i = 0; i < str.length(); i++) {
//      
//      int tnum = Character.getNumericValue(str.charAt(i));
    ////참고: sum += str.charAt(i) - '0';
//      sum += tnum;
//    }
//    System.out.println("sum=" + sum);
//    
    
//    10.
//    int num = 12345;
//    int sum = 0;
//
//    while (num > 0) {
//      
//      sum += (num % 10);
//      num = num / 10;
//
//    }
//    
//    System.out.println("sum=" + sum);

    // 11.
//    // Fibonnaci 1, 1 .
//    int num1 = 1;
//    int num2 = 1;
//    int num3 = 0; // 세번째 값
//    
//    System.out.print(num1 + ", " + num2);
//    
//    for (int i = 0; i < 8; i++) {
//      
//      num3 = num1 + num2;
//      
//      System.out.print(", " + num3);
//      
//      num1 = num2;
//      num2 = num3;
//    }
    
//    12.
//    for (int k = 1; k <= 3; k++) {
//      
//      int num = 3 * k -1;
//      int lnum = num + 2;
//
//      for (int i = 1; i <= 3; i++) {
//        
//        for (int j = num; j <= lnum && j <= 9; j++) {
//          
//          System.out.print(j + " * " + i + " = " + (j*i) + "\t");
//        }
//
//        System.out.println("");
//      }
//
//      System.out.println("");
//    }
    
    
    
    // 13.
//    String value = "12o34";
//    char ch = ' ';
//    boolean isNumber = true;
//    
//    // 반복문과 charAt(int i)를 이용해서 문자열의 문자를
//    // 하나씩 읽어서 검사한다 .
//    for (int i = 0; i < value.length(); i++) {
//      
//      char tc = value.charAt(i);
//      isNumber = (tc >= '0' && tc <= '9');
//      
//      if (!isNumber)
//        break;
//    }
//    
//    if (isNumber) {
//      System.out.println(value + " 는 숫자입니다.");
//    } else {
//      System.out.println(value + " 는 숫자가 아닙니다.");
//    }
    
//    14.
//    int answer = (int)(Math.random() * 100) + 1; // 작성
//    int input = 0;
//    int count = 0;
//    int time = 0;
//    
//    Scanner s = new java.util.Scanner(System.in);
//    
//    do {
//      count++;
//      System.out.print(++time + "번시도 - 1과 100사이의 값을 입력하세요: ");
//      input = s.nextInt();
//      
//      // 작성
//      if (input == 9999) {
//        System.out.println("answer: " + answer);
//        break;
//      } else if (input > answer) {
//        System.out.println("더 작은 값입니다.");
//      } else if (input < answer) {
//        System.out.println("더 큰 값입니다.");
//      } else if (input == answer) {
//        System.out.println("정답입니다.");
//        break;
//      } else {
//
//      }
//      
//    } while (true);
    
    // 15.
//    int number = 12321;
//    int tmp = number;
//    int result = 0; // number 변수 를 거꾸로 변환해서 담을 변수
//    
//    while (tmp != 0) {
//      
//      result = result * 10 + (tmp % 10);
//      tmp = tmp / 10;
//    }
//    
//    if (number == result)
//      System.out.println(number + " 는 회문수 입니다.");
//    else
//      System.out.println(number + " 는 회문수가 아닙니다.");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

  }

}
