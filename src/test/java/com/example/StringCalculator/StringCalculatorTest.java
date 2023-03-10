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
    public void AddTwoNumbersToReturnTheSumOfTheNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        assertEquals(3, result);
    }

    @Test
    public void TestAddMultipleNumbersToCheckIfEqualsToSum() {
        StringCalculator sc = new StringCalculator();
        int result = sc.add("1,2,3,4");
        assertEquals(10, result);
    }

    @Test
    public void TestIfNumbersIsAddedWhenNewLineIsPresented() {
        StringCalculator calculatorLines = new StringCalculator();

        int sum = calculatorLines.addNewLines("1\n2,3");
        assertEquals(6, sum);

        sum = calculatorLines.addNewLines("1,2\n3");
        assertEquals(6, sum);

        sum = calculatorLines.addNewLines("1\n2\n3");
        assertEquals(6, sum);


    }

    @Test
    public void CustomDelimiterTestIfEqualsTheSum() {
        StringCalculator calculator = new StringCalculator();
        String input = "//;\n1;2";
        int expected = 3;
        int result = calculator.addDelimiters(input);
        assertEquals(expected, result);
    }

    @Test
    public void AddOneNegativeToCatchIfItsAllowed() {
        StringCalculator calculator = new StringCalculator();
        try {
            calculator.addNegative("1,-2,3");
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("negatives not allowed:", e.getMessage());
        }

    }

    @Test()
    public void AddBigNumberOver1000ToCheckIfItsIgnored() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(2, calculator.addNegative("2,1001"));
    }

    @Test
    public void TestIfDelimitersIsIgnoredAndNumbersIsAddedUp() {
        String number = "//[***]\n1***2***3";
        assertEquals(6, StringCalculator.OneDelimiter(number));
    }

    @Test
    public void TestIfTwoDelimitersWithDifferentCharIisIgnoredAndNumbersIsAdded() {
        String number = "//[*][%]\n1*2%3";
        int numbercalc = StringCalculator.OneDelimiter(number);
        assertEquals(6, numbercalc);
    }

    @Test
    public void AddNumbersWithMultipleDelimitersWithLengthLongerThanChar() {
        String number = "//[%*][*&][!%]\n1*2%3";
        int numbercalc = StringCalculator.OneDelimiter(number);
        assertEquals(6, numbercalc);


    }
}