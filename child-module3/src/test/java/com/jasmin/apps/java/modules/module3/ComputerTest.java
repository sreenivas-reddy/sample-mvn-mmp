package com.jasmin.apps.java.modules.module3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    @Test
    public void getProcessor() {
        Computer computer = new Computer();
        System.out.println(computer.getProcessor());
    }

    @Test
    public void setProcessor() {
    }

    @Test
    public void getMemory() {
        Computer computer = new Computer();
        System.out.println(computer.getMemory());
    }

    @Test
    public void setMemory() {
    }
}