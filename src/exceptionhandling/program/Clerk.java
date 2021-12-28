package exceptionhandling.program;

import exceptionhandling.program.acc.Bank;
import exceptionhandling.program.acc.HDFCBank;

import javax.naming.InvalidNameException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Clerk {
    public static void main(String[] args) {
        try {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            Bank acc1=new HDFCBank();
            String option="";
            do{
                System.out.println("1 Deposit");
                System.out.println("2 Withdraw");
                System.out.println("3 Balance Enquiry");
                option = br.readLine();
                switch (option){
                    case "1":{
                        System.out.println("Enter deposit amount:");
                        String s=br.readLine();
                        double amt=Double.parseDouble(s);


                        break;
                    }
                    case "2":{
                        System.out.println("Enter withdraw amount:");
                        String s=br.readLine();
                        double amt=Double.parseDouble(s);
                        break;
                    }
                    case"3":{
                        break;
                    }
                    default:{
                        System.out.println("Invalid amount");
                    }


                }

            }while (option.equalsIgnoreCase("Yes"));
        }
        catch (IOException e){

        }
    }
}
