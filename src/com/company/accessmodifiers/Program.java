package com.company.accessmodifiers;

public class Program {
    private int a=10;    //access within the class
        int b=20;        //access within the package
    protected int c=30;     //access within the package and outside the package
    public int d=40;        //access all
    public static void main(String[] args) {
       Program p=new Program();// create non-static veriable in class level so create object
        System.out.println(p.a);
        System.out.println(p.b);
        System.out.println(p.c);
        System.out.println(p.d);
    }
}
