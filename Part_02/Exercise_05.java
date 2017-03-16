package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args)
        throws java.io.IOException {

            Scanner input = new Scanner(System.in);

            int number;

            System.out.print("Type a number 1 - 9: ");
            number = input.nextInt();

            if (number <= 9) {
                if (number == 1) System.out.println("The number 1 is spelled \"ONE\"");
                if (number == 2) System.out.println("The number 2 is spelled \"TWO\"");
                if (number == 3) System.out.println("The number 3 is spelled \"THREE\"");
                if (number == 4) System.out.println("The number 4 is spelled \"FOUR\"");
                if (number == 5) System.out.println("The number 5 is spelled \"FIVE\"");
                if (number == 6) System.out.println("The number 6 is spelled \"SIX\"");
                if (number == 7) System.out.println("The number 7 is spelled \"SEVEN\"");
                if (number == 8) System.out.println("The number 8 is spelled \"EIGHT\"");
                if (number == 9) System.out.println("The number 9 is spelled \"NINE\"");
            }
            else
                System.out.println("OTHER");

        }
    }

