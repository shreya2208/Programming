package a_iterations;

import java.util.Scanner;

public class Palindrome {
    //logic: reverse the number or string and compare if reversed number is equal to original number

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("enter a number");
        int n = ip.nextInt();
        int rev = 0;

        int temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == n) {
            System.out.println("Is a palindrome");
        }
        else
        System.out.println("Not a palindrome");
    }
}
