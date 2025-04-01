abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

interface Loanable {
    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}

class LoanAccount extends SavingsAccount implements Loanable {
    private double loanAmount;

    public LoanAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void applyForLoan(double amount) {
        loanAmount = amount;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= loanAmount * 0.2;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Alice", 5000);
        BankAccount current = new CurrentAccount("CA456", "Bob", 10000);

        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Current Account Interest: " + current.calculateInterest());

        LoanAccount loanAccount = new LoanAccount("LA789", "Charlie", 20000);
        loanAccount.applyForLoan(5000);
        System.out.println("Loan Eligibility: " + loanAccount.calculateLoanEligibility());
    }
}