package com.sap1;

public class ConstantDemo {

  public static void main(String[] args) {
    
//    if(Fruit.APPLE == Company.APPLE){ System.out.println("과일 애플과 회사 애플이 같다."); }
      
//    Fruit type = Fruit.APPLE;
//    
//    switch (type) {
//    case APPLE:
//      System.out.println(57+" kcal, "+Fruit.APPLE.getColor());
//      break;
//    case PEACH:
//      System.out.println(34 + " kcal, "+Fruit.PEACH.getColor());
//      break;
//    case BANANA:
//      System.out.println(93 + " kcal, "+Fruit.BANANA.getColor());
//      break;
//    }
    
    for(Fruit f : Fruit.values()){
      System.out.println(f+", "+f.getColor());
    }

    for(Company c : Company.values()){
      System.out.println(c);
    }
  }
}

enum Fruit {
  APPLE("red"), PEACH("pink"), BANANA("yellow");
  
  public String color;
  
  Fruit(String color){
      System.out.println("Call Constructor "+this);
      this.color = color;
  }
  
  String getColor(){
    return this.color;
  }
}

enum Company{
    GOOGLE, APPLE, ORACLE;
  
  Company(){
        System.out.println("Call Constructor "+this);
    }
}