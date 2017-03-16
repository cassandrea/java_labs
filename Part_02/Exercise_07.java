package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args)
        throws java.io.IOException {

            Scanner input = new Scanner(System.in);

            int minutes, days, years;

            System.out.print("Give me a number of minutes, up to 1,000,000,000: ");
            minutes = input.nextInt();
            days = minutes/60/12;
            years = days/365;

            System.out.printf(minutes + " minutes would be " + days + " days and " + years + " years.");
        }
    }

