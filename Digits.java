import java.util.*;
/************************************
*Project: isolate the digits in a number
*Programmer: Qealtz
*Date: Febuary 25th 2025
*Program Name: Digits.java
*************************************/

public class Digits {

    public static void main(String[]args)
    {
        int number;

        //number = 4168;
        int ones;
        int tens;
        int hundreds;
        int thousands;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        number = input.nextInt();
        input.close();


        ones = number % 10;
        tens = (number / 10) % 10;
        hundreds = ((number/10)/10) % 10;
        thousands = (((number/10)/10)/10) % 10;

        System.out.println("If your number is " + number + " , then...");
        System.out.println("Ones are " + ones);
        System.out.println("Tens are " + tens);
        System.out.println("Hundreds are " + hundreds);
        System.out.println("Thousands are " + thousands);





    }


}
