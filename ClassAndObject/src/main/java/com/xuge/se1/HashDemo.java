package com.xuge.se1;

/**
 * author: yjx
 * Date :2022/8/416:46
 **/
public class HashDemo {
  public static void main(String[] args) {
    T1 t1 = new T1();
    T1 t2 = new T1();
    System.out.println(t1==t2);
    System.out.println(t1.hashCode());
    System.out.println(t2.hashCode());
  }
}
class  T1{
  String name;
}
