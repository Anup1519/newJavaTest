package datatypes;

public class TypeConversion {
    public static void main(String[] args) {

        byte b1=10;
        int i1=b1;

//        byte b2=i1;//CE: incompatible type
        byte b2=(byte)i1;

//        int i=true;//CE: incompatible type Required: int
                    // Required: int
                    // Provide: boolean
        int i=(int)i1;

        int i2=254;
//        byte b3=i2;//CE: incompatible type
        byte b3=(byte)i2;

        long l1=10;
        float f1=l1;

//        long l2=f1;//CE: Incompatible type
        long l2=(long)l1;
//        System.out.println("i1":+i1);
        System.out.println(i1);
    }
}
