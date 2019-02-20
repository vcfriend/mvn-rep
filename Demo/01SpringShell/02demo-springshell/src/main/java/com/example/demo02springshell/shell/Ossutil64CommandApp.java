package com.example.demo02springshell.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * @author 向亚林
 * 2018/7/26 下午12:28
 */
@ShellComponent
public class Ossutil64CommandApp {
    @ShellMethod("ossutil64")
    public String ossutil64(@ShellOption(defaultValue = "cp") final String value, final String upFilePath,@ShellOption(defaultValue = "36000") final String timeout){

        return String.format("ossutil64 %s %s %s",value, upFilePath, timeout);
    }
}
