package cse26.oop.bank2;

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
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setTime(String time) {
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
