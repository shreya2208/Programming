package a_iterations;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the digit");
        int power = sc.nextInt();
        long ans = num;

        if(power <0 || num<0)
            System.out.println("Invalid input");

        else{
            while (power!=1){
                ans = ans*num;
                power--;
            }
            System.out.println("ANSWER: "+ans);
        }
        }



}
