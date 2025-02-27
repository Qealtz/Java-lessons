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
        
        double gradeOne;
        double gradeTwo;
        double gradeThree;
        double gradeFour;
        double gradeFive;
        double gradeAverage;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first of five grades : ");
        gradeOne = input.nextDouble();
        System.out.print("Enter your second of five grades : ");
        gradeTwo = input.nextDouble();
        System.out.print("Enter your third of five grades : ");
        gradeThree = input.nextDouble();
        System.out.print("Enter your fourth of five grades : ");
        gradeFour = input.nextDouble();
        System.out.print("Enter your fifth of five grades : ");
        gradeFive = input.nextDouble();
        input.close();

        gradeAverage = (gradeOne + gradeTwo + gradeThree + gradeFour + gradeFive) / 5;

        System.out.println("With your current grades, your Grade Point Average is " + gradeAverage);













    }
}
