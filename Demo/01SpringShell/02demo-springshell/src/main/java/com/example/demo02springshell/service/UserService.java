package com.example.demo02springshell.service;

import com.example.demo02springshell.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 向亚林
 * 2018/7/26 上午8:54
 */
public class UserService {
    private final Map<String, User> users = new HashMap<>();

    public UserService() {
        users.put("alex", new User("alex", "Alex"));
        users.put("bob", new User("bob", "Bob"));
    }

    public User findUser(String id) {
        return users.get(id);
    }
}
