package com.sap;

import java.util.Scanner;

public class MainArgs {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
//    String[] data = args;
//    
//    for (String d : data)
//      System.out.println(d);
//    
    
    Scanner sc = new Scanner(System.in);

    while(!sc.hasNextInt()) {

      sc = new Scanner(System.in);
    }

    System.out.println(sc.nextInt()*1000);
    sc.close();
    
  }

}
