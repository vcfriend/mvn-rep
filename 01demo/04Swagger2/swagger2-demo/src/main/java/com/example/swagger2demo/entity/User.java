package com.example.swagger2demo.entity;

import lombok.Data;

/**
 * @author 向亚林
 * 2018/9/3 下午2:23
 */
@Data
public class User {
  private Long id;
  private String username;
  private String name;
  private Integer age;

  public User(Long id, String username, String name, Integer age) {
    this.id = id;
    this.username = username;
    this.name = name;
    this.age = age;
  }

  public User() {
  }
}
