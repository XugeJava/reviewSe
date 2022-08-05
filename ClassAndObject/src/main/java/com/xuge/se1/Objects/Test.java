package com.xuge.se1.Objects;

import java.util.Objects;

/**
 * author: yjx
 * Date :2022/8/59:25
 **/
public class Test {
  public static void main(String[] args) {
    Student s1=null;
    Student  s2=new Student();
    System.out.println(Objects.equals(s1,s2));
  }
}

class Student{

}
