package abstraction;

public class Test {
    public static void main(String[] args) {
        System.out.println("main methods");

        ThreeSeries ts=new ThreeSeries();
        ts.commonFunc();
        ts.acceleration();

        FiveSeriecs fs=new FiveSeriecs();
        fs.commonFunc();
        fs.acceleration();

    }
}
