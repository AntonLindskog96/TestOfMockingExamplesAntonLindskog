package StringCalculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        String[] parts = numbers.split(",");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }
}

    class StringCalculatorWithNewLines {
        public int addNewLines(String numbers) {
            if (numbers == null || numbers.isEmpty()) {
                return 0;
            }
            String[] parts = numbers.split("[,\n]");
            int sum = 0;
            for (String part : parts) {
                sum += Integer.parseInt(part);
            }
            return sum;
        }
    }

    class StringCalculatorNegativeNumber {

    public int add(String numbers) {
        List<Integer> negativeNumbers = new ArrayList<>();
        String[] numbArray = numbers.split(",");
        int sum = 0;

        for (String number : numbArray) {
            int parsedNumber = Integer.parseInt(number);
            if (parsedNumber < 0) {
                negativeNumbers.add(parsedNumber);
            }
            sum += parsedNumber;
        }
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed: " + negativeNumbers.toString());
        }
        return sum;
    }
}

