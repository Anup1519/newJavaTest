package com.company.accessmodifiers;

public class Program1 {
    public static void main(String[] args) {
        Program p1=new Program();
//        System.out.println(p1.a); //Private access in class Program so it can't access
        System.out.println(p1.b);
        System.out.println(p1.c);
        System.out.println(p1.d);
    }
}
