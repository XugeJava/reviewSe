package com.xuge.se1.clone;

/**
 * author: yjx
 * Date :2022/8/418:04
 **/
public class Student {
  private Long id;
  private String name;
  private Integer sex;

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getSex() {
    return sex;
  }
  public void setSex(Integer sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", name=" + name + ", sex=" + sex + "]";
  }
}