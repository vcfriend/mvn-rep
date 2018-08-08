package com.example.demo02springshell.shell;

import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * 清单 19. 组织命令
 * @author 向亚林
 * 2018/7/26 上午8:59
 */
@ShellComponent
@ShellCommandGroup("Special")
public class CommandsGroupApp {

    @ShellMethod("Command1")
    public void command1() {}

    @ShellMethod(value = "Command2", group = "Basic Group")
    public void command2() {}

}
