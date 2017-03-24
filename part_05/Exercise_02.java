package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class cookieMonster {

    public static void main(String [] args) {
        //create an instance of class 2
        coookies oreos = new coookies();

        System.out.println("Type of cookie is: " + oreos.typeOfCookies);
        System.out.println("Number of Cookies is: " + oreos.numberOfCookies);
        System.out.println("Number of bites in each cookie: " + oreos.bitesPerCookie);
        System.out.println("Is it a chocolate cookie? " + oreos.isChocolate);

        //pass instance to method 1
        //I had to make the methods static to get this to work, why?
        oreos = meWantCookies(oreos);

        System.out.println("Type of cookie is: " + oreos.typeOfCookies);
        System.out.println("Number of Cookies is: " + oreos.numberOfCookies);
        System.out.println("Number of bites in each cookie: " + oreos.bitesPerCookie);
        System.out.println("Is it a chocolate cookie? " + oreos.isChocolate);

        //pass instance to method 2
        coookies moreOreos = meWantMoreCookies(oreos);

        System.out.println("Type of cookie is: " + oreos.typeOfCookies);
        System.out.println("Number of Cookies is: " + oreos.numberOfCookies);
        System.out.println("Number of bites in each cookie: " + oreos.bitesPerCookie);
        System.out.println("Is it a chocolate cookie? " + oreos.isChocolate);

    }
    //create a method that accepts an object of class 2 and manipulates instance variables, then pass that instance to
    //method 2
    static coookies meWantCookies(coookies x) {
        x.numberOfCookies = 10;
        x.typeOfCookies = "Oreos";
        x.isChocolate = true;
        x.bitesPerCookie = 1.5;
        return x;
    }
    //create method 2 that accepts and object of class 2 and modifies instance variables
    static coookies meWantMoreCookies(coookies y) {
        y.numberOfCookies = 50;
        y.typeOfCookies = "Oreos";
        y.isChocolate = true;
        y.bitesPerCookie = 1;
        return y;
    }


}
class coookies {
    int numberOfCookies;
    String typeOfCookies;
    boolean isChocolate;
    double bitesPerCookie;
}
