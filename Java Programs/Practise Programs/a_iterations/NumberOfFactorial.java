package a_iterations;

import java.util.Scanner;

public class NumberOfFactorial {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner ip = new Scanner(System.in);
        int p = ip.nextInt();
        int count = 0;

        for (int i = 1; i < p; i++) {
            if (p % i == 0) {
                p /= i;
                count++;
            }
        }
        if (p == 1)
            System.out.println(count);
        System.out.println("this is not number of any factorial");
    }
}
