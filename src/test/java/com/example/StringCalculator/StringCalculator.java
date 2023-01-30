package com.example.StringCalculator;

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


    }
