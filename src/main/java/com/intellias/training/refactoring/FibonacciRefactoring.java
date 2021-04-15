package com.intellias.training.refactoring;

import java.math.BigInteger;

public class FibonacciRefactoring {

    public static BigInteger calculateFibonacciN(int n) {
        return innerFibonacci(n, BigInteger.ZERO, BigInteger.ONE);
    }

    private static BigInteger innerFibonacci(int n, BigInteger preLast, BigInteger last) {
        if (n == 1) {
            return preLast;
        } else if (n == 2) {
            return last;
        } else {
            return innerFibonacci(n - 1, last, last.add(preLast));
        }
    }

}
