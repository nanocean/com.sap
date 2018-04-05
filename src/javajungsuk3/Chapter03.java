package javajungsuk3;

public class Chapter03 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

//  p.9
//  p.170
    
//    1.
//    int x = 2;
//    int y = 5;
//    char c = 'A'; // 'A' 의 문자코드는  65
    
//    System.out.println(1 + x << 33); // ?
//    System.out.println(y >= 5 || x < 0 && x > 2); // true
//    System.out.println(y += 10 - x++); // 12 X -> 13
//    System.out.println(x+=2); // 5
//    System.out.println( !('A' <= c && c <='Z') ); // true  X -> false
//    System.out.println('C'-c); // 2
//    System.out.println('5'-'0'); // 5
//    System.out.println(c+1); // 66
//    System.out.println(++c); // 66 X -> B
//    System.out.println(c++); // 66 X -> B
//    System.out.println(c); // 67 X -> C
    
//    2.
//    numberOfApples / sizeOfBasket + (((numberOfApples % sizeOfBasket) > 0) ? 1 : 0)
    
//    3.
//    num 양수 음수 을 ‘ ’, ‘ ’, ‘0’
//    (num > 0) ? "양수" : ((num == 0) ? "0" : "음수")
    
//    4.
//    (num / 100) + "00"
    
//    5.
//    (num / 10) + "1"
    
//    6. 
//    10 - (num % 10)
//    (num % 10 == 0) ? 0 : (10 - (num % 10)) (일반적인 ceiling 합수라면)
    
//    7.
//    int fahrenheit = 100;
//    float celcius = ( /* (1) */ );
//    System.out.println("Fahrenheit:"+fahrenheit);
//    System.out.println("Celcius:"+celcius);
//    변환 결과값은 소수점 셋째자리에서 반올림
//    
//    C = 5/9 × (F - 32)
    
//    ((int)(((5/9f) * (fahrenheit - 32))*100 + 0.5)) / 100f
    
//    8.
//    byte a = 10;
//    byte b = 20;
//    byte c = a + b;  =>  byte c = (byte)(a + b);
//    char ch = 'A';
//    ch = ch + 2;  =>  ch = (char)(ch + 2);
//    float f = 3 / 2;  =>  float f = 3 / 2f;
//    long l = 3000 * 3000 * 3000;  =>  long l = 3000 * 3000 * 3000L;
//    float f2 = 0.1f;
//    double d = 0.1;
//    boolean result = d==f2;  =>  boolean result = (float)d==f2;
//    System.out.println("c="+c);
//    System.out.println("ch="+ch);
//    System.out.println("f="+f);
//    System.out.println("l="+l);
//    System.out.println("result="+result);
//
//    c=30
//    ch=C
//    f=1.5
//    l=27000000000
//    result=true
    
//    ??? 고친것 없음
    
//    float a = 0.1F;
//    double b = 0.1;
//    
//    System.out.println(a == b);
    
//    9.
//    (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')
    
//    10.
//    char ch = 'A';
//    char lowerCase = ( /* (1) */ ) ? ( /* (2) */ ) : ch;
//    System.out.println("ch:"+ch);
//    System.out.println("ch to lowerCase:"+lowerCase);
//    
//    ch:A
//    ch to lowerCase:a
    
//    (1) ch >= 'A' && ch <= 'Z'
//    (2) (char)(ch + 32)
    
//    
    
    
    
    
    
    
    
    
    
    
  }

}
