package com.xuge.se1.test;

/**
 * author: yjx
 * Date :2022/8/416:17
 **/
public class Demo {
  public static void main(String[] args) {
    Animal a = new Dog();
    //Dog d = (Dog)a;
    //Cat c = (Cat)a; 编译不报错，运行报ClassCastException错误
    if (a instanceof Cat) {
      Cat c = (Cat) a;
    } else if (a instanceof Dog) {
      Dog d = (Dog) a;
    }
    System.out.println(a);
  }
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
