package com.kkdev.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void testAddition() {
        MathOperation math = new MathOperation(); //mencontruct MathOperation
        int result = math.add(3, 4); //menggunkanan method math.add untuk menambah 3 dan 4
        assertEquals(7, result); //apabila result yang dihasilkan sama dengan expected result yaitu 7. maka hasil akan pass
    }
}