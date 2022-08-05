package com.xuge.se1;

import java.util.Objects;

/**
 * author: yjx
 * Date :2022/8/416:35
 **/
public class Equals {
  public static void main(String[] args) {
    //默认toString()
    System.out.println(new A1());


  }
}

/**
 * 1.==比校的是变量(栈)内存中存放的对象的(堆)内存地址，用来判别两个对象地址是否相同
 * 即是否是指向同一个对象
 * 2.Object默认比较的是引用，重写后比较的是两个对象的内容是否相等
 */

class A1 {
  String name;
  int age;

  @Override
  public boolean equals(Object o) {
    //1.判断引用地址是否相等
    if (this == o) return true;
    //2.判断被比较者是否为Null,或者是否为当前调用这个equals方法对象类型
    if (o == null || this.getClass() != o.getClass()) return false;
    //3.强制转换后，开始比较内容
    A1 a=(A1)o;
    return  this.age==a.age&& Objects.equals(this.name,a.name);


  }
}
