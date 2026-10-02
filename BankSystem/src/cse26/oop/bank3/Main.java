package cse26.oop.bank3;

public class Main {
    public static void main(String[] args) {
        Account nayem, pretom;
        nayem = new Account("260254", "Naim", "Current", 100);


        pretom = new Account("260256", "Pretom", "Current", 100);


        nayem.deposit(5000);
        nayem.withdraw(10000);
        pretom.deposit(10000);
        pretom.withdraw(4000);
        pretom.deposit(10000);
        pretom.deposit(10000);
        pretom.deposit(10000);

        }

}