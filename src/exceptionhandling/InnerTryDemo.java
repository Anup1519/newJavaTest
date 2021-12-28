package exceptionhandling;

public class InnerTryDemo {
    public static void main(String[] args) {
    /* CASE:1
       try{
            System.out.println("In outer try");
            int a=Integer.parseInt(args[0]);
            System.out.println("a is:"+a);
            try{
                int[] x= new int[a];
                System.out.println("array size:"+x.length);
            }
            catch (NegativeArraySizeException nase){
                int[] x=new int[3];
                System.out.println("array size:"+x.length);
            }
            int b=a+20;
            System.out.println("b:"+b);
        }
        catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("pass one int value ");
        }
        catch (NumberFormatException nfe){
            System.out.println("pass only int values");
        }

     */
        // CASE:2

    /*    try {
            int a=Integer.parseInt(args[0]);
            System.out.println("a:"+a);
            try{
                int[] x= new int[a];
                System.out.println("array size:"+x.length);
            }
            catch (NullPointerException npe){
                System.out.println("NPE is raised");
            }
            int b=a+20;
            System.out.println("b is:"+b);
        }
        catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("please pass one int value");
        }
        catch (NumberFormatException nfe){
            System.out.println("please pass only int value ");
        }
        catch (NegativeArraySizeException nase){
            int[] x=new int[3];
            System.out.println("In outer try array size:"+x.length);
        }
        System.out.println("After outer try/catch");
    }
}

     */
//CASE:3
try {
        int a=Integer.parseInt(args[0]);
        System.out.println("a:"+a);
        try{
        int[] x= new int[a];
                System.out.println("array size:"+x.length);
        }
        catch (NullPointerException npe){
                System.out.println("NPE is raised");
        }
                int b=a+20;
                System.out.println("b is:"+b);
        }
        catch (ArrayIndexOutOfBoundsException aiob){
                System.out.println("please pass one int value");
        }
        catch (NumberFormatException nfe){
                System.out.println("please pass only int value ");
        }

        System.out.println("After outer try/catch");

    }
}
