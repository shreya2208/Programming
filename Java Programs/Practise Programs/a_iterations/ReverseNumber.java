package a_iterations;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 987654, reverse = 0;

        //using while loop
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);

        //using for loop
        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);

        //using recursion
        System.out.println("enter the no to reverse using recursion");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverseNum(num);


    }
    public static void reverseNum(int n){
        if(n<10){
            System.out.println(n);
        }
        else {
            System.out.print(n%10);
            reverseNum(n/10);
        }
    }
}

