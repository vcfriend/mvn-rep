package com.example.demo05shell.util;

/**
 * @author 向亚林
 * 2018/7/26 下午9:45
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunExec {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Process process;
        try {
            process = Runtime.getRuntime().exec(new String[] { "/bin/sh","-c", "python all.py '" + "Do every human change?" + "'"});

            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line=bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}