package com.sap;

public class SubClass01 {
 
  public static void PrintSeries() {

    int[] data = { 10, 20, 30, 40, 50 };
    int total = 0;

    for(int d:data)
    {
      total = total + d;
    }

    System.out.println(total);
  }
}
