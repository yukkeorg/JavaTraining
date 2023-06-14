package com.s_giken.traning;

public class App {
    public static void main(String... args) throws Exception{
        new App().Run();
    }

    public void Run() {
        for(var i = 1; i <= 100; i++) {
            System.out.print(fooBar(i) + " ");
        }
        System.out.print("\n");
    }

    public String fooBar(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            return "FooBar";
        } else if(num % 3 == 0) {
            return "Foo";
        } else if(num % 5 == 0) {
            return "Bar";
        } 
        return String.valueOf(num);
    }
}
