package database;

import com.sun.rowset.CachedRowSetImpl;

import java.sql.*;

public class DBUtil {
    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

    private static Connection connection = null;

    private static final String connectionString = "jdbc:oracle:thin:HR/HR@localhost:1521/xe";

    public static void dbConnect() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver failed");
            e.printStackTrace();
            throw e;
        }

        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException e) {
            System.out.println("Connection failed!" + e);
            e.printStackTrace();
            throw e;
        }

    }

    public static void dbDisconnect() throws SQLException {
        try {
            if(connection != null && !connection.isClosed())
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
            statement = connection.createStatement();
            result = statement.executeQuery(query);

            crs = new CachedRowSetImpl();
            crs.populate(result);
        } catch (SQLException e) {
            System.out.println("Problem occurated at executeQuery operation: " + e);
            throw e;
        } finally {
            if(result != null)
                result.close();
            if(statement != null)
                statement.close();

            dbDisconnect();
        }

        return crs;
    }


}
