package com.company.flowcontrolstatement;

public class DoWhile {
    public static void main(String[] args) {
  /*      do {
            System.out.println("DO-While");
        }while (true);// infinite loop
//        System.out.println("outside loop");// Unreachable code

   */
        int x=1;
        do {
            if(x%2==0){
                System.out.println(x);
            }
            x++;
        }while (x<=50);
    }
}
