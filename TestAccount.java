package finallabparcticse;
//Lab2

import java.util.Date;

public class TestAccount {

    public static void main(String[] args) {
        Account acc = new Account(1122, 20000);
        acc.withdraw(2500);
        acc.depost(3000);
        System.out.println("The balance: " + acc.getBalance());
        System.out.println("Date when the account was created:  " + acc.getDateCreated());

    }
}

class Account {

    private int id;
    int dollar;
    private double balance;
    private Date dateCreated;

       Account() {
        id = 0;
        balance = 0;
        dateCreated = new Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void depost(double amount) {
        balance += amount;

    }
}// end Account class
