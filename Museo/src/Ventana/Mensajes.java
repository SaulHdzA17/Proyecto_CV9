/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Map;
import java.util.HashMap;




/**
 *
 * @author jauregui
 */
public class Mensajes extends javax.swing.JFrame {

    /**
     * Creates new form Mensajes
     */
    public Mensajes() {
        initComponents();
      
        TipoMenu();
       
        Fecha.setText(fechaActual());
        Calendar cal= Calendar.getInstance();
        String hora;
        
        hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        
        this.Hora.setText(hora);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        MenuLateralPanel = new javax.swing.JPanel();
        PanelInfoFecha = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        PanelContenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMensajes = new javax.swing.JTable();
        VerMensajes = new javax.swing.JButton();
        NuevoMensaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 690));

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuLateralPanel.setPreferredSize(new java.awt.Dimension(250, 690));

        javax.swing.GroupLayout MenuLateralPanelLayout = new javax.swing.GroupLayout(MenuLateralPanel);
        MenuLateralPanel.setLayout(MenuLateralPanelLayout);
        MenuLateralPanelLayout.setHorizontalGroup(
            MenuLateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        MenuLateralPanelLayout.setVerticalGroup(
            MenuLateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        BG.add(MenuLateralPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelInfoFecha.setBackground(new java.awt.Color(116, 141, 181));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hoy es ");

        Fecha.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Fecha.setForeground(new java.awt.Color(255, 255, 255));

        Hora.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Hora.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelInfoFechaLayout = new javax.swing.GroupLayout(PanelInfoFecha);
        PanelInfoFecha.setLayout(PanelInfoFechaLayout);
        PanelInfoFechaLayout.setHorizontalGroup(
            PanelInfoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoFechaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        PanelInfoFechaLayout.setVerticalGroup(
            PanelInfoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoFechaLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(PanelInfoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        BG.add(PanelInfoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 790, 140));

        PanelContenido.setBackground(new java.awt.Color(255, 255, 255));

        TablaMensajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaMensajes.setEnabled(false);
        jScrollPane1.setViewportView(TablaMensajes);

        VerMensajes.setText("Ver mis mensajes");
        VerMensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerMensajesMouseClicked(evt);
            }
        });
        VerMensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMensajesActionPerformed(evt);
            }
        });

        NuevoMensaje.setText("Nuevo Mensaje");
        NuevoMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoMensajeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenidoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenidoLayout.createSequentialGroup()
                        .addComponent(VerMensajes)
                        .addGap(18, 18, 18)
                        .addComponent(NuevoMensaje)
                        .addGap(180, 180, 180))))
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerMensajes)
                    .addComponent(NuevoMensaje))
                .addContainerGap())
        );

        BG.add(PanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 790, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerMensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMensajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerMensajesActionPerformed

    private void NuevoMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMensajeMouseClicked
        // TODO add your handling code here:
        VentanaNuevoMensaje VNM = new VentanaNuevoMensaje();
        MostrarPanel(VNM);
    }//GEN-LAST:event_NuevoMensajeMouseClicked

    private void VerMensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerMensajesMouseClicked
        // TODO add your handling code here:
        MostrarMensajes();
    }//GEN-LAST:event_VerMensajesMouseClicked
    
    
    private void TipoMenu(){
        TipoDeMenuLateral tipoMenu = new TipoDeMenuLateral();
        
        String rol = tipoMenu.MostrarMenu();
        System.out.println("El rol del usuario activo es: " + rol);
        //MenuLateral ML = new MenuLateral();
        //MostrarPanel(ML);
        
        switch(rol){
            case "Director":
                MenuLateral ML = new MenuLateral();
                MostrarPanelLateral(ML);
                break;
                
            case "Conservador":
            case "Restaurador":
            case "Investigador":
            case "Catalogador": //Analizar si aqui se debe de poner a lso educadores
                MenuLateral_IC MLIC = new MenuLateral_IC();
                MostrarPanelLateral(MLIC);
                break;
                
            case "Encargado de CIE":
                MenuLateralEncargado_C_I MLECIE = new MenuLateralEncargado_C_I();
                MostrarPanelLateral(MLECIE);
                break;
                
            case "Coordinador de personal":
                MenuLateralCoordinadorPersonal MLCP = new MenuLateralCoordinadorPersonal();
                MostrarPanelLateral(MLCP);
                break;
                
            case "Coordinador de personal operativo y taquillas":
                /*MenuLateral ML = new MenuLateral();
                MostrarPanelLateral(ML);*/
                break;
                
            case "Jefe de seguridad":
                /*MenuLateral ML = new MenuLateral();
                MostrarPanelLateral(ML);*/
                break;
            case "Guardias":
                /*MenuLateral ML = new MenuLateral();
                MostrarPanelLateral(ML);*/
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Error al desplegar el menu lateral");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mensajes().setVisible(true);
            }
        });
    }
    
    private void MostrarPanelLateral(JPanel p){
        

        
        p.setSize(250,690);
        p.setLocation(0,0);
        
        MenuLateralPanel.removeAll();
        MenuLateralPanel.add(p,BorderLayout.CENTER);
        MenuLateralPanel.revalidate();
        MenuLateralPanel.repaint();
    }
    
    private void MostrarPanel(JPanel p){
        
        p.setSize(790,470);
        p.setLocation(0,0);
        
        PanelContenido.removeAll();
        PanelContenido.add(p,BorderLayout.CENTER);
        PanelContenido.revalidate();
        PanelContenido.repaint();
    }
    
    public static String fechaActual(){
        Date fecha= new Date();
        SimpleDateFormat mostrar_fecha= new SimpleDateFormat("dd/MM/YYYY");
        return mostrar_fecha.format(fecha);
    }
    
    public void MostrarMensajes(){
        
        //Obtengo el ID del usuairo activo
        int idusuarioactivo = SesionUsuario.getUsuarioActivo();
        
        String consulta="select * from Chat where Chat.receptor_id= ? order by timestamp;";
        String consultaEmisores = "SELECT id, usuario FROM Personal;";
        
        PreparedStatement psEmisores = null;
        PreparedStatement ps = null;
        
        //Establece conexion
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
        
        
        //Diseño de la Tabla
        DefaultTableModel model = new DefaultTableModel();
       
        model.addColumn("Emisor");
        model.addColumn("Mensaje");
        model.addColumn("Fecha");

       
        TablaMensajes.setModel(model);
       
        //Obtener Datos
        String [] datos = new String[3];
        try {
            //Preparar la conuslta 
            ps = conexion.prepareStatement(consulta);
            //Asigno valor al parametro de la consulta
            ps.setInt(1, idusuarioactivo);
            
            //Ejecutar la consulta de los mensajes
            ResultSet rs = ps.executeQuery();  
            
            //Mapa para el mapeo entre el ID de emisor y nombre de usuario
            Map<Integer, String> emisoresMap = new HashMap<>();
            
            //Preparar la consulta para obtener nombres de un corrrespondiente id de emisor
            psEmisores = conexion.prepareStatement(consultaEmisores);
            //Ejecuto
            ResultSet rsEmisores = psEmisores.executeQuery();
            
            while(rsEmisores.next()){
                
                int idEmisor = rsEmisores.getInt("id");
                String nombreEmisor = rsEmisores.getString("usuario");
                emisoresMap.put(idEmisor, nombreEmisor);
            }
            
            //Proceso los resultados de la consulta de mensajes y lleno la tabla
            while(rs.next())  
            
            {
                int idEmisor = rs.getInt("emisor_id");
                String NombreEmisor = emisoresMap.get(idEmisor);
                
                 datos[0]= (NombreEmisor != null) ? NombreEmisor: String.valueOf(idEmisor);
                 datos[1]=rs.getString(4);
                 datos[2]=rs.getString(5);
                 model.addRow(datos);
            }
       
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }finally{
            
            try {
                if (ps != null) ps.close();
            } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Hora;
    private javax.swing.JPanel MenuLateralPanel;
    private javax.swing.JButton NuevoMensaje;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JPanel PanelInfoFecha;
    public javax.swing.JTable TablaMensajes;
    private javax.swing.JButton VerMensajes;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
