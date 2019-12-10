package com.energizeglobal.internship;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFirstMessage());
        Scanner userInputScanner = new Scanner(System.in);
        String userTypedWord = userInputScanner.nextLine();
        while (!"exit".equals(userTypedWord)) {
            switch (userTypedWord) {
                case "+": {
                    doSum(userInputScanner);
                    break;
                }
                case "-": {
                    doSubtrack(userInputScanner);
                    break;
                }
                case "*": {
                    doMultiply(userInputScanner);
                    break;
                }
                case "/": {
                    doDivide(userInputScanner);
                    break;
                }
                case "^": {
                    doSquare(userInputScanner);
                    break;
                }
                case "%": {
                    doPercent(userInputScanner);
                    break;
                }
                case "sqrt": {
                    doSqrt(userInputScanner);
                    break;
                }
            }
        }
    }

    private static void doSum(Scanner userInputScanner) {
        System.out.println("You choose Sum operation. Enter Arguments");
        String userTypedText = userInputScanner.next();
        while (!"exit".equals(userTypedText) || !"=".equals(userTypedText)) {
            if (parseTypedTextToNumberFormat(userTypedText) instanceof Double) {

            }
        }
    }

    private static Number parseTypedTextToNumberFormat(String text) {
        if (text.contains(".")) {
            try {
                return Double.parseDouble(text);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter correct argument.");
            }
        } else {
            try {
                return Long.parseLong(text);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter correct argument.");
            }
        }
        throw new IllegalArgumentException()
    }


    private static String getFirstMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi\n This is a simple calculator.")
                .append("The application provides followed functionality.")
                .append("Sum: + \nSubtract: - \nMultiply: * \nDivide: / \nPercent: % \nSquare: ^ \n Square root: sqrt")
                .append("To call the operation, first enter the appropriate character or word.")
                .append("To get a final result of operation, type = and press Enter.")
                .append("To close the application, type 'exit' and press Enter,");
        return stringBuilder.toString();
    }
}