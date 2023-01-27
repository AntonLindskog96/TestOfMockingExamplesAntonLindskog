package StringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorWithNewLinesTest {

    @Test
    public void AddWithNewLines() {
        StringCalculatorWithNewLines calculator = new StringCalculatorWithNewLines();

        int sum = calculator.addNewLines("1\n2,3");
        assertEquals(6, sum);

        sum = calculator.addNewLines("1,2\n3");
        assertEquals(6, sum);

        sum = calculator.addNewLines("1\n2\n3");
        assertEquals(6, sum);

    }

}