package com.s_giken.traning;


public class FizzBuzzRunner {
    private int num = 0;

    public FizzBuzzRunner(int num) {
        this.num = num;
    }

    public void displayToTerminal(IFizzBuzz... fizzBuzzInterfaces) {
        for(var fb : fizzBuzzInterfaces) {
            for(var i = 1; i <= this.num; i++) {
                System.out.print(fb.translate(i) + " ");
            }
            System.out.print("\n");
        }
    }
}
