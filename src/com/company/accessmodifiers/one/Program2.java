package com.company.accessmodifiers.one;

import com.company.accessmodifiers.Program;

public class Program2 extends Program {
    public static void main(String[] args) {
        Program p2=new Program();
//        System.out.println(p2.a);//Private variable
//        System.out.println(p2.b);// Default variable
//        System.out.println(p2.c);//// create object in extends of Program2 to access protected variable c
        System.out.println(p2.d);

        Program2 q=new Program2();
        System.out.println(q.c); //access Modifiers is used only with inheritance
        System.out.println(q.d);

        Program s=new Program2();
        System.out.println(s.d);
    }
}