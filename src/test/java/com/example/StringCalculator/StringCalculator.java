package com.example.StringCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {
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

    public int addDelimiters(String numbers) {
        if (numbers.startsWith("//")) {
            int newLineIndex = numbers.indexOf("\n");
            String delimiter = numbers.substring(2, newLineIndex);
            numbers = numbers.substring(newLineIndex + 1);
            numbers = numbers.replace(delimiter, ",");
        }
        String[] numberArray = numbers.split(",");
        int sum = 0;
        for (String number : numberArray) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    public int addNegative(String numbers) {
        List<Integer> negativeNumbers = new ArrayList<>();
        String[] numbArray = numbers.split(",");
        int sum = 0;

        for (String number : numbArray) {
            int parsedNumber = Integer.parseInt(number);
            if (parsedNumber < 0) {
                negativeNumbers.add(parsedNumber);
            } else if (parsedNumber > 1000) {
                continue;
            }
            sum += parsedNumber;
        }
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed:");
        }
        return sum;
    }

    public static int OneDelimiter(String numbers) {
            if (numbers.isEmpty()) {
                return 0;
            }
            String delimiter = ",|\n";
            String[] numberArray;

            if (numbers.startsWith("//")) {
                int delimiterIndex = numbers.indexOf("\n");
                delimiter = numbers.substring(2, delimiterIndex);
                numbers = numbers.substring(delimiterIndex + 1);
            }
            if (delimiter.length() > 1){
                delimiter = delimiter.replace("[", "").replace("]", "");
                delimiter = "[" + delimiter + "]";
                numberArray = numbers.split(delimiter);

            }   else {
                numberArray = numbers.split(delimiter);
            }


            int sum = 0;

            for (String number : numberArray) {
                if (number.isEmpty())
                    continue;
                sum += Integer.parseInt(number);
            }
            return sum;
        }

    }
