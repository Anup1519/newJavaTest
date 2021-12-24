package methods;

public class Example1 {

    static void m1(){
        System.out.println("m1 methods");
    }
    static int m2(){
        System.out.println("m2 methods");
        return 10;
    }
    static void m1(int a){
        System.out.println("before if");
        if(a==10){
            System.out.println("Inner if m1");
        }
        System.out.println("After m1 if");
    }
    static int m2(int a){
        System.out.println("before if");
        if(a==10){
            System.out.println("Inner if m2");
            return a+10;
        }
        System.out.println("After m2 if");
        return 30;
    }
    public static void main(String[] args) {
        m1();
        m2();
        int x=m2();
        System.out.println(x);
        System.out.println(m2()); // Return type 'int' allowed

//        int y=m1();// CE: inconvertible type
//        System.out.println(m1()); // 'void' type not allowed here.

        m1(10);
        m1(20);

        m2(10);
        m2(20);


    }
}
