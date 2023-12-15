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
public class VentanaRegistrarPersonal extends javax.swing.JPanel {
Conexion conect=new Conexion();
    Connection conectar=conect.estableceConexion();
    /**
     * Creates new form VentanaRegistrarPersonal
     */
    public VentanaRegistrarPersonal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelNombre4 = new javax.swing.JLabel();
        jLabelRFC = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelCURP = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        TxtContraseña = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        TxtCurp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        TxtRFC = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        TxtCorreo = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cboRoles = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TxtEscolaridad = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        TxtEdad = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        FechaContratacion = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(790, 470));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(195, 237, 246));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 97, 150));
        jLabel1.setText("Registrar Personal");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre");

        TxtNombre.setForeground(new java.awt.Color(204, 204, 204));
        TxtNombre.setBorder(null);
        TxtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtNombreMousePressed(evt);
            }
        });
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator1.setForeground(new java.awt.Color(64, 97, 150));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuario");

        jLabelContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelContraseña.setText("Contraseña");

        jLabelFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelFecha.setText("Correo");

        jLabelNombre4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelRFC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRFC.setText("RFC");

        jLabelEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEdad.setText("Rol");

        jLabelCURP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCURP.setText("CURP");

        TxtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        TxtUsuario.setBorder(null);
        TxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtUsuarioMousePressed(evt);
            }
        });
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator2.setForeground(new java.awt.Color(64, 97, 150));

        TxtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        TxtContraseña.setBorder(null);
        TxtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtContraseñaMousePressed(evt);
            }
        });
        TxtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContraseñaActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator3.setForeground(new java.awt.Color(64, 97, 150));

        TxtCurp.setForeground(new java.awt.Color(204, 204, 204));
        TxtCurp.setBorder(null);
        TxtCurp.setPreferredSize(new java.awt.Dimension(78, 17));
        TxtCurp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtCurpMousePressed(evt);
            }
        });
        TxtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCurpActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator4.setForeground(new java.awt.Color(64, 97, 150));

        TxtRFC.setForeground(new java.awt.Color(204, 204, 204));
        TxtRFC.setBorder(null);
        TxtRFC.setPreferredSize(new java.awt.Dimension(78, 17));
        TxtRFC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtRFCMousePressed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator6.setForeground(new java.awt.Color(64, 97, 150));

        jSeparator7.setBackground(new java.awt.Color(64, 97, 150));
        jSeparator7.setForeground(new java.awt.Color(64, 97, 150));

        TxtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        TxtCorreo.setBorder(null);
        TxtCorreo.setPreferredSize(new java.awt.Dimension(106, 17));
        TxtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtCorreoMousePressed(evt);
            }
        });

        jButtonRegistrar.setBackground(new java.awt.Color(195, 216, 245));
        jButtonRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(64, 97, 150));
        jButtonRegistrar.setText("REGISTRAR");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cboRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un rol", "Director", "Conservador", "Restaurador", "Encargado de Catalogadores_Investigadores", "Catalogador", "Investigador", "Educador", "Coordinador del personal de administracion", "Encargado del personal operativo y taquillas", "Administrador de sistemas informaticos", "Jefe de guardias de seguridad", "Guardia" }));
        cboRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRolesActionPerformed(evt);
            }
        });

        jLabel2.setText("Escolaridad");

        TxtEscolaridad.setBorder(null);

        jLabel3.setText("Edad");

        TxtEdad.setBorder(null);

        jLabel4.setText("Telefono");

        TxtTelefono.setBorder(null);

        jLabel5.setText("Fecha de contrataciòn ");

        FechaContratacion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaContratacionPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelContraseña)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addGap(183, 183, 183)
                                .addComponent(jLabelNombre4))
                            .addComponent(FechaContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCURP)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCurp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtRFC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelFecha)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEdad)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtEdad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtEscolaridad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboRoles, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))
                .addGap(0, 134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(jLabelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelContraseña)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCURP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabelFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelEdad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelRFC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FechaContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabelNombre4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRolesActionPerformed
        // TODO add your handling code here:
        String mensaje = "El Rol elegido es: ";
        mensaje = mensaje + cboRoles.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, ""+ mensaje);
    }//GEN-LAST:event_cboRolesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        TxtNombre.setText("");
        TxtUsuario.setText("");
        TxtContraseña.setText("");
        TxtCurp.setText("");
        TxtRFC.setText("");
        FechaContratacion.setDate(null);
        TxtCorreo.setText("");
        cboRoles.setSelectedItem("Seleccione un rol");
        TxtEscolaridad.setText("");
        TxtEdad.setText("");
        TxtTelefono.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed
    private void RegresarVentanaanterior(){
        // Cerrar el panel actual
        java.awt.Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof java.awt.Frame) {
            java.awt.Frame frame = (java.awt.Frame) window;
            frame.dispose();  // Cierra la ventana actual
        }

        // Mostrar la ventana anterior (Actividades)
        Personal personal = new Personal();
        personal.setVisible(true);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       RegresarVentanaanterior();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
       // TODO add your handling code here:
       GuardarRegistro();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void TxtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtCorreoMousePressed
        // TODO add your handling code here:
        TxtCorreo.setText("");
        TxtCorreo.setForeground(Color.black);
    }//GEN-LAST:event_TxtCorreoMousePressed

    private void TxtRFCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtRFCMousePressed
        // TODO add your handling code here:
        TxtRFC.setText("");
        TxtRFC.setForeground(Color.black);
    }//GEN-LAST:event_TxtRFCMousePressed

    private void TxtCurpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtCurpMousePressed
        // TODO add your handling code here:
        TxtCurp.setText("");
        TxtCurp.setForeground(Color.black);
    }//GEN-LAST:event_TxtCurpMousePressed

    private void TxtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraseñaMousePressed
        // TODO add your handling code here:
        TxtContraseña.setText("");
        TxtContraseña.setForeground(Color.black);
    }//GEN-LAST:event_TxtContraseñaMousePressed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioMousePressed
        // TODO add your handling code here:
        TxtUsuario.setText("");
        TxtUsuario.setForeground(Color.black);
    }//GEN-LAST:event_TxtUsuarioMousePressed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtNombreMousePressed
        // TODO add your handling code here:
        TxtNombre.setText("");
        TxtNombre.setForeground(Color.black);
    }//GEN-LAST:event_TxtNombreMousePressed

    private void TxtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContraseñaActionPerformed

    private void TxtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCurpActionPerformed

    private void FechaContratacionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaContratacionPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_FechaContratacionPropertyChange

    public void GuardarRegistro(){
    String nombre = TxtNombre.getText();
    String usuario = TxtUsuario.getText();
    String contraseña = TxtContraseña.getText();
    String CURP = TxtCurp.getText();
    String RFC = TxtRFC.getText();
    //Le doy formato ami calendario
    SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
    String fecha_contratacion = ff.format(FechaContratacion.getCalendar().getTime());
    System.out.print("Formato de fecha de contratacion ocn: " + fecha_contratacion);
    
    String correo = TxtCorreo.getText();
    String escolaridad = TxtEscolaridad.getText();
    int edad = Integer.parseInt(TxtEdad.getText());
    String telefono = TxtTelefono.getText();
    String rol = cboRoles.getSelectedItem().toString();
    //Obtengo el ID del usuario activo 
    int idusuarioactivo = SesionUsuario.getUsuarioActivo();

      
    String sql = "INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, correo, escolaridad, edad, telefono, rol, registrado_por) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
     if(nombre.isEmpty()|| usuario.isEmpty()|| contraseña.isEmpty()|| CURP.isEmpty()|| RFC.isEmpty()|| correo.isEmpty()|| escolaridad.isEmpty()|| telefono.isEmpty()){
          JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else{
            if(ff.equals(null)){
          JOptionPane.showMessageDialog(null, "Indique una fecha");
          }else{  
          if(rol.equalsIgnoreCase("Seleccione un rol")){
          JOptionPane.showMessageDialog(null, "Seleccione un rol");
          }else{ 
    try{  
        PreparedStatement pasardatos =conectar.prepareStatement(sql);
            
        pasardatos.setString(1, nombre);
        pasardatos.setString(2, usuario);
        pasardatos.setString(3, contraseña);
        pasardatos.setString(4, CURP);
        pasardatos.setString(5, RFC);
        pasardatos.setString(6, fecha_contratacion);
        pasardatos.setString(7, correo);
        pasardatos.setString(8, escolaridad);
        pasardatos.setInt(9, edad);
        pasardatos.setString(10, telefono);
        pasardatos.setString(11, rol);
        pasardatos.setInt(12, idusuarioactivo);
        
        pasardatos.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro exitoso"); 
        
    }catch (SQLException e){
        Logger.getLogger(VentanaRegistrarItem.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Verifique los datos que ingresó");
    }
    
    }}}}
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaContratacion;
    private javax.swing.JTextField TxtContraseña;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtCurp;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtEscolaridad;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtRFC;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JComboBox<String> cboRoles;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCURP;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelRFC;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
