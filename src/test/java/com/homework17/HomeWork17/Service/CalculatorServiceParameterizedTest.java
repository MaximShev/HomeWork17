package com.homework17.HomeWork17.Service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParameterizedTest {

    private final CalculatorService service = new CalculatorService();

    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(4, 5),
                Arguments.of(6, 7),
                Arguments.of(1, 2),
                Arguments.of(3, 4),
                Arguments.of(8, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void plus(int num1, int num2) {
        assertEquals(num1 + num2, service.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void minus(int num1, int num2) {
        assertEquals(num1 - num2, service.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void multiply(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void divide(double num1, double num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }

}