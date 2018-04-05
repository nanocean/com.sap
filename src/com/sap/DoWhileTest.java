package com.sap;

public class DoWhileTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int i = 1;
    int count = 9;
    
    do {
      System.out.printf("5*%d=%d%n", i, 5*i);
      i++;
      count--;
    } while (count > 0);

  }

}
