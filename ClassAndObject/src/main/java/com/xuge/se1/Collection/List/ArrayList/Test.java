package com.xuge.se1.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * author: yjx
 * Date :2022/8/510:55
 **/
public class Test {

  public static void main(String[] args) {
    /**
     * 1.ArrayList中维护了一个Object类型的数组elementData
     * transient Object[]elementData;  不会被序列化
     * 2.当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0,第1次添加
     * 则扩容elementData为10，如需要再次扩容，则扩容elementData为1.5倍
     * 3.如果时指定，初始默认指定大小，需要扩容，也是1.5倍
     */
//    List<Integer> lists = new ArrayList<>();//多态
    List<Integer> lists = new ArrayList<>(8);//多态
    //1.将指定的元素追加到此集合的末尾
    //1-10
    for (int i = 1; i <=10; i++) {
      lists.add(i);
    }
    //11-15
    for (int i = 11; i <=15; i++) {
      lists.add(i);
    }
//    lists.add("java4");
//    System.out.println("此时List集合元素为:");
//    lists.forEach(s->{
//      System.out.println(s);
//    });
//
//
//    //2.将指定的元素，添加到该集合中的指定位置上
//    System.out.println("在指定位置前加入元素前,元素为:"+lists);
//    lists.add(1,"java5");
//    //3.返回集合中指定位置的元素
//    String s = lists.get(1);
//    System.out.println("索引为1的元素为"+s);
//    //4.移除列表中指定位置的元素，返回的是被移除的元素
//    String remove = lists.remove(1);
//    System.out.println("被移除的元素为:"+remove);
//    //5.用指定元素替换集合中指定位置的元素，返回更新前的元素值
//    lists.set(2,"test");
//    //6.返回列表中指定元  素第一次出现的索引，如果不包含此元素，则返回 -1
//    System.out.println(lists.indexOf("java1"));


  }
}
