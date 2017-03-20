package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args)
            throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        double meter, foot;

        System.out.print("Enter a number in feet: ");
        foot = input.nextDouble();
        meter = foot*.305;

        System.out.printf("%.2f", foot);
        System.out.print(" feet equals ");
        System.out.printf("%.2f", meter);
        System.out.println(" meters.");

    }
}
