package com.s_giken.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {
    private final FooBar fooBar = new FooBar();

    @Test
    public void Correct_FooBar_transrate() {
        assertEquals("2", fooBar.translate(2));
        assertEquals("Fizz", fooBar.translate(3));
        assertEquals("4", fooBar.translate(4));
        assertEquals("Buzz", fooBar.translate(5));

        assertEquals("Fizz", fooBar.translate(6));
        assertEquals("Buzz", fooBar.translate(10));
        assertEquals("FizzBuzz", fooBar.translate(15));
    }

    @Test
    public void Foobar_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            fooBar.translate(-1);
        });
    }
}
