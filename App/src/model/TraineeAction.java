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
        if ((Boolean) context.get("theory")) trn.setTheory('T');
        else trn.setTheory('F');
        if ((Boolean) context.get("internal_exam")) trn.setInternal_exam('T');
        else trn.setInternal_exam('F');

        String id_addr = null;

        System.out.println("INSERT TRAINEE");

        try {
            System.out.println("insertAddress");
            id_addr = insertAddress(trn.getCity(), trn.getStreet(), trn.getBuilding_no(), trn.getFlat_no());
            System.out.println("id_addr = " + id_addr);
        } catch (SQLException e) {
            System.out.println("TrnAct - insertTrn SQL: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("TrnAct - insertTrn ClassNF: " + e);
        }

        String insertPerson = "INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr) " +
                "VALUES ('" + trn.getPesel() + "', '" + trn.getSurname() + "', '" + trn.getName() +
                "', to_date('" + trn.getYear() + "-" + trn.getMonth() + "-" + trn.getDay() +
                "', 'yyyy-mm-dd'), " + id_addr + ")";

        String insertTrainee = "INSERT INTO TRAINEE (Pesel, Starting_date, Theory, Internal_exam)" +
                "VALUES ('" + trn.getPesel() + "', to_date('" + trn.getStarting_date() +
                "', 'yyyy-mm-dd'), '" + trn.getTheory() + "', '" + trn.getInternal_exam() + "')";

        try {
            System.out.println("insertPerson");
            DBUtil.dbInsert(insertPerson);
            System.out.println("insertTrainee");
            DBUtil.dbInsert(insertTrainee);
        } catch (SQLException e) {
            System.out.println("TrnAct - insertTrn2 SQL: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("TrnAct - insertTrn2 ClassNF: " + e);
        }



        //test

        ResultSet result = null;
        String query = "SELECT Surname, Name, Pesel FROM PERSON WHERE Pesel = '" + trn.getPesel() + "'";

        System.out.println("TEST");
        System.out.println(query);

        try {
            System.out.println("test 1");
            result = DBUtil.dbExecuteQuery(query);
        } catch (SQLException e) {
            System.out.println("TrnAct - SQL select failed: " + e);
          //  throw e;
        } catch (ClassNotFoundException e) {
            System.out.println("TrnAct - getStreet ClassNotFound: " + e);
        }

        System.out.println("test 2");
        result.next();
        System.out.println(result.getString("Surname") + " " + result.getString("Name") + " " + result.getString("Pesel"));

    }

    public static String insertAddress(String city, String street, Integer building, Integer flat) throws SQLException, ClassNotFoundException {
        String id_addr = null;
        String query = "SELECT Id_addr FROM ADDRESS WHERE city = '" + city + "' AND street = '" + street + "' AND building_number = " + building;
        if (flat != null) query += " AND flat_number = " + flat;

        System.out.println(query);

        ResultSet result = null;

        try {
            System.out.println("result 1");
            result = DBUtil.dbExecuteQuery(query);
            System.out.println("result 2");
        } catch (SQLException e) {
            System.out.println("TrnAct - insertAddr SQL: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("TrnAct - insertAddr ClassNF: " + e);
        }

        if (!result.first()) {
            String insertAddress = "INSERT INTO ADDRESS (City, Street, Building_number, Flat_number) " +
                    "VALUES ('" + city + "', '" + street + "', " + building + ", " + flat + ")";

            System.out.println(insertAddress);
            try {
                System.out.println("insert");
                DBUtil.dbInsert(insertAddress);
                System.out.println("result = dbExecute");
                result = DBUtil.dbExecuteQuery(query);
            } catch (SQLException e) {
                System.out.println("TrnAct - insertAddr2 SQL: " + e);
            } catch (ClassNotFoundException e) {
                System.out.println("TrnAct - insertAddr2 ClassNF: " + e);
            }
        }

        result.next();
        System.out.println(result.getString("Id_addr"));

        return result.getString("Id_addr");
    }
}
