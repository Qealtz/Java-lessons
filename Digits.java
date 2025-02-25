/************************************
*Project: isolate the 3 digits in a 3 digit number
*Programmer: Qealtz
*Date: Febuary 25th 2025
*Program Name: Digits.java
*************************************/

public class Digits {

    public static void main(String[]args)
    {
        int number;

        number = 526;
        int ones;
        int tens;
        int hundreds;

        ones = number % 10;
        tens = (number / 10) % 10;
        hundreds = ((number/10)/10) % 10;

        System.out.println("If your number is " + number + " , then...");
        System.out.println("Ones are " + ones);
        System.out.println("Tens are " + tens);
        System.out.println("Hundreds are " + hundreds);





    }


}
