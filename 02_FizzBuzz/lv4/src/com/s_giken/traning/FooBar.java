package com.s_giken.traning;

public class FooBar implements IFizzBuzzFilter {
    @Override
    public String translate(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            return "FooBar";
        } else if(num % 3 == 0) {
            return "Foo";
        } else if(num % 5 == 0) {
            return "Bar";
        } else {
            return String.valueOf(num);
        }
    }
}
