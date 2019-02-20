package com.example.demo02springshell.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * @author 向亚林
 * 2018/7/26 上午10:01
 */
//    清单 11. 使用 PrefixedResult 的命令
@ShellComponent
public class CustomResultHandlerApp {
    @ShellMethod("Result handler")
    public PrefixedResult resultHandler() {
        return new PrefixedResult("PRE", "Hello!");
    }
}
