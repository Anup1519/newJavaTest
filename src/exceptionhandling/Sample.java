package exceptionhandling;

public class Sample {
    public static void main(String[] args) {
        System.out.println("In main method start");
        Sample s=new Sample();
        s.m1();

    }
// Case:1 Variable only initialized in try block
     void m1(){
        int a;

        try {
            a=10;
            System.out.println(a);

        }
        catch (ArithmeticException ae){
//            System.out.println(a);// CE: variable a might not have been initialized
        }
//        System.out.println(a); // CE: variable a might not have been initialized
         System.out.println("outer try/catch");
    }

/*
//    Case:2 Variable initialized in both try/catch block

    void m1(){
        int a;
        try {
            a=10;
            System.out.println(a);
        }
        catch (ArithmeticException ae){
            a=20;
            System.out.println(a);
        }
        catch (NullPointerException npe){
//            System.out.println(a); //CE: variable a might not have been initialized
        }
        //System.out.println(a); //CE: variable a might not have been initialized
    }*/

}
