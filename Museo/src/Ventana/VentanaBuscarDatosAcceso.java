/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventana;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jauregui
 */
public class VentanaBuscarDatosAcceso extends javax.swing.JPanel {

    /**
     * Creates new form VentanaBuscarDatosAcceso
     */
    public VentanaBuscarDatosAcceso() {
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

        FiltrosDatosAcceso = new javax.swing.ButtonGroup();
        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BotonFiltroID = new javax.swing.JRadioButton();
        BotonFiltroNombre = new javax.swing.JRadioButton();
        BotonFiltroCorreo = new javax.swing.JRadioButton();
        BotonFiltroFecha = new javax.swing.JRadioButton();
        BotonFiltroTelefono = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Filtro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLista = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        BG.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 97, 150));
        jLabel1.setText("Buscar Datos de Acceso");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por:"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        FiltrosDatosAcceso.add(BotonFiltroID);
        BotonFiltroID.setText("ID");
        BotonFiltroID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroIDActionPerformed(evt);
            }
        });

        FiltrosDatosAcceso.add(BotonFiltroNombre);
        BotonFiltroNombre.setText("Nombre");
        BotonFiltroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroNombreActionPerformed(evt);
            }
        });

        FiltrosDatosAcceso.add(BotonFiltroCorreo);
        BotonFiltroCorreo.setText("Correo");
        BotonFiltroCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroCorreoActionPerformed(evt);
            }
        });

        FiltrosDatosAcceso.add(BotonFiltroFecha);
        BotonFiltroFecha.setText("Fecha");
        BotonFiltroFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroFechaActionPerformed(evt);
            }
        });

        FiltrosDatosAcceso.add(BotonFiltroTelefono);
        BotonFiltroTelefono.setText("Telefono");
        BotonFiltroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltroTelefonoActionPerformed(evt);
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
                    .addComponent(BotonFiltroFecha)
                    .addComponent(BotonFiltroCorreo)
                    .addComponent(BotonFiltroTelefono))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonFiltroID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonFiltroNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonFiltroCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonFiltroFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonFiltroTelefono)
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

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
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
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        BuscarId();
    }//GEN-LAST:event_BotonFiltroIDActionPerformed

    private void BotonFiltroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroNombreActionPerformed
        // TODO add your handling code here:
        BuscarNombre();
    }//GEN-LAST:event_BotonFiltroNombreActionPerformed

    private void BotonFiltroCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroCorreoActionPerformed
        // TODO add your handling code here:
        BuscarCorreo();
    }//GEN-LAST:event_BotonFiltroCorreoActionPerformed

    private void BotonFiltroFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroFechaActionPerformed
        // TODO add your handling code here:
        BuscarFecha();
    }//GEN-LAST:event_BotonFiltroFechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        buscar(Filtro.getText());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RegresarVentanaanterior();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotonFiltroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltroTelefonoActionPerformed
        // TODO add your handling code here:
        BuscarTelefono();
    }//GEN-LAST:event_BotonFiltroTelefonoActionPerformed


    
    private void RegresarVentanaanterior(){
        // Cerrar el panel actual
        java.awt.Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof java.awt.Frame) {
            java.awt.Frame frame = (java.awt.Frame) window;
            frame.dispose();  // Cierra la ventana actual
        }

        // Mostrar la ventana anterior (Actividades)
        DatosAcceso da = new DatosAcceso();
        da.setVisible(true);
    }
        
    public void BuscarId(){
        String sql="select id_visitante from DatosAceso";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
        
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Id del visitante");
              
       tablaLista.setModel(model);
       String [] datos = new String[1];
       try {
            st = conexion.createStatement();
            java.sql.ResultSet rs= st.executeQuery(sql);
            while(rs.next())  
           
            {
                datos[0]=rs.getString(1);
                model.addRow(datos);
            }
       
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
    
    public void BuscarFecha(){
        String sql="select fecha_registro_visitante from DatosAceso";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Fecha de visita");
              
       tablaLista.setModel(model);
       String [] datos = new String[1];
       try {
       st = conexion.createStatement();
       java.sql.ResultSet rs= st.executeQuery(sql);
       while(rs.next())  
           
       {
       datos[0]=rs.getString(1);
              model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
    
    public void BuscarNombre(){
        String sql="select nombrecompleto from DatosAceso";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Nombre del visitane");
              
       tablaLista.setModel(model);
       String [] datos = new String[1];
       try {
       st = conexion.createStatement();
       java.sql.ResultSet rs= st.executeQuery(sql);
       while(rs.next())  
           
       {
       datos[0]=rs.getString(1);
              model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
    
    public void BuscarCorreo(){
        String sql="select correoElectronico from DatosAceso";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Correo del visitante");
              
       tablaLista.setModel(model);
       String [] datos = new String[1];
       try {
       st = conexion.createStatement();
       java.sql.ResultSet rs= st.executeQuery(sql);
       while(rs.next())  
           
       {
       datos[0]=rs.getString(1);
              model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
    
    public void BuscarTelefono(){
        String sql="select telefono from DatosAceso";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Telefono del visitane");
              
       tablaLista.setModel(model);
       String [] datos = new String[1];
       try {
       st = conexion.createStatement();
       java.sql.ResultSet rs= st.executeQuery(sql);
       while(rs.next())  
           
       {
       datos[0]=rs.getString(1);
              model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
    
    public void buscar(String buscar){
        DatosAcceso DA = new DatosAcceso();
        DefaultTableModel modelo= DA.buscar1(buscar);
        tablaLista.setModel(modelo);
    }
    
 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JRadioButton BotonFiltroCorreo;
    private javax.swing.JRadioButton BotonFiltroFecha;
    private javax.swing.JRadioButton BotonFiltroID;
    private javax.swing.JRadioButton BotonFiltroNombre;
    private javax.swing.JRadioButton BotonFiltroTelefono;
    private javax.swing.JTextField Filtro;
    private javax.swing.ButtonGroup FiltrosDatosAcceso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaLista;
    // End of variables declaration//GEN-END:variables
}
