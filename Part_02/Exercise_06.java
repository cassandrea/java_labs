package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 6:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "switch-case" statement.
 *
 *
 */
public class Exercise_06 {

    public static void main(String[] args)
            throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Type a number 1 - 9: ");
        number = input.nextInt();

         switch (number) {
             case (1):
                 System.out.println("The number 1 is spelled \"ONE\"");
                 break;
             case (2):
                 System.out.println("The number 2 is spelled \"TWO\"");
                 break;
             case (3):
                 System.out.println("The number 3 is spelled \"THREE\"");
                 break;
             case (4):
                 System.out.println("The number 4 is spelled \"FOUR\"");
                 break;
             case (5):
                 System.out.println("The number 5 is spelled \"FIVE\"");
                 break;
             case (6):
                 System.out.println("The number 6 is spelled \"SIX\"");
                 break;
             case (7):
                 System.out.println("The number 7 is spelled \"SEVEN\"");
                 break;
             case (8):
                 System.out.println("The number 8 is spelled \"EIGHT\"");
                 break;
             case (9):
                 System.out.println("The number 9 is spelled \"NINE\"");
                 break;
             default:
                 System.out.println("OTHER");
         }
    }
}
