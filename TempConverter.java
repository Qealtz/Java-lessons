/************************************
*Project: convert temperature
*Programmer: Qealtz
*Date: Febuary 27th 2025
*Program Name: Digits.java
*************************************/


import java.util.*;

public class TempConverter {
    public static void main(String[]args)
    
    {
        
        double Fahrenheit;
        double Celcius;

        Scanner input = new Scanner(System.in);
        System.out.print("What temperature is it in Fahrenheit? : ");

        Fahrenheit = input.nextDouble();
        input.close();

        Celcius = (Fahrenheit - 32)*5/9;
        
        System.out.println("Your temperature in Celcius if your temperature in Fahrenheit is " + Fahrenheit + " Will be " + Celcius);













    }
}

