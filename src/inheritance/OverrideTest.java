package inheritance;

public class OverrideTest {
    public static void main(String[] args) {
        System.out.println("main");

        Car c= new Car();
        System.out.println(c.fuel());

        Bike b=new Bike();
        System.out.println(b.fuel());
    }
}
