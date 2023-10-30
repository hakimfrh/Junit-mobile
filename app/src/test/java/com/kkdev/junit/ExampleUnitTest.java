package com.kkdev.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void testAddition() {
        MathOperation math = new MathOperation();
        int result = math.add(3, 4);
        assertEquals(7, result);
    }
}