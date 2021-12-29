package innerclass.nonstatic;

public class ExamOuter {
    private static int x=20;
    private int y;
    ExamOuter(int y){
        this.y=y;
    }
    void m1(){
        System.out.println("Outer static");
    }
    class ExamInner{
        private int y;

        ExamInner(int y){
            this.y=y;
        }

        private void m2(){
            System.out.println("Outer class x:"+ExamOuter.x);  //accessing outer class static variable
            System.out.println("Outer class y:"+ExamOuter.this.y); //accessing outer class non-static variable
            System.out.println("Inner class y:"+this.y);// accessing inner class variable
        }
    }
    public static void main(String[] args) {
        ExamOuter eo=new ExamOuter(30);
        eo.m1();

        ExamOuter.ExamInner eio=eo.new ExamInner(50);// By using the instant of parent class'.'new operator than constructor of inner class
        eio.m2();
        System.out.println(eio.y);
    }
}
