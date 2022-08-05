package com.xuge.se;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * author: yjx
 * Date :2022/8/414:27
 **/
public class TwoArray {
  @Test
  public  void  test1(){
    int[][] arr = {{11, 22, 33}, {33, 44, 55}};
    for (int i = 0; i < arr.length; i++) {
      for (int i1 = 0; i1 < arr[i].length; i1++) {
        System.out.println(arr[i][i1]);
      }
    }
  }
  @Test
  public void test2(){
    int  i=1;
    //i=i++;
    //;
    System.out.println(i);
  }
  @Test
  public  void test3(){
    //测试布尔运算符
    System.out.println(false&true);
    System.out.println(1|2);
    //测试布尔条件运算符
    System.out.println(false&&true);
    System.out.println(true&&false);
  }
  @Test
  public  void test4(){
    System.out.println(2>>1);
    System.out.println(1<<1);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s=scanner.nextLine();
    //测试switch
    switch(s){
      case  "test":
        System.out.println("hello world..");
        break;
      case
              "hello":
        System.out.println("nihao  ..");
      default  :
        System.out.println("hello world..");
    }


  }
  
}
