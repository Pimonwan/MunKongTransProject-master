package model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
    protected List<String> allBusStop = new ArrayList<String>();

    public void getBusStop(String busNumber) {
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:BusSystem.db";
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected to the getAllBusStop....");

                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();

                String query = "Select * from stopping WHERE bus_number = "+busNumber;
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(query);


                while (resultSet.next()){
                    String bus = resultSet.getString("busStop_name");
                    allBusStop.add(bus);
                }
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public List<String> getAllBusStop(){
        return allBusStop;
    }

    public void resetBusStopList(){
        allBusStop.clear();
    }

}
