package DataAccess;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class OJDataHelper {

    private static final String URL = "jdbc:sqlite:design/database.db";

    public static Connection openConnection() throws SQLException {
        File dbFile = new File("design/database.db");
        if (!dbFile.exists()) {
            throw new SQLException("El archivo de la base de datos no se encuentra en la ubicación especificada.");
        }
        return DriverManager.getConnection(URL);
    }
   

}



