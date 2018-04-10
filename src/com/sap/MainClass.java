package com.sap;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    SubClass01 sb1 = new SubClass01();
    sb1.PrintSeries();

    int[] data = { 10, 20, 30, 40, 50 };
    SubClass02 sb2 = new SubClass02();
    sb2.PrintSeries(data);
  }

}
