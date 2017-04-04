package part_09;

import java.sql.*;

public class MyDbTest {

    private PreparedStatement preparedStatement = null;
    //private Statement statement = null;
    private ResultSet resultSet = null;
    private Connection connection = null;

    public static void main(String[] args) {
        MyDbTest c = new MyDbTest();
        try {
            c.mySqlConnection();
            c.createTable();
            c.insertRecord(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2], args[3], Double.parseDouble(args[4]));
            c.getRecord();
            c.updateRecord(args[5], Integer.parseInt(args[6]));
            c.getRecord();
            c.deleteRecord(Integer.parseInt(args[7]));

        } catch (Exception e){
            System.out.println("error in mySqlConnection()" + e.getMessage());
            System.out.println(e.getStackTrace());
        }

    }
    private void mySqlConnection() {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost/car_dealership?" +
                    "user=USER&password=PASSWORD&useSSL=false");
            // Statements allow to issue SQL queries to the database
            //statement = connection.createStatement();
           }
        catch (Exception e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
    //create table
    private void createTable() {
        try {
            preparedStatement = connection.
                    prepareStatement("CREATE TABLE leases ("
                            + "contractNumber INT PRIMARY KEY NOT NULL AUTO_INCREMENT,"
                            + "userID INT NOT NULL,"
                            + "carID INT NOT NULL,"
                            + "startMonthYear VARCHAR(255),"
                            + "endMonthYear VARCHAR(255),"
                            + "monthlyPayment DOUBLE)");
            preparedStatement.executeUpdate();
        }catch (Exception e){ System.out.println("Error in createTable()");}
    }
    //insert into table
    private void insertRecord(int userID, int carID, String startMonthYear, String endMonthYear, Double monthlyPayment) {
        try {
            preparedStatement = connection.
                prepareStatement(" INSERT INTO car_dealership.leases " +
                        "(userID, carID, startMonthYear, endMonthYear, monthlyPayment) VALUES (?,?,?,?,?)");
        // Parameters start with 1
            preparedStatement.setInt(1, userID);
            preparedStatement.setInt(2, carID);
            preparedStatement.setString(3, startMonthYear);
            preparedStatement.setString(4, endMonthYear);
            preparedStatement.setDouble(5, monthlyPayment);
            preparedStatement.executeUpdate();
        }catch (Exception e){ System.out.println("Error in insertRecord()");}
    }
    //update record by contract number
    private void updateRecord(String endMonthYear, int contractNumber) {
        try {
            preparedStatement = connection.
                prepareStatement("UPDATE car_dealership.leases SET endMonthYear=? WHERE contractNumber=?");
            preparedStatement.setString(1, endMonthYear);
            preparedStatement.setInt(2, contractNumber);
            preparedStatement.executeUpdate();
        }catch (Exception e){ System.out.println("Error in updateRecord()");}
    }
    //delete record by contract number
    private void deleteRecord(int contractNumber) {
        try {
            preparedStatement = connection.
                prepareStatement("DELETE FROM car_dealership.leases WHERE contractNumber=?");
            preparedStatement.setInt(1, contractNumber);
            preparedStatement.executeUpdate();
    }catch (Exception e){ System.out.println("Error in deleteRecord()");}
    }
    //get records
    private void getRecord() {
        try {
            preparedStatement = connection.
                prepareStatement("SELECT * FROM car_dealership.leases");
            resultSet = preparedStatement.executeQuery();
            writeResultSet(resultSet);
        }catch (Exception e){ System.out.println("Error in getRecord()");}
    }
    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getString(2);
            int contractNumber = resultSet.getInt("contractNumber");
            int userID = resultSet.getInt("userID");
            int carID = resultSet.getInt("carID");
            String startMonthYear = resultSet.getString("startMonthYear");
            String endMonthYear = resultSet.getString("endMonthYear");
            double monthlyPayment = resultSet.getDouble("monthlyPayment");
            System.out.println("Contract Number: " + contractNumber);
            System.out.println("User ID: " + userID);
            System.out.println("Car ID: " + carID);
            System.out.println("Start Month and Year: " + startMonthYear);
            System.out.println("End Month and Year: " + endMonthYear);
            System.out.println("Monthly Payment: " + monthlyPayment);
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");
        }
    }
}









