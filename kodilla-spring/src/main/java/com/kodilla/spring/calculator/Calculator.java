package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;

    public double add(double a, double b) {
        double val = a + b;
        display.displayValue(val);
        return val;
    }
    public double sub(double a, double b) {
        double val = a - b;
        display.displayValue(val);
        return val;
    }
    public double multi(double a, double b) {
        double val = a * b;
        display.displayValue(val);
        return val;
    }
    public double div(double a, double b) {
        double val;
        try {
            val = a / b;
            display.displayValue(val);
            return val;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

}
