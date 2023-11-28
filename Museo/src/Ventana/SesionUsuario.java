/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;

/**
 *
 * @author jauregui
 */
public class SesionUsuario {
    private static int IDusuarioActivo;

    public static void setUsuarioActivo(int idnombreDeUsuario) {
        IDusuarioActivo = idnombreDeUsuario;
    }

    public static int getUsuarioActivo() {
        return IDusuarioActivo;
    }
    
}
