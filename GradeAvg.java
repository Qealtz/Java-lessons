/************************************
*Project: calculate average of grades
*Programmer: Qealtz
*Date: Febuary 27th 2025
*Program Name: GradeAvg.java
*************************************/

import java.util.*;

public class GradeAvg {
    public static void main(String[]args)
    
    {
        
        int gradeOne;
        int gradeTwo;
        int gradeThree;
        int gradeFour;
        int gradeFive;
        int gradeAverage;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first of five grades : ");
        gradeOne = input.nextInt();
        System.out.print("Enter your second of five grades : ");
        gradeTwo = input.nextInt();
        System.out.print("Enter your third of five grades : ");
        gradeThree = input.nextInt();
        System.out.print("Enter your fourth of five grades : ");
        gradeFour = input.nextInt();
        System.out.print("Enter your fifth of five grades : ");
        gradeFive = input.nextInt();
        input.close();

        gradeAverage = (gradeOne + gradeTwo + gradeThree + gradeFour + gradeFive) / 5;

        System.out.println("With your current grades, your Grade Point Average is " + gradeAverage);













    }
}
