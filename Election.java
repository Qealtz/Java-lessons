import java.io.*;
import java.util.Scanner;

/************************************
*Project: electon average
*Programmer: Qealtz
*Date: March 4th 2025
*Program Name: Election.java
*************************************/

public class Election {
    public static void main(String[]args)
    {

        Scanner input = new Scanner(System.in);

        double awbreyNY;
        double awbreyNJ;
        double awbreyCN;
        double Awbrey;
        double martinezNY;
        double martinezNJ;
        double martinezCN;
        double Martinez;
        double total;

       
        System.out.print("How many votes did Awbrey get in New York? : ");
        awbreyNY = input.nextDouble();
        System.out.print("How many votes did Awbrey get in New Jersey? : ");
        awbreyNJ = input.nextDouble();
        System.out.print("How many votes did Awbrey get in Connecticut? : ");
        awbreyCN = input.nextDouble();

        System.out.print("How many votes did Martinez get in New York? : ");
        martinezNY = input.nextDouble();
        System.out.print("How many votes did Martinez get in New Jersey? : ");
        martinezNJ = input.nextDouble();
        System.out.print("How many votes did Martinez get in Connecticut? : ");
        martinezCN = input.nextDouble();

        Awbrey = awbreyNY + awbreyNJ + awbreyCN;
        Martinez = martinezNY + martinezNJ + martinezCN;
        total = Awbrey + Martinez;

        double awbreyPercentage = (Awbrey / (Awbrey + Martinez)) * 100;
        double martinezPercentage = (Martinez / (Awbrey + Martinez)) *100;


        System.out.println(" Candidate \t\t Votes \t Percentage");
        System.out.println("Awbrey \t\t" + Awbrey + "\t" + awbreyPercentage);
        System.out.println("Martinez \t\t" + Martinez + "\t" + martinezPercentage);
        System.out.println("\n TOTAL VOTES: " + total);







        
    
}
}

