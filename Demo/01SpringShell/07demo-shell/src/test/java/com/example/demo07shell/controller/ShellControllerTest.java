package com.example.demo07shell.controller;

import com.example.demo07shell.Demo07shellApplicationTests;
import com.example.demo07shell.controller.ShellController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ShellControllerTest extends Demo07shellApplicationTests {

    @Autowired
    ShellController shellController;
    @Test
    public void ossutil64() {
        shellController.ossutil64("-a");
    }

    @Test
    public void command() {
        shellController.command("pwd", "-a");
    }
}