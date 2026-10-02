package cse.ku.oop;

public class BankAccount {
    protected String accountNumber;
    protected String holderName;
    protected double balance;


    public BankAccount(String number, String holderName, double balance) {
        this.accountNumber = number;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }


    public String getAccountNumber() {

        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String toString() {
        return "BankAccount[Number=" + accountNumber + ", Name=" + holderName + ", Balance=" + balance + "]";
    }

}