package com.company.flowcontrolstatement;

public class Switch {
    public static void main(String[] args) {
       /* String choice="check balance";

        switch (choice){
            case"check balance":
                System.out.println("check balance");
            case"deposit balance":
                System.out.println("deposit balance");
            case"withdraw balance":
                System.out.println("withdraw balance");
                break;
            case "change pin":
                System.out.println("change pin");
            default:
                System.out.println("Time out");

        */
        int i=10;
        final int j=20;// it can used this variable it can't change(final)
        switch (i){
            case 10:
                System.out.println("10");
                break;
            case j:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
            default:
                System.out.println("default");
        }
    }
}
