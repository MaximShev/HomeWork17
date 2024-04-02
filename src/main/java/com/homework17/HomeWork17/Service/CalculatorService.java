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
    public float divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ExceptionZeroDivide();
        } else {
            return (float) num1 / num2;
        }
    }
}




