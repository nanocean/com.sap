package com.sap.network;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScannerTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] asdf = {"a", "b", "c"};
    
    System.out.println(Arrays.toString(asdf));
    
    List<String> qwer = Arrays.asList(asdf);
    
    System.out.println(qwer);
    
    String[] asdf22 = (String[])qwer.toArray();
    
    System.out.println(Arrays.toString(asdf22));
  }

}
