package com.s_giken.traning;

public class App {
    public static void main(String... args) {
        var runner = new FizzBuzzRunner(100);
        runner.displayToTerminal(new FizzBuzz(), new FeeVer());
    }    
}
