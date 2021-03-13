//Author:Adarsh Gupta
//Purpose: Tests the sum of numbers method (Add())
package com.example.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StringCalculatorTest {

@Test
    public void Add() {
    //Adding tests of  1 and then 2 numbers since
    //addition of 0 numbers is caught by try and catch block
    assertEquals(5, StringCalculator.Add("5"));
    assertEquals(7, StringCalculator.Add("2,5"));
    assertEquals(17, StringCalculator.Add("2,4,6,5"));
    assertEquals(17, StringCalculator.Add("2,4\n6,5"));
    assertEquals(3, StringCalculator.Add("//;\\n1;2"));
    //Program returns 0 for negative numbers in the string
    assertEquals(1, StringCalculator.Add("1;-2"));
    //Program throws exception and lists the negative number and only adds the positive numbers
    assertEquals(1, StringCalculator.Add("//;\\n1;-2"));

    }
}