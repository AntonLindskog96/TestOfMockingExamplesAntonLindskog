package com.example.StringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void EmptyStringReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }
    @Test
    public void AddTwoNumbersToReturnTheSumOfTheNumbers (){
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        assertEquals(3,result) ;
    }






}