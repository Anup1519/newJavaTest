package inheritance;

public class Sample3 extends Example3{

    public static void main(String[] args) {
        System.out.println(a);//static ver 'a'
        m1();

        Sample3 s=new Sample3();
        System.out.println(s.x);//non-static ver 's'
        s.m2();
    }
}
