package model;

import database.DBUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TraineeAction {

    public static ObservableList<Trainee> searchTrainee(String surname, String name, String pesel) throws SQLException, ClassNotFoundException {
        ObservableList<Trainee> list = null;
        ResultSet result = null;
        String query = "SELECT P.Surname, P.Name, P.Pesel, A.City, A.Street, A.Building_number, A.Flat_number " +
                "       FROM PERSON P, TRAINEE T, ADDRESS A " +
                "       WHERE T.Pesel = P.Pesel AND P.Id_addr = A.Id_addr";

        if(surname != null) query += " AND P.Surname = '" + surname + "'";
        if(name != null) query += " AND P.Name = '" + name + "'";
        if(pesel != null) query += " AND T.Pesel = '" + pesel + "'";
        //query += ";";

        System.out.println(query);

        try {
            result = DBUtil.dbExecuteQuery(query);
        } catch (SQLException e) {
            System.out.println("TrnAct - SQL select failed: " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            System.out.println("TrnAct - searchTrainee ClassNotFound: " + e);
        }

        try {
            list = getTraineeList(result);
        } catch (SQLException e) {
            System.out.println("TrnAct - SQL select 2: " + e);
        }

        return list;
    }

    private static ObservableList<Trainee> getTraineeList(ResultSet result) throws SQLException {
        ObservableList<Trainee> list = FXCollections.observableArrayList();

        while (result.next()) {
            Trainee trn = new Trainee();
            trn.setSurname(result.getString("Surname"));
            trn.setName(result.getString("Name"));
            trn.setPesel(result.getString("Pesel"));
            trn.setCity(result.getString("City"));
            trn.setStreet(result.getString("Street"));
            trn.setBuilding_no(result.getInt("Building_number"));
            trn.setFlat_no(result.getInt("Flat_number"));

            list.add(trn);
        }
        return list;
    }
}
