package cse.ku.oop;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String number, String holdername){
      accountNumber = number;
      holderName = holdername;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited..");
    }

    public boolean withdraw(double amount){

        return false;
    }

    public double getBalance()
    {
        return balance;
    }



}
