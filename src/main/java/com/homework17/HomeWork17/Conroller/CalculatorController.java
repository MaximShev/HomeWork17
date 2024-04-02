package com.homework17.HomeWork17.Conroller;

import com.homework17.HomeWork17.Exception.ExceptionNumberNull;
import com.homework17.HomeWork17.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1,
                       @RequestParam("num2") int num2) throws ExceptionNumberNull {
        return "Ответ: " + num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1,
                        @RequestParam("num2") int num2) throws ExceptionNumberNull {
        return "Ответ: " + num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1,
                           @RequestParam("num2") int num2) throws ExceptionNumberNull {
        return "Ответ: " + num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") double num1,
                         @RequestParam("num2") double num2) throws ExceptionNumberNull {
        return "Ответ: " + num1 + " * " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}