package com.company;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This class tests methods in TemperatureConvertor class
 */
public class TemperatureConverterTest {

    @Test
    public void test55CtoF() {
        double result = TemperatureConverter.celsisusToFahrenheit(55);
        assertEquals(131,result,0);
    }

    @Test
    public void test47FtoC() {
        double result = TemperatureConverter.fahrenheitToCelsius(47);
        assertEquals(8.333,result,0.001);
    }

    @Test
    public void test100FtoC() {
        double result = TemperatureConverter.fahrenheitToCelsius(100);
        assertEquals(37.7778,result,0.0001);
    }
}