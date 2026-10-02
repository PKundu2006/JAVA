package cse.ku.oop;

public class SavingAccount extends BankAccount{
    private double interestRate =0.0;
    public SavingAccount(String number, String holderName, double balance, double interest){
        super(number, holderName,balance);
        interestRate = interest;
    }

    public void addProfit(){
        double profit = (this.interestRate*this.balance)/100;
        super.deposit(profit);
    }
    public String toString() {
        return "SavingAccount [Number=" + accountNumber + ", Name=" + holderName + ", Balance=" + balance + "Interest "+ interestRate+ "]";
    }

}
