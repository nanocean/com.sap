package com.sap;

public class InitializationBlock {
  public static void main(String [] args){
    NewClass NC1 = new NewClass();
    NewClass NC2 = new NewClass("Name");
  }
}

class NewClass{
  static{
    System.out.println("Ŭ���� �ʱ�ȭ");
  }
  {
    System.out.println("Ŭ���� ����");
  }
  NewClass(){
    System.out.println("���ڰ� ���� ������");
  }
  NewClass(String name){
    System.out.println("���ڰ� �ִ� ������");
  }
}
