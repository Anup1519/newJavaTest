package exceptionhandling;

public class Example {
    public static void main(String[] args) {
/* case:1
        //        System.out.println(10/0);
        try {
            System.out.println("In try");
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println("In catch");
        }
        finally {
            System.out.println("In Finally");
        }
        System.out.println("In outer try/catch/finally");

 */
        /*case:2
        try {
            System.out.println("In try");
            System.out.println(10/0);
        }
        catch (NullPointerException npe){
            System.out.println("In catch");
        } finally {
            System.out.println("In finally");
        }
        System.out.println("In outer try/catch/finally");


         */
        //case:3
        try {
            System.out.println("In try");
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println("In catch");
            System.out.println(10/0);    // finally--> JVM Default Handler---> ArithmeticException: / by zero
        }
        finally {
            System.out.println("In finally");
        }
        System.out.println("In outer try/catch/finally");

    }
}



