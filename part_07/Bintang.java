package part_07;

/**
 Write three subclasses (with at least 3 methods each that not getters and setters) that extend the super
 class. Make sure each subclass can manipulate the private variables in the super class. One subclass should
 extend another subclass which extends the super class. Each subclass should only have variables and methods
 that apply to that subclass, ie Animal -> Mammal -> Whale.
 */
public class Bintang extends Beer{
    //private variables
    private boolean radler;
    private boolean smallBottle;
    private int otherVariable;
    private double moreVariables;

    //3 methods
    public void bintang1(){
        System.out.println("Bintang!");
    }
    public double bintang2(int otherVariable, double moreVariables) {
        return otherVariable*moreVariables;
    }
    public boolean bintang3(boolean radler) {
        if (radler) return smallBottle;
        else return false;
    }

    //constructors
    public Bintang(boolean radler, boolean smallBottle, int otherVariable, double moreVariables) {
        this.radler = radler;
        this.smallBottle = smallBottle;
        this.otherVariable = otherVariable;
        this.moreVariables = moreVariables;
    }

    //getters and setters
    public boolean isRadler() {
        return radler;
    }

    public void setRadler(boolean radler) {
        this.radler = radler;
    }

    public boolean isSmallBottle() {
        return smallBottle;
    }

    public void setSmallBottle(boolean smallBottle) {
        this.smallBottle = smallBottle;
    }

    public int getOtherVariable() {
        return otherVariable;
    }

    public void setOtherVariable(int otherVariable) {
        this.otherVariable = otherVariable;
    }

    public double getMoreVariables() {
        return moreVariables;
    }

    public void setMoreVariables(double moreVariables) {
        this.moreVariables = moreVariables;
    }
}
