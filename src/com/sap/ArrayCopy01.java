package com.sap;

public class ArrayCopy01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int[] data = {10,20,30,40,50};
    int[] copydata1 = new int[5];
    int[] copydata2 = new int[5];
    
    for (int i = 0; i < data.length; i++) {
      copydata1[i] = data[i];
    }

    for(int d : copydata1)
      System.out.printf("%3d", d);
    
    int[] dest = new int[5];
    
    System.out.println("");

    System.arraycopy( data, 0, copydata2, 1, 3 );

    for(int d : copydata2)
      System.out.printf("%3d", d);
    
//    ~ : home
//    @ : 방향
//    # : 주석
//    $ : line의 끝
//    % : 나머지연산, MS(환경변수)
//    ^ : cap(line의 시작)
//    & : 논리연산
//    * : 곱셈
//    () : 괄호
//    {} : block(구역, 영역)
//    [] : 배열 인덱
//    - : ㅁㅁㅁ
//    _ : 붙임표시
      
      
      
      
      
  }

}
