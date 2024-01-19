
package com.proyecto.connection;

/**
 *
 * @author aspxe
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aspxe
 */
public class Conexion {
    
    private static final String JDBC_URL = "jdbc:mysql://arquitectura-software.cfkhcrzck2ap.us-east-1.rds.amazonaws.com:3306/arquitectura_colaborativo?useSSL=false&useTimeZone=true&serverTimeZone=UTC"
            + "&allowPublicKeyRetrieval=true";

    private static final String JDBC_USER = "aspxe";
    private static final String JDBC_PASSWD = "aspxe0000";
    
    public static Connection conectar() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWD);
    }

    public static void cerrar(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void cerrar(PreparedStatement stmt) throws SQLException {
        stmt.close();
    }

    public static void cerrar(Connection conn) throws SQLException {
        conn.close();
    }

    public static void cerrar(Statement stmt) throws SQLException {
        stmt.close();
    }
}
