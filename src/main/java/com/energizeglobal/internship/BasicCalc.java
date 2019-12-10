package com.energizeglobal.internship;

public class BasicCalc implements Calculator {

    protected void isArgumentsEnough(long[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("must be 2 or more arguments");
        }
    }

    @Override
    public long sum(long... numbers) {
        isArgumentsEnough(numbers);
        long total = 0;
        for (long num : numbers) {
            total += num;
        }
        return total;
    }

    @Override
    public <T extends Number> Double sum(Double x, T y) {
        return x + y.doubleValue();
    }

    @Override
    public double subtraction(long... numbers) {
        isArgumentsEnough(numbers);
        double total = 0;
        for (double num : numbers) {
            total -= num;
        }
        return total;
    }

    @Override
    public <T extends Number> Double subtraction(Double x, T y) {
        if (y == null) {
            throw new IllegalArgumentException();
        }
        return x - y.doubleValue();
    }

    @Override
    public long divide(long x, long y) {
        if (y == 0) throw new UnsupportedOperationException();
        return x / y;
    }

    @Override
    public <T extends Number> double divide(Double x, T y) {
        if (y == null || y.doubleValue() == 0) {
            throw new UnsupportedOperationException();
        }
        return x / y.doubleValue();
    }

    @Override
    public double multiply(long... numbers) {
        isArgumentsEnough(numbers);
        double total = 0;
        for (double number : numbers) {
            total *= number;
        }
        return total;
    }

    @Override
    public <T extends Number> Double multiply(Double x, T y) {
        if (y == null) {
            throw new IllegalArgumentException();
        }
        return x * y.doubleValue();
    }

    @Override
    public float computePercent(double number, float percent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double computeSqrt(double number) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double computeSquare(double number) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double computeSqrt(int sqrt, double number) {
        throw new UnsupportedOperationException();
    }
}
