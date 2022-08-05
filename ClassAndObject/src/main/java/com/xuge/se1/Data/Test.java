package com.xuge.se1.Data;

import java.util.Date;

/**
 * author: yjx
 * Date :2022/8/510:21
 **/
public class Test {
  public static void main(String[] args) {
    Date d = new Date();
    System.out.println(d);//Fri Oct 16 21:58:44 CST 2020
    long time = d.getTime() + 121*1000;//过121s是什么时间
    System.out.println(time);//1602856875485

    Date d1 = new Date(time);
    System.out.println(d1);//Fri Oct 16 22:01:15 CST 2020
  }
}
