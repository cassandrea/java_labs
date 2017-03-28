package part_07;

/**
 Write three subclasses (with at least 3 methods each that not getters and setters) that extend the super
 class. Make sure each subclass can manipulate the private variables in the super class. One subclass should
 extend another subclass which extends the super class. Each subclass should only have variables and methods
 that apply to that subclass, ie Animal -> Mammal -> Whale.

 Make use of the keyword "super" in at least two constructors.
 */
public class Beer extends TastyBeverages{
    //private variables
    private int IBU;
    private String brewery;
    private String typeOfBeer;
    private boolean canned;

    //3 methods
    public int beerMethod1(int IBU) {
        return IBU/2;
    }
    public void beerMethod2() {
        System.out.println("method 2");
    }
    public String beerMethod3(String brewery, String typeOfBeer){
        return brewery+typeOfBeer;
    }

    //constructors
    public Beer(){
        //default
    }
    public Beer(int IBU, String brewery, String typeOfBeer, boolean canned) {
        this.IBU = IBU;
        this.brewery = brewery;
        this.typeOfBeer = typeOfBeer;
        this.canned = canned;
    }
    public Beer(int amount, double cost, String name, String brand, boolean containsAlcohol, double ABV, int IBU, String brewery, String typeOfBeer, boolean canned) {
        super(amount, cost, name, brand, containsAlcohol, ABV);
        this.IBU = IBU;
        this.brewery = brewery;
        this.typeOfBeer = typeOfBeer;
        this.canned = canned;
    }

    //getters and setters
    public int getIBU() {
        return IBU;
    }

    public void setIBU(int IBU) {
        this.IBU = IBU;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public String getTypeOfBeer() {
        return typeOfBeer;
    }

    public void setTypeOfBeer(String typeOfBeer) {
        this.typeOfBeer = typeOfBeer;
    }

    public boolean isCanned() {
        return canned;
    }

    public void setCanned(boolean canned) {
        this.canned = canned;
    }
}
