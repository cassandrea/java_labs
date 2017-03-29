package part_08;

/**
 Write a class with at least one method that uses a try/catch statement. Make sure the catch block is executed, ie
 generate an error and catch it in the catch block.
 */
public class Exercise_01 {
    //main method
    public static void main(String[] args) {
        badMath(3026);
    }
    //variable
    static int y = 0;
    //try/catch method
    public static void badMath(int x) {
        try { int badMath = x/y;}
        catch (ArithmeticException exc) {
            System.out.println("Error! Bad Math!");
        }
    }
}
