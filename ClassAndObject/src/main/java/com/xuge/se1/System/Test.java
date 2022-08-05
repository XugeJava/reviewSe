package com.xuge.se1.System;

import java.util.Date;

/**
 * author: yjx
 * Date :2022/8/510:19
 **/
public class Test {
  public static void main(String[] args) {
    //System.exit(0); // 0代表正常终止!!
    long startTime = System.currentTimeMillis();//定义sdf 按照格式输出
    for (int i = 0; i < 10000; i++) {//输出i}
      long endTime = new Date().getTime();
      System.out.println((endTime - startTime) / 1000.0 + "s");//程序用时

      int[] arr1 = new int[]{10, 20, 30, 40, 50, 60, 70};
      int[] arr2 = new int[6]; // [ 0 , 0 , 0 , 0 , 0 , 0]
      // 变成arrs2 = [0 , 30 , 40 , 50 , 0 , 0 ]
      System.arraycopy(arr1, 2, arr2, 1, 3);
    }
  }
}
