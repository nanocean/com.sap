package com.sap;

public class WhileTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int a = 2, b = 2;

    while (a < 10) {
      
      while (b < 10) {
        System.out.print(b + " * " + a + " = " + (a*b) + "\t");
        b++;
      }
      
      a++;
      b = 2;
      System.out.println("");
    }
    
  }

}
