package javajungsuk3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter08 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    1.
//    정의: 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
//    목적: 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
    
//    2.
//    d
    
//    3.
//    b,c
//    더 하위 오류 클래스를 던질 수 없음
//    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    d,e
//    조상 클래스의 메서드보다 많은 수의 예외를 던질 수 없다.
//    (상위 클래스의 메서드에서 예외를 던질 때, 오버라이딩한 메서드는 해당 예외의 상위클래스를 던질 수 없음 - 만약 된다면 무조건 Exception 던질 것)
//    ref) 리스코프 치환 원칙
    
//  4.
//    c, 
    
//    5.
//    1
//    3
//    5
//    
//    1
//    2
//    5
//    6

//    6.
//    3
//    4
//    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    3 - 5
    
//    7.
//    1
//    
//    1
//    2
//    5
//    6
//    XXXXXXXXXXXXX
    
//    1
//     System.exit(0); => 프로그램 종료됨
    
//    8.
//    int input = 0;
//    int count = 0;
//    
//    do {
//      try {
//        input = new Scanner(System.in).nextInt();
//      }
//      catch (InputMismatchException e) {
//        count--;
//        System.out.println("유효하지 않은 값 다시 입력");
//        continue;
//      }
//    }
//    while (true)
    
//    9.
//    throw new UnsupportedFuctionException("adsfasdfasdf.",100);
    
//    10.
//    2
//    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    2 - 4 - 7
    
    
    
  }

}

class UnsupportedFuctionException extends RuntimeException {
  final private int ERR_CODE;
  
  public UnsupportedFuctionException(String message) {
    this(message, 100);
  }
  
  public UnsupportedFuctionException(String message, int errCode) {
    super(message);
    this.ERR_CODE = errCode;
  }
  
  public int getErrorCode() {
    return ERR_CODE;
  }
  
  public String getMessage() {
    return "[" + ERR_CODE + "]" +super.getMessage();
  }
}

class Parent11 {
  int a;
  int b;

  Parent11() {
    this(0, 0);
  }

  Parent11(int a, int b) {
    this.a = a;
    this.b = b;
  }

//  void add(int a, int b) throws InvalidNumberException, NotANumberException {
//  }
  
  void add(int a, int b) throws NumberException {
  }
}

class Child11 extends Parent11 {
  Child11() {
  }

  Child11(int a, int b) {
    super(a, b);
  }

//  오류
//  void add(int a, int b) throws Exception {
//  }
  
  void add(int a, int b) throws InvalidNumberException, NotANumberException {
  }
}

class NumberException extends Exception {}
class InvalidNumberException extends NumberException {}
class NotANumberException extends NumberException {}
