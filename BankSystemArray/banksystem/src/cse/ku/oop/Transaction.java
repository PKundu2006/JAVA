package cse.ku.oop;

public class Transaction {
    private String tid;
    private double amount;
    private String accountNumber;
    private String operation;

    public Transaction(String tid, double amount, String accountNumber, String operation) {
        this.tid = tid;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.operation = operation;
    }

    public String transactionDetails(){
        return tid + " " + operation + ": " + amount + " " + "\nAccount Number: " + accountNumber + " ";
    }
    public String toString() {
        return tid + " " + operation + ": " + amount + " " + "\nAccount Number: " + accountNumber + " ";
    }
}
