package Part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {

    public static void main(String[] strings) {

        double W = 2.4, H = 6.4;
        double A = W*H, P = 2*W*H;

        System.out.println("The area of this rectangle is " + A +" and the perimeter is " + P + ".");
    }
}
