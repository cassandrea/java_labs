package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 23: - ryan
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */
class Exercise_12 {

    public static void main(String [] args)
        throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        double miles;
        double mpg;
        double price;

        System.out.println("Miles to Drive: ");
        miles = input.nextDouble();
        System.out.println("MPG of the Car: ");
        mpg = (input.nextDouble());
        System.out.println("Price per Gallon of Fuel: ");
        price = input.nextDouble();

        double cost;

        cost = (miles/mpg)*price;

        System.out.printf("Fuel Costs for this Trip: $" + "%,.2f", cost);
    }
}

