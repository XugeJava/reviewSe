package com.xuge.se1.Calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * author: yjx
 * Date :2022/8/510:27
 **/
public class Test {
  public static void main(String[] args) {
    System.out.println();
    Calendar instance = Calendar.getInstance();
    
    
    
    int year = instance.get(Calendar.YEAR);//获取年
    int month = instance.get(Calendar.MONTH) + 1;//月要+1
    int days = instance.get(Calendar.DAY_OF_YEAR);
    instance.set(Calendar.YEAR , 2099);//修改某个字段
    instance.add(Calendar.HOUR , 15);//加15小时  -15就是减去15小时
    Date date = instance.getTime();//日历对象
    long time = instance.getTimeInMillis();//时间毫秒值
    //700天后是什么日子
    instance.add(Calendar.DAY_OF_YEAR , 701);
    Date  d = instance.getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(sdf.format(d));//输出700天后的日期
  }
}
