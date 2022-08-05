package com.xuge.se;

/**
 * author: yjx
 * Date :2022/8/414:52
 **/
public class Override {
  /**
   * 1.多个方法在同一个类中
   * 2.多个方法具有相同的方法名
   * 3.多个方法的参数不相同，类型不同或者数量不同
   * @param args
   */
  public static void main(String[] args) {

  }
  public static int  m(int n1){
    return  n1;
  }

  public static double m(double n1){
    return  n1;
  }
  public static double  m(int n1,int n2){
    return  n1+n2;
  }
  public static double  m(int n1,double n2){
    return  n1+n2;
  }

}
