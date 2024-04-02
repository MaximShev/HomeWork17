package com.homework17.HomeWork17.Service;

import com.homework17.HomeWork17.Exception.ExceptionZeroDivide;

@org.springframework.stereotype.Service
public class CalculatorService implements CalculatorInterface {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ExceptionZeroDivide();
        } else {
            return (double) num1 / num2;
        }
    }
}




