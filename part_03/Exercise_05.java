package part_03;

import java.util.Scanner;
/**
 *
 */
public class Exercise_05 {

    public static void main(String[] strings)
            throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        Scanner input = new Scanner(System.in);
        System.out.print("Pick a number more than zero and less than a billion\n");
        int userNumber = input.nextInt();

        results(userNumber);

    }
    // print out the results
    public static void results (int ch) {
        // use the && operator to see if the user's number is divisible by both 4 and 7
        if (ch %4 == 0 && ch%7 == 0 ) {
            System.out.println("The number is divisible by both 4 and 7");
        }
        else {
            System.out.println("The number is not divisible by both 4 and 7");
        }
        // use the || operator to see if the user's number is divisible by 4 or 7
        if (ch %4 == 0 || ch%7 == 0 ) {
            System.out.println("The number is divisible by 4 and/or 7");
        }
        else {
            System.out.println("The number is not divisible by 4 or 7");
        }
        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if (ch %4 == 0 ^ ch%7 == 0 ) {
            System.out.println("The number is divisible by 4 or 7 exclusively");
        }
        else {
            System.out.println("The number is not divisible by 4 or 7 exclusively");
        }
    }
}
