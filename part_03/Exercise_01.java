package part_03;

import java.util.Scanner;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.


 Task = Calculate how many bananas you need to fend off the monkeys

 Need: monkeyAppetite, PersonStrength, timeOfDay
 Use a method to calculate the monkeyAppetite based on numberOfMonkeys and typeOfMonkeys
 Use a method to calculate the PersonStrength based on height and beersDrank

 return the value of those methods to a final method that compares the monkeyAppetite to PersonStrength and assigns
 the number of bananas


 */
class Monkey {
    int typeOfMonkey;
    int numberOfMonkeys;
    int monkeyAppetite;

    //constructor
    Monkey() {
        typeOfMonkey = 1;
        numberOfMonkeys = 1;
    }

    //methods to collect data
    public int getNumberOfMonkeys() {

        Scanner input = new Scanner(System.in);
        System.out.println("How many monkeys are there?");
        numberOfMonkeys = input.nextInt();
        return numberOfMonkeys;
    }

    public int getTypeOfMonkey() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which monkey do they most resemble?\n" +
                "1. Curious George/\n" +
                "2. Rafiki\n" +
                "3. King Kong\n");
        typeOfMonkey = input.nextInt();
        return typeOfMonkey;
    }

    //method to calculate monkey appetite
    public int getMonkeyAppetite(int typeOfMonkey, int numberOfMonkeys) {

        monkeyAppetite = (typeOfMonkey*numberOfMonkeys);

        if (monkeyAppetite <= 0) {
            monkeyAppetite = 1;
        } else if (monkeyAppetite > 0 && monkeyAppetite > 1000) {
            monkeyAppetite = 2;
        } else if (monkeyAppetite >= 1000) {
            monkeyAppetite = 3;
        } else monkeyAppetite = 4;
        return monkeyAppetite;
    }
}


class User {
    int height = 1;
    int beers = 1;
    int x = 1;

    //constructor
    User() {
        int height = 1;
        int beers = 1;
    }

    //methods to collect data
    int getHeight() {
        Scanner input = new Scanner(System.in);
        System.out.println("How tall are you?");
        int height = input.nextInt();
        return height;
    }

    int getBeers() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many beers have you drank today?");
        int beers = input.nextInt();
        return beers;
    }

    //method to calculate data - return int
    int getPersonStrength(int height, int beers) {
        int personStrength;

        personStrength = (beers*height);

        if (personStrength <= 0) {
            personStrength = 1;
        } else if (personStrength > 0 && personStrength > 1000) {
            personStrength = 2;
        } else if (personStrength >= 1000) {
            personStrength = 3;
        } else personStrength = 4;

        return personStrength;
    }
}
class Bananas {

    public int getBananas( int personStrength, int monkeyAppetite) {
        //calculate and display result
        int bananas = (15*monkeyAppetite)/personStrength;
        return bananas;
    }
}

class MonkeyController {

int bananas;

    public static void main(String[] args)
            throws java.io.IOException {

        //utilize constructors to make 2 objects
        Monkey monkey1 = new Monkey();
        User user1 = new User();
        Bananas number1 = new Bananas();

        System.out.println("Ahhhhh! The monkeys are after you!\n" +
                "Let's calculate how many bananas you need to fend them off.\n\n");

        //invoke monkey methods
        int numberOfMonkeys = monkey1.getNumberOfMonkeys();
        int typeOfMonkey = monkey1.getTypeOfMonkey();

        int monkeyAppetite = monkey1.getMonkeyAppetite(numberOfMonkeys, typeOfMonkey);

        //invoke user methods
        int height = user1.getHeight();
        int beers = user1.getBeers();

        int personStrength = user1.getPersonStrength(height, beers);

        int bananas = number1.getBananas(personStrength, monkeyAppetite);

        System.out.println("You will need " + bananas + " bananas to fend off all those monkeys!");

    }


}



