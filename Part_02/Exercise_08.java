package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args)
            throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        int Num;
        int search;

        System.out.print("Give me a number, up to 1,000,000,000: ");
        Num = input.nextInt();

        search = 0;
        while( search <= 1000000000 ) {
            if (search == Num) {
                System.out.printf("Your number is: " + search);
                break;
            }
            else
                search++;
        }

    }
}

