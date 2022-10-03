/* Author: Warren Spalding
*  Date: 03/10/2022
*  Practical: Week 3
*  Exercise: 2
*  Task: a simple program that prints all even numbers between a set range of numbers which
*  should obtain form the user through the console input.
*/

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter a number:%n"); // prompt
        int userInput = input.nextInt(); // read number from user
        System.out.println(); // creates a line between the userInput and result of the loop

        // for loop that checks user input and prints out even numbers
        for (int i = 1; i <= userInput; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d%n", i);
            }
        }
    }
}