package cse.ku.oop;

public class MainSystem {

    public static void main(String args[]){
        BankSystem banksys = new BankSystem(10); //Maximum 10 accounts
        banksys.addAccount("00011", "Jhon", 100);
        banksys.addAccount("00022", "Bob", 250);
        banksys.addAccount("00033", "Dob", 250);
        banksys.addAccount("00044", "Cob", 250);
        System.out.println("Number of customers in the bank: "+ banksys.getNumberOfCustomers());
        BankAccount baccnt = banksys.searchAccount("00022");
        if(baccnt==null){
            System.out.println("\nCustomer not found");
        }
        else{
            System.out.println("\nFound the customer>> \n"+baccnt);
        }

        baccnt.deposit(500);
        baccnt.statement();
        baccnt.withdraw(200);
        baccnt.statement();




        BankAccount baccount1 = new BankAccount("00055", "Rob", 100);
        banksys.createAccount(baccount1);
        System.out.println("\nNumber of customers in the bank: "+ banksys.getNumberOfCustomers() + "\n");
        banksys.accountDetails();
        banksys.performtransaction("00011", 1000.0, "Deposit");
        banksys.performDeposit(500);
        banksys.printStatement();
        banksys.performWithdraw(250);
        banksys.printStatement();
        banksys.deleteAccount("00044");
        banksys.deleteAccount("00033");

        System.out.println("\nNumber of customers in the bank: "+ banksys.getNumberOfCustomers());

        BankAccount baccnt2 = banksys.searchAccount("00044");
        if(baccnt2==null){
            System.out.println("\nCustomer not found");
        }
        else{
            System.out.println("\nFound the customer>> \n"+baccnt2);
        }
    }
}
