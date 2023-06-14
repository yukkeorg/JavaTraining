package com.s_giken.traning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FooBarTests {
    private final App app = new App();

    @Test
    public void correct_FooBar() {
        assertEquals("1", app.fooBar(1));
        assertEquals("11", app.fooBar(11));

        assertEquals("Foo", app.fooBar(3));
        assertEquals("Bar", app.fooBar(5));
        assertEquals("FooBar", app.fooBar(15));

        assertEquals("Foo", app.fooBar(6));
        assertEquals("Bar", app.fooBar(10));
        assertEquals("FooBar", app.fooBar(30));
    }
}
