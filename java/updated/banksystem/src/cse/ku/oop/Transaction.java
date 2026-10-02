package cse.ku.oop;


public class Transaction {

    private BankAccount account;
    private String operation;
    private double changeAmount;
    private double currentBalance;

    public Transaction(BankAccount account, String operation, double amount, double balance) {
        this.account = account;
        this.operation = operation;
        this.changeAmount = amount;
        this.currentBalance = balance;
    }

    public BankAccount getAccount () {
        return this.account;
    }

    public String toString () {
        return "Transaction[Operation=" + operation + ", Amount=" + changeAmount + ", Balance=" + currentBalance + "]";
    }

}