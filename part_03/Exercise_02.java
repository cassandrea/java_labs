package part_03;

import java.util.Scanner;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task.
*/

//Task: calculate travel expenses and compare to budget
 class TravelCost {
    public static void main(String [] args) {
        double budget, actual, difference;
        budget = budget();
        actual = actual();

        if (actual > budget) {
            difference = actual - budget;
            System.out.println("Your travel expenses were $" + difference + " over budget.");
        } else {
            difference = budget - actual;
            System.out.println("Your travel expenses were $" + difference + " under budget.");
        }
    }
    static double budget () {
        double accommodation = 1500;
        double transportation = 1500;
        double food = 500;
        double activities = 400;
        double other = 300;
        double total = accommodation + transportation + food + activities + other;

        return total;
    }
    static double actual () {
        double accommodation = 1200;
        double transportation = 1100;
        double food = 500;
        double activities = 200;
        double other = 150;
        double total = accommodation + transportation + food + activities + other;

        return total;
    }
 }