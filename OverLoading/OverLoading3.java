import java.util.*;

public class OverLoading3 
{
    void display(int n)   
    {
        // To print the sum: 1 + 2 + 3 + ... + n

        int t = 0;

        for(int i = 1; i <= n; i++)
        {
            t = t + i;
        }

        System.out.println("Sum of 1 to " + n + " is: " + t);
    }
    
    void display(int x, int n)
    {
        // To print the sum: x^1 + x^2 + x^3 + ... + x^n

        double t = 0;
        double s = 0;

        for(int i = 1; i <= n; i++)
        {
            t = Math.pow(x, i);
            s = s + t;
        }

        System.out.println("Sum of powers is: " + s);
    }

    void display(double n)
    {
        // To print the factorial of the number

        int f = 1;

        for(int i = 1; i <= n; i++)
        {
            f = f * i;
        }

        System.out.println("Factorial of " + n + " is: " + f);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        OverLoading3 ol = new OverLoading3();

        // (a)
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        ol.display(n);

        // (b)
        System.out.println("Enter the value of x and n:");
        int x = sc.nextInt();
        int n1 = sc.nextInt();
        ol.display(x, n1);

        // (c)
        System.out.println("Enter the value of n for factorial:");
        double n2 = sc.nextDouble();
        ol.display(n2);

        sc.close();
    }
}