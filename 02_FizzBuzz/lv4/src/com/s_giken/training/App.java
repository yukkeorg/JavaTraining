package com.s_giken.traning;

public class App {
    public static void main(String... args) throws Exception{
        var runner = new FizzBuzzRunner(100);
        runner.addFizzBuzzFilter(new FizzBuzz());
        runner.addFizzBuzzFilter(new FeeVer());
        runner.write();
    }    
}
