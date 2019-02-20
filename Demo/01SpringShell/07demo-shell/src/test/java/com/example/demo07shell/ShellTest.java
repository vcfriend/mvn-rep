package com.example.demo07shell;

import org.hswebframework.expands.shell.Shell;
import org.hswebframework.utils.file.FileUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by zhouhao on 16-6-28.
 */
public class ShellTest {

    @Test
    public void testPattern(){
        String content = "http://127.0.0.1:9999/crzvideo/videos%2Fcctv_2.mp4";
        String pattern = "([1-9]{1,3}\\.){3}[1-9]";
        //String pattern = "(\\d|[1-9]\\d|1\\d{2}|2[0-5][0-5])\\.(\\d|[1-9]\\d|1\\d{2}|2[0-5][0-5])\\.(\\d|[1-9]\\d|1\\d{2}|2[0-5][0-5])\\.(\\d|[1-9]\\d|1\\d{2}|2[0-5][0-5])";
        //String pattern = "([0-9]|[1-9]\\d{1,3}|[1-5]\\d{4}|6[0-5]{2}[0-3][0-5])";


        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 '127.0.0.1:9999' 子字符串? " + isMatch);
        content.replace(pattern ,"30.195.248.189:9999");
        System.out.println("content: "+content);
    }

    @Test
    public void testPing() throws Exception {
        int[] count = new int[1];
        Shell.build("ping", "www.baidu.com")
                .onProcess((line, helper) -> {
                    if (++count[0] > 10) helper.kill();
                    System.out.println(line);
                })
                .exec();
    }
    @Test
    public void testPwd() throws Exception {
        Shell.build("pwd")
                .onProcess((line, helper) -> {
                    System.out.println(line);
                })
                .exec();
    }
    @Test
    public void testMkdir() throws Exception {
        Shell.build("mkdir","8787")
                .onProcess((line, helper) -> System.out.println(line))
                .exec();
    }
    @Test
    public void testLs() throws Exception {
        List<String> resultInfList = new ArrayList<>();
        List<String> errInfList = new ArrayList<>();

        Shell.build("ls","-a")
                .onProcess((line, helper) -> {
                    resultInfList.add(line);
                    System.out.println(line);})
                .onError(((line, helper) -> {
                    errInfList.add(line);
                    System.out.println(line);
                })).exec();

        System.out.println("===========");
        System.out.println("res: " + resultInfList.size());
        System.out.println("err: " + errInfList.size());
        System.out.println("===========");
        resultInfList.stream().forEach(result  -> System.out.println(": "+ result));
        errInfList.stream().forEach(err -> System.out.println("err: " + err));

    }

    @Test
    public void testShellFile() throws Exception {
        String absolutePath = FileUtils.getResourceAsFile("test.sh").getAbsolutePath();
        Shell.build("bash", FileUtils.getResourceAsFile("test.sh").getAbsolutePath())
                .onProcess((line, helper) -> System.out.println(line))
                .exec();
    }

    @Test
    public void testText() throws Exception {
        Shell.buildText("echo helloShell \n ls").dir("/")
                .onProcess((line, helper) -> System.out.println(line))
                .exec();
    }

    @Test
    public void testJavac() throws Exception {
        String code = "public class Test{" +
                "public static void main(String args[]){" +
                "   for(int i=0;i<args.length;i++){System.out.print(args[i]+\\\"\\\\t\\\");}" +
                "   System.out.println();" +
                "}" +
                "};";
        Shell.buildText("\necho \"" + code + "\">Test.java \n" +
                "/usr/lib/jvm/jdk1.8.0_77/bin/javac -encoding utf-8 Test.java\n" +
                "/usr/lib/jvm/jdk1.8.0_77/bin/java Test arg1 arg2")
                .dir("target")
                .onProcess((line, helper) -> System.out.println(line))
                .onError((line, helper) -> System.out.println(line))
                .exec();
    }

    @Test
    public void testDocker() {
        for (int i = 0; i < 20; i++) {
            int n = i;
            new Thread(() -> {
                try {
                    Shell.build("docker run --rm --name mysql-test-" + n + " -e MYSQL_ROOT_PASSWORD=test mysql")
                            .onProcess((line, helper) -> System.out.println(line))
                            .onError((line, helper) -> System.out.println(line))
                            .exec();
                } catch (IOException e) {
                }
            }).start();
        }
    }

    public static void main(String[] args) throws Exception {
        Shell.buildText("ifconfig | awk '/HWaddr/{print $5}'")
                .onProcess((line, helper) -> System.out.println(line))
                .exec();
    }

}