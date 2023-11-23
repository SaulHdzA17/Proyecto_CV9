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

/**
 *
 * @author jauregui
 */
public class VentanaRegistrarItem extends javax.swing.JPanel {
    Conexion conect=new Conexion();
    Connection conectar=conect.estableceConexion();

    /**
     * Creates new form VentanaRegistrarItem
     */
    public VentanaRegistrarItem() {
        initComponents();
    }
    
    public void Guardar(){
    String Identificador = IdentificadorItem.getText();
    String Nombre =NombreItem.getText();
    String Descripción=DescripcionItem.getText();
    String IdPr=IdPrestamo.getText();
    String IdPer=IdPersonal.getText();
    String Campo= CampoItem.getText();
    String sql="Insert into Item () values (?,?,?,?,?,?)";
    try{
    Statement st=conectar.createStatement();
    ResultSet resultado= st.executeQuery("select * from Item where ID like'"+IdentificadorItem.getText()+"'");
    if (resultado.next()){
    getToolkit().beep();
    JOptionPane.showMessageDialog(null, "Ese identificador ya está ocupado");
    IdentificadorItem.requestFocus();
            } else if(IdentificadorItem.getText().isEmpty()){
            getToolkit().beep();
    JOptionPane.showMessageDialog(null, "Ingrese un identificador");
    IdentificadorItem.requestFocus();
            } else{
            
            PreparedStatement pasardatos =conectar.prepareStatement(sql);
            
            pasardatos.setString(1, Identificador);
            pasardatos.setString(2, Nombre);
            pasardatos.setString(3, Descripción);
            pasardatos.setString(4, IdPr);
            pasardatos.setString(5, IdPer);
            pasardatos.setString(6, Campo);
            pasardatos.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
   
            }
    
    }catch (SQLException e){
        Logger.getLogger(VentanaRegistrarItem.class.getName()).log(Level.SEVERE, null, e);
    }
    
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
        jLabel1 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        NombreItem = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelDescripcion = new javax.swing.JLabel();
        DescripcionItem = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CampoItem = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        IdentificadorItem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IdPrestamo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        IdPersonal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        BG.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 97, 150));
        jLabel1.setText("Registrar Items");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre");

        NombreItem.setForeground(new java.awt.Color(204, 204, 204));
        NombreItem.setBorder(null);
        NombreItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreItemMousePressed(evt);
            }
        });
        NombreItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreItemActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator1.setForeground(new java.awt.Color(64, 97, 150));

        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDescripcion.setText("Descripcion");

        DescripcionItem.setForeground(new java.awt.Color(204, 204, 204));
        DescripcionItem.setBorder(null);
        DescripcionItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DescripcionItemMousePressed(evt);
            }
        });
        DescripcionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionItemActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator2.setForeground(new java.awt.Color(64, 97, 150));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Identificador de prestamo");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CampoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoItemActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator3.setForeground(new java.awt.Color(64, 97, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Identificador");

        jSeparator4.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator4.setForeground(new java.awt.Color(64, 97, 150));

        IdentificadorItem.setForeground(new java.awt.Color(204, 204, 204));
        IdentificadorItem.setBorder(null);
        IdentificadorItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IdentificadorItemMousePressed(evt);
            }
        });
        IdentificadorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificadorItemActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Identificador de personal");

        jSeparator5.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator5.setForeground(new java.awt.Color(64, 97, 150));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Campo");

        jSeparator6.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator6.setForeground(new java.awt.Color(64, 97, 150));

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(IdPrestamo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DescripcionItem, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4)
                                    .addComponent(IdentificadorItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
                        .addGap(58, 58, 58)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CampoItem, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addComponent(IdPersonal)
                                        .addComponent(jSeparator6))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdentificadorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreItem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcion)
                    .addComponent(CampoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescripcionItem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(7, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Items newframe = new Items();
        newframe.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DescripcionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionItemActionPerformed

    private void DescripcionItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescripcionItemMousePressed
        // TODO add your handling code here:
        DescripcionItem.setText("");
        DescripcionItem.setForeground(Color.black);
    }//GEN-LAST:event_DescripcionItemMousePressed

    private void NombreItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreItemActionPerformed

    private void NombreItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreItemMousePressed
        // TODO add your handling code here:
        NombreItem.setText("");
        NombreItem.setForeground(Color.black);
    }//GEN-LAST:event_NombreItemMousePressed

    private void CampoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoItemActionPerformed

    private void IdentificadorItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdentificadorItemMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdentificadorItemMousePressed

    private void IdentificadorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificadorItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdentificadorItemActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JTextField CampoItem;
    private javax.swing.JTextField DescripcionItem;
    private javax.swing.JTextField IdPersonal;
    private javax.swing.JTextField IdPrestamo;
    private javax.swing.JTextField IdentificadorItem;
    private javax.swing.JTextField NombreItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
