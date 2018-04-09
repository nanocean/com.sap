package com.sap;

import java.util.Arrays;

public class Bubblesort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int[] data = new int[] {1,2,3,4,5,6,7,8,9,0};

    for (int i = 0; i < data.length; i++) {
      int r = (int)(Math.random() * 10);
      
      int tmp = data[r];
      data[r] = data[0];
      data[0] = tmp;
    }
    
    for (int d : data)
      System.out.print(d + " ");
    
    System.out.println("");
    
//    for (int i = 0; i < data.length - 1; i++) {
//      for (int j = 0; j < data.length - 1 - i; j++) {
//        
//        if (data[j] > data[j + 1])
//        {
//          int tmp = data[j];
//          data[j] = data[j+1];
//          data[j+1] = tmp;
//        }
//      }
//    }
    
    Arrays.sort(data);
    
    for (int d : data)
      System.out.print(d + " ");
    

  }

}
