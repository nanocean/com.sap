package javajungsuk3;

import java.util.Scanner;

public class Chapter05 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
//    1.
//    a: �ٽ��� �ι� ��
//    b: �׹��� �ε��� �� ����
//    e: ������ ������ ����
//    f: �ٽ��� ���� ��� ���� �ʳ�?
//    int[] arr = {1,2,3,}; // OK
//    int[] arr[] = new int[3][]; // OK
//    int[] arr = new int[5] {1,2,3,4,5}; // error
//    int[] arr = new int[] {1,2,3,4,5};
//    System.out.println(arr.length);
    
//    2.
//    2
    
//    3.
//    int[] arr = {10, 20, 30, 40, 50};
//    int sum = 0;
//    
//    for (int i = 0; i < arr.length; i++) {
//      sum += arr[i];
//    }
//    
//    System.out.println("sum="+sum);
////    sum=150
    
//    4.
//    int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
//    int total = 0;
//    float average = 0;
//
//    int count = 0;
//    
//    for (int i = 0; i < arr.length; i++) {
//      for (int j = 0; j < arr[i].length; j++) {
//        total += arr[i][j];
//        count++;
//      }
//    }
//    
//    average = total / (float)count;
//    
//    System.out.println("total=" + total);
//    System.out.println("average=" + average);
//    
////    total=325
////    average=16.25
    
    // 5.
//    int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//    int[] ball3 = new int[3];
//    
//    // ballArr �迭 �� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
//    for (int i = 0; i < ballArr.length; i++) {
//      int j = (int) (Math.random() * ballArr.length);
//      int tmp = 0;
//      
//      tmp = ballArr[j];
//      ballArr[j] = ballArr[0]; // �׻� i=0�� �� �ٲ�
//      ballArr[0] = tmp;
//    }
//    
//    // ballArr �迭 �� �տ��� 3���� ���� ball3�迭 �� �����Ѵ�.
////    for (int i = 0; i < ball3.length; i++) {
////      ball3[i] = ballArr[i];
////    }
//    
//    System.arraycopy(ballArr, 0, ball3, 0, 3);
//    
//    
//    for (int i = 0; i < ball3.length; i++) {
//      System.out.print(ball3[i]);
//    }
    
//    6.
 // .
//    int[] coinUnit = { 500, 100, 50, 10 };
//    int money = 2680;
//    System.out.println("money=" + money);
//    for (int i = 0; i < coinUnit.length; i++) {
//
//      System.out.println(coinUnit[i] + "��: " + (money / coinUnit[i]));
//      money %= coinUnit[i];
//    }
    
    // 7.
//    Scanner sc;
//
//    do {
//      sc = new Scanner(System.in);
//      System.out.println("���� �ݾ��� �Է����ּ���. : ");
//    } while (!sc.hasNextInt());
//
//    int money = sc.nextInt();
//    System.out.println("money=" + money);
//    int[] coinUnit = { 500, 100, 50, 10 }; // ������ ����
//    int[] coin = { 5, 5, 5, 5 }; // ������ ������ ����
//    
//    for (int i = 0; i < coinUnit.length; i++) {
//      int coinNum = 0;
//      /*
//       * (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.  
//       * 1. �ݾ�(money)�� ���������� ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�. 
//       * 2. �迭 coin���� coinNum��ŭ�� ������ ����. (���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.) 
//       * 3. �ݾ׿��� ������ ���� (coinNum)�� ���������� ���� ���� ���� .
//       */
//      
//      coinNum = money / coinUnit[i];
//      
//      coinNum = (coinNum <= coin[i]) ? coinNum : coin[i];
//      coin[i] -= coinNum;
//      
//      money -= coinNum * coinUnit[i];
//      
//      System.out.println(coinUnit[i] + "�� : " + coinNum);
//    }
//    
//    if (money > 0) {
//      System.out.println("�Ž������� �����մϴ�.");
//      System.exit(0); // ���α׷��� �����Ѵ�.
//    }
//    
//    System.out.println("=���� ������ ���� =");
//    
//    for (int i = 0; i < coinUnit.length; i++) {
//      System.out.println(coinUnit[i] + "�� :" + coin[i]);
//    }
    
    // 8.
//    int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
//    int[] counter = new int[4];
//    
//    for (int i = 0; i < answer.length; i++) {
//      counter[answer[i] - 1]++;
//    }
//    
//    for (int i = 0; i < counter.length; i++) {
//      
//      System.out.print(counter[i]);
//      
//      for (int j = 0; j < counter[i]; j++) {
//        System.out.print("*");
//      }
//      
//      System.out.println();
//    }
    
//    9.
//    char[][] star = {
//        {'*','*',' ',' ',' '},
//        {'*','*',' ',' ',' '},
//        {'*','*','*','*','*'},
//        {'*','*','*','*','*'}
//        };
//
//    char[][] result = new char[star[0].length][star.length];
//
//    for (int i = 0; i < star.length; i++) {
//      for (int j = 0; j < star[i].length; j++) {
//        System.out.print(star[i][j]);
//      }
//      System.out.println();
//    }
//
//    System.out.println();
//
//    for (int i = 0; i < star.length; i++) {
//      for (int j = 0; j < star[i].length; j++) {
//
//        if (star[i][j] == '*')
////          result[j][3-i] = '*';
//          result[j][star.length -1 -i] = '*'; // Ǯ�� Ȯ�� �� ���� - ������� �ڵ尡 �� ��Ȯ
//      }
//    }
//
//    for (int i = 0; i < result.length; i++) {
//      for (int j = 0; j < result[i].length; j++) {
//        System.out.print(result[i][j]);
//      }
//      System.out.println();
//    }
    
    
    // 10.
//    char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[', ']',
//        '{', '}', ';', ':', ',', '.', '/' };
//    
//    // 0 1 2 3 4 5 6 7 8 9
//    char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
//    
//    Scanner sc;
//
//    do {
//      sc = new Scanner(System.in);
//      System.out.println("���ڿ��� �Է����ּ���. : ");
//    } while (!sc.hasNext());
//
//    String src = sc.next();
//    String result = "";
//    
//    // ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
//    for (int i = 0; i < src.length(); i++) {
//      char ch = src.charAt(i);
//      
//      if (ch >= 'a' && ch <= 'z')
//      {
//        result += abcCode[ch - 'a'];
//      }
//      else if (ch >= '0' && ch <= '9')
//      {
//        result += numCode[ch - '0'];
//      }
//    }
//    
//    System.out.println("src:" + src);
//    System.out.println("result:" + result);
//    
////    src:abc123
////    result:`~!wer

    
//    11.
////    �ٽ� Ǯ��
//    int[][] score = {
//        {100, 100, 100}
//        , {20, 20, 20}
//        , {30, 30, 30}
//        , {40, 40, 40}
//        , {50, 50, 50}
//        };
//    
//    int[][] result = new int[score.length + 1][score[0].length + 1];
//    
//    for (int i = 0; i < score.length; i++) {
//      for (int j = 0; j < score[i].length; j++) {
//
//        result[i][j] = score[i][j];
//        result[i][score[i].length] += score[i][j];
//        result[score.length][j] += score[i][j];
//        result[score.length][score[i].length] += score[i][j];
//        
////        if (j == score[i].length - 1)
////        {
////          for (int k = 0; k < score[i].length; k++)
////          {
////            result[i][j + 1] += score[i][j];
////          }
////        }
////        
////        if (i == score.length - 1)
////        {
////          for (int k = 0; k < score.length; k++)
////          {
////            result[i + 1][j] += score[k][j];
////          }
////        }
////
////        if (i == score.length - 1 && j == score[i].length - 1)
////        {
////          for (int k = 0; k < score.length; k++)
////          {
////            for (int l = 0; l < score[i].length; l++)
////            {
////              result[i + 1][j + 1] += score[k][l];
////            }
////          }
////        }
//      }
//    }
//    
//    for (int i = 0; i < result.length; i++) {
//      for (int j = 0; j < result[i].length; j++) {
//        System.out.printf("%4d", result[i][j]);
//      }
//      System.out.println();
//    }
//    
    
    // 13.
//    String[] words = { "television", "computer", "mouse", "phone" };
//    Scanner scanner = new Scanner(System.in);
//    
//    for (int i = 0; i < words.length; i++) {
//      char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
//      
//      /*
//       * (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. 
//       * char�迭 question�� ��� ������ ��ġ�� ���Ƿ� �ٲ۴�. 
//       */
//      
//      for (int j = 0; j < question.length; j++) {
//        
//        int r = (int)(Math.random() * question.length);
//        
//        char tch = question[0];
//        question[0] = question[r];
//        question[r] = tch;
//      }
//      
//      System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i + 1, new String(question));
//      String answer = scanner.nextLine();
//      
//      // trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
//      if (words[i].equals(answer.trim()))
//        System.out.printf("�¾ҽ��ϴ�.%n%n");
//      else
//        System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
//    }
    
    
    
    
    
    
    
    
    
    
  }

}
