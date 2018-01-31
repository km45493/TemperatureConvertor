package com.company;

/**
 * The TemperatureConvertor class converts temperature from Celsius to Farhenheit and viceversa
 */
public class TemperatureConverter {

    /**
     * This method converts the temperature from Celsius to Farhenheit.
     * @param celsius Temperature in celsius
     * @return  Temperature in Farhenheit
     */
    public static double celsisusToFahrenheit(double celsius) {

        double fahrenheit = (9.0/5.0)*celsius + 32;
        return fahrenheit;
    }

    /**
     *  This method converts the temperature from Farhenheit to Celsius
     * @param fahrenheit Temperature in Farhenheit
     * @return  Temperature in celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit){

        double celsius = (5.0/9.0)*(fahrenheit - 32);
        return celsius;

    }
}
