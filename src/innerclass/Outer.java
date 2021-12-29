package innerclass;

public class Outer {

    static void m1(){
        System.out.println("Outer static class method");
    }
    static class inner{
        static void m2(){
            System.out.println("Inner static class method ");
        }
        void m3(){
            System.out.println("Inner non-static method");
        }
    }
    public static void main(String[] args) {
        Outer.m1();
        Outer.inner.m2();
        Outer.inner s=new Outer.inner();
        s.m3();

    }
}
