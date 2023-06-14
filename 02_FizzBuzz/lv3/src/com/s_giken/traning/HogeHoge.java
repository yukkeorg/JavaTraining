package com.s_giken.traning;

public class HogeHoge implements IFizzBuzz {
    @Override
    public String translate(int num) {
        String sNum = String.valueOf(num);

        if (num % 7 == 0) {
            return "HogeHoge";
        } else if(sNum.contains("7")) {
            return "HogeHoge";
        } else {
            return sNum;
        }
    }
}
