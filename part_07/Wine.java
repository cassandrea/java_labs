package part_07;


/**
 Write three subclasses (with at least 3 methods each that not getters and setters) that extend the super
 class. Make sure each subclass can manipulate the private variables in the super class. One subclass should
 extend another subclass which extends the super class. Each subclass should only have variables and methods
 that apply to that subclass, ie Animal -> Mammal -> Whale.

 Make use of the keyword "super" in at least two constructors.
 */
public class Wine extends TastyBeverages{
    //private variables
    private String typeOfGrape;
    private String winery;
    private boolean red;
    private boolean sparkling;
    private int vintage;

    //3 methods
    public int age(int currentYear) {
        return currentYear-vintage;
    }
    public void wineMethod2() {
        System.out.println("method 2");
    }
    public String wineMethod3(String typeOfGrape, String winery){
        return winery+typeOfGrape;
    }

    //constructors
    public Wine(){
        //default
    }
    public Wine(String typeOfGrape, String winery, boolean red, boolean sparkling, int vintage) {
        this.typeOfGrape = typeOfGrape;
        this.winery = winery;
        this.red = red;
        this.sparkling = sparkling;
        this.vintage = vintage;
    }
    public Wine(int amount, double cost, String name, String brand, boolean containsAlcohol, double ABV, String typeOfGrape, String winery, boolean red, boolean sparkling, int vintage) {
        super(amount, cost, name, brand, containsAlcohol, ABV);
        this.typeOfGrape = typeOfGrape;
        this.winery = winery;
        this.red = red;
        this.sparkling = sparkling;
        this.vintage = vintage;
    }

    //getters and setters
    public String getTypeOfGrape() {
        return typeOfGrape;
    }

    public void setTypeOfGrape(String typeOfGrape) {
        this.typeOfGrape = typeOfGrape;
    }

    public String getWinery() {
        return winery;
    }

    public void setWinery(String winery) {
        this.winery = winery;
    }

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public boolean isSparkling() {
        return sparkling;
    }

    public void setSparkling(boolean sparkling) {
        this.sparkling = sparkling;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }
}