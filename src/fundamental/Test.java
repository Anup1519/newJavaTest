package fundamental;

public class Test {
    public static void main(String[] args) {
       Student s1=new Student(1,"AK",12);
       Student s2=new Student(2,"Raj",3);
       Student s3=s2;

        System.out.println(s1==s2);// false different reference
        System.out.println(s1.equals(s2)); //false different reference
        System.out.println(s2==s3);      //true point to same reference
        System.out.println(s2.equals(s3));// true  both reference variable has same objects reference

        System.out.println();

        Address a=new Address();
        System.out.println(null==null);// true
//        System.out.println(null.equals(null));//CE: inconvertible type

        Address a1=null;
        Address a2=null;
        System.out.println(a1==a2);//true
        System.out.println(a1.equals(a2));// RE:NullPointerException
    }
}
