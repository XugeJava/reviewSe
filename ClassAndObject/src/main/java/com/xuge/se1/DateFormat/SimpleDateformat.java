package com.xuge.se1.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author: yjx
 * Date :2022/8/510:24
 **/
public class SimpleDateformat {
  public static void main(String[] args) throws ParseException {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //1.把日期对象格式化成我们喜欢的时间形式，返回字符串
    String time = sdf.format(date);
    System.out.println(time);//2020-10-18 19:58:34
    //过121s后是什么时间
    long time1 = date.getTime();
    time1 += 121;
    //2.把时间毫秒值格式化成设定的时间形式，返回字符串!
    System.out.println(sdf.format(time1));
    String d = "2020-10-18 20:20:20";//格式一致
    //3.把字符串的时间解析成日期对象
    Date newDate = sdf.parse(d);
    System.out.println(sdf.format(newDate)); //按照前面的方法输出
  }
}
