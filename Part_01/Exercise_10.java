package Part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */
public class Exercise_10 {

    public static void main(String[] strings) {

        double km = 12, min = 30.5, mi = km/1.6, hr = min/60;

        System.out.println("The runner's average speed is " + mi/hr +" mph.");

    }

}
