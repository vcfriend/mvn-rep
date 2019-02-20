package com.example.demo07shell.enums;

import lombok.Getter;

/**
 * 异常信息返回类型
 *
 * @author 向亚林
 * 2018/3/26 21:23
 */
@Getter
public enum ResultTypeInfoEnum {
    CMMOND_ERROR(0, "调用命令错误"),
    PARAM_ERROR(1, "命令不存在"),
    PRODUCT_NOT_EXIST(10, "参数不存在")
    ;


    private Integer code;

    private String message;

    ResultTypeInfoEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
