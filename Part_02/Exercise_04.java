package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */
public class Exercise_04 {

    public static void main(String[] args)
            throws java.io.IOException {

            Scanner input = new Scanner(System.in);

            double kilogram;
            double pound;

            System.out.print("How many pounds does it weigh? ");
            pound = input.nextDouble();
            kilogram = pound*.454;

            System.out.printf("%.2f", pound);
            System.out.print(" pounds is equal to ");
            System.out.printf("%.2f", kilogram);
            System.out.println(" kilograms.");
    }
}
