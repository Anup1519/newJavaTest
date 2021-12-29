package fundamental;

public class Student {
    private int sno;
    private String sname;
    private int whichClass;

    Student(int sno,String  sname, int whichClass){
        this.sno=sno;
        this.sname=sname;
        this.whichClass=whichClass;
    }
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        else{
            if(obj instanceof  Student){
                Student s=(Student)obj;

                return  this.sno==s.sno&&
                        this.sname==s.sname&&
                        this.whichClass==s.whichClass;
            }
            else {
                return false;
            }
        }
    }


}
