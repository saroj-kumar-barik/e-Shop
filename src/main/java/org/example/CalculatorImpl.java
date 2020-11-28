package org.example;

public class CalculatorImpl implements ICalculator {
    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }

    @Override
    public int mul(int x, int y) {
        return x * y;
    }

    @Override
    public int div(int x, int y) {
        if (y == 0)
            return y;
        return x / y;
    }
}
