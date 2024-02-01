package com.homework17.HomeWork17;

@org.springframework.stereotype.Service
public class CalculatorService implements CalculatorInterface {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plus(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    @Override
    public int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    @Override
    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    @Override
    public float divide(int num1, int num2) {
        float result = (float) num1 / num2;
        return result;
    }
}




