package com.energizeglobal.internship;

public class Start {

    public static void main(String[] args) {
        Calculator basicCalc = new BasicCalcImpl();
        Calculator advancedCalc = new AdvancedCalcImpl();

        System.out.println("basic: 1 + 5 + 4 + 5 + 10 =" + basicCalc.sum(1, 5, 4, 5, 10));
        System.out.println("advanced: 1 + 5 + 4 + 5 + 10 =" + advancedCalc.sum(1, 5, 4, 5, 10));

        System.out.println("basic: 15.5 + 1 =" + basicCalc.sum(15.5, 1));
        System.out.println("advanced: 15.5 + 1 =" + advancedCalc.sum(15.5, 1));

        System.out.println("basic: 15-1-0-1 =" + basicCalc.subtraction(15, 1, 0, 1));
        System.out.println("advanced: 15-1-0-1 =" + advancedCalc.subtraction(15, 1, 0, 1));

        System.out.println("basic: 99.99 - 1.1 =" + basicCalc.subtraction(99.99, 1));
        System.out.println("advanced: 99.99 - 1.1 =" + advancedCalc.subtraction(99.99, 1.1));

        System.out.println("basic: 5*5*5 =" + basicCalc.multiply(5,5,5));
        System.out.println("advanced: 5*5*5 =" + advancedCalc.multiply(5,5,5));

        System.out.println("basic: 5.5 * 5 =" + basicCalc.multiply(5.5,5));
        System.out.println("advanced: 5.5 * 5 =" + advancedCalc.multiply(5.5, 5));

        System.out.println("basic: 5.5 / 5 =" + basicCalc.divide(5.5,5));
        System.out.println("advanced: 5.5 / 5 =" + advancedCalc.divide(5.5, 5));

        System.out.println("basic: 5000/10 =" + basicCalc.divide(5000,10));
        System.out.println("advanced: 5000/10 =" + advancedCalc.divide(5000, 10));

        System.out.println("advanced: 99% of 99 =" + advancedCalc.computePercent(99, 99));
        System.out.println("advanced: 3√81 =" + advancedCalc.computeSqrt(3, 81));
        System.out.println("advanced: 2√81 =" + advancedCalc.computeSqrt( 81));
        System.out.println("advanced: 5^2 =" + advancedCalc.computeSquare(5));
        try {
            System.out.println("basic: 99% of 99 =" + basicCalc.computePercent(99, 99));
        } catch (UnsupportedOperationException ex) {
            System.out.println("Can't compute percent in BasicCalc.");
        }

    }
}
