import java.util.*;

public class OverLoading4
{
    void display(int n)
    {
        /*
        1
        12
        123
        1234
        for n = 4
        */

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void display(int n, int m)
    {
        // To print a rectangle of stars with n rows and m columns

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= m; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        OverLoading4 ol = new OverLoading4();

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        ol.display(n);

        System.out.println("Enter the value of n and m:");
        int n1 = sc.nextInt();
        int m = sc.nextInt();
        ol.display(n1, m);

        sc.close();
    }
}