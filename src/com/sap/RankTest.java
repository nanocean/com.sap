package com.sap;

import java.util.Scanner;

public class RankTest {

  public static void main(String[] args) {

    Scanner sc;

    do {
      sc = new Scanner(System.in);
      System.out.println("�л����� ���? ");
    } while (!sc.hasNextInt());

    int mcount = sc.nextInt();

    do {
      sc = new Scanner(System.in);
      System.out.println("������� �? ");
    } while (!sc.hasNextInt());

    int scount = sc.nextInt();

    String[] name = new String[mcount];
    int[][] score = new int[mcount][scount];

    for (int i = 0; i < name.length; i++) {
      do {
        sc = new Scanner(System.in);
        System.out.println((i + 1) + "�� �л��̸���? ");
      } while (!sc.hasNext());

      name[i] = sc.next();

      for (int j = 0; j < score[i].length; j++) {
        do {
          sc = new Scanner(System.in);
          System.out.println((i + 1) + "�� �л��� " + (j + 1) + "�� ���� ������? ");
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
    System.out.println("<�л� ����ǥ>");
    
    for (int i = 0; i < score.length; i++) {

      System.out.print((i + 1) + "�� �л� " + name[i] + "�� ������ ");

      for (int j = 0; j < score[i].length; j++) {
        System.out.print(((j == 0) ? "" : ",") + score[i][j]);
      }

      System.out.printf(" ������ %d ����� %5.2f ������ %d", total[i], ave[i], rank[i]);
      System.out.println("");
    }
    
  }

}
