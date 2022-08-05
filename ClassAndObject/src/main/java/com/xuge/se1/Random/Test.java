package com.xuge.se1.Random;

import java.util.Random;

/**
 * author: yjx
 * Date :2022/8/510:15
 **/
public class Test {
  public static void main(String[] args) {
    long  start=System.currentTimeMillis();
    while(true){

      int  s=new Random().nextInt(10);
      if(s==1){
        break;
      }
    }
    long end=System.currentTimeMillis();
    System.out.println("cost:"+(end-start));
  }
}
