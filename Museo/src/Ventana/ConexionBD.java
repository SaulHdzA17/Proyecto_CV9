package Ventana;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author SAUL
 */
public class ConexionBD {
    Connection conectar = null;
    String usuario = "root";
    String contraseña = "Alonso.172001";
    String bd = "fillgaps";
    String ip = "localhost";
    String puerto ="3306";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection establecerConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Queda pendiente la dependencia de SQL.
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "Se conectó a la base de datos");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "No se conectó a la base de datos" + e.toString());
        }
        
        return conectar;
    }
}
