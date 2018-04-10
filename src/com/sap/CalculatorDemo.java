package com.sap;

public class CalculatorDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Calculator c1 = new Calculator(10,20);

    c1.sum();
    c1.avg();
    
//    c1.setOprands(10, 20);
//
//    c1.sum();
//    c1.avg();
//
//    Calculator c2 = new Calculator();
//
//    c2.setOprands(20, 40);
//
//    c2.sum();
//    c2.avg();
    
    Calculator3.sum(10, 20);
    Calculator3.avg(10, 30);
    
    Calculator3.sum(20, 40);
    Calculator3.avg(20, 40);
  }

}

class Calculator {

  static double PI = 3.14;
  int left, right;
  
  public Calculator (int left, int right) {
    this.left = left;
    this.right = right;
  }

  public void setOprands(int left, int right) {

    this.left = left;

    this.right = right;

  }

  public void sum() {

    System.out.println(this.left + this.right);

  }

  public void avg() {

    System.out.println((this.left + this.right) / 2);

  }

}

class Calculator3 {
  public static void sum(int left, int right) {
    System.out.println(left + right);
  }

  public static void avg(int left, int right) {
    System.out.println((left + right) / 2);
  }
}


