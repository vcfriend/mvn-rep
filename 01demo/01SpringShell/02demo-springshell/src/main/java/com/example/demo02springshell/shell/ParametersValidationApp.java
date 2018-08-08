package com.example.demo02springshell.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * 清单 8. 校验参数
 * @author 向亚林
 * 2018/7/26 上午10:06
 */
@ShellComponent
public class ParametersValidationApp {
    //    清单 8. 校验参数
    @ShellMethod("String size")
    //命令行myshell=>string-size jack 或 string-size --name jack
    public String stringSize(@Size(min = 3, max = 16) String name) {
        return String.format("Your name is %s", name);
    }

    //    清单 8. 校验参数
    @ShellMethod("Number range")
    //命令行myshell=>number-range --number 88
    public String numberRange(@Min(10) @Max(100) int number) {
        return String.format("The number is %s", number);
    }
}
