package com.energizeglobal.internship;

public interface Calculator {
    long sum(long... numbers);

    <T extends Number> Double sum(Double x, T y);

    double subtraction(long... numbers);

    <T extends Number> Double subtraction(Double x, T y);

    long divide(long x, long y);

    <T extends Number> double divide(Double x, T y);

    double multiply(long... numbers);

    <T extends Number> Double multiply(Double x, T y);

    float computePercent(double number, float percent);

    double computeSqrt(double number);

    double computeSquare(double number);

    double computeSqrt(int sqrt, double number);

}
