package com.xuge.se1.test3;

import java.util.ArrayList;

/**
 * author: yjx
 * Date :2022/8/416:29
 **/
public class CodeDemo {
  public static String schoolName;
  public static ArrayList<String> lists = new ArrayList<>();

  // 静态代码块,属于类，与类一起加载一次!
  static {
    System.out.println("静态代码块被触发执行~~~~~~~");
    // 在静态代码块中进行静态资源的初始化操作
    schoolName = "张三";
    lists.add("3");
    lists.add("4");
    lists.add("5");
  }

  public static void main(String[] args) {
    System.out.println("main方法被执行");
    System.out.println(schoolName);
    System.out.println(lists);
  }
}
/*静态代码块被触发执行~~~~~~~
main方法被执行
张三
[3, 4, 5] */