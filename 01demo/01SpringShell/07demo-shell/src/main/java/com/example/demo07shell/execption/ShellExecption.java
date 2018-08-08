package com.example.demo07shell.execption;


import com.example.demo07shell.enums.ResultTypeInfoEnum;

/**
 * 异常类
 * @author 向亚林
 * 2018/3/26 21:21
 */
public class ShellExecption extends RuntimeException {
    private Integer code;

    public ShellExecption(ResultTypeInfoEnum resultTypeInfoEnum) {
        super(resultTypeInfoEnum.getMessage());
        this.code = resultTypeInfoEnum.getCode();
    }

    public ShellExecption(Integer code, String defaultMessage) {
        super(defaultMessage);
        this.code = code;
    }
}
