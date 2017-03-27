package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */
class Class_01 {
    public static void main(String [] args) {

        Class_02 ex1 = new Class_02(1);
        Class_02 ex2 = new Class_02(1,2);
        Class_02 ex3 = new Class_02(1,2,3);

        System.out.println(ex1.toString());
        System.out.println(ex2.toString());
        System.out.println(ex3.toString());

        ex1.setA(10);
        ex1.setB(10);
        ex1.setC(10);

        ex2.setA(20);
        ex2.setB(20);
        ex2.setC(20);

        ex3.setA(30);
        ex3.setB(30);
        ex3.setC(30);

        System.out.println(ex1.toString());
        System.out.println(ex2.toString());
        System.out.println(ex3.toString());
    }
}

class Class_02 {
    private int a,b,c;

    Class_02(int a){
        this.a = a;
    }
    Class_02(int a, int b){
        this.a = a;
        this.b = b;
    }
    Class_02(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Class_02{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
