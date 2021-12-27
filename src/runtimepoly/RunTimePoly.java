package runtimepoly;

public class RunTimePoly {
    public static void main(String[] args) {
        System.out.println("main methods");
        MACBook m1=new MACBookAir();
        MACBook m2=new MACBookPro();

        m1.start();
        m1.shutdown();

        m2.start();
        m2.shutdown();

    }
}
