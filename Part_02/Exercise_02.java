package Part_02;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: surface area of cylinder = (2 * pi * radius * length) + ( 2 * radius * radius * pi) (roughly)
 *           volume of cylinder = pi * radius * radius * length
 */
public class Exercise_02 {

    public static void main(String[] args) throws java.io.IOException {
        double area, volume, radius, length;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        System.out.print("Enter length: ");
        length = input.nextDouble();


        area = (2 * Math.PI * radius * length) + ( 2 * radius * radius * Math.PI);
        volume = (Math.PI * radius * radius * length);

        System.out.print("The surface area of the cylinder is ");
        System.out.printf("%.2f", area);
        System.out.print(" and the volume is ");
        System.out.printf("%.2f", volume);

    }
}
