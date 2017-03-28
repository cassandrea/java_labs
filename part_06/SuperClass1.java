package part_06;

/**
 * Created by cass on 3/28/17.
 */
public class SuperClass1 {

    private int x, y, z;
    private double a, b, c;
    private String one, two, three;

    //constructors - demonstrate the use of overloaded constructors in your superclass.
    SuperClass1() {
        //default
    }
    public SuperClass1(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public SuperClass1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public SuperClass1(String one, String two, String three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }
    public SuperClass1(int x, int y, int z, double a, double b, double c, String one, String two, String three) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
        this.b = b;
        this.c = c;
        this.one = one;
        this.two = two;
        this.three = three;
    }

    //Further extrapolating on the previous exercises, add at least two methods to a superclass that are not
    //getter/setter methods. Demonstrate the use of these methods from a subclass.
    public double methodAddition(){
        return (x + y + z + a + b + c);
    }
    public String methodConcat() {
        return (one + two + three);
    }

    //Demonstrate dynamic method dispatch.
    public void dynamicMD() {
        System.out.println("This is the method in SuperClass1");
    }

    //getters and setters
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public String getOne() {
        return one;
    }
    public void setOne(String one) {
        this.one = one;
    }
    public String getTwo() {
        return two;
    }
    public void setTwo(String two) {
        this.two = two;
    }
    public String getThree() {
        return three;
    }
    public void setThree(String three) {
        this.three = three;
    }
}
