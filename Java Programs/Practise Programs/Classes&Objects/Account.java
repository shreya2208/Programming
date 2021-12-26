package accenture;

public class Account {
    private int accountId;
    private String accountType;
    private int balance;

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public boolean withdraw(int withdrawAmount) {
        if (getBalance() < withdrawAmount) {
            System.out.println("Sorry!!! No enough balance");
            return false;
        } else {
            int updatedBalance = getBalance() - withdrawAmount;
            setBalance(updatedBalance);
            System.out.println("Balance amount after withdraw: " + updatedBalance);
            return true;
        }
    }
}