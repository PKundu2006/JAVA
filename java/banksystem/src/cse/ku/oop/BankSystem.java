package cse.ku.oop;

public class BankSystem {
private BankAccount account;
private Transaction transaction;

public void createAccount(BankAccount account)
{
    this.account = account;
    System.out.println("Created account");
}

public void deleteAccount(String accountNumber)
{
    System.out.println("Delete account");

}

public void performtransaction(String number, double amount)
{
    this.account.deposit(amount);
}

public void statement(String number){
    double balanc = this.account.getBalance();
    System.out.println("Current balance "+ balanc);
}

}
