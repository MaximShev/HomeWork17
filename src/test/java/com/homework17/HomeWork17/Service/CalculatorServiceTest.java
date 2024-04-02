package com.homework17.HomeWork17.Service;

import com.homework17.HomeWork17.Exception.ExceptionZeroDivide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.homework17.HomeWork17.CalculatorConstant.*;

class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void plus_1() {
        assertEquals(a + b, service.plus(a, b));
    }

    @Test
    void plus_2() {
        assertEquals(a + d, service.plus(a, d));
    }

    @Test
    void minus_1() {
        assertEquals(a - d, service.minus(a, d));
    }

    @Test
    void minus_2() {
        assertEquals(a - c, service.minus(a, c));
    }

    @Test
    void multiply_1() {
        assertEquals(a * g, service.multiply(a, g));
    }

    @Test
    void multiply_2() {
        assertEquals(a * a, service.multiply(a, a));
    }

    @Test
    void divide_1() {
        assertEquals(a / f, service.divide(a, f));
    }

    @Test
    void divide_2() {
        assertEquals(a / b, service.divide(a, b));
    }

    @Test
    void throwExceptionZeroDivide() {
        assertThrows(ExceptionZeroDivide.class, () -> service.divide(b, a));
    }
}