package exceptionhandling;

public class ExampleWithFinallyReturn {
    public static void main(String[] args) {
        m1();
        System.out.println("After calling m1()");
    }
   static int m1(){
        try {
//            System.out.println(10/0);
            System.out.println("In try");
            System.out.println(10/0);
            return 10;
        }
        catch (NullPointerException npe){
            System.out.println("In catch Null");
            return 20;
        }
        catch (ArithmeticException ae){
            System.out.println("In catch");
            System.out.println(10/0);
            return 20;
        }
        finally {
            System.out.println("In finally");
            return 30;
        }
       // System.out.println("after try/catch/finally");  //CE: unreachable stmt---   return stmt in finally block
                                                          // we cannot place stmt after finally block

/*
    static void m1(){
        try {
            System.out.println("In try");
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println("In catch");
        }
        catch (NullPointerException npe){
            System.out.println("In catch null");
        }
        finally {
            System.out.println("In finally");
            return;
        }

 */

    }
}
