/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import static Ventana.Personal.Eliminar;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author axel
 */
public class Prestamos extends javax.swing.JFrame {

    /**
     * Creates new form Prestamos
     */
     Calendar fecha_actual= new GregorianCalendar();
    public Prestamos() {
        initComponents();
        //Mando a llamar la funcion mostrarPanelLateral
        TipoMenu();

        Fecha.setText(fechaActual());
        
        Calendar cal= Calendar.getInstance();
        String hora;
        
        hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        
        this.Hora.setText(hora);
    }
    
    public void Mostrar(String tabla){
        String sql="select * from Prestamo";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       System.out.println(sql);
       DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Id");
       model.addColumn("Inicio Prestamo");
       model.addColumn("Fin Prestamo");
       model.addColumn("Motivo");
       model.addColumn("Id Item");
       model.addColumn("Id Personal");

       
       TablaPrestamos.setModel(model);
       String [] datos = new String[6];
       try {
       st = conexion.createStatement();
       ResultSet rs= st.executeQuery(sql);
       while(rs.next())  
           
       {
       datos[0]=rs.getString(1);
       datos[1]=rs.getString(2);
       datos[2]=rs.getString(3);
       datos[3]=rs.getString(4);
       datos[4]=rs.getString(5);
       datos[5]=rs.getString(6);

       model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }    
    
           public static boolean Eliminar(String id){
        Conexion con = new Conexion();
        Connection cn = con.estableceConexion();
        PreparedStatement ps=null;
        
        String SQL="delete from Prestamo where ID="+id;
        try{
        ps=cn.prepareStatement(SQL);
        ps.execute();
        cn.close();
        return true;
        } catch (Exception e){
        System.out.println(e.toString());
        return false;
        }
        
    
    }

        public DefaultTableModel buscar1(String buscar){
    
        String [] nombreColumna={"Id", "InicioPrestamo", "FinPrestamo", "Motivo"};
        String [] registros = new String [4];
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumna);
        String sql="select * from Prestamo where ID like'%"+buscar+"%' or InicioPrestamo like'%"+buscar+"%' or FinPrestamo like '%"+buscar+"%' or Motivo like '%"+buscar+"%'";
        Connection cn = null;
        Conexion con = new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try{
            
        cn= con.estableceConexion();
        ps = cn.prepareStatement(sql);
        rs= ps.executeQuery();
        
        while(rs.next()){
        registros[0]=rs.getString("Id");
        registros[1]=rs.getString("InicioPrestamo");
        registros[2]=rs.getString("FinPrestamo");
        registros[3]=rs.getString("Motivo");

       
   
        modelo.addRow(registros);
        
        }
        
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "No se encontró");
        }
        return modelo;
    }           
           
    
    //Funcion para mostrar el menu lateral del admin
    private void MostrarPanelMenuLateral(JPanel p){
        

        
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

    private void TipoMenu(){
        TipoDeMenuLateral tipoMenu = new TipoDeMenuLateral();
        
        String rol = tipoMenu.MostrarMenu();
        System.out.println("El rol del usuario activo es: " + rol);
        //MenuLateral ML = new MenuLateral();
        //MostrarPanel(ML);
        
        switch(rol){
            case "Director":
                MenuLateral ML = new MenuLateral();
                MostrarPanelMenuLateral(ML);
                break;
                
            case "Conservador":
            case "Restaurador":
            case "Investigador":
            case "Catalogador": //Analizar si aqui se debe de poner a lso educadores
                MenuLateral_IC MLIC = new MenuLateral_IC();
                MostrarPanelMenuLateral(MLIC);
                break;
                
            case "Encargado de Catalogadores_Investigadores":
                MenuLateralEncargado_C_I MLECIE = new MenuLateralEncargado_C_I();
                MostrarPanelMenuLateral(MLECIE);
                break;
                
            case "Coordinador de personal":
                MenuLateralCoordinadorPersonal MLCP = new MenuLateralCoordinadorPersonal();
                MostrarPanelMenuLateral(MLCP);
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
        TablaPrestamos = new javax.swing.JTable();
        BotonAgregar1 = new javax.swing.JButton();
        BotonActualizar1 = new javax.swing.JButton();
        BotonBorrar1 = new javax.swing.JButton();
        BotonBuscar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 690));

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout MenuLateralPanelLayout = new javax.swing.GroupLayout(MenuLateralPanel);
        MenuLateralPanel.setLayout(MenuLateralPanelLayout);
        MenuLateralPanelLayout.setHorizontalGroup(
            MenuLateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        MenuLateralPanelLayout.setVerticalGroup(
            MenuLateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        BG.add(MenuLateralPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 690));

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
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        PanelInfoFechaLayout.setVerticalGroup(
            PanelInfoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoFechaLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(PanelInfoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        BG.add(PanelInfoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 810, 140));

        PanelContenido.setBackground(new java.awt.Color(255, 255, 255));

        TablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaPrestamos);

        BotonAgregar1.setBackground(new java.awt.Color(255, 255, 255));
        BotonAgregar1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        BotonAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregar1ActionPerformed(evt);
            }
        });

        BotonActualizar1.setBackground(new java.awt.Color(255, 255, 255));
        BotonActualizar1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonActualizar1.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        BotonActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizar1ActionPerformed(evt);
            }
        });

        BotonBorrar1.setBackground(new java.awt.Color(255, 255, 255));
        BotonBorrar1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonBorrar1.setForeground(new java.awt.Color(255, 255, 255));
        BotonBorrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        BotonBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrar1ActionPerformed(evt);
            }
        });

        BotonBuscar1.setBackground(new java.awt.Color(255, 255, 255));
        BotonBuscar1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        BotonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscar1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Prestamos.png"))); // NOI18N

        BotonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        BotonBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonBorrar.setBackground(new java.awt.Color(255, 255, 255));
        BotonBorrar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        BotonAgregar.setBackground(new java.awt.Color(255, 255, 255));
        BotonAgregar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        BotonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarMouseClicked(evt);
            }
        });
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelContenidoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBuscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(427, 427, 427)
                .addComponent(BotonAgregar1)
                .addGap(18, 18, 18)
                .addComponent(BotonActualizar1)
                .addGap(18, 18, 18)
                .addComponent(BotonBorrar1)
                .addGap(18, 18, 18)
                .addComponent(BotonBuscar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonBorrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(BotonBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonActualizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelContenidoLayout.createSequentialGroup()
                        .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        BG.add(PanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 780, 480));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String fechaActual(){
    Date fecha= new Date();
        SimpleDateFormat mostrar_fecha= new SimpleDateFormat("dd/MM/YYYY");
        return mostrar_fecha.format(fecha);
    }
    
    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        // TODO add your handling code here:
        
               // TODO add your handling code here:
        
                int fila=TablaPrestamos.getSelectedRowCount();
        if(fila<1){
            JOptionPane.showMessageDialog(null, "Seleccione un registro");
        }
        else{
        if(Eliminar(TablaPrestamos.getValueAt(TablaPrestamos.getSelectedRow(),0).toString())){
        JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
       
        }
            }
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        VentanaBuscarPrestamos VBP = new VentanaBuscarPrestamos();
        MostrarPanel(VBP);
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregar1ActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarPersonal VRP = new VentanaRegistrarPersonal();
        MostrarPanel(VRP);
    }//GEN-LAST:event_BotonAgregar1ActionPerformed

    private void BotonActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonActualizar1ActionPerformed

    private void BotonBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBorrar1ActionPerformed

    private void BotonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBuscar1ActionPerformed

    private void BotonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarMouseClicked
        // TODO add your handling code here:
        VentanaRegistrarPrestamo VRP = new VentanaRegistrarPrestamo();
        MostrarPanel(VRP);
    }//GEN-LAST:event_BotonAgregarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                 Mostrar("Prestamo");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton BotonActualizar1;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonAgregar1;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonBorrar1;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonBuscar1;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Hora;
    private javax.swing.JPanel MenuLateralPanel;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JPanel PanelInfoFecha;
    private javax.swing.JTable TablaPrestamos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
