package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */
class eventPlanning {
    public static void main(String [] args) {
        Events birthday = new Events();
        birthday.setOccasion("Alex's birthday");
        birthday.setLocation("The Beer Hall");
        birthday.setDate(" March 26th");
        birthday.setStartTime("7pm");
        birthday.setEndTime("11pm");

        //these won't work until after the variables have been retrieved
//        System.out.println(birthday.invitation());
//        System.out.println();
//        System.out.println(birthday.invitation(occasion,location,date));
//        System.out.println();
//        System.out.println(birthday.invitation(occasion, location, date, startTime, endTime));

        String occasion = birthday.getOccasion();
        String location = birthday.getLocation();
        String date = birthday.getDate();
        String startTime = birthday.getStartTime();
        String endTime = birthday.getEndTime();

        System.out.println(birthday.invitation());
        System.out.println();
        System.out.println(birthday.invitation(occasion,location,date));
        System.out.println();
        System.out.println(birthday.invitation(occasion, location, date, startTime, endTime));
    }

}

class Events {
    private String occasion, location, date, startTime, endTime;
    private int guestsInvited, yesRSVP, noRSVP, awaitingRSVP;
    private double budget;
    private boolean isMeal;



    String invitation() {
        String invitationMessage = "You're Invited!";
        return invitationMessage;
    }

    String invitation(String occassion, String location, String date){
        String invitationMessage = "You're Invited!\nLet's celebrate " + occassion + " at " + location + " on " + date + ".";
        return invitationMessage;
    }

    String invitation(String occassion, String location, String date, String startTime, String endTime){
        String invitationMessage = "You're Invited!\nLet's celebrate " + occassion + " at " + location + " on " + date + "\n" +
                "from " + startTime + " until " + endTime + ".";
        return invitationMessage;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getGuestsInvited() {
        return guestsInvited;
    }

    public void setGuestsInvited(int guestsInvited) {
        this.guestsInvited = guestsInvited;
    }

    public int getYesRSVP() {
        return yesRSVP;
    }

    public void setYesRSVP(int yesRSVP) {
        this.yesRSVP = yesRSVP;
    }

    public int getNoRSVP() {
        return noRSVP;
    }

    public void setNoRSVP(int noRSVP) {
        this.noRSVP = noRSVP;
    }

    public int getAwaitingRSVP() {
        return awaitingRSVP;
    }

    public void setAwaitingRSVP(int awaitingRSVP) {
        this.awaitingRSVP = awaitingRSVP;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean isMeal() {
        return isMeal;
    }

    public void setMeal(boolean meal) {
        isMeal = meal;
    }
}