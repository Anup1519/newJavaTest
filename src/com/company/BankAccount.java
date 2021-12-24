package com.company;

public class BankAccount {
    String bankName;
    String accountHolderName;
    String accountNumber;
    float balance;
    public static void main(String[] args) {

        BankAccount b= new BankAccount();
        b.accountHolderName="Anup";
        b.accountNumber="54435";
        b.balance=123456;
        System.out.println(b.balance+" "+b.accountNumber+" "+b.accountHolderName);
//        System.out.println(b.accountNumber);
//        System.out.println(b.accountHolderName);

    }
}
