package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class CodingNomads {
    public static void main(String[] args) {
        Course Bali = new Course();

        System.out.println("Title: " + Bali.getTitle());
        System.out.println("Location: " + Bali.getLocation());
        System.out.println("Instructor: " + Bali.getInstructor());
        System.out.println("Class Size " + Bali.getClassSize());
        System.out.println("Number of Days:  " + Bali.getNoOfDays());

        Bali.setTitle("CodingNomads Bali");
        Bali.setLocation("Ubud, Bali");
        Bali.setInstructor("Ryan");
        Bali.setClassSize(5);
        Bali.setNoOfDays(60);

        System.out.println("Title: " + Bali.getTitle());
        System.out.println("Location: " + Bali.getLocation());
        System.out.println("Instructor: " + Bali.getInstructor());
        System.out.println("Class Size " + Bali.getClassSize());
        System.out.println("Number of Days:  " + Bali.getNoOfDays());

        Bali.lessonPlan();
    }
}

class Course {
    private String title, location, instructor;
    private int classSize, noOfDays;

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    public String getInstructor() {return instructor;}

    public void setInstructor(String instructor) {this.instructor = instructor;}

    public int getClassSize() {return classSize;}

    public void setClassSize(int classSize) {this.classSize = classSize;}

    public int getNoOfDays() {return noOfDays;}

    public void setNoOfDays(int noOfDays) {this.noOfDays = noOfDays;}



    public void lessonPlan(){

        Lesson JavaAWS = new Lesson();

        System.out.println("Lesson Name: " + JavaAWS.getLessonName());
        System.out.println("Lesson Number: " + JavaAWS.getLessonNumber());
        System.out.println("Key Concepts: " + JavaAWS.getConcepts());
        System.out.println("Number of Exercises: " + JavaAWS.getNoOfExercises());

        JavaAWS.setLessonName("A Closer Look at Methods and Classes");
        JavaAWS.setLessonNumber(6);
        JavaAWS.setConcepts("Access Control Modifiers, Method Overloading, Recursion and Static Variables");
        JavaAWS.setNoOfExercises(9);

        System.out.println("Lesson Name: " + JavaAWS.getLessonName());
        System.out.println("Lesson Number: " + JavaAWS.getLessonNumber());
        System.out.println("Key Concepts: " + JavaAWS.getConcepts());
        System.out.println("Number of Exercises: " + JavaAWS.getNoOfExercises());

        return;
    }
}

class Lesson {
    private String lessonName, concepts;
    private int lessonNumber, noOfExercises;

    public String getLessonName() {return lessonName;}

    public void setLessonName(String lessonName) {this.lessonName = lessonName;}

    public String getConcepts() {return concepts;}

    public void setConcepts(String concepts) {this.concepts = concepts;}

    public int getLessonNumber() {return lessonNumber;}

    public void setLessonNumber(int lessonNumber) {this.lessonNumber = lessonNumber;}

    public int getNoOfExercises() {return noOfExercises;}

    public void setNoOfExercises(int noOfExercises) {this.noOfExercises = noOfExercises;}
}
