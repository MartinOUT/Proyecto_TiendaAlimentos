
package logica;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Martin Cardozo
 */
public class Conexion {
    Connection con;
    public Connection geConnection(){
        try {
            String myBD = "jdbc:mysql://localthost:3306/tienda_alimentos?serverTimezone=UTC";
            con  = DriverManager.getConnection(myBD, "root", "");
            return con;
            
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
