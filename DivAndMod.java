import java.io.*;
import java.util.Scanner;

/************************************
*Project: promp user for two ints and spits the int and modular divison 
*Programmer: Qealtz
*Date: March 3rd 2025
*Program Name: AccountSetup.java
*************************************/


public class DivAndMod {

    public static void main(String[]args)
    {

        Scanner input = new Scanner(System.in);

        int intOne;
        int intTwo;

        System.out.print("Input one integer: ");

        intOne = input.nextInt();

        System.out.print("Input a password: ");

        intTwo = input.nextInt();

        int answerOne = intOne / intTwo;
        int answerTwo = intOne % intTwo;

        int answerThree = intTwo / intOne;
        int answerFour = intTwo % intOne;
        

        System.out.println(intOne +  " / " + intTwo " = " + answerOne );
        System.out.println(intOne +  " % " + intTwo " = " + answerOne );
    
}
}
