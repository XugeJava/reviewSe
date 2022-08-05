package com.xuge.se1;

/**
 * author: yjx
 * Date :2022/8/415:26
 **/
public enum season {
  SPRING(1,"春天"),
  SUMMER(2,"夏天"),
  AUTUMN(3,"秋天"),
  WINTER(4,"冬天");
  Integer id;
  String name;

  season(int id, String name) {
    this.id=id;
    this.name=name;
  }
}

