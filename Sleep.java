import java.io.*;
import java.util.Scanner;
import java.text.NumberFormat;



/************************************
*Project: convert year, month and days of birthdate and current month to see how long you've been alive and how long you've slept on average
*Programmer: Qealtz
*Date: march 6th 2025
*Program Name: Sleep.java
*************************************/

public class Sleep {

    public static void main(String[]args){
        int year;
        int month;
        int day;
        int todayYear;
        int todayMonth;
        int todayDay;
        int daysAlive;
        int hoursAsleep;


        Scanner input = new Scanner(System.in);


        System.out.println("Enter your birthdate:");
        System.out.print("Year : ");
        year = input.nextInt();
        System.out.print("month : ");
        month = input.nextInt();
        System.out.print("day : ");
        day = input.nextInt();

        System.out.println("Enter today's date:");
        System.out.print("Year : ");
        todayYear = input.nextInt();
        System.out.print("Month :");
        todayMonth = input.nextInt();
        System.out.print("Day : ");
        todayDay = input.nextInt();
        input.close();


        year = todayYear - year;
        month = todayMonth - month;
        day = todayDay - day;

        daysAlive = (year * 365) + (month*30) + day;

        hoursAsleep = (daysAlive * 8);

        NumberFormat number = NumberFormat.getIntegerInstance();


        System.out.println("You have been alive for " + number.format(daysAlive) + " days.");
        System.out.println("You have slept for " + number.format(hoursAsleep) + " hours.");

        












    }
    
}
