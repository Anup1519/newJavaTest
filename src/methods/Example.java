package methods;

public class Example {

    static int a=10;
    static int b=a+10;

//    m1();  //method calls ,validation ,calculation, data printing stmt must be placed inside method

    static void m1(){
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
        System.out.println(a+"....."+b);
        m1();
        if(true){
            System.out.println("Hi");
        }
    }
}
