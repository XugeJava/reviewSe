package com.xuge.se1.Arrays;

import java.util.Arrays;

/**
 * author: yjx
 * Date :2022/8/510:06
 **/
public class Test {
  public static void main(String[] args) {
    //按照数字顺序排列指定的数组
    int [] arr = {3,2,4,6,7};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
    int index = Arrays.binarySearch(arr, 0);
    System.out.println(index);
    //1,数组必须有序
    //2.如果要查找的元素存在,那么返回的是这个元素实际的索引
    //3.如果要查找的元素不存在,那么返回的是 (-插入点-1)
    //插入点:如果这个元素在数组中,他应该在哪个索引上.
  }
}
