package a_controlStructures;

import java.util.Scanner;
/*
Sample Input 2:
Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85
Sample Output 2:
Highest placement
ECE
MECH
 */
public class Placement {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] dept = new String[] {"CSE", "ECE", "MECH"};
        int[] n = new int[3];
        for(int i=0; i<3; i++)
        {
            System.out.print("Enter the no of students placed in "+dept[i]+":");
            n[i] = sc.nextInt();
        }
        if(n[0]>=0 && n[1]>=0 && n[2]>=0)
        {
            if(n[0]==n[1] && n[0]==n[2])
            {
                System.out.println("None of the department has got the highest placement");
            }
            else
            {
                System.out.println("Highest placement");
                if(n[0]>n[1] && n[0]>n[2])
                {
                    System.out.println(dept[0]);
                }
                else if(n[1]>n[0] && n[1]>n[2])
                {
                    System.out.println(dept[1]);
                }
                else if(n[2]>n[0] && n[2]>n[1])
                {
                    System.out.println(dept[2]);
                }
                else if(n[0] == n[1])
                {
                    System.out.println(dept[0]);
                    System.out.println(dept[1]);
                }
                else if(n[1] == n[2])
                {
                    System.out.println(dept[1]);
                    System.out.println(dept[2]);
                }
                else
                {
                    System.out.println(dept[0]);
                    System.out.println(dept[2]);
                }
            }
        }
        else
        {
            System.out.println("Input is Invalid");
        }
    }
}
