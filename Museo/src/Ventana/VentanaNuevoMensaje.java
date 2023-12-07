/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventana;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql. CallableStatement;
import javax.swing.SwingUtilities;

/**
 *
 * @author jauregui
 */
public class VentanaNuevoMensaje extends javax.swing.JPanel {

    /**
     * Creates new form VentanaNuevoMensaje
     */
    public VentanaNuevoMensaje() {
        initComponents();
        MostrarPersonal();
        SeleccionarEmisor();
        //UsuarioActivo();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtMensaje = new javax.swing.JTextArea();
        BotonEnviar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaReceptor = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        TxtAsunto = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        TxtReceptor = new javax.swing.JTextField();
        TxtEmisor = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(792, 465));
        setSize(new java.awt.Dimension(792, 465));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BG.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 97, 150));
        jLabel1.setText("Nuevo Mensaje");

        jLabel2.setText("Seleccione al personal al cual desea mandar un mensaje:");

        jLabel3.setText("De:");

        jLabel4.setText("Mensaje:");

        TxtMensaje.setColumns(20);
        TxtMensaje.setRows(5);
        jScrollPane3.setViewportView(TxtMensaje);

        BotonEnviar.setText("Enviar");
        BotonEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseClicked(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        TablaReceptor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaReceptor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaReceptorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaReceptor);

        jLabel6.setText("Para:");

        jLabel5.setText("Asunto:");

        TxtAsunto.setBorder(null);

        TxtReceptor.setBorder(null);
        TxtReceptor.setEnabled(false);

        TxtEmisor.setBorder(null);
        TxtEmisor.setEnabled(false);

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 23, Short.MAX_VALUE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(TxtReceptor))
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(TxtEmisor))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(BGLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonCancelar)
                .addGap(32, 32, 32))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(TxtReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonEnviar)
                            .addComponent(BotonCancelar))
                        .addGap(33, 33, 33))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))))
        );

        add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void TablaReceptorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaReceptorMouseClicked
        // TODO add your handling code here:
        SeleccionarReceptor();
    }//GEN-LAST:event_TablaReceptorMouseClicked

    private void BotonEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseClicked
        // TODO add your handling code here:
        InsertarMensaje();
    }//GEN-LAST:event_BotonEnviarMouseClicked

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:
        RegresarVentanaanterior();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void SeleccionarReceptor(){
        try{
            int fila = TablaReceptor.getSelectedRow();
            
            if (fila >= 0){
                TxtReceptor.setText((TablaReceptor.getValueAt(fila, 1).toString()));
            }else{
                JOptionPane.showMessageDialog(null, "Error, Seleccione a un usuario");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error"+ e.toString());
        }
    }
    
    private void MostrarPersonal(){
        
        String sql="select * from Personal";
        Statement st;
        //Establece conexion
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
        System.out.println(sql);
        
        //Diseño de la Tabla
        DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Id");
       model.addColumn("Nombre");
       model.addColumn("Rol");

       
       TablaReceptor.setModel(model);
       
       //Obtener Datos
       String [] datos = new String[3];
       try {
       st = conexion.createStatement();
       java.sql.ResultSet rs= st.executeQuery(sql);
       while(rs.next())  
           
       {
       datos[0]=rs.getString(1);
       datos[1]=rs.getString(2);
       datos[2]=rs.getString(9);
       model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
    
    private void SeleccionarEmisor(){
       String consulta="select usuario from Personal where Personal.id= ?;";
       PreparedStatement st = null; 
       ResultSet rs = null;
       
       try{
           
           //Establece conexion
            Conexion con = new Conexion();
            Connection conexion = con.estableceConexion();
            System.out.println(consulta);
        
            st = conexion.prepareStatement(consulta);
            
            int idusuarioactivo = SesionUsuario.getUsuarioActivo();
            
            st.setInt(1, idusuarioactivo);
            
            //Ejecutar consulta 
            rs = st.executeQuery();
            
            if(rs.next()){
                String nombreUsuario = rs.getString("usuario");
                // Lo despliego en el emisor
                TxtEmisor.setText(nombreUsuario);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error: " + e.toString());
       } finally {
           try {
               if (rs != null) rs.close();
               if (st != null) st.close();
           }catch(SQLException e){
               e.printStackTrace();
           }
       }
       

        
        
        
    }
    
    private void InsertarMensaje(){
        //Establece conexion
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
        
        //Obtengo el ID del usuario activo 
        int idusuarioactivo = SesionUsuario.getUsuarioActivo();
        
        //Obtengo el ID del receptor
        String idreceptor = "";
        int fila = TablaReceptor.getSelectedRow();
        
        if (fila >= 0){
            idreceptor = TablaReceptor.getValueAt(fila, 0).toString();
        }else{
            JOptionPane.showMessageDialog(null, "Error, Seleccione a un usuario");
        }
        
        
        
        String consulta = "INSERT INTO Chat (emisor_id, receptor_id, asunto, mensaje) VALUES (?, ?, ?, ?);";
        
        try{
            
            
            CallableStatement cs = conexion.prepareCall(consulta);
            
            cs.setInt(1, idusuarioactivo);
            cs.setInt(2, Integer.parseInt(idreceptor));
            cs.setString(3, TxtAsunto.getText());
            cs.setString(4, TxtMensaje.getText());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "El mensaje se envio exitosamente. . .");  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "El mensaje no se envio, error. . . ");
        }
    }

    private void RegresarVentanaanterior(){
        // Cerrar el panel actual
        java.awt.Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof java.awt.Frame) {
            java.awt.Frame frame = (java.awt.Frame) window;
            frame.dispose();  // Cierra la ventana actual
        }

        // Mostrar la ventana anterior (Actividades)
        Actividades actividades = new Actividades();
        actividades.setVisible(true);
    }





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JTable TablaReceptor;
    private javax.swing.JTextField TxtAsunto;
    private javax.swing.JTextField TxtEmisor;
    private javax.swing.JTextArea TxtMensaje;
    private javax.swing.JTextField TxtReceptor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
