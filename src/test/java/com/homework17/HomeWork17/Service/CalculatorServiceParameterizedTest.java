package com.homework17.HomeWork17.Service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static com.homework17.HomeWork17.CalculatorConstant.*;

class CalculatorServiceParameterizedTest {

    private final CalculatorService service = new CalculatorService();

    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(a, b),
                Arguments.of(a, c),
                Arguments.of(a, d),
                Arguments.of(a, e),
                Arguments.of(a, f),
                Arguments.of(a, g),
                Arguments.of(f, f),
                Arguments.of(d, d)
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
    void divide(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }

}