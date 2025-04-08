//qealtz
//4/8/25
//Monogram.java

import java.util.*;

public class Monogram {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String name = input.next();

        System.out.print("Enter your middle initial: ");
        String initial = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        char Char1 =  name.charAt(0);

        char Char2 =  lastName.charAt(0);

        System.out.println("Your monogram is " + Char1 +  initial + Char2); 

        










    }
    
}
