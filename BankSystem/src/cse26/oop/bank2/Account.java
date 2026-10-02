package cse26.oop.bank2;

public class Account {
    Transaction trans = new Transaction();
    private String accountnumber;
    private String userName;
    private String accounttype;
    private double balance;
    private int i =0;

    public void setNumber(String number)
    {
        this.accountnumber = number;
    }
    public String getNumber(){
        return this.accountnumber;
    }
    public void setUserName(String name){
        this.userName = name;
    }
    public String getUserName(){
        return this.userName;
     }
    public void setType(String type){
        this.accounttype = type;
     }
    public  String getType(){
        return this.accounttype;
     }
    public void setBalance(double balance){
        this.balance = balance;
     }

    public void deposit(double amount){
        this.balance = this.balance + amount;
        trans.setAmount(amount);
        trans.setType("Deposit");
        trans.setUserName(userName);
        trans.setAccountNumber(accountnumber);
        trans.setBalance(balance);
        trans.setAccountType(accounttype);
        trans.setTransactionId(accountnumber + i++);
        trans.setDate("Today");
        trans.setTime("Just Now");
        trans.getTransactionDetails();
     }

    public boolean withdraw(double amount){
        if(this.balance>=amount) {
            this.balance = this.balance - amount;
            trans.setAmount(amount);
            trans.setType("Withdraw");
            trans.setUserName(userName);
            trans.setAccountNumber(accountnumber);
            trans.setBalance(balance);
            trans.setAccountType(accounttype);
            trans.setTransactionId(accountnumber + i++);
            trans.setDate("Today");
            trans.setTime("Just Now");
            trans.getTransactionDetails();
            return true;
        }
        else{
            System.out.println(" ");
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    public String getAccountDetails(){

        return "Account number: "+ this.accountnumber + " Name: " + this.userName + "Type: " + this.accounttype + " Balance: "+ this.balance;
    }
}
