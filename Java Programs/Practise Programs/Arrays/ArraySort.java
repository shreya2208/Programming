package Arrays;

import java.util.*;
public class ArraySort
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        sc.nextLine();
        
        if(n<=0)
            System.out.println("Array size should be greater than 0");
        else
        {
            int a[] = new int[n];
            System.out.println("Enter the elements:");
            for(int i=0; i<a.length; i++)
                a[i] = sc.nextInt();
            
            int mid = (int) Math.ceil((float) a.length / 2);
            int temp;
            for(int i=0; i<mid; i++)
                for(int j=i+1; j<mid; j++)
                    if(a[i] > a[j])
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
            
            for(int i=mid; i<a.length; i++)
                for(int j=i+1; j<a.length; j++)
                    if(a[i] < a[j])
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
            for(int i=0; i<a.length; i++)
                System.out.println(a[i]);
        }
    }
}