package com.xuge.se1.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * author: yjx
 * Date :2022/8/510:48
 **/
public class test1 {
  public static void main(String[] args) {
    Collection<String> lists = new ArrayList<>();
    lists.add("aa");
    lists.add("bb");
    lists.add("cc");
    System.out.println(lists); // lists = [aa, bb, cc]
    System.out.println("1.迭代器遍历");
    Iterator<String> iterator = lists.iterator();
    while (iterator.hasNext()) {
      String next = iterator.next();
      System.out.println(next);
    }

    System.out.println("2.使用for循环遍历");
    for (String list : lists) {
      System.out.println(list);
    }
    //lambda
    System.out.println("3.使用lambda表达式");
   lists.forEach(s->{
     System.out.println(s);
   });
  }
}
