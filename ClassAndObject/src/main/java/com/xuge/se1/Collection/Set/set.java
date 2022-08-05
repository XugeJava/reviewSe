package com.xuge.se1.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * author: yjx
 * Date :2022/8/515:21
 **/
public class set {
  public static void main(String[] args) {
    /**
     * 1.无序，不重复，无索引
     * 2.set接口对象，不能存放重复元素，可以存放null
     * 3.存放数据无序，即添加数据和取出数据不一致,但是取出数据是固定的
     */
    Set<Integer> set=new HashSet<Integer>();
    set.add(1);
    set.add(2);
    set.add(2);
    set.add(null);
    set.forEach(System.out::println);

    //遍历方式1
    System.out.println("===========使用迭代器===========");
    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
      Integer next =  iterator.next();
      System.out.println(next);
    }

    //遍历方式2
    System.out.println("=======使用增强for=========");
    for (Integer integer : set) {
      System.out.println(integer);

    }

    System.out.println(-1&1);

  }
}
