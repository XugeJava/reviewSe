package com.xuge.se.clone;

//import lombok.extern.slf4j.Slf4j;


/**
 * author: yjx
 * Date :2022/8/417:23
 **/
public class Demo {
  public static void main(String[] args) throws CloneNotSupportedException {
    Student student = new Student();
    student.name="hello";
    System.out.println("未修改前:"+ student.name);
    Student  s1=student;
    s1.name="nihao ";
    System.out.println("改后:"+ student.name);
    //浅拷贝
    Student s3=(Student)s1.clone();
    System.out.println(s1==s3);
  }
}

class  Student  implements  Cloneable{
  String name;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
//  @Override
//  protected Object clone() throws CloneNotSupportedException {
//    return super.clone();
//  }
}
