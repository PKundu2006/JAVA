package cse26.oop.bank3;

import java.time.LocalDate;

public class Transaction {
    private String accountNumber;
    private String transactionId;
    private String userName;
    private String accountType;
    private String type;
    private double balance;
    private String date;
    private double amount;
    private String time;

    public Transaction(String accountNumber, String transactionId, String userName, String accountType, String type, double balance, double amount, String date, String time) {
        this.accountNumber = accountNumber;
        this.transactionId = transactionId;
        this.userName = userName;
        this.accountType = accountType;
        this.type = type;
        this.balance = balance;
        this.date = date;
        this.amount = amount;
        this.time = time;
    }

    public void getTransactionDetails() {
        System.out.println(" ");
        System.out.println(type + ": " + amount + " Taka    (" + time + ", " + date + ")" );
        System.out.println("Remaining Balance : " + balance);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("User Name: " + userName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Transaction ID: " + transactionId);


    }

}
