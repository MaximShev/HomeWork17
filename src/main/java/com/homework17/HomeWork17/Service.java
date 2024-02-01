package com.homework17.HomeWork17;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Service
public class Service implements Interface {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return "Ответ: " + num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return "Ответ: " + num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return "Ответ: " + num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Деление на 0 невозможно, измените второе число";
        } else {
            float result = (float) num1 / num2;
            return "Ответ: " + num1 + " / " + num2 + " = " + result;
        }
    }
}




