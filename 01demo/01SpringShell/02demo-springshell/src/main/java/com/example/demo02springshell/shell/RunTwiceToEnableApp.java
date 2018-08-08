package com.example.demo02springshell.shell;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * @author 向亚林
 * 2018/7/26 上午10:02
 */
//    清单 14. 动态命令可用性
@ShellComponent
public class RunTwiceToEnableApp {
    private boolean run = false;

    @ShellMethod("Run once")
    public void runOnce() {
        this.run = true;
    }

    @ShellMethod("Run Exit")
    public void runExit() {
        this.run = false;
    }
    @ShellMethod("Run again")
    public void runAgain() {
        System.out.println("Run!");
    }

    public Availability runAgainAvailability() {
        return run
                ? Availability.available()
                : Availability.unavailable("You should run runOnce first!");
    }
}
