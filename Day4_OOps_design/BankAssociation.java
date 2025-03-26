package Week2.Day4_OOps_design;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public Account openAccount(Customer customer, double balance) {
        Account account = new Account(customer, this, balance);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }

    public String toString() {
        return name;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalances() {
        for (Account account : accounts) {
            System.out.println("Account Balance: " + account.getBalance());
        }
    }

    public String toString() {
        return name;
    }
}

class Account {
    private Customer customer;
    private Bank bank;
    private double balance;

    public Account(Customer customer, Bank bank, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.openAccount(customer1, 5000);
        bank.openAccount(customer1, 15000);
        bank.openAccount(customer2, 20000);

        System.out.println("Bank: " + bank);
        System.out.println("Customer 1: " + customer1);
        customer1.viewBalances();
        System.out.println("Customer 2: " + customer2);
        customer2.viewBalances();
    }
}
