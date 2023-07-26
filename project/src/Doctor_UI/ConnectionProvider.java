package Doctor_UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class ConnectionProvider {

    private static Connection Conn;
    private static final String DATABASE_SERVER = "localhost";
    private static final String DATABASE_NAME = "CLINICMANAGEMENT";
    private static final String DATABASE_USERNAME = "sa";
    private static final String DATABASE_PASSWORD = "12345678";

    public static Connection getConnection() {
        if (Conn != null) {
            return Conn;
        } else {
            String url = String.format("jdbc:sqlserver://%s;DatabaseName = %s;username=%s;password=%s;trustServerCertificate =true;",
                    DATABASE_SERVER,DATABASE_NAME,DATABASE_USERNAME,DATABASE_PASSWORD);
            try {
                  Conn = DriverManager.getConnection(url);
                  return Conn;
            } catch (Exception e) {
                return null;
            }
        }
    }
   
}
