package application;

import javafx.collections.ObservableList;
import model.Trainee;
import model.TraineeAction;

import java.sql.SQLException;

public class Actions {

    private static ObservableList<Trainee> traineeList;

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
}
