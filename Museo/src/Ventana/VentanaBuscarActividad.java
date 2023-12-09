/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author jauregui
 */
public class VentanaBuscarActividad extends javax.swing.JPanel {

    /**
     * Creates new form VentanaBuscarPersonal
     */
    public VentanaBuscarActividad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    
    
    @SuppressWarnings("unchecked")
    
    
        public void BuscarId(String tabla){
        String sql="select id_actividad from Actividad";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Id");
              
       tablaLista.setModel(model);
       String [] datos = new String[1];
       try {
       st = conexion.createStatement();
       ResultSet rs= st.executeQuery(sql);
       while(rs.next())  
           
       {
       datos[0]=rs.getString(1);
              model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
        
      public void BuscarAsunto(String tabla){
        String sql="select asunto from Actividad";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Asunto");
              
       tablaLista.setModel(model);
       String [] datos = new String[1];
       try {
       st = conexion.createStatement();
       ResultSet rs= st.executeQuery(sql);
       while(rs.next())  
           
       {
       datos[0]=rs.getString(1);
              model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
      
      public void BuscarDesc(String tabla){
        String sql="select descripcion_actividad from Actividad";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Descripcion");
              
       tablaLista.setModel(model);
       String [] datos = new String[1];
       try {
       st = conexion.createStatement();
       ResultSet rs= st.executeQuery(sql);
       while(rs.next())  
           
       {
       datos[0]=rs.getString(1);
              model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
      
      public void BuscarFecha(String tabla){
        String sql="select fecha_actividad from Actividad";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Fecha Actividad");
              
       tablaLista.setModel(model);
       String [] datos = new String[1];
       try {
       st = conexion.createStatement();
       ResultSet rs= st.executeQuery(sql);
       while(rs.next())  
           
       {
       datos[0]=rs.getString(1);
              model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
      
       
      
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrpBotonesFiltro = new javax.swing.ButtonGroup();
        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BotonFiltroID = new javax.swing.JRadioButton();
        BotonFiltroNombre = new javax.swing.JRadioButton();
        BotonFiltroCURP = new javax.swing.JRadioButton();
        BotonFiltroRFC = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Filtro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLista = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(790, 470));

        BG.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 97, 150));
        jLabel1.setText("Buscar Actividad");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por:"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        GrpBotonesFiltro.add(BotonFiltroID);
        BotonFiltroID.setText("ID");
        BotonFiltroID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroIDActionPerformed(evt);
            }
        });

        GrpBotonesFiltro.add(BotonFiltroNombre);
        BotonFiltroNombre.setText("Asunto");
        BotonFiltroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroNombreActionPerformed(evt);
            }
        });

        GrpBotonesFiltro.add(BotonFiltroCURP);
        BotonFiltroCURP.setText("Descripcion");
        BotonFiltroCURP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroCURPActionPerformed(evt);
            }
        });

        GrpBotonesFiltro.add(BotonFiltroRFC);
        BotonFiltroRFC.setText("Fecha Actividad");
        BotonFiltroRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroRFCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonFiltroID)
                    .addComponent(BotonFiltroNombre)
                    .addComponent(BotonFiltroRFC)
                    .addComponent(BotonFiltroCURP))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonFiltroID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonFiltroNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonFiltroCURP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonFiltroRFC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingresa tu filtro de busqueda ");

        Filtro.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(64, 97, 150));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaLista);

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(Filtro, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(jSeparator1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void BotonFiltroIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroIDActionPerformed
        // TODO add your handling code here:
        
        BuscarId("Actividad");
    }//GEN-LAST:event_BotonFiltroIDActionPerformed

    
    public void buscar(String buscar){
    Actividades p= new Actividades();
    DefaultTableModel modelo= p.buscar1(buscar);
    tablaLista.setModel(modelo);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        buscar(Filtro.getText());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonFiltroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroNombreActionPerformed
        // TODO add your handling code here:
        BuscarAsunto("Actividad");
    }//GEN-LAST:event_BotonFiltroNombreActionPerformed

    private void BotonFiltroCURPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroCURPActionPerformed
        // TODO add your handling code here:
        BuscarDesc("Actividad");
    }//GEN-LAST:event_BotonFiltroCURPActionPerformed

    private void BotonFiltroRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroRFCActionPerformed
        // TODO add your handling code here:
        BuscarFecha("Actividad");
    }//GEN-LAST:event_BotonFiltroRFCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JRadioButton BotonFiltroCURP;
    private javax.swing.JRadioButton BotonFiltroID;
    private javax.swing.JRadioButton BotonFiltroNombre;
    private javax.swing.JRadioButton BotonFiltroRFC;
    private javax.swing.JTextField Filtro;
    private javax.swing.ButtonGroup GrpBotonesFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaLista;
    // End of variables declaration//GEN-END:variables
}
