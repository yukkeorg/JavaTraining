package com.s_giken.traning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void Correct_FizzBuzz_transrate() {
        assertEquals("2", fizzBuzz.translate(2));
        assertEquals("Fizz", fizzBuzz.translate(3));
        assertEquals("4", fizzBuzz.translate(4));
        assertEquals("Buzz", fizzBuzz.translate(5));

        assertEquals("Fizz", fizzBuzz.translate(6));
        assertEquals("Buzz", fizzBuzz.translate(10));
        assertEquals("FizzBuzz", fizzBuzz.translate(15));
    }

    @Test
    public void FizzBuzz_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            fizzBuzz.translate(-1);
        });
    }
}
