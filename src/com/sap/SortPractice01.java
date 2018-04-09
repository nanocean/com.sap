package com.sap;

public class SortPractice01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // Bubble Sort
    // initializing
    int[] data = new int[] {0,1,2,3,4,5,6,7,8,9};

    // shuffle
    for (int i = 0; i < data.length; i++) {
      int r = (int)(Math.random() * 10);
      
      int tmp = data[r];
      data[r] = data[0];
      data[0] = tmp;
    }
    
    for (int d : data)
      System.out.print(d + " ");
    
    System.out.println("");
    
    // sorting
    for (int i = 0; i < data.length - 1; i++) {
      for (int j = 0; j < data.length - 1 - i; j++) {
        
        if (data[j] > data[j + 1])
        {
          int tmp = data[j];
          data[j] = data[j+1];
          data[j+1] = tmp;
        }
      }
    }
    
    for (int d : data)
      System.out.print(d + " ");
    
    
    

    // Insertion Sort
//    // initializing
//    int[] data = new int[] {0,1,2,3,4,5,6,7,8,9};
//
//    // shuffle
//    for (int i = 0; i < data.length; i++) {
//      int r = (int)(Math.random() * 10);
//      
//      int tmp = data[r];
//      data[r] = data[0];
//      data[0] = tmp;
//    }
//    
//    for (int d : data)
//      System.out.print(d + " ");
//    
//    System.out.println("");
//    
//    // sorting
//    int[] resultArray = new int[data.length];
//    
//    for (int i = 0; i < data.length; i++) {
//
//      if (i == 0)
//        resultArray[i] = data[i];
//      else
//      {
//        
//        
//      }
//    }
//    
//    for (int d : data)
//      System.out.print(d + " ");
    
    
    
  }

}
