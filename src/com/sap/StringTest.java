package com.sap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StringTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[][] array = new String[5][4];
    int[][] jum = new int[5][3];
    
//    int[] jum = new int[3];
    int total = 0;
    
    for (int i = 0; i < array.length; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.println("이름,국어,영어,수학 순서로 입력하세요.");

      array[i] = sc.nextLine().split(",");
    }
    
    for (int i = 0; i < jum.length; i++) {
      for (int j = 0; j < jum[i].length; j++) {
        jum[i][j] = Integer.parseInt(array[i][j + 1]);
      }
    }
    
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i][0] + "의 점수는 " +  Arrays.toString(array[i])
      + ", 총점은 " + IntStream.of(jum[i]).sum() + ", 평균은" + IntStream.of(jum[i]).sum() / 3D);
    }
  }

}
