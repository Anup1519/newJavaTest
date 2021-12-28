package exceptionhandling;

public class InnenrTryDemo {
    public static void main(String[] args) {
        try{
            System.out.println("In outer try");
            try{
                System.out.println("In Inner Try");
                System.out.println(10/0);
            }
            catch(ArithmeticException ae){
                System.out.println("In inner catch");
            }
            System.out.println("In inner try/catch");
        }
        catch(ArithmeticException ae){
            System.out.println("In outer catch");
        }
        System.out.println("In outer try/catch");
    }
}
