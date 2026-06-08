import java.util.*;

public class OverLoading1 
{
    void display(double p, double r, double t)
    {
        // To calculate simple interest

        System.out.println("Principal: " + p);
        System.out.println("Rate of Interest: " + r);
        System.out.println("Time in years: " + t);

        double SI = (p * r * t) / 100;

        System.out.println("Simple Interest: " + SI);
    }

    void display(double p, double SI)
    {
        // To calculate amount

        System.out.println("Principal: " + p);
        System.out.println("Simple Interest: " + SI);

        double A = p + SI;

        System.out.println("Amount: " + A);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        OverLoading1 ol = new OverLoading1();

        // (a)
        System.out.println("Enter the value of Principal:");
        double p = sc.nextDouble();

        System.out.println("Enter the value of Rate of Interest:");
        double r = sc.nextDouble();

        System.out.println("Enter the value of Time in years:");
        double t = sc.nextDouble();

        ol.display(p, r, t);

        // (b)
        System.out.println("Enter the value of Principal:");
        double a = sc.nextDouble();

        System.out.println("Enter the value of Simple Interest:");
        double SI = sc.nextDouble();

        ol.display(a, SI);

        sc.close();
    }
}