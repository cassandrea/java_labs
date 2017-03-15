package Part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {

        int pop = 380123456;
        double yr = 31557600;
        double BR = yr/6, DR = yr/12, IR = yr/40;

        int year;

        for (year = 1; year < 4; year++) {
            System.out.println("The population in " + year + " years will be: " + (int)(pop + (BR) + (IR) - (DR)) + ".");
            pop = (int)(pop + (BR) + (IR) - (DR));

        }
    }
}
