package com.company;

public class DataTypeConversion {
    public static void main(String[] args) {
        int a=10;
//        byte b=a; //CE:incompatible types found int, required byte
        byte b=(byte)a;
//        char ch=a; //CE: possilbe loss of precision
//        boolean bo=a; ////CE:incompatible types found int, required boolean
//        byte b1=(short)a;
        short s=(byte)a;
        byte b2=(byte)(short)a;
//        byte b3=(short)(byte)a; //CE:incompatible types
        double e=90.0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(b2);

    }
}
