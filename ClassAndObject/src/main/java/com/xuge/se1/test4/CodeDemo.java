package com.xuge.se1.test4;

import java.util.ArrayList;

/**
 * author: yjx
 * Date :2022/8/416:31
 **/
public class CodeDemo {
  private String name;
  private ArrayList<String> lists = new ArrayList<>();
  {
    name = "代码块";
    lists.add("java");
    System.out.println("实例代码块被触发执行一次~~~~~~~~");
  }
  public CodeDemo(){ }//构造方法
  public CodeDemo(String name){}

  public static void main(String[] args) {
    CodeDemo c = new CodeDemo();//实例代码块被触发执行一次
    System.out.println(c.name);
    System.out.println(c.lists);
    new CodeDemo();//实例代码块被触发执行一次
  }
}