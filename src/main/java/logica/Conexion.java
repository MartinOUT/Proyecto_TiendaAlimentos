
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin Cardozo
 */
public class Conexion {
    private final String URL = "jdbc:mysql://localhost:3306/tienda_alimentos";
    private final String USER = "root";
    private final String PASSWORD = "";

    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver no encontrado", e);
        }
    }

}