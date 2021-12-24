package com.company;

public class DataTypes {
//    static int p;
    public static void main(String[] args) {
    /*    byte a=30;
        short s=48;
        int b=50;
        char c='A';
        boolean i=true;
        System.out.println(DataTypes.p);
        System.out.println(a);
        System.out.println(s);
        System.out.println(b);
        System.out.println(c);   */

//  implict casting
  /*      byte b=100;
        int a=b;
        System.out.println(a);
        long l=a;
        double d=l;
        System.out.println(d);
        char ch='A';
        int x=ch;
        System.out.println(ch);

     */
//        Explict casting
        int i=100;
        byte b=(byte) i;
        int x=97;
        char ch=(char) x;
        System.out.println(b);
        System.out.println(ch);
        int y=130;
        byte b1=(byte) y;     // [minRange+(result-MaxRange-1]=> -128+(130-127-1)=>-128+2=>-126
        System.out.println(b1);

    }
}
