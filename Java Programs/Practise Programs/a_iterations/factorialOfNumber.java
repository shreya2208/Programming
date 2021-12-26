package a_iterations;

public class factorialOfNumber {
    public static void main(String[] args) {
        int i; int fact = 1; int num = 5;
        for ( i = 1; i <= num; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
