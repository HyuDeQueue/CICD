package org.example;

public class Calculator {

    public int add (int a, int b) {
        int result;
        try {
            result = a + b;
        } catch (OutOfMemoryError oome) {
            throw new OutOfMemoryError(oome.toString());
        }

        return result;
    }

    public int minus(int a, int b) {
        int result;
        try {
            result = a - b;
        } catch (OutOfMemoryError oome) {
            throw new OutOfMemoryError(oome.toString());
        }

        return result;
    }

    public int multiple(int a, int b) {
        int result;
        try {
            result = a * b;
        } catch (OutOfMemoryError oome) {
            throw new OutOfMemoryError(oome.toString());
        }

        return result;
    }

    public double divide(int a, int b) {
        double result = 0;
        if ((double) b == 0) throw new IllegalArgumentException("Divide by zero");
        try {
            result = (double) a / (double) b;
        } catch (OutOfMemoryError oome) {
            throw new OutOfMemoryError(oome.toString());
        }
        return result;
    }
}
