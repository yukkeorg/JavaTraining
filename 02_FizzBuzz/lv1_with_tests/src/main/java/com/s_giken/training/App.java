package com.s_giken.training;

public class App {
    public static void main(String... args) throws Exception {
        new App().Run();
    }

    public void Run() {
        for (var i = 1; i <= 100; i++) {
            System.out.print(fizzBuzz(i) + " ");
        }
        System.out.print("\n");
    }

    public String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }
}
