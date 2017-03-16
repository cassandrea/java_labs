package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 21:
 *
 *      Calculate investment value
 *
 *      Receive the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */
class Exercise_11 {
    public static void main(String [] args)
        throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        double principle;
        double apr;
        double term;

        System.out.println("Investment Amount: ");
        principle = input.nextDouble();
        System.out.println("Interest Rate in Percentage: ");
        apr = (input.nextDouble())/100;
        System.out.println("Number of Years to Invest: ");
        term = input.nextDouble();

        double annualReturn;
        int year;

        for (year = 1; year <= term; year++) {
            annualReturn = principle*apr;
            principle = principle + annualReturn;
        }

        System.out.printf("Future Value: $" + "%,.2f", principle);

    }

}



