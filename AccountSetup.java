/************************************
*Project: make an account and password
*Programmer: Qealtz
*Date: April 7th
*Program Name: AccountSetup.java
*************************************/
import java.util.*;
public class AccountSetup{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String userName;
        String password;
        System.out.println("Enter a username: ");
        userName = input.next();
        System.out.println("Enter a password: ");
        password = input.next();
        while ((password.length() <= 7)){
            System.out.println("Enter a password: ");
            password = input.next();
        }
        System.out.print("Your Username is " + userName + " and your password is " + password);
    }



 
       












    }
