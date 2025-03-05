/************************************
*Project: convert minutes into standard time units
*Programmer: Qealtz
*Date: March 5th 2025
*Program Name: TimeConversion.java
*************************************/
import java.util.*;



public class TimeConversion {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        int time;
        int timeHours;
        int timeMinutes;

        System.out.print("Enter the time in minutes: ");
        time = input.nextInt();
        input.close();

        timeHours = time / 60;
        timeMinutes = time % 60;

        System.out.println("The time is: " + timeHours + ":" + timeMinutes);


        



        



        
















    }



    
}
