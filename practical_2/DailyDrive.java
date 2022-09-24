/* Author: Warren Spalding
*  Date: 23/09/2022
*  Practical: Week 2
*  Exercise: 6
*  Task: Program that determines daily driving cost based on total miles driven per
         day, cost per gallon of petrol, average miles per gallon, parking fees per day and tolls per
         day.
*/

import java.util.Scanner; // program uses class Scanner

public class DailyDrive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter total miles driven per day: "); // prompt
        double milesPD = input.nextDouble();  // read first number from user
        
        System.out.print("Please enter cost per gallon of petrol: "); // prompt
        double CostPG = input.nextDouble();  // read second number from user

        System.out.print("Please enter the average miles per gallon of the vehicle: "); // prompt
        double milesPG = input.nextDouble(); // read thrid number from user

        System.out.print("Please enter the total amount of parking fees and road tolls per day: "); // prompt
        double totalFees = input.nextDouble(); // read forth number from user

        double totalCost = (((CostPG / milesPG) * milesPD) + totalFees); // calculates total cost per day

        System.out.printf("The total cost per day is £%.2f%n", totalCost); // displays cost per day

    } // end method main
} // end class DailyDrive