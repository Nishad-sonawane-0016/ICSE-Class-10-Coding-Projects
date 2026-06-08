/*Question 5: OverLoading5

Write a Java program using method overloading with the method name display() to perform temperature conversion:

void display(double c)
To convert temperature from Celsius to Fahrenheit using the formula:
F = (C × 9 / 5) + 32
void display(float f)
To convert temperature from Fahrenheit to Celsius using the formula:
C = (F - 32) × 5 / 9

Accept the temperature values from the user. */

import java.util.*;

public class OverLoading5 
{
    void display(double c)
    {
        // To convert Celsius to Fahrenheit
        // Formula: F = (C * 9 / 5) + 32

        System.out.println("Degree Celsius: " + c);

        double t = (c * 9 / 5) + 32;

        System.out.println("Temperature in degree Fahrenheit: " + t);
    }

    void display(float f)
    {
        // To convert Fahrenheit to Celsius
        // Formula: C = (F - 32) * 5 / 9

        System.out.println("Degree Fahrenheit: " + f);

        double t = (f - 32) * 5 / 9;

        System.out.println("Temperature in degree Celsius: " + t);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        OverLoading5 ol = new OverLoading5();

        // (a)
        System.out.println("Enter the temperature in degree Celsius:");
        double c = sc.nextDouble();
        ol.display(c);

        // (b)
        System.out.println("Enter the temperature in degree Fahrenheit:");
        float f = sc.nextFloat();
        ol.display(f);

        sc.close();
    }
}