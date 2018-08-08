package com.example.demo05shell.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author 向亚林
 * 2018/7/27 上午9:13
 */
public class ExeclShell {

    public static void main(String[] args) {
        execShell(true,"mkdir 999");
    }

    /**
     * 执行shell
     * @param execCmd 使用命令 或 脚本标志位
     * @param para 传入参数
     */
    private static void execShell(boolean execCmd, String... para) {
        StringBuffer paras = new StringBuffer();
        Arrays.stream(para).forEach(x -> paras.append(x).append(" "));
        try {
            String cmd = "", shpath = "";
            if (execCmd) {
                // 命令模式
                shpath = "echo";
            } else {
                //脚本路径
                shpath = "/Users/yangyibo/Desktop/callShell.sh";

            }
            cmd = shpath + " " + paras.toString();
            Process ps = Runtime.getRuntime().exec(cmd);
            ps.waitFor();

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String result = sb.toString();
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
