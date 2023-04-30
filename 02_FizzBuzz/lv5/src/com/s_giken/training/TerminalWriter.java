package com.s_giken.training;

public class TerminalWriter implements IMessageWriter {
    @Override
    public void write(String message) {
        System.out.print(message);
    }
}
