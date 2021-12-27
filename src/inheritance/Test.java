package inheritance;

public class Test {
    public static void main(String[] args) {
        System.out.println("main methods");
        B b=new B();
//        b.m1();
//        b.m2();
//        b.m3();
        b.hashCode();//Whenever it is invoked on the same object more than once during an execution of a Java application,
                      // the hashCode method must consistently return the same integer.

        A a=new B();
        a.m1();
        a.m2();
//        a.m3();//CE: can't find Symbol methods m3() variable a of type inheritance.A




    }
}
