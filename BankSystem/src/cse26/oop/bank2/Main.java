package cse26.oop.bank2;

public class Main {
    public static void main(String[] args) {
        Account nayem, pretom;
        nayem = new Account();
        nayem.setNumber("260254");
        nayem.setUserName("Naim");
        nayem.setType("Current");
        nayem.setBalance(100);

        pretom = new Account();
        pretom.setNumber("260256");
        pretom.setUserName("Pretom");
        pretom.setType("Current");
        pretom.setBalance(100);

        nayem.deposit(5000);
        nayem.withdraw(10000);
        pretom.deposit(10000);
        pretom.withdraw(4000);


        }

}