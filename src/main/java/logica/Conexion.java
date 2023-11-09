
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
    public String db = "tienda_alimentos";
    public String url = "jdbc:mysql://127.0.0.1/"+db;
    public String user = "root";
    public String pass = "";

    public Conexion() {
    }
    
    public Connection conectar() throws ClassNotFoundException{
        Connection link =null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url, this.user, this.pass);
        }catch (SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
}