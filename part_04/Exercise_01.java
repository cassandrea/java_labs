package part_04;

import java.util.Scanner;

/**
 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 Then print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.
 */

class NumberSort {
    public static void main(String [] args ) {

        int numbers [] = new int[10];
        int i = 0, count =0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers, pressing enter after each one.");
         do {
            numbers[i] = input.nextInt();
            i++;
         } while (i < numbers.length);

        for (count=1;count< numbers.length; count+=2){
                System.out.println(numbers[count]);
        }
        for (count=8;count >=0; count-=2){
            System.out.println(numbers[count]);
        }
    }
}