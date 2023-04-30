package com.s_giken.traning;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter implements IMessageWriter {
    private PrintWriter out = null;

    public FileWriter(String fileName) throws IOException {
        this.out = new PrintWriter(new java.io.FileWriter(fileName, false));
    }

    @Override
    public void write(String message) {
        this.out.print(message);
        this.out.flush();
    }
}
