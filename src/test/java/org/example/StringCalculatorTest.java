package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void add() {
        var sc = new StringCalculator();
        assertEquals(0, sc.add(""));
        assertEquals(1, sc.add("1"));
        assertEquals(3, sc.add("1,2"));
        assertEquals(6, sc.add("1\n2,3"));
    }
}