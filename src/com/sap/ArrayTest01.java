package com.sap;

public class ArrayTest01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    String[] name = {"aaa","bbb","ccc","ddd","eee"};
    int[][] score = {{89,56,56},{45,23,56},{71,45,56},{58,36,56},{47,69,56}};
    int[] total = new int[5];
    float[] ave = new float[5];
    int[] rank = {1,1,1,1,1};
    
    for (int i = 0; i < score.length; i++) {
      
      for (int tscore : score[i]) {
        total[i] += tscore;
      }
      
      
      ave[i] = (int)(total[i] / (float)score[i].length);
      
    }
    
    for (int i = 0; i < rank.length; i++) {
      
      for (int j = 0; j < total.length; j++) {
        
        if (i != j)
        {
          if (total[i] < total[j])
          {
            rank[i]++; 
            
          }
        }
      }
    }
    
    for (int i = 0; i < score.length; i++) {
      
      System.out.print(name[i] + "의 점수는 ");
      
      for (int j = 0; j < score[i].length; j++) {
        System.out.print(((j==0) ? "" : ",") + score[i][j]);
      }

      System.out.printf(" 총점은 %d 평균은 %5.2f 순위는 %d", total[i], ave[i], rank[i]);
      System.out.println("");
    }
    
    
//    int[] num = new int[10];
//
//    for (int i = 0; i < num.length; i++) {
//      num[i] = i + 1;
//    }
//
//    int sum = 0;
//    for (int i = 0; i < num.length; i++) {
//      sum += num[i];
//    }
//
//    System.out.println(sum);
  }

}
