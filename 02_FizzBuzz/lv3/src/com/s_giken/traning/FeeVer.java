package com.s_giken.traning;

public class FeeVer implements IFizzBuzzFilter {
    @Override
    public String translate(int num) {
        String sNum = String.valueOf(num);

        if (num % 7 == 0) {
            return "FeeVer";
        } else if(sNum.contains("7")) {
            return "FeeVer";
        } else {
            return sNum;
        }
    }
}
