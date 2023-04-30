package com.s_giken.traning;

public class TerminalWriter implements IMessageWriter {
    @Override
    public void write(String message) {
        System.out.print(message);
    }
}
