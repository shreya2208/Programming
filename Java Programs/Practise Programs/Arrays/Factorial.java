package Arrays;

import java.util.*;

public class Factorial
{
    public int findFact(int n)
    {
        int fact =1;
        for(int i=1; i<=n; ++i)
            fact *= i;
        return fact;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();

        Factorial fc = new Factorial();
        int sum = 0;
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++)
        {
            int no = sc.nextInt();
            if(no>0 && no<10)
                sum += fc.findFact(no);
        }

        if(sum == 0)
            System.out.println("No positive and single digit numbers found in an array");
        else
            System.out.println(sum);
    }
}

