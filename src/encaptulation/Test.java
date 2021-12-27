package encaptulation;

public class Test {
    public static void main(String[] args) {
         Customer c=new Customer();
         c.setFirstName("anup");
         c.setLastName("noida");
         c.setCreditCard("9876");

        System.out.println("First name:"+c.getFirstName());
        System.out.println("Last name:"+c.getLastName());
        System.out.println("Credit number:"+c.getCreditCard());
    }
}
