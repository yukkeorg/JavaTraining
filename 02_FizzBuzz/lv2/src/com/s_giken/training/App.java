package com.s_giken.traning;

public class App {
    public static void main(String... args) throws Exception{
        String s = "";
        for(var i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                s = "FizzBuzz";
            } else if(i % 3 == 0) {
                s = "Fizz";
            } else if(i % 5 == 0) {
                s = "Buzz";
            } else {
                s = String.valueOf(i);
            }
            System.out.print(s + " ");
        }
        System.out.print("\n");
    }  
}
