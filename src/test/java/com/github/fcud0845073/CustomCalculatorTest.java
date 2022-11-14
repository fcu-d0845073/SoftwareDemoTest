package com.github.fcud0845073;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomCalculatorTest {
    CustomCalculator customCalculator;

    @BeforeEach
    void setUp() {
        customCalculator = new CustomCalculator();
    }

    @Test
    void add() {
        assertEquals(3, customCalculator.add(1, 2));
    }
}
