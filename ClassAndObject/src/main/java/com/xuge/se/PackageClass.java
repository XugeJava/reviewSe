package com.xuge.se;

import org.junit.jupiter.api.Test;

/**
 * author: yjx
 * Date :2022/8/413:59
 **/
public class PackageClass {
  public static void main(String[] args) {
    // 1.把基本数据类型的值转成字符串
    Integer it = 100 ;
    // a.调用toString()方法。
    String itStr = it.toString();
    System.out.println(itStr+1);//1001
    // b.调用Integer.toString(基本数据类型的值)得到字符串。
    String itStr1 = Integer.toString(it);
    System.out.println(itStr1+1);//1001
    // c.直接把基本数据类型+空字符串就得到了字符串。
    String itStr2 = it + "";
    System.out.println(itStr2+1);// 1001

    // 2.把字符串类型的数值转换成对应的基本数据类型的值
    String numStr = "23";
    int numInt = Integer.valueOf(numStr);
    System.out.println(numInt+1);//24

    String doubleStr = "99.9";
    double doubleDb = Double.valueOf(doubleStr);
    System.out.println(doubleDb+0.1);//100.0

  }
  @Test
  public void test2(){
    int a = 12 ;
    Integer a1 = 12 ;  // 自动装箱
    Integer a2 = a ;   // 自动装箱
    Integer a3 = null; // 引用数据类型的默认值可以为null

    Integer c = 100 ;
    int c1 = c ;      // 自动拆箱

    Integer it = Integer.valueOf(12);  	// 手工装箱！
    // Integer it1 = new Integer(12); 	// 手工装箱！
    Integer it2 = 12;

    Integer it3 = 111 ;
    int it33 = it3.intValue(); // 手工拆箱
  }
  @Test
  public void  test(){
    Integer x = new Integer(123);
    Integer y = new Integer(123);
    System.out.println(x == y);    // false
    Integer z = Integer.valueOf(123);
    Integer k = Integer.valueOf(123);
    System.out.println(z == k);   // true
  }

}
