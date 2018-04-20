package com.sap;

public class OuterInnerTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    OuterClass1.InnerClass1 in = (new OuterClass1()).new InnerClass1();
    in.test();
  }

}

class OuterClass1 {
  class InnerClass1 {
    
    void test() {}
  }
}