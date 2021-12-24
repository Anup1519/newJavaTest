package com.company.flowcontrolstatement;

public class IfElse {
    public static void main(String[] args) {

        String choice="deposit balance";
        if(choice.equals("check balance")){
            System.out.println("check balance");

        }
        else if (choice.equals("withdraw balance")){
            System.out.println("withdraw balance");
        }
        else if (choice.equals("deposit balance")){
            System.out.println("deposit balance");
        }
        else if (choice.equals("change pin")){
            System.out.println("change pin");
        }else {
            System.out.println("Time out");
        }
    }
}
