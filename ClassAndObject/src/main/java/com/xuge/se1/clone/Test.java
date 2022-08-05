package com.xuge.se1.clone;

/**
 * author: yjx
 * Date :2022/8/418:09
 **/
public class Test {
  public static void main(String[] args) {
    Person person = new Person();
    Person p1=person;
    p1.name="xuge";
    p1.id=101;
    System.out.println(person.name+"="+person.id+"--");
    System.out.println(person==p1);
    System.out.println(person.hashCode());
    System.out.println(p1.hashCode());


  }
}
class Person{
  String name;
  int id;
}
