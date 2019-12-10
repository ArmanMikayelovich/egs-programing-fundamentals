package com.energizeglobal.internship;

public class AdvancedCalcImpl extends BasicCalcImpl {

    @Override
    public float computePercent(double number, float percent) {
        return (float) (number / 100 * percent);
    }

    @Override
    public double computeSqrt(double number) {
        return Math.sqrt(number);
    }

    @Override
    public double computeSquare(double number) {
        return number * number;
    }

    @Override
    public double computeSqrt(int sqrt, double number) {
        for (int x = 1; x < sqrt; x++) {
            number = computeSqrt(number);
        }
        return number;
    }

}
