/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jauregui
 */
public class TipoDeMenuLateral {
    
    //Obtengo al usuario Activo
    int idusuario = SesionUsuario.getUsuarioActivo();
    
    public String MostrarMenu(){
        //Establezco conexion
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
        
        if(conexion != null){
            //Consulta SQL
            String consulta = "SELECT rol FROM Personal WHERE id = ?";
            PreparedStatement st = null; 
            ResultSet rs = null;
            
       try{
        
            st = conexion.prepareStatement(consulta); 
            
            st.setInt(1, idusuario);
            
            //Ejecutar consulta 
            rs = st.executeQuery();
            
            if(rs.next()){
                String rol = rs.getString("rol");
                //Retorno el valor de la consulta 
                return rol;
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error en clase tipoMenuLateral: " + e.toString());
       } finally {
           try {
               if (rs != null) rs.close();
               if (st != null) st.close();
           }catch(SQLException e){
               e.printStackTrace();
               JOptionPane.showMessageDialog(null, "Error en clase tipoMenuLateral v1: " + e.toString());
           }
       }
        }
        
        return "";
    }
    

}
