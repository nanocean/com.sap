package javajungsuk3;

import java.util.Arrays;

public class Chapter06 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    1. 2.
//    SutdaCard card1 = new SutdaCard(3, false);
//    SutdaCard card2 = new SutdaCard();
//    
//    System.out.println(card1.info());
//    System.out.println(card2.info());
    
//    3. 4. 
//    Student s = new Student();
//    s.name = "ȫ�浿";
//    s.ban = 1;
//    s.no = 1;
//    s.kor = 100;
//    s.eng = 60;
//    s.math = 76;
//    System.out.println("�̸�  :"+s.name);
//    System.out.println("����  :"+s.getTotal());
//    System.out.println("���  :"+s.getAverage());
    
//    5.
//    Student s = new Student("ȫ�浿",1,1,100,60,76);
//    System.out.println(s.info());
    
//    6.
//    System.out.println(getDistance(1,1,2,2));
    
//    7. 
//    MyPoint p = new MyPoint(1,1);
//    // p�� (2,2) �� �Ÿ��� ���Ѵ�.
//    System.out.println(p.getDistance(2,2));
    
//    8.
//    - Ŭ��������: width, height
//    - �ν��Ͻ�����: kind, num 
//    - ��������: k, n, card, args
    
//    9. 
//    static int weapon = 6;
//    static int armor = 0;
//    => ��� �ν��Ͻ��� ���� ��
//    + weaponUp(), armorUp() 
//    => Ŭ�������� ó���ϹǷ�
    
//    10.
//    e
//    b => new operator - create objects, constructor - initializing
    
//    11.
//    b
    
//    12.
//    c, d
    
//    13.
//    b XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    b,c,d
//    �����ε� ���� => �Լ��� ����, �Ķ���� �ٸ���.
    
//    14.
//    c, e
    
//    15. 
//    a
    
//    16.
//    a
//    e => ���������� ȣ�⽺�� �� ����, ����� ���̳� �޼��尡 ����Ǹ� �Ҹ�
    
//    17.
//    b, f XXXXXXXXXX
//    b
//    �������� �޼���� �ϳ�, �������� ��� ����
    
//    18.
//    A: Ŭ���� �������� �ν��Ͻ� ������ ������
//    B: Ŭ���� �޼��忡�� �ν��Ͻ� ������ ������
//    D: Ŭ���� �޼��忡�� �ν��Ͻ� �޼��带 ȣ����
    
//    19.
//    ABC123
//    After change:ABC123
    
//    20.
//    int[] original = {1,2,3,4,5,6,7,8,9};
//    System.out.println(Arrays.toString(original));
//    int[] result = shuffle(original);
//    System.out.println(Arrays.toString(result));
    
    // 21.
//    MyTv t = new MyTv();
//    t.channel = 100;
//    t.volume = 0;
//    System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//    t.channelDown();
//    t.volumeDown();
//    System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//    t.volume = 100;
//    t.channelUp();
//    t.volumeUp();
//    System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
    
//    22.
//    String str = "123";
//    System.out.println(str+" �� �����Դϱ� ? "+isNumber(str));
//    str = "1234o";
//    System.out.println(str+" �� �����Դϱ� ? "+isNumber(str));
    
//    23.
//    int[] data = {3,2,9,4,7};
//    System.out.println(java.util.Arrays.toString(data));
//    System.out.println("�ִ밪:" + max(data));
//    System.out.println("�ִ밪:" + max(null));
//    System.out.println("�ִ밪:" + max(new int[]{}));
    
//    24.
//    int value = 5;
//    System.out.println(value+" �� ���밪 :"+abs(value));
//    value = -10;
//    System.out.println(value+" �� ���밪 :"+abs(value));
    
  }
  
  public static int abs(int value) {
    
    if (value >= 0)
      return value;
    else
//      return (-1) * value;
      return -value;
    
  }
  
  public static long abs(long value) {
    
    return 1L;
    
  }
  
  public static int max(int[] arr) {
    if (arr == null || arr.length == 0)
      return -999999;
    
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i+1])
      {
        int tmp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = tmp;
        
      }
    }
    
    return arr[arr.length - 1];
  }
  
  public static boolean isNumber(String str) {
//    boolean rbool = true;
//    
//    if (str == null || str == "")
//      rbool = false;
//    else
//    {
//      for (int i = 0; i < str.length(); i++) {
//        if (str.charAt(i) > '9' || str.charAt(i) < '0')
//        {
//          rbool = false;
//          break;
//        }
//      }
//      
//    }
//    
//    return rbool;
    
    if (str == null || str == "")
      return false;
    else
    {
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) > '9' || str.charAt(i) < '0')
          return false;
      }
      
    }
    
    return true;
  }
  
  public static int[] shuffle (int[] para) {
    // ��ȿ�� üũ �ʿ�
    if (para == null || para.length == 0)
      return para; 
    
    for (int i = 0; i < para.length; i++) {
      int r = (int)(Math.random() * para.length);
      
      int tmp = para[r];
      para[r] = para[0];
      para[0] = tmp;
    }
    
    return para;
  }

  public static double getDistance(int x1, int y1, int x2, int y2) {
    // TODO Auto-generated method stub
    return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
  }

}

class MyTv {
  boolean isPowerOn;
  int channel;
  int volume;
  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  void turnOnOff() {
    isPowerOn = !isPowerOn;
  }

  void volumeUp() {
    if (volume < MAX_VOLUME)
      volume++;
  }

  void volumeDown() {
    if (volume > MIN_VOLUME)
      volume--;
  }

  void channelUp() {
    if (channel == MAX_CHANNEL)
      channel = MIN_CHANNEL;
    else
      channel++;
      // ä�� �����÷ο�? ���� �ʿ�
  }

  void channelDown() {
    if (channel == MIN_CHANNEL)
      channel = MAX_CHANNEL;
    else
      channel--;
  }
} // class MyTv

class MyPoint {
  int x;
  int y;
  
  public MyPoint(int x, int y) {
//    super();
    this.x = x;
    this.y = y;
  }

  public double getDistance(int x1, int y1) {
    // TODO Auto-generated method stub
    return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
  }
}

//3.
class Student {
String name;
int ban;
int no;
int kor;
int eng;
int math;

public Student(String name, int ban, int no, int kor, int eng, int math) {
 super();
 this.name = name;
 this.ban = ban;
 this.no = no;
 this.kor = kor;
 this.eng = eng;
 this.math = math;
}

public String info() {
 return name + "," + ban + "," + no + "," 
+ kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
}

public int getTotal() {
 return kor + eng + math;
}

public float getAverage() {
 return Math.round(getTotal() / (float)3 * 10) / 10F;
}

}

class SutdaCard {
  int num;
  boolean isKwang;
  
  public SutdaCard() {
//    num = 1;
//    isKwang = true;
    
    this(1, true);
  }
  
  public SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }
  
  public String info() {
    return num + (isKwang ? "K" : "");
  }
}