package stringhandling;

public class StringDemo {
    public static void main(String[] args) {
        User user1=new User(1,"AK");
        User user2=new User(1,"Raj");
        System.out.println(user1);  //stringhandling.User@4554617c
        System.out.println(user2);  //stringhandling.User@74a14482

        String s1="abc";
        String s2="xyz";
        String s3="abc";
        String s4=new String("abc");//if use new String operator than JVM will allocate new memory location.

        System.out.println(s1);//abc
        System.out.println(s2);//xyz
        System.out.println(s3);//abc

        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//119193
        System.out.println(s3.hashCode());// 96354 (s1 and s3 point to same memory location)

        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//false
        System.out.println(s1==s3);//true

        System.out.println(s1==s4);//false
        System.out.println(s1.equals(s4));//true
        System.out.println(s3==s4);//false


        char[] c={'a','b','c','d','e','f'};
        String s5=new String(c);//String object with the given char array values
        System.out.println(s5);//abcdef

        String s6=new String(c,2,3);
        System.out.println("s6:"+s6);//cde

        byte[] b={97,98,99};
        String s7=new String(b,1,1);
        System.out.println(s7);//b
        String s8=new String(b,1,2);
        System.out.println(s8);//bc


    }
}
