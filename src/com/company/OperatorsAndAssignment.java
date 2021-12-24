package com.company;

public class OperatorsAndAssignment {
    public static void main(String[] args) {
        int i=10;
        int j=++i;
        int k=i++;
        int l=--i;
        int a=i--;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(a);


        int f=10;
        int g=20;
        String s1="ab";
        String s2="cd";
        System.out.println(f+g);
        System.out.println(s1+s2);
        System.out.println(f+g+s1+s2);
        System.out.println(f+s1+s2+g);

        System.out.println(f<g);
        System.out.println(f>=g);
        System.out.println('a'<'A');
        System.out.println('a'>97);
        System.out.println((int)'a');
        System.out.println((int) 'B');

        System.out.println(f&g);
        System.out.println(f|g);
        System.out.println(f^g);
// use compound Assignment

        int h=40;
        h+=30;
        System.out.println(h);

//  Ternary Operator
        int i8=90;
        int i9=40;
        String result=(i8>i9)?"i8 is greater":"i9 is greater";
        System.out.println(result);


    }
}
