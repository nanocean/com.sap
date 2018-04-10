package com.sap;

public class SubClass02 {

  public static void PrintSeries(int[] paraArray) {

    int total = 0;

    for(int d:paraArray)
    {
      total = total + d;
    }

    System.out.println(total);
  }
}
