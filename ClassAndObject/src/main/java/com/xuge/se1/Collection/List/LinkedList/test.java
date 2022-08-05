package com.xuge.se1.Collection.List.LinkedList;

import java.util.LinkedList;

/**
 * author: yjx
 * Date :2022/8/514:32
 **/
public class test {
  public static void main(String[] args) {
    Node xuge = new Node("xuge");
    Node simit = new Node("simit");
    Node tom = new Node("tom");
    /**
     * 1.是否线程安全,都是不同步的
     * 2.ArrayList底层是Object数组，LinkedList底层使用的是双向链表数据结构
     * 3.插入和删除是否受元素位置影响
     * 4.是否支持高效的随机访问
     * 5.内存空间 ArrayList需要预留一部分空间，而linkedList 需要存放next,pre,item三个数据
     */

    LinkedList<Integer> list=new LinkedList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
/**
 * Object var2 = var1.item;
 *     LinkedList.Node var3 = var1.next;
 *     var1.item = null;
 *     var1.next = null;
 *     this.first = var3;
 *     if (var3 == null) {
 *       this.last = null;
 *     } else {
 *       var3.prev = null;
 *     }
 *
 *     --this.size;
 *     ++this.modCount;
 *     return var2;
 */
    //删除节点==>删除最后一个节点
    list.remove();
    list.forEach(System.out::println);

  }
}

class Node {
  public Object item;
  public Node next;
  public Node pre;

  public Node(Object item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return "Node{" +
            "item=" + item +
            ", next=" + next +
            ", pre=" + pre +
            '}';
  }
}
