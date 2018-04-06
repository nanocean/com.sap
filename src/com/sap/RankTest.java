package com.sap;

import java.util.Scanner;

public class RankTest {

  public static void main(String[] args) {

    Scanner sc;

    do {
      sc = new Scanner(System.in);
      System.out.println("학생수는 몇명? ");
    } while (!sc.hasNextInt());

    int mcount = sc.nextInt();

    do {
      sc = new Scanner(System.in);
      System.out.println("과목수는 몇개? ");
    } while (!sc.hasNextInt());

    int scount = sc.nextInt();

    String[] name = new String[mcount];
    int[][] score = new int[mcount][scount];

    for (int i = 0; i < name.length; i++) {
      do {
        sc = new Scanner(System.in);
        System.out.println((i + 1) + "번 학생이름은? ");
      } while (!sc.hasNext());

      name[i] = sc.next();

      for (int j = 0; j < score[i].length; j++) {
        do {
          sc = new Scanner(System.in);
          System.out.println((i + 1) + "번 학생의 " + (j + 1) + "번 과목 점수는? ");
        } while (!sc.hasNextInt());

        score[i][j] = sc.nextInt();
      }
    }

    int[] total = new int[5];
    float[] ave = new float[5];
    int[] rank = { 1, 1, 1, 1, 1 };

    for (int i = 0; i < score.length; i++) {

      for (int tscore : score[i]) {
        total[i] += tscore;
      }

      ave[i] = (int) (total[i] / (float) score[i].length * 100) / 100F;

    }

    for (int i = 0; i < rank.length; i++) {

      for (int j = 0; j < total.length; j++) {

        if (i != j) {
          if (total[i] < total[j]) {
            rank[i]++;

          }
        }
      }
    }

    System.out.println("");
    System.out.println("<학생 성적표>");
    
    for (int i = 0; i < score.length; i++) {

      System.out.print((i + 1) + "번 학생 " + name[i] + "의 점수는 ");

      for (int j = 0; j < score[i].length; j++) {
        System.out.print(((j == 0) ? "" : ",") + score[i][j]);
      }

      System.out.printf(" 총점은 %d 평균은 %5.2f 순위는 %d", total[i], ave[i], rank[i]);
      System.out.println("");
    }
    
  }

}
