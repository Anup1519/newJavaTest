package com.company;

public class WrapperProgram {
    public static void main(String[] args) {

//     Primitive to Object
        int x=18;
        Integer y =Integer.valueOf(x); //Primitive to Object(Unnecessary boxing)
        System.out.println(y);
        byte b=10;
        Byte b1=Byte.valueOf(b);
        byte b2=b1.byteValue();// object to primitive (Unnecessary boxing)
        System.out.println(b1);
        System.out.println(b2);

        short s=6556;
//        Integer s1=Integer.valueOf(s);//
        Short s1=Short.valueOf(s);
        System.out.println(s1);
        long l=3434;
        Long l1=Long.valueOf(l);
        System.out.println(l1);

//        Object to Primitive
        int i=20;
        Integer i1=Integer.valueOf(i);// primitive to object
        int i2=i1.intValue();//object to primitive
        System.out.println(i2);

//     Primitive to String
        int j=50;
        String j1=Integer.toString(j);//Return String object
        byte b5=68;
        String b8=Byte.toString(b5);

//        String to Primitive
        int a=50;
        String a1=Integer.toString(a);//Return String object
        int a2=Integer.parseInt(a1);//Parse the String argument as a Integer

        byte n=80;
        String n1=Byte.toString(n);
        byte n2=Byte.parseByte(n1);

        double d=40.0;
        String s6=Double.toString(d);
        System.out.println(s6);
        double d8=Double.parseDouble(s6);
        System.out.println(d8);
    }
}
