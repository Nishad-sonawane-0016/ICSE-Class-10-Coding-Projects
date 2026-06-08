import java.util.Scanner;

public class OverLoading2 
{
    void display(int n)
    {
        // To check whether the number is even or odd

        if(n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    void display(int a, int b)
    {
        // To print the greater number

        if(a > b)
            System.out.println(a + " is greater than " + b);
        else if(b > a)
            System.out.println(b + " is greater than " + a);
        else
            System.out.println("Both numbers are equal");
    }

    void display(int a, int b, int c)
    {
        // To print the greatest number

        if(a > b && a > c)
            System.out.println("Greatest number = " + a);
        else if(b > a && b > c)
            System.out.println("Greatest number = " + b);
        else if(c > a && c > b)
            System.out.println("Greatest number = " + c);
        else
            System.out.println("Two or more numbers are equal and greatest");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        OverLoading2 ol = new OverLoading2();

        // (a)
        System.out.println("Enter the number to check whether the number is even or odd:");
        int n = sc.nextInt();
        ol.display(n);

        // (b)
        System.out.println("Enter two numbers to check which one is greater:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        ol.display(n1, n2);

        // (c)
        System.out.println("Enter 3 numbers to check which one is greater:");
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        ol.display(n3, n4, n5);

        sc.close();
    }
}