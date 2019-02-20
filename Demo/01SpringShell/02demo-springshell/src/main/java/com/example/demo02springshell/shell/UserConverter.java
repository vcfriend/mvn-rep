package com.example.demo02springshell.shell;

import com.example.demo02springshell.entity.User;
import com.example.demo02springshell.service.UserService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 清单 17. 使用类型转换
 * @author 向亚林
 * 2018/7/26 上午8:55
 */
@Component
public class UserConverter implements Converter<String, User> {

    private final UserService userService = new UserService();
    @Override
    public User convert(String source) {
        return userService.findUser(source);
    }

}

