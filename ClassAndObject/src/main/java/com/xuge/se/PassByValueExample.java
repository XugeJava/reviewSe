package com.xuge.se;

/**
 * author: yjx
 * Date :2022/8/415:03
 **/
public class PassByValueExample {
  public static void main(String[] args) {
    Dog dog = new Dog("A");
    func(dog);
    System.out.println(dog.getName());    // B
  }

  private static void func(Dog dog) {
    dog.setName("B");
  }
}

class Dog {
  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  String name;//.....
}