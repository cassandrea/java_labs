package part_06;

/**
 * Created by cass on 3/28/17.
 */
public class SubClass2 extends SubClass1 {
    private int bottomInt;
    private double bottomDouble;
    private String bottomString;

    //constructors
    SubClass2(){
        //default
    }
    public SubClass2(int bottomInt, double bottomDouble, String bottomString) {
        this.bottomInt = bottomInt;
        this.bottomDouble = bottomDouble;
        this.bottomString = bottomString;
    }
    public SubClass2(int middleInt, double middleDouble, String middleString, int bottomInt, double bottomDouble, String bottomString) {
        super(middleInt, middleDouble, middleString);
        this.bottomInt = bottomInt;
        this.bottomDouble = bottomDouble;
        this.bottomString = bottomString;
    }
    public SubClass2(int x, int y, int z, double a, double b, double c, String one, String two, String three, int middleInt, double middleDouble, String middleString, int bottomInt, double bottomDouble, String bottomString) {
        super(x, y, z, a, b, c, one, two, three, middleInt, middleDouble, middleString);
        this.bottomInt = bottomInt;
        this.bottomDouble = bottomDouble;
        this.bottomString = bottomString;
    }

    //Demonstrate inheritance. Building on exercise_01, add private instance variables to the super class and use
    //the subclasses to set them.
    void method2(){
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

    //Also, demonstrate how to override a method.
    @Override
    public double methodAddition(){
        return (super.methodAddition() + bottomInt + bottomDouble);
    }

    //Demonstrate dynamic method dispatch.
    public void dynamicMD() {
        System.out.println("This is the method in SubClass2");
    }

    //getters and setters
    public int getBottomInt() {
        return bottomInt;
    }
    public void setBottomInt(int bottomInt) {
        this.bottomInt = bottomInt;
    }
    public double getBottomDouble() {
        return bottomDouble;
    }
    public void setBottomDouble(double bottomDouble) {
        this.bottomDouble = bottomDouble;
    }
    public String getBottomString() {
        return bottomString;
    }
    public void setBottomString(String bottomString) {
        this.bottomString = bottomString;
    }
}
