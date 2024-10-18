package com.firstTryMaven;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){

        int result = calculator.add(5,7);
        assertEquals(12, result);
    }
    @Test
    public void testSubtract(){
        int result = calculator.subtract(5,9);
        assertEquals(-4,result);
    }
    @Test
    public void testMultiply(){
        int result = calculator.multiply(5,5);
        assertEquals(25,result);
    }

    @Test
    public void testDivision(){
        int result = calculator.divide(9,3);
        assertEquals(3,result);
    }
    @Test
    public void testDivision_TrowsException(){
        assertThrows(ArithmeticException.class,()->calculator.divide(9,0));
    }
}
