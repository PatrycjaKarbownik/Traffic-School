//created by Patrycja Karbownik
//application for database
//"TrafficSchool"

package model;

import database.DBUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class TraineeAction {

    public static ObservableList<Trainee> searchTrainee(String surname, String name, String pesel) throws SQLException, ClassNotFoundException {
        ObservableList<Trainee> list = null;
        ResultSet result = null;
        String query = "SELECT P.Surname, P.Name, P.Pesel, A.City, A.Street, A.Building_number, A.Flat_number " +
                "       FROM PERSON P, TRAINEE T, ADDRESS A " +
                "       WHERE T.Pesel = P.Pesel AND P.Id_addr = A.Id_addr";

        if (surname.compareTo("") != 0) query += " AND P.Surname = '" + surname + "'";
        if (name.compareTo("") != 0) query += " AND P.Name = '" + name + "'";
        if (pesel.compareTo("") != 0) query += " AND T.Pesel = '" + pesel + "'";

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

    public static void insertTrainee(Map<String, Object> context) throws SQLException, ClassNotFoundException {
        Trainee trn = new Trainee();
        trn.setPesel((String) context.get("pesel"));
        trn.setSurname((String) context.get("surname"));
        trn.setName((String) context.get("name"));
        trn.setYear((String) context.get("year"));
        trn.setMonth((String) context.get("month"));
        trn.setDay((String) context.get("day"));
        trn.setCity((String) context.get("city"));
        trn.setStreet((String) context.get("street"));
        trn.setBuilding_no(Integer.parseInt(String.valueOf(context.get("building"))));
        trn.setFlat_no(Integer.parseInt(String.valueOf(context.get("flat")))); // w przypadku NULL problem !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        trn.setStarting_date((String) context.get("starting_date"));

        System.out.println(context.get("theory").toString());
        if ((Boolean) context.get("theory")) trn.setTheory('T');
        else trn.setTheory('F');
        if ((Boolean) context.get("internal_exam")) trn.setInternal_exam('T');
        else trn.setInternal_exam('F');


        System.out.println("INSERT TRAINEE");
        DBUtil.dbTraineeTransaction(trn);
    }


}
