package abstraction;

public abstract class Audi {  //class Audi can be either abstract or final, not both
    void commonFunc(){
        System.out.println("Inside common function");
    }
    abstract void acceleration();//We can't marks abstract methods as static

    public static void main(String[] args) {      //inside abstract class main methods allowed
        System.out.println("Inside abstraction main");
    }
}
