package cse26.oop.bank3;

public class Account {
    Transaction trans;
    private String accountNumber;
    private String userName;
    private String accountType;
    private double balance;
    private int i=0;

    public Account(String accountNumber, String userName, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.accountType = accountType;
        this.balance = balance;

    }

    public void deposit(double amount) {
        this.balance += amount;
        trans = new Transaction(accountNumber,accountNumber+i++, userName, accountType, "Deposit", balance, amount, "Today", "Now");
        trans.getTransactionDetails();
    }
    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            trans = new Transaction(accountNumber,accountNumber+i++, userName, accountType, "Withdraw", balance, amount, "Today", "Now");
            trans.getTransactionDetails();
            return true;
        }
        else  {
            System.out.println(" ");
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    public String getAccountDetails(){

        return "Account number: "+ this.accountNumber + " Name: " + this.userName + "Type: " + this.accountType + " Balance: "+ this.balance;
    }
}
