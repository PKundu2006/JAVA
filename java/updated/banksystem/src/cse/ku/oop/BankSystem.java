package cse.ku.oop;

public class BankSystem {

    private BankAccount[] accounts;
    private SavingAccount[] savingAccounts;
    private int savingCounter = 0;
    private int currentIndex = 0;
    private Transaction[] transactions;
    private int transactionIndex = 0;

    public BankSystem(int numberOfAccounts, int numberOfTransactions) {
        this.accounts = new BankAccount[numberOfAccounts];
        this.transactions = new Transaction[numberOfTransactions];
    }

    public void setSavingAccountNumbers(int noofSavings){
        this.savingAccounts  = new SavingAccount[noofSavings];
    }

    public void addSavingAccount(String number, String name, double Balance, double rate){
        SavingAccount account = new SavingAccount(number, name, Balance, rate);
        this.savingAccounts[savingCounter] = account;
        this.savingCounter++;
    }

    public void printSavingAccount(){
        for(SavingAccount sa: this.savingAccounts){
            System.out.println(sa);
        }
    }

    public void addAccount(String number, String name, double Balance) {
        BankAccount account = new BankAccount(number, name, Balance);
        this.accounts[currentIndex] = account;
        this.currentIndex++;
    }

    public BankAccount searchAccount(String number) {
        for (BankAccount accnt : this.accounts) {
            if (accnt.getAccountNumber().equals(number)) {
                return accnt;
            }
        }
        return null;
    }

    public void performDeposit(String accountNumber, double amount) {
        BankAccount account = searchAccount(accountNumber);
            account.deposit(amount);
            Transaction newTransaction = new Transaction (account, "Deposit", amount, account.getBalance());
                transactions[transactionIndex] = newTransaction;
                transactionIndex++;
    }

    public void performWithdraw(String accountNumber, double amount) {
        BankAccount account = searchAccount(accountNumber);
            account.withdraw(amount);
            Transaction newTransaction = new Transaction(account, "Withdraw", amount, account.getBalance());
                transactions[transactionIndex] = newTransaction;
                transactionIndex++;
    }

    public void printAccounts() {
        for (int i = 0; i < currentIndex; i++) {
        BankAccount currentAccount = accounts[i];
        System.out.println("\nAccount Details:");
        System.out.println("  " + currentAccount);
        System.out.println("  Corresponding Transactions:");

        for (int j = 0; j < transactionIndex; j++) {
            if (transactions[j].getAccount().getAccountNumber().equals(currentAccount.getAccountNumber())) {
                System.out.println("    - " + transactions[j]);
            }
        }
      }
    }

}
