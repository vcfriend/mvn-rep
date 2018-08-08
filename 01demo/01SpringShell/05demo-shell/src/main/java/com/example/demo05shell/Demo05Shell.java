package com.example.demo05shell;

import com.example.demo05shell.util.ShellUtil;

/**
 * @author 向亚林
 * 2018/7/26 下午9:05
 */
public class Demo05Shell {

    public void main(String[] args){
        final String  commend[] = {"echo","param1","param2"};
        ShellUtil.executer(commend);
    }
}
