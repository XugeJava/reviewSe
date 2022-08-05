package com.xuge.se1.String;

import java.util.Arrays;

/**
 * author: yjx
 * Date :2022/8/59:26
 **/
public class test {
  //String类型不可改变的意思是，每次更改字符串是都会产说会新的对象，斌不是对原始对象进行改变
  public static void main(String[] args) {
    String str="a23";
    System.out.println("未改变前:"+str.hashCode());
    String str1="abc";
    System.out.println("改变后:"+str.hashCode());

    //比较两个字符串内容是否相同、区分大小写
    System.out.println(str.equals(str1));

    //比较字符串的内容，忽略大小写
    String s="A";
    String s1="a";
    System.out.println(s.equalsIgnoreCase(s1));


    //返回此字符串的长度
    System.out.println(s.length());
    //返回一个字符串，其值为此字符串，并删除任何前导和尾随空格
    String s3="  qweqr% ";
    System.out.println(s3.trim());

    //将字符串按给定的正则表达式分割成字符串数组
    String s4="123,45,789";
    String[] split = s4.split(",");
    System.out.println(Arrays.toString(split));

    //取索引处的值
    System.out.println(s4.charAt(1));


    //将字符串拆分为字符数组后返回
    String  s5="qwrer";
    char[] chars = s5.toCharArray();
    System.out.println(Arrays.toString(chars));
    //测试此字符串是否以指定的前缀开头
    System.out.println(s5.startsWith("q"));
    //返回指定子字符串第一次出现的字符串内的索引，没有返回 -1
    System.out.println(s5.indexOf("r"));
    //返回字符串最后一次出现 str 的索引，没有返回 -1
    System.out.println(s5.lastIndexOf("r"));
    //返回子字符串，以原字符串指定索引处到结尾 ,即从1到末尾
    System.out.println(s5.substring(1));
    //指定索引处扩展到 j - 1 的位置，字符串长度为 j - i
    System.out.println(s5.substring(1,4));
    //将此 String 所有字符转换为DA写，使用默认语言环境的规则
    System.out.println(s5.toUpperCase());
    //使用新值，将字符串中的旧值替换，得到新的字符串
    System.out.println(s5.replace("r", "a"));


    //
    String  test="abc";
    System.out.println(new String("abc").intern() == test);

    System.out.println("===========================");
    System.out.println("===========================");
    System.out.println("===========================");
    /**
     *  常量池中的信息都加载到运行时常量池，这时a b ab是常量池中的符号，还不是java字符串对象，是懒惰的
     *  ldc #2 会把 a 符号变为 "a" 字符串对象     ldc:反编译后的指令
     *  ldc #3 会把 b 符号变为 "b" 字符串对象
     *  ldc #4 会把 ab 符号变为 "ab" 字符串对象
     */
    String s11 = "a"; 	// 懒惰的
    String s22 = "b";
    String s33 = "ab";	// 串池

    String s44 = s11 + s22;	// 返回的是堆内地址
    // 原理：new StringBuilder().append("a").append("b").toString()  new String("ab")

    String s55 = "a" + "b";  // javac 在编译期间的优化，结果已经在编译期确定为ab

    System.out.println(s33 == s44); // false
    System.out.println(s33 == s55); // true

    String x2 = new String("c") + new String("d"); // new String("cd")
    // 虽然 new，但是在字符串常量池没有 cd 对象，因为 toString() 方法
    x2.intern();
    String x1 = "cd";

    System.out.println(x1 == x2); //true


  }
}
