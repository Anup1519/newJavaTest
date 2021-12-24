package com.company;

public class LabelledBlock {
    public static void main(String[] args) {
        int i=20;
        l1:{
            System.out.println("Inside labelled");
            if(i==20){
                System.out.println("inside if block");
//                break;            //Break can not be used outside loop or switch
                break l1;           //it can also used in name of labelled name;
            }
            System.out.println("Block Ends");
        }
        System.out.println("Outside block");
    }
}
