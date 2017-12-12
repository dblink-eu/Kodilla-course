package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a=a;
        this.b=b;
    }

    public int add(int a, int b) {
        int resultAdd = a+b;
        return resultAdd;
    }

    public int subtract(int a, int b) {
        int resultSubtract = a-b;
        return resultSubtract;
    }
}
