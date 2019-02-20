package com.example.demo02springshell.entity;

import lombok.Data;

/**
 * @author 向亚林
 * 2018/7/26 上午8:52
 */
@Data
public class User {
    private final String id;
    private final String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;

    }
    public String getName() {
        return name;
    }
}
