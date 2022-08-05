package com.xuge.co.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * author: yjx
 * Date :2022/8/515:45
 **/
public class test {
  public static void main(String[] args) {
    /**
     * 1.hashSet底层是hashMap
     * 2.添加一个元素时，先得到hash值-会转成-》索引值
     * 3.找到存储数据表table,看这个索引位置是否已经存放的有元素
     * 4.如果没有，直接加入
     * 5.如果有，调用equals比较。如果相同，就放弃添加，如果不相同，就添加到最后
     * 6.在java8中，如果一条链表的元素个数超过8,并且table大小>=64，就会进行树化
     */
    //模拟hashMap
//    Node[]table=new Node[16];
//    System.out.println("table"+table);
//    //创建节点
//    Node xuge = new Node("xuge", null);
//    table[2]=xuge;
//    Node jack = new Node("jack", null);
//    xuge.next=jack;
//    System.out.println(table);
    /**
     * 1. public HashSet() {
     *     this.map = new HashMap();
     *   }
     * 2.public boolean add(E var1) {
     *     return this.map.put(var1, PRESENT) == null;
     *   }
     * 3.public V put(K var1, V var2) {
     *     return this.putVal(hash(var1), var1, var2, false, true);
     *   }
     * 4. static final int hash(Object var0) {
     *     int var1;
     *     return var0 == null ? 0 : (var1 = var0.hashCode()) ^ var1 >>> 16;
     *   }
     * 5. HashMap.Node[] var6;
     *     int var8;
     *     //1.如果table为空，第一次扩容，
     *     if ((var6 = this.table) == null || (var8 = var6.length) == 0) {
     *       var8 = (var6 = this.resize()).length;
     *     }
     *
     *     Object var7;
     *     int var9;
     *     //2.1根据key,得到hash去计算key应该存放到table表的哪个索引位置
     *     并把这个位置的对象，付给p
     *     //2.2判断p是否为Null
     *     //2.3如果p为null,表示还没有存放元素，就创建一个node("java",value)
     *     //2.4然后把新创建的元素放到该位置上
     *     if ((var7 = var6[var9 = var8 - 1 & var1]) == null) {
     *       var6[var9] = this.newNode(var1, var2, var3, (HashMap.Node)null);
     *     } else {
     *       Object var10;
     *       Object var11;
     *       //1)准备加入的key和p指向的Node节点的key是同一个对象
     *       //2)p指向的Node节点的key的equals()和准备加入的key比较后相同
     *       if (((HashMap.Node)var7).hash == var1 && ((var11 = ((HashMap.Node)var7).key) == var2 || var2 != null && var2.equals(var11))) {
     *         var10 = var7;
     *       } else if (var7 instanceof HashMap.TreeNode) {
     *         var10 = ((HashMap.TreeNode)var7).putTreeVal(this, var6, var1, var2, var3);
     *       } else {
     *         int var12 = 0;
     *
     *         while(true) {
     *           if ((var10 = ((HashMap.Node)var7).next) == null) {
     *             ((HashMap.Node)var7).next = this.newNode(var1, var2, var3, (HashMap.Node)null);
     *             if (var12 >= 7) {
     *               this.treeifyBin(var6, var1);
     *             }
     *             break;
     *           }
     *
     *           if (((HashMap.Node)var10).hash == var1 && ((var11 = ((HashMap.Node)var10).key) == var2 || var2 != null && var2.equals(var11))) {
     *             break;
     *           }
     *
     *           var7 = var10;
     *           ++var12;
     *         }
     *       }
     *
     *       if (var10 != null) {
     *         Object var13 = ((HashMap.Node)var10).value;
     *         if (!var4 || var13 == null) {
     *           ((HashMap.Node)var10).value = var3;
     *         }
     *
     *         this.afterNodeAccess((HashMap.Node)var10);
     *         return var13;
     *       }
     *     }
     *
     *     ++this.modCount;
     *     if (++this.size > this.threshold) {
     *       this.resize();
     *     }
     *
     *     this.afterNodeInsertion(var5);
     *     return null;
     */
    Set set=new HashSet();
    set.add(1);
    set.add(1);
    set.add(10);




  }
}

class  Node{
  Node next;
  Object  item;

  public Node(Object item, Node next) {
    this.next=next;
    this.item=item;
  }
}
