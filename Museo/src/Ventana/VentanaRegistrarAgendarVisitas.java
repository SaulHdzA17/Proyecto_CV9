/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.*; 
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

/**
 *
 * @author jauregui
 */
public class VentanaRegistrarAgendarVisitas extends javax.swing.JPanel {
    Conexion conect=new Conexion();
    Connection conectar=conect.estableceConexion();

    /**
     * Creates new form VentanaRegistrarItem
     */
    public VentanaRegistrarAgendarVisitas() {
        initComponents();
    }
    
    private void RegistrarVisitas(){
        
        Conexion conect = new Conexion();
        Connection conectar = conect.estableceConexion();
        
        
        String N = Nombre.getText();
        String C = Correo.getText();
        String T = Telefono.getText();
        
        SimpleDateFormat fv = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_visita = fv.format(Fecha.getCalendar().getTime());
        System.out.print("Formato de fecha de visita: " + fecha_visita);
        
        String HI = HInicio.getSelectedItem().toString();
        String HF = HFin.getSelectedItem().toString();
        String CM = Comentarios.getText();
        String E = Estado.getSelectedItem().toString();

                
        String sql = "INSERT INTO VisitasAgendadas (NombreVisitante, CorreoVisitante, TelefonoVisitante, FechaVisita, HoraInicio, HoraFin, Comentarios, EstadoVisita) VALUES (?,?,?,?,?,?,?,?)";
    
        if(N.isEmpty()|| C.isEmpty()|| T.isEmpty()|| CM.isEmpty()){
          JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else{
          if(HI.equalsIgnoreCase("Seleccione una hora de inicio")){
          JOptionPane.showMessageDialog(null, "Seleccione una hora de inicio");
          }else{
              if(HF.equalsIgnoreCase("Seleccione una hora de fin")){
          JOptionPane.showMessageDialog(null, "Seleccione una hora de fin");
          }else{
                 if(E.equalsIgnoreCase("Seleccione un estado de visita")){
          JOptionPane.showMessageDialog(null, "Seleccione un estado de visita");
          }else{
                    if(fv.equals(null)){
          JOptionPane.showMessageDialog(null, "Indique una fecha");
          }else{
                 
              
                
        try{  
            PreparedStatement pasardatos =conectar.prepareStatement(sql);
            
            pasardatos.setString(1, N);
            pasardatos.setString(2, C);
            pasardatos.setString(3, T);
            pasardatos.setString(4, fecha_visita);
            pasardatos.setString(5, HI);
            pasardatos.setString(6, HF);
            pasardatos.setString(7, CM);
            pasardatos.setString(8, E);
            
        
            pasardatos.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso"); 
        
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Verifique los datos que ingresó");
            Logger.getLogger(VentanaRegistrarAgendarVisitas.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Verifique los datos que ingresó");
        }
              }
          
          }
          
          }}}}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelDescripcion = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Comentarios = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        HInicio = new javax.swing.JComboBox<>();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        HFin = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Estado = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();

        BG.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 97, 150));
        jLabel1.setText("Registrar Visitas");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText("Correo");

        Correo.setForeground(new java.awt.Color(204, 204, 204));
        Correo.setBorder(null);
        Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CorreoMousePressed(evt);
            }
        });
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator1.setForeground(new java.awt.Color(64, 97, 150));

        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDescripcion.setText("Telefono");

        Telefono.setForeground(new java.awt.Color(204, 204, 204));
        Telefono.setBorder(null);
        Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoMousePressed(evt);
            }
        });
        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator2.setForeground(new java.awt.Color(64, 97, 150));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Visita");

        jButton1.setBackground(new java.awt.Color(195, 216, 245));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(64, 97, 150));
        jButton1.setText("REGISTRAR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator3.setForeground(new java.awt.Color(64, 97, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jSeparator4.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator4.setForeground(new java.awt.Color(64, 97, 150));

        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setBorder(null);
        Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreMousePressed(evt);
            }
        });
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Hora Inicio");

        jSeparator5.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator5.setForeground(new java.awt.Color(64, 97, 150));

        Comentarios.setBorder(null);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        HInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una hora de inicio", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00", "17:00:00" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Hora Fin");

        HFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una hora de fin", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00", "17:00:00", "18:00:00" }));

        jSeparator6.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator6.setForeground(new java.awt.Color(64, 97, 150));

        jSeparator7.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator7.setForeground(new java.awt.Color(64, 97, 150));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Comentarios");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Estado");

        Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un estado de visita", "Pendiente", "Confirmada", "Cancelada" }));

        jSeparator8.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator8.setForeground(new java.awt.Color(64, 97, 150));

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(156, 508, Short.MAX_VALUE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Correo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator4)
                                        .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel4)
                            .addComponent(HInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(HFin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(Comentarios)
                                    .addComponent(jSeparator7)
                                    .addComponent(jLabel7)
                                    .addComponent(Estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator8))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HFin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabelDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(Comentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Estado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void RegresarVentanaanterior(){
        // Cerrar el panel actual
        java.awt.Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof java.awt.Frame) {
            java.awt.Frame frame = (java.awt.Frame) window;
            frame.dispose();  // Cierra la ventana actual
        }

        // Mostrar la ventana anterior (Actividades)
        AgendarVisitas av = new AgendarVisitas();
        av.setVisible(true);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       RegresarVentanaanterior();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RegistrarVisitas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoActionPerformed

    private void TelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMousePressed
        // TODO add your handling code here:
        Telefono.setText("");
        Telefono.setForeground(Color.black);
    }//GEN-LAST:event_TelefonoMousePressed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void CorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoMousePressed
        // TODO add your handling code here:
        Correo.setText("");
        Correo.setForeground(Color.black);
    }//GEN-LAST:event_CorreoMousePressed

    private void NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreMousePressed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
          Nombre.setText("");
          Correo.setText("");
          Telefono.setText("");
          Fecha.setDate(null);
          HInicio.setSelectedItem("Seleccione una hora de inicio");
          HFin.setSelectedItem("Seleccione una hora de fin");
          Comentarios.setText("");
          Estado.setSelectedItem("Seleccione un estado de visita");
         
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JTextField Comentarios;
    private javax.swing.JTextField Correo;
    private javax.swing.JComboBox<String> Estado;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JComboBox<String> HFin;
    private javax.swing.JComboBox<String> HInicio;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}