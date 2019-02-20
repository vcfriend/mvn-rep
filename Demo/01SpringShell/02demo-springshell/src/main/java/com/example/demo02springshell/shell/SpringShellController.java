package com.example.demo02springshell.shell;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.Availability;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * @author 向亚林
 * 2018/7/25 下午3:01
 * https://blog.csdn.net/bitgnu/article/details/78715807
 */
@ShellComponent
public class SpringShellController {
    //清单 1. 命令调用方法
    @ShellMethod("Echo One")
    //命令行myshell=>echo-one
    public String echoOne() {
        return String.format("echoOne");
    }
    //清单 1. 命令调用方法

    @ShellMethod("Echo One1")
    //命令行myshell=>echo-one //根据方法名有大写的添加-间隔符
    public String echoOne1() {
        return String.format("echoOne1");
    }

    //清单 4. 包含多个参数的命令方法
    @ShellMethod("Echo1")
    //命令行myshell=>echo1 1 2 3
    public String echo1(int a, int b, int c) {
        return String.format("echo1: a = %d, b = %d, c = %d", a, b, c);
    }
    //清单 4. 包含多个参数的命令方法
    @ShellMethod("Echo1 One1")
    //命令行myshell=>echo1 1 2 3
    public String echo1One1(int a, int b, int c) {
        return String.format("echo1: a = %d, b = %d, c = %d", a, b, c);
    }


    //清单 5. 指定参数名称
    //命令行myshell=>echo2 1 --boy 2 3
    @ShellMethod("Echo too")
    public String echo2(int a, @ShellOption("--boy") int b, int c) {
        return String.format("a = %d, b = %d, c = %d", a, b, c);
    }

    //    清单 7. 参数对应多个值
    //命令行myshell=>echo3 1 2 3
    @ShellMethod("Echo three")
    public String echo3(@ShellOption(arity = 3) int[] numbers) {
        return String.format("a = %d, b = %d, c = %d", numbers[0], numbers[1], numbers[2]);
    }

//    清单 13. 自定义提示符
    @Bean
    public PromptProvider promptProvider() {
        return () -> new AttributedString("myshell=>",
                AttributedStyle.DEFAULT.foreground(AttributedStyle.BLUE));
    }

}
