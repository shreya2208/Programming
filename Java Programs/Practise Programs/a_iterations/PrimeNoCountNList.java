package a_iterations;

/*
Sample Input 1
Enter starting range: 67
Enter ending range: 90

Sample Output 1: 6
 */

public class PrimeNoCountNList {
    public static void main(String[] args) {

    int start = 6;
    int end = 72;
    int count = 0; int flag = 0; int m;
    // count should be 3 : 67, 69, 71
        for (int p = start; p < end; p++) {

            m = p/2;
            for (int i = 2; i <m; i++) {
                if(p%2 == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(p+" ");
                count++;
            }
            flag = 0;
        }
        System.out.println("\n"+"Count is: "+count);
        }
}

