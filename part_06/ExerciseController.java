package part_06;

/**
 * Created by cass on 3/28/17.
 */
public class ExerciseController {
    public static void main(String [] args) {

        //create objects
        SuperClass1 myNewSuperObject = new SuperClass1();
        SubClass1 myNewObject1 = new SubClass1();
        SubClass2 myNewSubObject1 = new SubClass2();

        //use Object1 methods
        myNewObject1.method1();
        myNewObject1.methodAddition();
        myNewObject1.methodConcat();


        //use Object2 methods
        myNewSubObject1.method2();


        //dynamic method dispatch
        myNewSuperObject.dynamicMD();
        myNewObject1.dynamicMD();
        myNewSubObject1.dynamicMD();
    }

}
