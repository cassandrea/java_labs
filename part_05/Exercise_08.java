package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */
class Outer {
    private static int a,b,c;
    private static int sum;

    public static void analyze(){
        Inner inner = new Inner();
        inner.setVars();
        inner.sum();

    }

    static class Inner {

        public static void setVars(){

            a = 10;
            b = 20;
            c = 30;
        }

        private static void sum(){
            sum  = a + b + c;
        }

    }
}

class NestedClassDemo {
    public static void main(String args[]) {
        Outer outOb = new Outer();

        outOb.analyze();
    }
}