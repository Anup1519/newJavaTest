package com.company;

public class NonStaticAndStatic {
    int i;
    static {
        System.out.println("Inside Static");
        NonStaticAndStatic k=new NonStaticAndStatic();
        k.m1();

    }
    NonStaticAndStatic(){
        System.out.println("Inside Constructor");
    }
    {
        System.out.println("Inside Non-Static");//non-static class
    }
    void m1(){
        System.out.println("Inside Non-Static method m1");
//        m2();                      //Exception in thread "main" java.lang.StackOverflowError
    }
    void m2(){
        System.out.println("m2 method");
        m1();
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        NonStaticAndStatic n=new NonStaticAndStatic();
        n.m1();
        n.m2();


    }
}
