package a_controlStructures;

import java.util.Scanner;

public class AsciValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "";

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the number");
            int n = sc.nextInt();

            char c = (char)n;
            //getting the character from given asci value


            st = st+n+"-"+c+"\n";

        }
        System.out.println(st);
    }
}
