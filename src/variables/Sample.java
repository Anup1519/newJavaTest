package variables;

import methods.Example;

public class Sample {
    public static void main(String[] args) {
        int a=40;
        System.out.println("a:"+a);

        a=60;
        System.out.println("a:"+a);

        Example e1=new Example();
        System.out.println("e1:"+e1); //O/P: e1:methods.Example@4554617c

        e1=new Example();
        System.out.println("e1:"+e1);  //O/P: e1:methods.Example@74a14482
    }
}
