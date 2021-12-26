package accenture;

import java.util.Scanner;

public class AccountDetails {

    public static Account getAccountDetails() {
        Scanner sc = new Scanner(System.in);
        Account ob = new Account();
        System.out.println("Enter Account Id");
        ob.setAccountId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter account type");
        ob.setAccountType(sc.nextLine());

        int balance;
        do{
            System.out.println("Enter balance");
            balance = sc.nextInt();
            if(balance<=0){
                System.out.println("Balance should be positive");
            }
            ob.setBalance(balance);
        }while (balance<=0);

        return ob;
    }

    public static int getWithdrawAmount() {
        Scanner sc1 = new Scanner(System.in);
        int withdrawAmount;
        do
        {
            System.out.println("Enter amount to be withdrawn:");
            withdrawAmount = sc1.nextInt();
            if(withdrawAmount <= 0)
                System.out.println("Amount should be positive");
        }while(withdrawAmount <= 0);
        return withdrawAmount;
    }


    public static void main(String[] args) {

        AccountDetails acc = new AccountDetails();
        Account obj2 = new Account();
        obj2 = getAccountDetails();
        int w = getWithdrawAmount();
        obj2.withdraw(w);
    }
}
