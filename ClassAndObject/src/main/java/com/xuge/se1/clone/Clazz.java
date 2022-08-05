package com.xuge.se1.clone;

/**
 * author: yjx
 * Date :2022/8/418:04
 **/
public class Clazz implements Cloneable {

  private Long number;
  private String name;
  private Student stu;

  @Override
  protected Clazz clone() throws CloneNotSupportedException {
    Clazz cla = (Clazz)super.clone();
    return cla;
  }

  public Long getNumber() {
    return number;
  }
  public void setNumber(Long number) {
    this.number = number;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Student getStu() {
    return stu;
  }
  public void setStu(Student stu) {
    this.stu = stu;
  }
  @Override
  public String toString() {
    return "Clazz [number=" + number + ", name=" + name + ", stu=" + stu + "]";
  }
}
