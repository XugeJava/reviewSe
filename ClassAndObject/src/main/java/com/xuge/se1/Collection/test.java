package com.xuge.se1.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * author: yjx
 * Date :2022/8/510:40
 **/
public class test {
  /**set:无序，不重复，无索引
   * 1.hashSet :添加的元素是无序，不重复，无索引的
   * 2.LinkedHashSet:添加的元素是有序，不重复的，无索引的
   * 3.TreeSet:不重复，无索引，按照大小默认升序排序
   * List系列: 添加的元素是有序，可重复，有索引
   * ArrayList:添加的元素是有序，可重复，有索引
   * LinkedList:添加的元素是有序，可重复，有索引
   *
   * @param args
   */
  public static void main(String[] args) {
    Collection<String> sets = new HashSet<>();
    //1.把给定的对象添加到当前集合中
    sets.add("MyBatis");
    System.out.println(sets.add("Java"));//true
    System.out.println(sets.add("Java"));//false
    sets.add("Spring");
    sets.add("MySQL");
    System.out.println(sets);//[]无序的;
    //2.判断当前集合中是否包含给定的对象。
    System.out.println(sets.contains("java"));//true 存在
    //3.判断当前集合是否为空
    System.out.println(sets.isEmpty());
    //4.返回集合中元素个数
    System.out.println(sets.size());
    //5.把集合中的元素，存储到数组中
    Object[] arrs = sets.toArray();
    System.out.println("数组："+ Arrays.toString(arrs));

    Collection<String> c1 = new ArrayList<>();
    c1.add("java");
    Collection<String> c2 = new ArrayList<>();
    c2.add("ee");
    c1.addAll(c2);// c1:[java,ee]  c2:[ee];
    System.out.println(c1);
  }
}
