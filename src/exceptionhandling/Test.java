package exceptionhandling;

public class Test {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println("getMessage() method output");
            System.out.println(ae.getMessage());                 // o/p: / by zero
            System.out.println("====================\n");

            System.out.println("toString method output");
            System.out.println(ae.toString());                   // o/p: java.lang.ArithmeticException: / by zero
            System.out.println("==========\n");

            System.out.println("printStackTrace() method output");
            ae.printStackTrace();
            System.out.println("==========\n");

            System.out.println("JVM default output");
            throw ae;                                     // o/p: java.lang.ArithmeticException: / by zero

        }
    }
}
