package com.s_giken.training;

public class FizzBuzz implements IFizzBuzzFilter {
    @Override
    public String translate(int num) throws IllegalArgumentException {
        if (num <= 0) {
            throw new IllegalArgumentException("num must be positive");
        }

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
