package part_07;

/**
 Write one super class with at least 3 private instance variables and at least 3 public methods
 */
public class TastyBeverages implements ThingsISpendMoneyOn{
    private int amount;
    private double cost;
    private String name;
    private String brand;
    private boolean containsAlcohol;
    private double ABV;
    private double totalCost;

    public void drink() {
        System.out.println("mmmm... tasty!");
    }
    public double totalCost(int amount, double cost) {
        totalCost = amount * cost;
        return totalCost;
    }
    public void beverageMethod3(){
        System.out.println("Method 3");
    }

    //implement interface methods
    public double monthlySpending(int timesPerMonth){
        return timesPerMonth*totalCost;
    }
    public int method2(){
        return amount /2;
    }
    public void method3(){
        String brandName = (brand + name);
    }

    //constructors
    public TastyBeverages(){
        //default
    }

    public TastyBeverages(int amount, double cost, String name, String brand, boolean containsAlcohol, double ABV) {
        this.amount = amount;
        this.cost = cost;
        this.name = name;
        this.brand = brand;
        this.containsAlcohol = containsAlcohol;
        this.ABV = ABV;
    }

    public TastyBeverages(int amount, double cost, String brand, boolean containsAlcohol) {
        this.amount = amount;
        this.cost = cost;
        this.brand = brand;
        this.containsAlcohol = containsAlcohol;
    }

    //getters and setters
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isContainsAlcohol() {
        return containsAlcohol;
    }

    public void setContainsAlcohol(boolean containsAlcohol) {
        this.containsAlcohol = containsAlcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getABV() {
        return ABV;
    }

    public void setABV(double ABV) {
        this.ABV = ABV;
    }
}
