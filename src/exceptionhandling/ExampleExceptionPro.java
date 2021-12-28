package exceptionhandling;

public class ExampleExceptionPro {
    public static void main(String[] args) {

        System.out.println("In main methods start");
        m1();
        System.out.println("In main method end");
    }
   //case:1
    /* static void m1(){
        try {
            System.out.println("In try start");
            System.out.println(10/0);
            System.out.println("In try end");
        }
        catch (ArithmeticException ae){
            System.out.println("In catch");
        }*/
    //case:2
    static void m1(){
        System.out.println("In m1 method start");
        System.out.println(10/0);
        System.out.println("In m1 method end");

    }
}
