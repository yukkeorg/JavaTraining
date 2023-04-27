package com.s_giken.traning;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzRunner {
    private int maxNum = 0;
    private List<IMessageWriter> messageWriterList = new ArrayList<IMessageWriter>();
    private List<IFizzBuzzFilter> fizzBuzzFilterList = new ArrayList<IFizzBuzzFilter>();

    public FizzBuzzRunner(int maxNum) {
        this.maxNum = maxNum;
    }

    public void addMessageWriter(IMessageWriter messageWriter) {
        messageWriterList.add(messageWriter);
    }

    public void addFizzBuzzFilter(IFizzBuzzFilter fizzBuzzFilter) {
        fizzBuzzFilterList.add(fizzBuzzFilter);
    }

    public void write() {
        for (var writer: messageWriterList) {
            for (var fizzBuzzFilter : fizzBuzzFilterList) {
                for(var i = 1; i <= this.maxNum; i++) {
                    writer.write(fizzBuzzFilter.translate(i) + " ");
                }
                writer.write("\n");
            }    
        }
    }
}