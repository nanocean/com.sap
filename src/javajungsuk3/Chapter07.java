package javajungsuk3;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.sap.test.Test0000003;

public class Chapter07 {

  public static void main(String[] args) {

//    1.
//    SutdaDeck deck = new SutdaDeck();
//    
//    for (int i = 0; i < deck.cards.length; i++)
//      System.out.print(deck.cards[i] + ",");
    
    // 2.
//    SutdaDeck deck = new SutdaDeck();
//    System.out.println(deck.pick(0));
//    System.out.println(deck.pick());
//    deck.shuffle();
//    for (int i = 0; i < deck.cards.length; i++)
//      System.out.print(deck.cards[i] + ",");
//    System.out.println();
//    System.out.println(deck.pick(0));
    
//    3.
//    def: ����Ŭ�������� ����Ŭ������ Ư�� �޼��带 ���ۼ��ϴ� ��
//    - �ڵ带 ��Ȱ���ϸ鼭 �ʿ信 ���� �����Ͽ� ����ϱ� ���� �ʿ�
    
//    4.
//    c, d
    
//    5.
//    Product Ŭ������ �⺻ �����ڰ� ���� ������, Tv Ŭ������ �⺻ �����ڿ��� ���� �߻�
    
//    6.
//    ���� Ŭ���������� ���� Ŭ������ ��� ����� ���� ������, 
//    ���� Ŭ���� ������ �ʱ�ȭ�� �ʿ��Ͽ� ���� Ŭ������ ������ ȣ���� �ʿ��ϴ�
//  
//    7.
//    Child() - Child(1000) - Parent() - Parent(200)
//    Child c = new Child();
//    System.out.println("x="+c.getX());
    
//    8.
//    a. public - protected - default - private
    
//    9.
//    a, c X
//    c
    
//    10.
//    MyTv2 t = new MyTv2();
//    t.setChannel(10);
//    System.out.println("CH:"+t.getChannel());
//    t.setVolume(20);
//    System.out.println("VOL:"+t.getVolume());
    
//    11.
//    MyTv2 t = new MyTv2();
//    t.setChannel(10);
//    System.out.println("CH:"+t.getChannel());
//    t.setChannel(20);
//    System.out.println("CH:"+t.getChannel());
//    t.gotoPrevChannel();
//    System.out.println("CH:"+t.getChannel());
//    t.gotoPrevChannel();
//    System.out.println("CH:"+t.getChannel());
    
//    12.
//    c, 
    
//    13.
//    Math Ŭ������ �ν��Ͻ��� ������ ���ϰ� ���� ����
//    ����: Math Ŭ������ ��� �Լ��� static. �׷��� �ν��Ͻ��� ���� �ʿ� ����
    
//    14.
//    �ҽ��ڵ� ����
    
//    15.
//    c, e, 
//    Unit u = new GroundUnit();
//    Tank t = new Tank();
//    AirCraft ac = new AirCraft();
//    
//    u = (Unit)ac;
//    u = ac;
//    GroundUnit gu = (GroundUnit)u; // error
//    AirUnit au = ac;
//    t = (Tank)u; // error
//    GroundUnit gu1 = t;

//    e�� �Ұ�
//    c�� ���� Ŭ������ ����ȯ ������, �ν��Ͻ� ������ �� ����Ŭ���� �ν��Ͻ� �����߾���
    
    
//    16.
//    e
    
//    17.
//    �ҽ��ڵ� ����
    
//    18.
//    Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
//    
//    for (int i = 0; i < arr.length; i++)
//      action(arr[i]);
    
//    19.
    Buyer b = new Buyer();
    b.buy(new Tv());
    b.buy(new Computer());
    b.buy(new Tv());
    b.buy(new Audio());
    b.buy(new Computer());
    b.buy(new Computer());
    b.buy(new Computer());
    b.summary();
    
//    20.
//    Parent1 p = new Child1();
//    Child1 c = new Child1();
//    System.out.println("p.x = " + p.x);
//    p.method();
//    System.out.println("c.x = " + c.x);
//    c.method();
//    100
//    Child Method
//    200
//    Child Method
    
//    21. 
//    Movable, Movable ��ӹ��� child class
    
//    22.
//    �ҽ��ڵ� ����
    
//    23.
//    Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
//    System.out.println("������ ��  :"+sumArea(arr));
    
//    24.
//    e
    
//    25.
//    Outer.Inner inner = (new Outer()).new Inner();
//    System.out.println(inner.iv);
    
//    26.
//    Outer2.Inner2 inner2 = new Outer2.Inner2();
//    System.out.println(inner2.iv);
    
//    27. 
//    (4)
//    Outer3.Inner3 inner = (new Outer3()).new Inner3();
//    inner.method1();
    
//    28.
//    Frame f = new Frame();
//    f.addWindowListener(new EventHandler() extends WindowAdapter {
//      public void windowClosing(WindowEvent e) {
//        e.getWindow().setVisible(false);
//        e.getWindow().dispose();
//        System.exit(0);
//      }
//    });

//    Frame f = new Frame();
//    f.addWindowListener(new WindowAdapter() {
//      public void windowClosing(WindowEvent e) {
//        e.getWindow().setVisible(false);
//        e.getWindow().dispose();
//        System.exit(0);
//      }
//    });
    
//    29.
//    ���������� �� ������ ������� ������, �׻� ���� ����� ���� �����ϴ�
    
    
//    DanceRobot dr = new DanceRobot();
//    System.out.println(dr instanceof DanceRobot);

//    Test0000003 afsd = new Test0000003();

  }
  
  static double sumArea(Shape[] arr) {
    
    double total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i].calcArea();
    }
    
    return total;
  }
  
  static void action(Robot r) {
    
    if (r instanceof DanceRobot)
      ((DanceRobot)r).dance();
    else if (r instanceof SingRobot)
      ((SingRobot)r).sing();
    else if (r instanceof DrawRobot)
      ((DrawRobot) r).draw();
  }

}

//class EventHandler extends WindowAdapter {
//  public void windowClosing(WindowEvent e) {
//    e.getWindow().setVisible(false);
//    e.getWindow().dispose();
//    System.exit(0);
//  }
//}

class Outer3 {
  int value = 10;

  class Inner3 {
    int value = 20;

    void method1() {
      int value = 30;
      System.out.println(value);
      System.out.println(this.value);
      System.out.println(Outer3.this.value);
    }
  } // InnerŬ������ ��
} // OuterŬ������ ��

class Outer2 {
  static class Inner2 {
    int iv = 200;
  }
}

class Outer {
  class Inner {
    int iv = 100;
  }
}

// 22. 
class Circle extends Shape {
  double r;
  
  public Circle() {
    // TODO Auto-generated constructor stub
    this(0);
  }
  
  public Circle(double r) {
    // TODO Auto-generated constructor stub
    this.r = r;
  }

  @Override
  double calcArea() {
    // TODO Auto-generated method stub
    return r * r * Math.PI;
  }
  
  
}

class Rectangle extends Shape {
  double width;
  double height;
  
  public Rectangle() {
    // TODO Auto-generated constructor stub
    this(0, 0);
  }
  
  public Rectangle(double width, double height) {
    // TODO Auto-generated constructor stub
    this.width = width;
    this.height = height;
  }
  
  @Override
  double calcArea() {
    // TODO Auto-generated method stub
    return width * height;
  }
  
  boolean isSquare() {
    return width == height;
  }
}

abstract class Shape {
  Point p;

  Shape() {
    this(new Point(0, 0));
  }

  Shape(Point p) {
    this.p = p;
  }

  abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

  Point getPosition() {
    return p;
  }

  void setPosition(Point p) {
    this.p = p;
  }
}

class Point {
  int x;
  int y;

  Point() {
    this(0, 0);
  }

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "[" + x + "," + y + "]";
  }
}

class Parent1 {
  int x = 100;

  void method() {
    System.out.println("Parent Method");
  }
}

class Child1 extends Parent1 {
  int x = 200;

  void method() {
    System.out.println("Child Method");
  }
}

class Buyer {
  int money = 1000;
  Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
  int i = 0; // Product�迭 cart�� ���� index

  void buy(Product p) {
    /*
     * (1) .�Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 
     * 1.1 ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ� . 
     * 1.2 �������� ����ϸ� ��ǰ�� ������ ���� ������ ���� , 
     * 1.3 ��ٱ��Ͽ� ������ ������ ��´� .(add�޼��� ȣ�� )
     */
//    String producttype = "";
//    
//    if (p instanceof Tv)
//      producttype = ((Tv)p).toString();
//    else if (p instanceof Computer)
//      producttype = ((Computer)p).toString();
//    else if (p instanceof Audio)
//      producttype = ((Audio)p).toString();
//    else 
//      producttype = "???";
    
    if (p.price > money)
    {
      System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� �� �� �����ϴ�.");
      return;
    }
    else
    {
      money -= p.price;
      add(p);
    }
  }

  void add(Product p) {
    /*
     * (2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� . 
     * 1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ�� 
     * 1.1.1 ������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� �����Ѵ� 
     * 1.1.2 ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�
     * 1.1.3 ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�
     * 1.2 ������ ��ٱ���(cart) �� �����Ѵ� �׸��� i�� ���� 1 ������Ų��
     */
    if (i >= cart.length)
    {
      Product[] tmp = new Product[cart.length * 2];
      System.arraycopy(cart, 0, tmp, 0, cart.length);
      cart = tmp;
    }
    
    cart[i] = p;
    i++;
    
  } // add(Product p)

  void summary() {
    /*
     * (3) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� . 
     * 1.1 ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�. 
     * 1.2 ��ٱ��Ͽ� ��� ���ǵ���  ������ ��� ���ؼ� ����Ѵ� . 
     * 1.3 ������ ��� ���� �ݾ�(money) �� ����Ѵ� .
     */
    
//    System.out.print("������ ����: ");
//    
//    for (int i = 0; i < cart.length; i++) {
//      if (cart[i] instanceof Tv)
//        System.out.print(((Tv)cart[i]).toString() + ", ");
//      else if (cart[i] instanceof Computer)
//        System.out.print(((Computer)cart[i]).toString() + ", ");
//      else if (cart[i] instanceof Audio)
//        System.out.print(((Audio)cart[i]).toString() + ", ");
//    }
//    
//    System.out.println("");
//    
//    int total = 0;
//    
//    for (int i = 0; i < cart.length; i++) {
//      if (cart[i] != null)
//        total += cart[i].price;
//    }

    String itemlist = "";
    int total = 0;
    
    for (int i = 0; i < cart.length; i++) {
      if (cart[i] == null)
        break;
      
      if (itemlist == "")
        itemlist += cart[i];
      else
        itemlist += "," + cart[i];
      
      total += cart[i].price;
    }

    System.out.println("������ ����: " + itemlist);
    System.out.println("����� �ݾ�: " + total);
    System.out.println("���� �ݾ� " + money);
    
  } // summary()
}

class Product {
  int price; // ��ǰ�� ����

  Product(int price) {
    this.price = price;
  }
}

class Tv extends Product {
  Tv() {
    super(100);
  }

  public String toString() {
    return "Tv";
  }
}

class Computer extends Product {
  Computer() {
    super(200);
  }

  public String toString() {
    return "Computer";
  }
}

class Audio extends Product {
  Audio() {
    super(50);
  }

  public String toString() {
    return "Audio";
  }
}

class Robot {
}

class DanceRobot extends Robot {
  void dance() {
    System.out.println("���� ��ϴ� .");
  }
}

class SingRobot extends Robot {
  void sing() {
    System.out.println("�뷡�� �մϴ� .");
  }
}

class DrawRobot extends Robot {
  void draw() {
    System.out.println("�׸��� �׸��ϴ� .");
  }
}

// 17.
abstract class Unit {
  int x, y; // ���� ��ġ

  abstract void move(int x, int y);

  void stop() {
    /* ���� ��ġ�� ���� */ }
  
}

class Marine extends Unit { // ����

  void stimPack() {
    /* �������� ����Ѵ�. */}

  @Override
  void move(int x, int y) {
    // TODO Auto-generated method stub
    
  }
}

class Tank extends Unit { // ��ũ

  void changeMode() {
    /* ���ݸ�带 ��ȯ�Ѵ�. */}

  @Override
  void move(int x, int y) {
    // TODO Auto-generated method stub
    
  }
}

class Dropship extends Unit { // ���ۼ�

  void load() {
    /* ���õ� ����� �¿��. */ }

  void unload() {
    /* ���õ� ����� ������. */ }

  @Override
  void move(int x, int y) {
    // TODO Auto-generated method stub
    
  }
}

//class Unit {}
//class AirUnit extends Unit {}
//class GroundUnit extends Unit {}
//class Tank extends GroundUnit {}
//class AirCraft extends AirUnit {}

class MyTv2 {
  private boolean isPowerOn;
  private int channel;
  private int volume;
  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;
  private int prevChannel;
  
  public void gotoPrevChannel() {
//    int tmp = this.prevChannel;
//    this.prevChannel = this.channel;
//    this.channel = tmp;
    // �ڵ� ����!!
    setChannel(this.prevChannel);
  }
  
  public void setIsPowerOn (boolean isPowerOn) {
    this.isPowerOn = isPowerOn;
  }
  
  public boolean getIsPowerOn () {
    return this.isPowerOn;
  }
  
  public void setChannel (int channel) {
    // validation check
    if (channel >= MAX_CHANNEL || channel <= MIN_CHANNEL)
      return;
    
    if (this.channel != channel)
      this.prevChannel = this.channel;
    
    this.channel = channel;
  }
  
  public int getChannel() {
    return this.channel;
  }
  
  public void setVolume (int volume) {
    if(volume >= MAX_VOLUME || volume <= MIN_VOLUME)
      return;
    
    this.volume = volume;
  }
  
  public int getVolume() {
    return this.volume;
  }
  
}

class Parent {
  int x = 100;

  Parent() {
    this(200);
    System.out.println("P0");
  }

  Parent(int x) {
    System.out.println("P1");
    this.x = x;
  }

  int getX() {
    return x;
  }
}

class Child extends Parent {
  int x = 3000;

  Child() {
    this(1000);
    System.out.println("C0");
  }

  Child(int x) {
    System.out.println("C1");
    this.x = x;
  }
}

class SutdaDeck {
  final int CARD_NUM = 20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM];

  SutdaDeck() {
    /*
     * (1) �迭 SutdaCard�� ������ �ʱ�ȭ �Ͻÿ�.
     */
    for (int i = 0; i < cards.length; i++) {
      int tmpi = (i / 2) + 1;
      cards[i] = new SutdaCard(tmpi, ((i % 2 == 1) && (tmpi == 1 || tmpi == 3 || tmpi == 8)));
    }
    
    for (int i = 0; i < cards.length; i++) {
      int r = (int)(Math.random() * cards.length);
      
      SutdaCard tmp = cards[r];
      cards[r] = cards[0];
      cards[0] = tmp;
    }
  }
  
  //
  public void shuffle () {
    for (int i = 0; i < cards.length; i++) {
      int r = (int)(Math.random() * cards.length);
      
      SutdaCard tmp = cards[r];
      cards[r] = cards[0];
      cards[0] = tmp;
    }
  }
  
  public SutdaCard pick(int index) {
    // validation check
    if (index < 0 || index > CARD_NUM)
      return null;
    
    return cards[index];
  }
  
  public SutdaCard pick() {
    int r = (int)(Math.random() * cards.length);
    return pick(r);
  }
}

class SutdaCard {
  // 14.
  final int NUM;
  final boolean ISKWANG;

  SutdaCard() {
    this(1, true);
  }

  SutdaCard(int num, boolean isKwang) {
    this.NUM = num;
    this.ISKWANG = isKwang;
  }

  // info()��� ObjectŬ������ toString()�� �������̵��ߴ�.
  public String toString() {
    return NUM + (ISKWANG ? "K" : "");
  }
}
