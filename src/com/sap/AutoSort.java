package com.sap;

public class AutoSort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Calculator c1 = new Calculator();
    c1.setOprands(10, 0);
    
    try {
      c1.divide();
    } catch (Exception e) {
      // TODO: handle exception
    }

  }

}

class DivideException extends Exception {
  DivideException(){
      super();
  }
  DivideException(String message){
      super(message);
  }
}

class Calculator{
  int left, right;
  
  public void setOprands(int left, int right){        
      this.left = left;
      this.right = right;
  }
  
  public void divide() throws DivideException {
      if(this.right == 0){
          throw new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");
      }
      System.out.print(this.left/this.right);
  }
}
