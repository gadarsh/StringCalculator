//Author:Adarsh Gupta
//Purpose: Tests the sum of numbers method (Add())
package com.example.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StringCalculatorTest {

@Test
    public void Add() throws Exception {
    StringCalculator stringCalculator = new StringCalculator();
    //Adding tests of  1 and then 2 numbers since
    //addition of 0 numbers is caught by try and catch block
    assertEquals(5, stringCalculator.Add("5"));
    assertEquals(7, stringCalculator.Add("2,5"));
    assertEquals(23, stringCalculator.Add("2,5,7,9"));
    assertEquals(23, stringCalculator.Add("2,5\n7,9"));

    }
}