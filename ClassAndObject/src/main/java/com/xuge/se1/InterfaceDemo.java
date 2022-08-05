package com.xuge.se1;

/**
 * author: yjx
 * Date :2022/8/416:08
 **/
public class InterfaceDemo {
  public static void main(String[] args) {
    // 1.默认方法调用：必须用接口的实现类对象调用。
    Man m = new Man();
    m.run();
    m.work();

    // 2.接口的静态方法必须用接口的类名本身来调用。
    InterfaceJDK8.inAddr();
  }
}

class Man implements InterfaceJDK8 {
  @Override
  public void work() {
    System.out.println("工作中。。。");
  }
}

interface InterfaceJDK8 {
  //抽象方法！！
  void work();

  // a.默认方法（就是之前写的普通实例方法）
  // 必须用接口的实现类的对象来调用。
  default void run() {
//    go();
    System.out.println("开始跑步🏃‍");
  }

  // b.静态方法
  // 注意：接口的静态方法必须用接口的类名本身来调用
  static void inAddr() {
    System.out.println("我们在武汉");
  }

  // c.私有方法（就是私有的实例方法）: JDK 1.9才开始有的。
  // 只能在本接口中被其他的默认方法或者私有方法访问。
//  private void go() {
//    System.out.println("开始。。");
//  }
}