package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbConnection {
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";
    private static final String CONN = "jdbc:mysql://localhost/login";
    private static final String SCONN = "jdbc:sqlite:Estate.sqlite";

    public static Connection getConnection()throws SQLException{
        try {
            Connection conn;
            Class.forName("org.sqlite.JDBC");
            conn =  DriverManager.getConnection("jdbc:sqlite:Estate.sqlite");
            return conn;
        }catch (ClassNotFoundException|SQLException ex){
        }
        return null;

    }

}
