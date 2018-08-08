package com.example.demo07shell.controller;

import com.example.demo07shell.VO.ResultVO;
import com.example.demo07shell.enums.ResultTypeInfoEnum;
import com.example.demo07shell.execption.ShellExecption;
import com.example.demo07shell.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.hswebframework.expands.shell.Shell;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 向亚林
 * 2018/7/30 上午8:41
 */
@RestController
@Slf4j
@RequestMapping("/shell")
public class ShellController {

    @RequestMapping("/ossutil64/{params}")
    @ResponseBody
    public ResultVO<List<String>> ossutil64(@PathVariable("params") String params) {
        List<String> shellResultList = new ArrayList<>();
        String message = null;
        try {
            message = Shell.build("ossutil64", params)
                    .onProcess(((line, helper) -> {
                        shellResultList.add(line);
                        System.out.println(line);
                    }))
                    .exec().getMessage();
        } catch (IOException e) {
            log.error("调用命令错误");
            throw new ShellExecption(ResultTypeInfoEnum.CMMOND_ERROR);
        }
        System.out.println("\n========");
        for (String s : shellResultList) {
            System.out.println(": "+ s);
        }
        System.out.println("message: "+ message);
        return ResultVOUtil.success(shellResultList);
    }

    @RequestMapping(value = {"cmd/{cmd}", "cmd/{cmd}/{param}"}, method = RequestMethod.GET)
    @ResponseBody
    public ResultVO<List<String>> command(@PathVariable("cmd") String cmd,
                                          @PathVariable(value = "param",required = false) String param) {
        List<String> shellResultList = new ArrayList<>();
        try {
            System.out.println("param: "+param);
            if (param == null) {
                Shell.build(cmd)
                        .onError(((line, helper) -> {
                            shellResultList.add(line);
                            System.out.println(line);
                        }))
                        .onProcess((line, helper) -> {
                            shellResultList.add(line);
                            System.out.println(line);
                        }).exec();
            }
            else{
                String[] params = param.split(" ");
                Shell.build(cmd, params)
                        .onError(((line, helper) -> {
                            shellResultList.add(line);
                            System.out.println(line);
                        }))
                        .onProcess((line, helper) -> {
                            shellResultList.add(line);
                            System.out.println(line);
                        }).exec();
            }


        } catch (IOException e) {
            log.error("调用命令错误");
            throw new ShellExecption(ResultTypeInfoEnum.CMMOND_ERROR);
        }
        System.out.println("\n========");
        for (String s : shellResultList) {
            System.out.println(": "+ s);
        }
        return ResultVOUtil.success(shellResultList);
    }

}
