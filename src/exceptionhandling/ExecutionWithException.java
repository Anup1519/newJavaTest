package exceptionhandling;

import java.util.Scanner;

public class ExecutionWithException {
    public static void main(String[] args) {
      /*  System.out.println("Enter two integer");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();*/

        int a=20;
//        int b=10;
        int b=0;

        System.out.println("a value:"+a);
        System.out.println("b value:"+b);

        int c=a/b;                         // int b=0;  CE: java.lang.ArithmeticException:/ by zero

        System.out.println("c value:"+c);


    }
}
