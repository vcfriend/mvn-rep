package com.example.demo02springshell.util;

import java.io.*;

/**
 * @author 向亚林
 * 2018/7/26 下午5:47
 */
public class ShellUtil {
    private static final int SUCCESS = 0;
    private static final String SUCCESS_MESSAGE = "successful";
    private static final String ERROR_MESSAGE = "fail";
    /**
     *
     * @Title: executer
     * @Description: TODO
     * @param command
     * @return
     */
    public static boolean executer(String[] command){
        try{
            Process process=Runtime.getRuntime().exec(command);
            readProcessOutput(process);
            // 等待程序执行结束并输出状态
            int exitCode = process.waitFor();
            if (exitCode == SUCCESS) {
                System.out.println(SUCCESS_MESSAGE);
                return true;
            } else {
                System.err.println(ERROR_MESSAGE + exitCode);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 输出打印信息
     * @Title: readProcessOutput
     * @Description: TODO
     * @param process
     */
    private static void readProcessOutput(final Process process) {
        // 将进程的正常输出在 System.out 中打印，进程的错误输出在 System.err 中打印
        read(process.getInputStream(), System.out);
        read(process.getErrorStream(), System.err);
    }

    private static void  read(InputStream inputStream, PrintStream out) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                out.println(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        //executer("tail -f /data/demo/test.log");
    }
}
