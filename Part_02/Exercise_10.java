package Part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {

    public static void main(String [] args) {

        /*
        For every number between 1 and 100, divide by 2. If the remainder is zero, the number is even and not prime.
        For all remaining numbers, divide by all smaller numbers to see how many times the remainder is 0.
        If the remainder is 0 only once, the number is prime.
         */

        boolean isprime;
        int num;
        int range;

        for (num = 2; num <= 100; num++) {
            isprime = true;

            for (range = 2; range <= num/range; range++) {
                    if ((num % range) == 0) isprime = false;
            }

            if (isprime)
                System.out.println(num + " is a prime number");
        }
    }
}



