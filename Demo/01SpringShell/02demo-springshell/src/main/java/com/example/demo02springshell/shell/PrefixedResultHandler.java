package com.example.demo02springshell.shell;

import org.springframework.shell.ResultHandler;
import org.springframework.stereotype.Component;

/**
 * @author 向亚林
 * 2018/7/26 上午9:58
 */
//    清单 10. PrefixedResult 对应的处理器实现
@Component
public class PrefixedResultHandler implements ResultHandler<PrefixedResult> {
    @Override
    public void handleResult(PrefixedResult result) {
        System.out.printf("%s --> %s%n", result.getPrefix(), result.getResult());
    }

}
