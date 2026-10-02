package cse.ku.oop;

public class MainSystem {

    public static void main(String args[]){
        BankSystem banksys = new BankSystem();
        BankAccount baccount1 = new BankAccount("0011", "sukorno");
        banksys.createAccount(baccount1);
        banksys.performtransaction("0011", 1000.0);
        banksys.statement("0011");
//        banksys.deleteAccount("1");

    }
}
