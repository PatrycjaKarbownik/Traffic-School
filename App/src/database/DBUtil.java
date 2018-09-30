package database;

import java.sql.Connection;

public class DBUtil {
    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

    private static Connection connection = null;

    private static final String connectionString = "jdbc:oracle:thin:HR/HR@localhost:1521/xe";


}
