package com.s_giken.traning;

public class FizzBuzz implements IFizzBuzz {
    @Override
    public String translate(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if(num % 3 == 0) {
            return "Fizz";
        } else if(num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
