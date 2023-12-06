/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.lang.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author tania
 */
public class Login {
    
    public int validarUsuario(JTextField Usuario, JPasswordField Password){
        
    try{
        
    ResultSet rs=null;
    PreparedStatement ps = null;
    
    Ventana.Conexion objetoConexion = new Ventana.Conexion();
    String consulta="select ID from Personal where Personal.usuario=(?) and Personal.contraseña=(?);";
    
        ps=objetoConexion.estableceConexion().prepareStatement(consulta);
        
        
        
        String contra = String.valueOf(Password.getPassword());
        ps.setString(1, Usuario.getText());
        ps.setString(2, contra);
        
        rs= ps.executeQuery();
        
        if(rs.next()){
            //Muestro y guardo el ID del usuario activo despues de un login exitoso
            System.out.print("El ID del usuario es: "+ rs.getInt("id"));
            SesionUsuario.setUsuarioActivo(rs.getInt("id"));
            
            JOptionPane.showMessageDialog(null, "Usuario correcto");
            InicioAdmin objetoInicioAdmin = new InicioAdmin();
            objetoInicioAdmin.setVisible(true);
            return 1;
            
            
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            return 0;
        }
        
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "MEJOR NADOTA"+ e.toString());
    }
    return 0;
    
    }


    
}
