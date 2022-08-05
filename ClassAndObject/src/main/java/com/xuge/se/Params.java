package com.xuge.se;

/**
 * author: yjx
 * Date :2022/8/414:47
 **/
public class Params {
  public static void main(String[] args) {
    System.out.println(m1(1,2));
    System.out.println(m1(1));
    System.out.println(m1(1,2,3));
    System.out.println(m1(1,new int[]{1,3543,2345,2}));
  }
  public  static  int  m1(int n1,int  ...n2){
    int  sum=0;
    if(n2==null){
      return  n1;
    }
    sum+=n1;
    for (int i : n2) {
      sum+=i;
    }
    return sum;
  }
}
