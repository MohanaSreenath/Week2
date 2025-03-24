package level2;

import java.sql.SQLOutput;
import java.util.Scanner;

class BankAccount {
    String accountHolder;
    String accountNumber;
    Double balance;
    BankAccount(String accountHolder, String accountNumber, Double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayBalance(double amount) {
        balance = amount;
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

}
public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      BankAccount bankAccount = new BankAccount(scanner.next(), scanner.next(), scanner.nextDouble());
        System.out.println("Account Holder: " + bankAccount.accountHolder);
        System.out.println("Account Number: " + bankAccount.accountNumber);
        System.out.println("Balance: " + bankAccount.balance);
        System.out.println("Enter the amount to deposit");
        bankAccount.deposit(scanner.nextDouble());
        System.out.println("Enter the amount to withdraw");
        bankAccount.withdraw(scanner.nextDouble());
        System.out.println("Balance: " + bankAccount.balance);
        bankAccount.displayBalance(bankAccount.balance);
    }
}