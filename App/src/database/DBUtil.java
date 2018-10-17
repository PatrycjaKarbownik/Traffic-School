//created by Patrycja Karbownik
//application for database
//"TrafficSchool"

package database;

import com.sun.rowset.CachedRowSetImpl;
import model.Trainee;

import java.sql.*;

public class DBUtil {
    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

    private static Connection connection = null;

    private static final String connectionString = "jdbc:oracle:thin:hr/hr@localhost:1521/xe";

    public static void dbConnect() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("DBUtil - JDBC Driver failed");
            e.printStackTrace();
            throw e;
        }

        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException e) {
            System.out.println("DBUtil - Connection failed!" + e);
            e.printStackTrace();
            throw e;
        }

    }

    public static void dbDisconnect() throws SQLException {
        try {
            if (connection != null && !connection.isClosed())
                connection.close();
        } catch (Exception e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static CachedRowSetImpl dbExecuteQuery(String query) throws SQLException, ClassNotFoundException {
        Statement statement = null;
        ResultSet result = null;
        CachedRowSetImpl crs = null;

        try {
            dbConnect();
            System.out.println("connect");
            statement = connection.createStatement();
            result = statement.executeQuery(query);

            crs = new CachedRowSetImpl();
            crs.populate(result);
        } catch (SQLException e) {
            System.out.println("DBUtil - Problem occurated at executeQuery operation: " + e);
            throw e;
        } finally {
            if (result != null)
                result.close();
            if (statement != null)
                statement.close();

            dbDisconnect();
            System.out.println("disconnect");
        }

        return crs;
    }

    public static void dbTraineeTransaction(Trainee trn) throws SQLException {
        Statement statement = null;
        ResultSet result = null;
        String id_addr = null;
        CachedRowSetImpl crs = null;

        String queryIdAddress = "SELECT Id_addr FROM ADDRESS WHERE city = '" + trn.getCity() + "' AND street = '" + trn.getStreet() + "' AND building_number = " + trn.getBuilding_no();
        if (trn.flat_noProperty() != null) queryIdAddress += " AND flat_number = " + trn.getFlat_no();

        System.out.println(queryIdAddress);

        try {
            dbConnect();
            System.out.println("dbConnect");
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            System.out.println("createStatement");
            result = statement.executeQuery(queryIdAddress);
            crs = new CachedRowSetImpl();
            crs.populate(result);
            result = crs;
            System.out.println("executeQuery IDADDR");

            if (!result.first()) {
                System.out.println("if-wewnatrz");
                String insertAddress = "INSERT INTO ADDRESS (City, Street, Building_number, Flat_number) " +
                        "VALUES ('" + trn.getCity() + "', '" + trn.getStreet() + "', " + trn.getBuilding_no() + ", ";
                if (trn.flat_noProperty() != null)
                    insertAddress += trn.flat_noProperty().getValue() + ")";
                else insertAddress += "null)";

                System.out.println(insertAddress);
                System.out.println("rows: " + statement.executeUpdate(insertAddress));
                result = statement.executeQuery(queryIdAddress);
            }

            result.next();
            System.out.println("id_addr = " + result.getString("Id_addr"));
            id_addr = result.getString("Id_addr");

            // id_addr = null;

            String insertPerson = "INSERT INTO PERSON (Pesel, Surname, Name, Birthday, ID_addr) " +
                    "VALUES ('" + trn.getPesel() + "', '" + trn.getSurname() + "', '" + trn.getName() +
                    "', to_date('" + trn.getYear() + "-" + trn.getMonth() + "-" + trn.getDay() +
                    "', 'yyyy-mm-dd'), " + id_addr + ")";

            String insertTrainee = "INSERT INTO TRAINEE (Pesel, Starting_date, Theory, Internal_exam)" +
                    "VALUES ('" + trn.getPesel() + "', to_date('" + trn.getStarting_date() +
                    "', 'yyyy-mm-dd'), '" + trn.getTheory() + "', '" + trn.getInternal_exam() + "')";

            System.out.println(insertPerson);
            System.out.println("rows: " + statement.executeUpdate(insertPerson));
            System.out.println(insertTrainee);
            System.out.println("rows: " + statement.executeUpdate(insertTrainee));


        } catch (SQLException e) {
            connection.rollback();
            System.out.println("DBUtil - insertTrn SQL: " + e);
        } catch (ClassNotFoundException e) {
            connection.rollback();
            System.out.println("DBUtil - insertTrn ClassNF: " + e);
        } finally {
            if (statement != null)
                statement.close();
        }

        connection.commit();
        dbDisconnect();

    }


}
