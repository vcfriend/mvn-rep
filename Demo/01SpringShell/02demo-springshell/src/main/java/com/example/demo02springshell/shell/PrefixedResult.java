package com.example.demo02springshell.shell;

import org.springframework.shell.standard.ShellComponent;

/**
 * @author 向亚林
 * 2018/7/26 上午9:57
 */
//    清单 9.带前缀的处理结果
@ShellComponent
public class PrefixedResult {
    private final String prefix;
    private final String result;

    public PrefixedResult(String prefix, String result) {
        this.prefix = prefix;
        this.result = result;
    }

    public PrefixedResult() {
        this.prefix = "prefix";
        this.result = "result";
    }

    public String getPrefix() {
        return prefix;
    }

    public String getResult() {
        return result;
    }
}
