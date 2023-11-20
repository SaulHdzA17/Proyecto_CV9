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
    
    public void validarUsuario(JTextField Usuario, JPasswordField Password){
        
    try{
        
    ResultSet rs=null;
    PreparedStatement ps = null;
    
    Ventana.Conexion objetoConexion = new Ventana.Conexion();
    String consulta="select * from Usuario3 where Usuario3.ingresoUsr=(?) and Usuario3.ingresoPsw=(?);";
        ps=objetoConexion.estableceConexion().prepareStatement(consulta);
        
        
        
        String contra = String.valueOf(Password.getPassword());
        ps.setString(1, Usuario.getText());
        ps.setString(2, contra);
        
        rs= ps.executeQuery();
        
        if(rs.next()){
            JOptionPane.showMessageDialog(null, "Usuario correcto");
            InicioAdmin objetoInicioAdmin = new InicioAdmin();
            objetoInicioAdmin.setVisible(true);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
        }
        
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "MEJOR NADOTA"+ e.toString());
    }}


    
}
