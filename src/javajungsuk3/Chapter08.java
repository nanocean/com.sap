package javajungsuk3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter08 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    1.
//    ����: ���α׷� ���� �� �߻��� �� �ִ� ������ �߻��� ����� �ڵ带 �ۼ��ϴ� ��
//    ����: ���α׷��� ������ ���Ḧ ����, �������� ������¸� �����ϴ� ��
    
//    2.
//    d
    
//    3.
//    b,c
//    �� ���� ���� Ŭ������ ���� �� ����
//    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    d,e
//    ���� Ŭ������ �޼��庸�� ���� ���� ���ܸ� ���� �� ����.
//    (���� Ŭ������ �޼��忡�� ���ܸ� ���� ��, �������̵��� �޼���� �ش� ������ ����Ŭ������ ���� �� ���� - ���� �ȴٸ� ������ Exception ���� ��)
//    ref) �������� ġȯ ��Ģ
    
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
//     System.exit(0); => ���α׷� �����
    
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
//        System.out.println("��ȿ���� ���� �� �ٽ� �Է�");
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

//  ����
//  void add(int a, int b) throws Exception {
//  }
  
  void add(int a, int b) throws InvalidNumberException, NotANumberException {
  }
}

class NumberException extends Exception {}
class InvalidNumberException extends NumberException {}
class NotANumberException extends NumberException {}
