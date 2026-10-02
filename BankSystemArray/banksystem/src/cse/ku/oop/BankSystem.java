package cse.ku.oop;

public class BankSystem {
private BankAccount account;
private Transaction transaction;
private BankAccount accountholders[]; //Account array for storing the bank accounts
private int currentIndex=0; //Pointer of accounts
private int deleteIndex = 0;

public BankSystem(int numberOfAccounts)
{
    this.accountholders = new BankAccount[numberOfAccounts];
}

public void addAccount(String number, String name, double initBalance){
    BankAccount account = new BankAccount(number, name, initBalance);
    this.accountholders[currentIndex] = account; //Adding account object to array
    this.currentIndex++; //Increment the pointer
}

public BankAccount searchAccount(String number){
    for(BankAccount accnt: this.accountholders){
        if(accnt == null) break;
        if(accnt.getAccountNumber().equals(number)) {
            return accnt; //If found return the account object
        }
    }
    return null; //If account not found
}

public int getNumberOfCustomers(){
    return this.currentIndex;
}

public void createAccount(BankAccount account)
{
    this.account = account;
    this.accountholders[currentIndex++] = account;
    System.out.println("Created account");
}

public void deleteAccount(String accountNumber)
{
    int i = 0;
    for(i=0;i<this.currentIndex;i++){
        if(this.accountholders[i].getAccountNumber().equals(accountNumber)){
            break;
        }
    }
    int j;
    for(j = i; j<this.currentIndex-1; j++){
        this.accountholders[j] = this.accountholders[j+1];
    }
    this.accountholders[this.currentIndex--] = null;
    deleteIndex++;
    System.out.println("Delete account. Delete number: " + deleteIndex);
}

public void performtransaction(String number, double amount, String operation) {
    this.transaction = new Transaction(number+"01", amount, number, operation);
    this.account.deposit(amount);
    System.out.println("Performed transaction \n" + this.transaction);
}

public void performDeposit(double amount){
    this.account.deposit(amount);
}

public void performWithdraw(double amount){
        this.account.withdraw(amount);
}

public void printStatement(){
    this.account.statement();
}

public void accountDetails(){
        System.out.println(this.account);
    }

}
