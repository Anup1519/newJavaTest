package polymorphism;

public class CompileTimePoly {
    void add(int a,int b){
        int result=a+b;
        System.out.println("Result is:"+result);
    }
    void add(float a,float b){
        float result=a+b;
        System.out.println("Result is:"+result);
    }
    void add(int a,int b,int c){
        int result=a+b+c;
        System.out.println("Result is:"+result);
    }
    public static void main(String[] args) {
        System.out.println("main ");
        CompileTimePoly cp=new CompileTimePoly();
        cp.add(10,20);
        cp.add(30f,49f);
        cp.add(60,70,80);

    }
}
