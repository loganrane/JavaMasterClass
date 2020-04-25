package Inheritance;

import java.util.Scanner;

public class Account {
    private String name;
    private int accountNumber;
    private int initialAmount;
    private String address;
    private int currentBalance;
    private String typeOfAccount;

    public int deposit(int amount) {
        return currentBalance += amount;
    }

    public int withdraw(int amount) {
        return currentBalance -= amount;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public Account(String name, int accountNumber, int initialAmount){
        this.name = name;
        this.accountNumber = accountNumber;
        this.initialAmount = initialAmount;
    }

    public Account(String name, int accountNumber, String address, String typeOfAccount, int currentBalance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.typeOfAccount = typeOfAccount;
        this.currentBalance = currentBalance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac1 = new Account("Arpit", 369, 100000);
        Account ac2 = new Account("Falcon", 666, "Mesra", "Saving", 1000);
        System.out.println(ac1.name);
        System.out.println(ac2.name);
        System.out.println(ac2.typeOfAccount);
    }
}