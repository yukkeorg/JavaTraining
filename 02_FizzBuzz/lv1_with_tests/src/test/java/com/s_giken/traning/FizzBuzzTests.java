package com.s_giken.traning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {
    private final App app = new App();

    @Test
    public void correct_FizzBuzz() {
        assertEquals("1", app.fizzBuzz(1));
        assertEquals("10", app.fizzBuzz(10));

        assertEquals("Fizz", app.fizzBuzz(3));
        assertEquals("Buzz", app.fizzBuzz(5));
        assertEquals("FizzBuzz", app.fizzBuzz(15));

        assertEquals("Fizz", app.fizzBuzz(6));
        assertEquals("Buzz", app.fizzBuzz(10));
        assertEquals("FizzBuzz", app.fizzBuzz(30));
    }
}
