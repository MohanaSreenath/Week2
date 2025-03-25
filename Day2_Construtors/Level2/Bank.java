package Level2;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountNumber = "123456789";
        savingsAccount.accountHolder = "John Doe";
        savingsAccount.setBalance(5000.0);

        savingsAccount.displayAccountDetails();
        System.out.println("Balance: " + savingsAccount.getBalance());
    }
}