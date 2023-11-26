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
public class VentanaBuscarPersonal extends javax.swing.JPanel {

    /**
     * Creates new form VentanaBuscarPersonal
     */
    public VentanaBuscarPersonal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    
    
    @SuppressWarnings("unchecked")
    
    
        public void BuscarId(String tabla){
        String sql="select ID from Personal";
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
        
      public void BuscarNombre(String tabla){
        String sql="select Nombre from Personal";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Nombre");
              
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
      
      public void BuscarCURP(String tabla){
        String sql="select CURP from Personal";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("CURP");
              
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
      
      public void BuscarRFC(String tabla){
        String sql="select RFC from Personal";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("RFC");
              
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
        String sql="select FechaContratacion from Personal";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Fechya Contratacion ");
              
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
      public void BuscarEdad(String tabla){
        String sql="select edad from Personal";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Edad");
              
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
        BotonFiltroEdad = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
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
        jLabel1.setText("Buscar Personal");

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
        BotonFiltroNombre.setText("Nombre");
        BotonFiltroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroNombreActionPerformed(evt);
            }
        });

        GrpBotonesFiltro.add(BotonFiltroCURP);
        BotonFiltroCURP.setText("CURP");
        BotonFiltroCURP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroCURPActionPerformed(evt);
            }
        });

        GrpBotonesFiltro.add(BotonFiltroRFC);
        BotonFiltroRFC.setText("RFC");
        BotonFiltroRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroRFCActionPerformed(evt);
            }
        });

        GrpBotonesFiltro.add(BotonFiltroEdad);
        BotonFiltroEdad.setText("Edad");
        BotonFiltroEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroEdadActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Fecha Contratacion");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
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
                    .addComponent(BotonFiltroEdad)
                    .addComponent(BotonFiltroRFC)
                    .addComponent(BotonFiltroCURP)
                    .addComponent(jRadioButton1))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonFiltroEdad)
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
                .addContainerGap(34, Short.MAX_VALUE))
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
        
        BuscarId("Personal");
    }//GEN-LAST:event_BotonFiltroIDActionPerformed

    
    public void buscar(String buscar){
    Personal p= new Personal();
    DefaultTableModel modelo= p.buscar1(buscar);
    tablaLista.setModel(modelo);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        buscar(Filtro.getText());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonFiltroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroNombreActionPerformed
        // TODO add your handling code here:
        BuscarNombre("Personal");
    }//GEN-LAST:event_BotonFiltroNombreActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        BuscarFecha("Personal");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void BotonFiltroCURPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroCURPActionPerformed
        // TODO add your handling code here:
        BuscarCURP("Personal");
    }//GEN-LAST:event_BotonFiltroCURPActionPerformed

    private void BotonFiltroRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroRFCActionPerformed
        // TODO add your handling code here:
        BuscarRFC("Personal");
    }//GEN-LAST:event_BotonFiltroRFCActionPerformed

    private void BotonFiltroEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroEdadActionPerformed
        // TODO add your handling code here:
        BuscarEdad("Personal");
    }//GEN-LAST:event_BotonFiltroEdadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JRadioButton BotonFiltroCURP;
    private javax.swing.JRadioButton BotonFiltroEdad;
    private javax.swing.JRadioButton BotonFiltroID;
    private javax.swing.JRadioButton BotonFiltroNombre;
    private javax.swing.JRadioButton BotonFiltroRFC;
    private javax.swing.JTextField Filtro;
    private javax.swing.ButtonGroup GrpBotonesFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaLista;
    // End of variables declaration//GEN-END:variables
}
