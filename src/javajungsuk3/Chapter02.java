package javajungsuk3;

public class Chapter02 {

  public static void main(String[] args) {
//     TODO Auto-generated method stub


//    p.5
//    p.157
    
//    1.
//    논리형: boolean 1
//    문자형: char 2
//    정수형: byte 1, short 2, int 4, long 8
//    실수형: float 4, double 8
    
//    2.
    long regNo = 8001011234567L;
    
//    3.
    int i = 100;
    long l =100L;
    final float PI = 3.14f;
//    
//    리터럴 - : 100, 100L, 3.14f
//    변수 - : i, l
//    키워드 - : int, long, final, float
//    상수 - : PI
    
//    4.
//    b. Byte
    
//    5.
//    System.out.println(“1” + “2”) → (12 )
//    System.out.println(true + “”) → ( true) 
//    System.out.println(‘A' + 'B') → ( AB) X -> (131) 
//    System.out.println('1' + 2) → ( 12)  X -> (51)
//    System.out.println('1' + '2') → ( 12) X -> (99)
//    System.out.println('J' + “ava”) → ( Java) 
//    System.out.println(true + null) → ( 오류 - true + null -> null)
//    System.out.println('A' + 'B');
//    System.out.println('1' + 2);
//    System.out.println('1' + '2');

    System.out.println((int)'A');
    System.out.println((int)'Z');
    System.out.println((int)'a');
    System.out.println((int)'z');

    System.out.println("");
//    System.out.println((char)91);
    
//    6.
//    b, c, d, e (모든 키워드는 소문자)
    
//    java 키워드
//    abstract default if package this
//    assert do goto private throw
//    boolean double implements protected throws
//    break else import public transient
//    byte enum instanceof return true
//    case extends int short try
//    catch false interface static void
//    char final long strictfp volatile
//    class finally native super while
//    const float new switch
//    continue for null synchronized
    
    
//    7.
//    a. $ystem, g. $MAX_NUM
//    d. If (모든 예약어는 소문자), e. 자바 (한글 가능)
    int If;
    int 자바;
    
//    8. int, float
//    모든 참조형 변수는 4 byte

//    ref: 
//    The amount of memory used by a reference depends on several parameters:
//
//      on a 32-bit JVM, it will be 32 bits
//      on a 64-bit JVM, it can be 32 or 64 bits depending on configuration. 
//      On hotspot for example, compressed ordinary object pointers is activated by default and the size of a reference is 32 bits. 
//      If you deactivate the option with -XX:-UseCompressedOops, they will use 64 bits.
    
//    9. 
//    d, e
    long l2 = 1000L;
    float f = l2;
    
//    float f1 = 1.2f;
//    long l3 = f1; //error
    
    
//    10.
//    0 ~ 65535
    
//    11.
//    a, b, c
//    d. float f = 3.14f
    
//    12.
//    a, b, c, e
    
//    13.
//    c. float - 0.0F, 
//    e. long - 0L,
//    f. String - null
    
    
    
//     ref:
    // to Integer from int
    Integer ri = new Integer(10);
    // to int from Integer
    int pi = ri.intValue();
    
    System.out.println((char)'\u0000');
    
    
    
    
    
  }

}
