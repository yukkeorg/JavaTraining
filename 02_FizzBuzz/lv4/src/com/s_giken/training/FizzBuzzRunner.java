package com.s_giken.training;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzRunner {
    private int maxNum = 0;
    private List<IFizzBuzzFilter> fizzBuzzFilterList = new ArrayList<IFizzBuzzFilter>();

    public FizzBuzzRunner(int maxNum) {
        this.maxNum = maxNum;
    }

    public void addFizzBuzzFilter(IFizzBuzzFilter fizzBuzzFilter) {
        fizzBuzzFilterList.add(fizzBuzzFilter);
    }

    public void write() {
        for (var fizzBuzzFilter : fizzBuzzFilterList) {
            for (var i = 1; i <= this.maxNum; i++) {
                System.out.print(fizzBuzzFilter.translate(i) + " ");
            }
            System.out.print("\n");
        }
    }
}