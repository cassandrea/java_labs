package part_06;

/**
 * Created by cass on 3/28/17.
 */
public class SubClass1 extends SuperClass1 {
    private int middleInt;
    private double middleDouble;
    private String middleString;

    //constructors - Also, demonstrate the use of the "super" keyword.
    public SubClass1() {
        //default
    }
    public SubClass1(int middleInt, double middleDouble, String middleString) {
        this.middleInt = middleInt;
        this.middleDouble = middleDouble;
        this.middleString = middleString;
    }
    public SubClass1(int x, int y, int z, double a, double b, double c, String one, String two, String three, int middleInt, double middleDouble, String middleString) {
        super(x, y, z, a, b, c, one, two, three);
        this.middleInt = middleInt;
        this.middleDouble = middleDouble;
        this.middleString = middleString;
    }

    //Further extrapolating on the previous exercises, add at least two methods to a superclass that are not
    //getter/setter methods. Demonstrate the use of these methods from a subclass.
    double sum = methodAddition();
    String allStrings = methodConcat();

    //Also, demonstrate how to override a method.
    @Override
    public double methodAddition(){
        return (super.methodAddition() + middleInt + middleDouble);
    }

    //Demonstrate dynamic method dispatch.
    public void dynamicMD() {
        System.out.println("This is the method in SubClass1");
    }

    //Demonstrate inheritance. Building on exercise_01, add private instance variables to the super class and use
    //the subclasses to set them.
    void method1(){
        setX(10);
        setY(20);
        setZ(30);
        setA(10.5);
        setB(20.5);
        setC(30.5);
        setOne("One");
        setTwo("Two");
        setThree("Three");
    }

    //getters and setters
    public int getMiddleInt() {
        return middleInt;
    }
    public void setMiddleInt(int middleInt) {
        this.middleInt = middleInt;
    }
    public double getMiddleDouble() {
        return middleDouble;
    }
    public void setMiddleDouble(double middleDouble) {
        this.middleDouble = middleDouble;
    }
    public String getMiddleString() {
        return middleString;
    }
    public void setMiddleString(String middleString) {
        this.middleString = middleString;
    }
}
