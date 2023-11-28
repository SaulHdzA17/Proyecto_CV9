/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;


import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author tania
 */
public class Conexion {
    
 
    /*public static void main(String[] args){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "1234");
        
        System.out.println("Conexion exitosa"  + " - "+ con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }*/
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    Connection conectar;
    
    //Cambiar valores dependiendo de la computadora 
    String usuario="root";
    String password="12345678";
    String bd="FG";
    String ip="localhost";
    String puerto="3306";
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar= DriverManager.getConnection(cadena, usuario, password);
           // JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Mejor nadota"+"----"+ e.toString());
           
        }
        
  return conectar;
    }
    
    
    
    }
    
    
    
    
    
    
    

