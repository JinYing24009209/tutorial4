package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSubtraction {
    Calc a = new Calc();
    @Test
    public void subtraction(){
        assertEquals(4, a.add(2,2));
    }
}
