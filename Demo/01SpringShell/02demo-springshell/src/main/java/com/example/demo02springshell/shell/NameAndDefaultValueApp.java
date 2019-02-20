package com.example.demo02springshell.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * @author 向亚林
 * 2018/7/26 上午10:09
 */
@ShellComponent
public class NameAndDefaultValueApp {
    //清单 6. 指定方法名称和参数默认值
    @ShellMethod(key = "default", value = "With default value")
    public void withDefault(@ShellOption(defaultValue = "Hello") final String value) {
        System.out.printf("Value: %s%n", value);
    }
}
