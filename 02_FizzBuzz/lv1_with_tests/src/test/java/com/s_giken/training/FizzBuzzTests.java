package com.s_giken.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {
    private final App app = new App();

    @Test
    public void correct_FizzBuzz() {
        assertEquals("1", app.fizzBuzz(1));
        assertEquals("2", app.fizzBuzz(2));
        assertEquals("Fizz", app.fizzBuzz(3));
        assertEquals("4", app.fizzBuzz(4));
        assertEquals("Buzz", app.fizzBuzz(5));
        assertEquals("Fizz", app.fizzBuzz(6));
        assertEquals("7", app.fizzBuzz(7));
        assertEquals("8", app.fizzBuzz(8));
        assertEquals("Fizz", app.fizzBuzz(9));
        assertEquals("Buzz", app.fizzBuzz(10));

        assertEquals("FizzBuzz", app.fizzBuzz(15));
        assertEquals("FizzBuzz", app.fizzBuzz(30));
    }
}
