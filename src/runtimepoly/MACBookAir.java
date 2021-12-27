package runtimepoly;

public class MACBookAir extends MACBook {
    @Override
    void start(){
        System.out.println("Inside MacBookAir start()");
    }

    @Override
    void shutdown() {
        System.out.println("Inside MacBookAir shutdown()");
    }
}
