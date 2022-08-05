package com.xuge.se1.Collection.List.vector;

import java.util.List;
import java.util.Vector;

/**
 * author: yjx
 * Date :2022/8/514:10
 **/
public class Test {
  public static void main(String[] args) {
    List<Integer> list=new Vector<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    /**
     * 1.vector默认构造，是长度为10的Object数组，不够了再按照两倍扩容
     * 2.vector带参构造为初始长度，不够了按照两倍扩容
     */


  }
}
