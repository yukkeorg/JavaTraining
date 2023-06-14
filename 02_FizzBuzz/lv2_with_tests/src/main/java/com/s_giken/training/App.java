package com.s_giken.traning;

public class App {
    public static void main(String... args) throws Exception{
        IFizzBuzz fizzBuzzFilter = new FooBar();
        for(var i = 1; i <= 100; i++) {
            System.out.print(fizzBuzzFilter.translate(i) + " ");
        }
        System.out.print("\n");
    }  
}
