package exceptionhandling;

public class Division {
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println(c);
        }
        catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("please pass atleast two integer value");
        }
        catch (NumberFormatException nfe){
            System.out.println("please pass integer value");
        }catch (ArithmeticException ae){
            System.out.println("Please do not pass second value zero");
        }
    }
}
