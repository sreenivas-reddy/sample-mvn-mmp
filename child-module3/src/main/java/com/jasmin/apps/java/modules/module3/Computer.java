package com.jasmin.apps.java.modules.module3;

public class Computer {
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    private String processor;
    private int memory;
}
