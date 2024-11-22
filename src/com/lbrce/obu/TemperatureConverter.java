package com.lbrce.obu;
import java.util.Scanner;

public class TemperatureConverter {
    
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display the menu
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Select the conversion (1-6): ");
        
        int choice = scanner.nextInt();
        System.out.print("Enter the temperature value: ");
        double value = scanner.nextDouble();
        
        // Perform the selected conversion
        double result = 0;
        switch (choice) {
            case 1:
                result = celsiusToFahrenheit(value);
                System.out.println(value + " Celsius is " + result + " Fahrenheit");
                break;
            case 2:
                result = celsiusToKelvin(value);
                System.out.println(value + " Celsius is " + result + " Kelvin");
                break;
            case 3:
                result = fahrenheitToCelsius(value);
                System.out.println(value + " Fahrenheit is " + result + " Celsius");
                break;
            case 4:
                result = fahrenheitToKelvin(value);
                System.out.println(value + " Fahrenheit is " + result + " Kelvin");
                break;
            case 5:
                result = kelvinToCelsius(value);
                System.out.println(value + " Kelvin is " + result + " Celsius");
                break;
            case 6:
                result = kelvinToFahrenheit(value);
                System.out.println(value + " Kelvin is " + result + " Fahrenheit");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        
        scanner.close();
    }
}

