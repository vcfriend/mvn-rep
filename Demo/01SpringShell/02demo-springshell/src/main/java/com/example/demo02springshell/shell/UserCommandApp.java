package com.example.demo02springshell.shell;

import com.example.demo02springshell.entity.User;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * 清单 18. 使用类型转换的命令
 * @author 向亚林
 * 2018/7/26 上午8:57
 */
@ShellComponent
public class UserCommandApp {

    @ShellMethod("User")
    public void user(final User user) {
        if (user != null) {
            System.out.println("user:"+ user);
            System.out.println(user.getName());
        } else {
            System.out.println("user:"+ user);
            System.out.println("User not found");
        }
    }
}

