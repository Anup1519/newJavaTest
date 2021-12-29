package innerclass.nonstatic;

import innerclass.Outer;

public class Outer1 {
    void m1(){
        System.out.println("Outer class non-static ");
    }
    class Inner1{
        void m2(){
            System.out.println("inner class non-static");
        }
    }
    public static void main(String[] args) {
        Outer1 o1=new Outer1();
        o1.m1();

        Outer1.Inner1 o2=o1.new Inner1();  // By using the instant of parent class'.'new operator than constructor of inner class
        o2.m2();

    }
}
