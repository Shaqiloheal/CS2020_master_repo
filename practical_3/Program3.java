/* Author: Warren Spalding
*  Date: 03/10/2022
*  Practical: Week 3
*  Exercise: 3
*  Modify the program from 2. so every 5th number from the given range is multiplied by 3 but
*  only if it is not an even number and the multiplication result is less or equal 100.
*/

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter a number:%n"); // prompt
        int userInput = input.nextInt(); // read number from user
        System.out.println(); // creates a line between the userInput and result of the loop

        // for loop that checks user input and prints out even numbers
        for (int i = 1; i <= userInput; i++) {


            if (i % 2 == 0) { // find out the number is even
                System.out.println(i);
            }
            
            // find out if the number is odd, when the 5th number is a multiple of 3 doesnt exceed 100
            if (i % 2 != 0 && i * 3 <= 100 && i % 5 == 0) {
                System.out.println(i * 3);
                
            }

        }
    }
}