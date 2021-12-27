package runtimepoly;

public class MACBookPro extends MACBook {

    @Override
    void start(){
        System.out.println("Inside MacBookpro start()");
    }
    void shutdown(){
        System.out.println("Inside MacBookpro shutdown()");
    }
}
