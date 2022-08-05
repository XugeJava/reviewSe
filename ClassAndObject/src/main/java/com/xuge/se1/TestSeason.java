package com.xuge.se1;

/**
 * author: yjx
 * Date :2022/8/415:30
 **/
public class TestSeason {
  public static void main(String[] args) {
    season  s=season.SPRING;
    System.out.println(s.name());
    season s1=season.WINTER;
    System.out.println(s.compareTo(s1));
  }
}
