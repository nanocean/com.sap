package com.sap;

import java.util.HashMap;
import java.util.Objects;

public class CalculatorDemo {
  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    c1.setOprands(10, 0);

    Calculator c2 = new Calculator();
    c2.setOprands(10, 0);
    
    System.out.println(c1 == c2);
    System.out.println(c1.equals(c2));
    
    HashMap<Calculator, String> hm = new HashMap<>();
    hm.put(c1, "c1");
    hm.put(c2, "c2");
    
    for (Calculator c : hm.keySet())
      System.out.println(hm.get(c));
  }
}

class Calculator {
  int left, right;

  public void setOprands(int left, int right) {
    this.left = left;
    this.right = right;
  }
  
  public boolean equals(Object obj) {
    Calculator c = (Calculator)obj;
    if (left == c.left && right == c.right)
      return true;
    else
      return false;
  }

  public int hashCode() {
      return Objects.hash(right, left);
  }

  public void divide() {
    try {
      System.out.println(left / right);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
    } catch (Exception e) {
      System.out.println("Exception");
    }
  }
}
