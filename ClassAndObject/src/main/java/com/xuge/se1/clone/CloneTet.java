package com.xuge.se1.clone;

/**
 * author: yjx
 * Date :2022/8/418:05
 **/
public class CloneTet {

  public static void main(String[] args) throws CloneNotSupportedException {
    test();
  }

  private static void test() throws CloneNotSupportedException {
    Clazz cla = getClazz();
    System.out.println("cla_1>:"+cla+"cla_1.hashCode>:"+cla.hashCode()+"-----cla_1_stu.hashCode>:"+cla.getStu().hashCode());
    Clazz cla2 = cla.clone();
    System.out.println("cla_2>:"+cla2+"cla_2.hashCode>:"+cla2.hashCode()+"-----cla_2_stu.hashCode>:"+cla2.getStu().hashCode());

    cla2.setName("999体育班");
    Student changeStu = cla2.getStu();
    changeStu.setName("小王");
    changeStu.setId(2L);
    changeStu.setSex(1);
    System.out.println("-----修改了Clone出来的Clazz.name以及Clazz.stu.name----------");
    System.out.println("cla_1>:"+cla+"cla_1.hashCode>:"+cla.hashCode()+"-----cla_1_stu.hashCode>:"+cla.getStu().hashCode());
    System.out.println("cla_2>:"+cla2+"cla_2.hashCode>:"+cla2.hashCode()+"-----cla_2_stu.hashCode>:"+cla2.getStu().hashCode());

  }

  private static Student getStudent() {
    Student stu = new Student();
    stu.setId(1L);
    stu.setName("小李");
    stu.setSex(0);
    return stu;
  }

  private static Clazz getClazz() {
    Clazz cla = new Clazz();
    cla.setNumber(324L);
    cla.setName("文化班");
    cla.setStu(getStudent());
    return cla;
  }

}