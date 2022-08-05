package com.xuge.se1.clone.Improve;

/**
 * author: yjx
 * Date :2022/8/59:16
 **/

public class Person implements Cloneable{

  //private Integer age;
  private int age;//阿里规范中规定pojo类中的属性强制使用包装类型，这里只是测试

  private String name;

  public Person(Integer age, String name) {
    super();
    this.age = age;
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
  //对象拷贝
  public  static void copyRealObject() throws CloneNotSupportedException{
    Person p = new Person(23, "zhang");
    Person p1 = (Person) p.clone();
    System.out.println(p);
    System.out.println(p1);
    System.out.println("pName："+p.getName().hashCode());
    System.out.println("p1Name："+p1.getName().hashCode());
  }
  //浅拷贝只拷贝基本数据类型 String,Integer等包装类是不可改变的，也可拷贝
  public static void main(String[] args) throws CloneNotSupportedException {
      Person.copyRealObject();
  }
}
