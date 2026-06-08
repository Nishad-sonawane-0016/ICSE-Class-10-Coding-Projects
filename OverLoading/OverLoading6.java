/*Question 6: OverLoading6

Write a Java program using method overloading with the method name display() to perform the following tasks:

void display(int x, int n)
To print the sum of the series:
x¹ + x² + x³ + ... + xⁿ
void display(int n)
To print the first n terms of the series:
0, 7, 26, 63, ...

The formula is:

n³ - 1
void display(double n)
To print the sum of the series:
1/2 + 1/3 + 1/4 + ... + 1/10

Accept the required values from the user wherever needed. */

import java.util.*;

public class OverLoading6 
{
    void display(int x, int n)
    {
        // To print the sum: x¹ + x² + x³ + ... + xⁿ

        double s = 0;
        double z = 0;

        for(int i = 1; i <= n; i++)
        {
            z = Math.pow(x, i);
            s = s + z;
        }

        System.out.println("Sum of x¹ + x² + x³ + ... + xⁿ = " + s);
    }

    void display(int n)
    {
        // To print the first n terms of this series: 0, 7, 26, 63, ...  (n³ - 1)

        int z = 0;

        for(int i = 1; i <= n; i++)
        {
            z = (i * i * i) - 1;
            System.out.print(z + ", ");
        }

        System.out.println();
    }

    void display(double n)
    {
        // To print the sum: 1/2 + 1/3 + 1/4 + ... + 1/10

        double z = 0;

        for(int i = 2; i <= 10; i++)
        {
            z = z + (1.0 / i);
        }

        System.out.println("The sum of 1/2 + 1/3 + 1/4 + ... + 1/10 = " + z);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        OverLoading6 ol = new OverLoading6();

        // (a)
        System.out.println("Enter the value of Base(x):");
        int x = sc.nextInt();

        System.out.println("Enter the value of Index(n):");
        int n = sc.nextInt();

        ol.display(x, n);

        // (b)
        System.out.println("Enter the number of terms:");
        int n1 = sc.nextInt();

        ol.display(n1);

        // (c)
        ol.display(10.0);

        sc.close();
    }    
}