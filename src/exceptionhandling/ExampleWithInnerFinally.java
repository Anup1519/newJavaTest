package exceptionhandling;

public class ExampleWithInnerFinally {
    public static void main(String[] args) {
//        m1();
        System.out.println(m1());
    }
    static int m1(){
        try {
            System.out.println("In outer try");
           try{
               System.out.println("Inner try");
               System.out.println(10/0);
           }
            catch (NullPointerException npe){
                System.out.println("Inner catch");
            }
            finally {
                System.out.println("Inner finally");
                return 10;
            }
//           System.out.println("After Inner try/catch/finally");  //CE:unreachable stmt
        }
        catch (NullPointerException npe){
            System.out.println("Outer catch");
        }
        finally {
            System.out.println("outer finally");
            //return 30;

        }
        System.out.println("After outer try/catch/finally");

        return 20;
    }
}
