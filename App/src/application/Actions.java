//created by Patrycja Karbownik
//application for database
//"TrafficSchool"

package application;

import database.DBUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Trainee;
import model.TraineeAction;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class Actions {

    private static ObservableList<Trainee> traineeList;
    private static ObservableList<String> cityList;
    private static ObservableList<String> streetList;
    private static ObservableList<String> startingDateList;

    public static void searchTrainee(String surname, String name, String pesel) throws SQLException, ClassNotFoundException {
        try {
            traineeList = TraineeAction.searchTrainee(surname, name, pesel);
        } catch (SQLException e) {
            System.out.println("Actions - SQL: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Actions - ClassNotFound: " + e);
        }
    }

    public static ObservableList getTraineeList(){
        return traineeList;
    }

    public static ObservableList getCityList() throws SQLException, ClassNotFoundException {
        cityList = FXCollections.observableArrayList();
        ResultSet result = null;
        String query = "SELECT City FROM ADDRESS GROUP BY City ORDER BY City";

        System.out.println(query);

        try {
            result = DBUtil.dbExecuteQuery(query);
        } catch (SQLException e) {
            System.out.println("Act - SQL select failed: " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            System.out.println("Act - getCity ClassNotFound: " + e);
        }

        while (result.next())
            cityList.add(result.getString("City"));

        return cityList;
    }

    public static ObservableList getStreetList() throws SQLException, ClassNotFoundException {
        streetList = FXCollections.observableArrayList();
        ResultSet result = null;
        String query = "SELECT Street FROM ADDRESS GROUP BY Street ORDER BY Street";

        System.out.println(query);

        try {
            result = DBUtil.dbExecuteQuery(query);
        } catch (SQLException e) {
            System.out.println("Act - SQL select failed: " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            System.out.println("Act - getStreet ClassNotFound: " + e);
        }

        while (result.next())
            streetList.add(result.getString("Street"));

        return streetList;
    }

    public static ObservableList getStartingDateList() {
        startingDateList = FXCollections.observableArrayList();

        startingDateList.add("2018-09-14");
        startingDateList.add("2018-10-05");
        startingDateList.add("2018-10-26");

        return startingDateList;
    }

}
