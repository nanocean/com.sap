package com.sap;

public class MultiIF {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    String name = "lee";
    int jumsoo = 85;
    int result;
    result = jumsoo / 10;
    char grade;
    
    if (result == 9) {
      grade = 'A';
    }
    else if (result == 8) {
      grade = 'B';
    }
    else if (result == 7) {
      grade = 'C';
    }
    else if (result == 6) {
      grade = 'D';
    }
    else if (result == 5) {
      grade = 'E';
    }
    else {
      grade = 'F';
    }
    
    System.out.println("이름\t점수\t학점");
    System.out.printf("%s\t%d\t%c", name, jumsoo, grade);
    
    
  }

}
