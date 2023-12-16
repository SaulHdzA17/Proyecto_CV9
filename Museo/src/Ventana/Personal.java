/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author jauregui
 */
public class Personal extends javax.swing.JFrame {
    Conexion enlace = new Conexion();
    Connection connection = enlace.estableceConexion();    
            
    

    //Variables para las ventanas
    //private InicioAdmin IniAdmin = new InicioAdmin();
    
    /**
     * Creates new form Personal
     */
    public Personal() {
        initComponents();
        
        TipoMenu();
        
        Fecha.setText(fechaActual());
        
        Calendar cal= Calendar.getInstance();
        String hora;
        
        hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        
        this.Hora.setText(hora);
        
        Mostrar("Personal");
       
    }
    
    public void Mostrar(String tabla){
        String sql="select * from Personal";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.estableceConexion();
       
        DefaultTableModel model = new DefaultTableModel();
       
       model.addColumn("Id");
       model.addColumn("Nombre");
       model.addColumn("Usuario");
       model.addColumn("Contraseña");
       model.addColumn("CURP");
       model.addColumn("RFC");
       model.addColumn("Fecha Contratación");
       model.addColumn("Correo");
       model.addColumn("Escolaridad");
       model.addColumn("Edad");
       model.addColumn("Telefono");
       model.addColumn("Rol");
       
       TablaPersonal.setModel(model);
       String [] datos = new String[12];
       
       try {
       st = conexion.createStatement();
       ResultSet rs= st.executeQuery(sql);
       
       while(rs.next())  {
           
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            datos[4]=rs.getString(5);
            datos[5]=rs.getString(6);
            datos[6]=rs.getString(7);
            datos[7]=rs.getString(8);
            datos[8]=rs.getString(9);
            datos[9]=rs.getString(10);
            datos[10]=rs.getString(11);
            datos[11]=rs.getString(12);
            
            model.addRow(datos);
       }
       
       }catch(SQLException e){
       JOptionPane.showMessageDialog(null, "Error" + e.toString());
       }
    }
    
 /*   public static boolean Eliminar(String id){
    Conexion con = new Conexion();
        Connection cn = con.estableceConexion();
        PreparedStatement ps=null;
        
        String SQL="delete from Personal where id="+id;
        
        try{
            
        ps=cn.prepareStatement(SQL);
        ps.execute();
        cn.close();
        return true;
        } catch (Exception e){
            
        System.out.println(e.toString());
        return false;
        }
        
    
    }*/
    
    
    public void Eliminar(){
       int opt=JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro seleccionado?", "Eliminación", JOptionPane.YES_NO_OPTION);
        
        if(opt==0){          
        int fila=TablaPersonal.getSelectedRow();
        String valor =TablaPersonal.getValueAt(fila,0).toString();
            try {
                PreparedStatement delete = connection.prepareStatement("Delete from Personal where id='"+valor+"'");
                delete.executeUpdate();
                JOptionPane.showMessageDialog(null, "Eliminación exitosa");
                Mostrar("Personal");
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
       
    public DefaultTableModel buscar1(String buscar){
    
        String [] nombreColumna={"Id", "Nombre", "Usuario", "Contraseña", "CURP", "RFC", "Fecha_Contratacion", "Correo", "Escolaridad", "Edad", "Telefono", "Rol"};
        String [] registros = new String [12];
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumna);
        String sql="select * from Personal where id like'"+buscar+"' or nombre like '"+buscar+"' or usuario like '"+buscar+"' or contraseña like '"+buscar+"' or curp like '"+buscar+"' or rfc like '"+buscar+"' or fecha_contratacion like '"+buscar+"' or correo like '"+buscar+"' or escolaridad like '"+buscar+"' or edad like '"+buscar+"' or telefono like '"+buscar+"' or rol like '"+buscar+"'";
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
        registros[1]=rs.getString("Nombre");
        registros[2]=rs.getString("Usuario");
        registros[3]=rs.getString("Contraseña");
        registros[4]=rs.getString("CURP");
        registros[5]=rs.getString("RFC");
        registros[6]=rs.getString("Fecha_Contratacion");
        registros[7]=rs.getString("Correo");
        registros[8]=rs.getString("Escolaridad");
        registros[9]=rs.getString("Edad");
        registros[10]=rs.getString("Telefono");
        registros[11]=rs.getString("Rol");
        
        

       
   
        modelo.addRow(registros);
        
        }
        
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "No se encontró");
        }
        return modelo;
    }
    
    public void Actualizar(){

        int fila = TablaPersonal.getSelectedRow();
    
        int id =Integer.parseInt(this.TablaPersonal.getValueAt(fila, 0).toString());
        String N =TablaPersonal.getValueAt(fila,1).toString();
        String U =TablaPersonal.getValueAt(fila,2).toString();
        String C =TablaPersonal.getValueAt(fila,3).toString();
        String CU =TablaPersonal.getValueAt(fila,4).toString();
        String R =TablaPersonal.getValueAt(fila,5).toString();
        String F =TablaPersonal.getValueAt(fila,6).toString();
        String CO =TablaPersonal.getValueAt(fila,7).toString();
        String E =TablaPersonal.getValueAt(fila,8).toString();
        String A =TablaPersonal.getValueAt(fila,9).toString();
        String T =TablaPersonal.getValueAt(fila,10).toString();
        String RL =TablaPersonal.getValueAt(fila,11).toString();
        

    
        try {
            PreparedStatement actu= connection.prepareStatement("Update Personal set nombre='"+N+"', usuario='"+U+"', contraseña='"+C+"', curp='"+CU+"', rfc='"+R+"', fecha_contratacion='"+F+"', correo='"+CO+"', escolaridad='"+E+"', edad='"+A+"', telefono='"+T+"', rol='"+RL+"' where id='"+id+"'");
            actu.executeUpdate();
            Mostrar("Personal");
            JOptionPane.showMessageDialog(null,"Actualizacion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e +"No se actualizó el registro");
        }

}
    
    private void PasarValoresPanelDetallesMensaje(){
        int rowIndex = TablaPersonal.getSelectedRow();

        // Verifica si hay alguna fila seleccionada
        if (rowIndex != -1) {
            // Obtiene los valores de las celdas en la fila seleccionada
            String N = String.valueOf(TablaPersonal.getValueAt(rowIndex, 1));  
            String U = String.valueOf(TablaPersonal.getValueAt(rowIndex, 2));
            String C = String.valueOf(TablaPersonal.getValueAt(rowIndex, 3));
            String CU = String.valueOf(TablaPersonal.getValueAt(rowIndex, 4));
            String RF = String.valueOf(TablaPersonal.getValueAt(rowIndex, 5));
            String F = String.valueOf(TablaPersonal.getValueAt(rowIndex, 6));  
            String CO = String.valueOf(TablaPersonal.getValueAt(rowIndex, 7));
            String E = String.valueOf(TablaPersonal.getValueAt(rowIndex, 8));
            String ED = String.valueOf(TablaPersonal.getValueAt(rowIndex, 9));
            String T = String.valueOf(TablaPersonal.getValueAt(rowIndex, 10));
            String R = String.valueOf(TablaPersonal.getValueAt(rowIndex, 11));
            

            //Mando a llamar el nuevo panel
            DetallesPersonal DP = new DetallesPersonal(N, U, C, CU, RF, F, CO, E, ED, T ,R);
            MostrarPanel(DP);
           
            // ... haz algo más con los valores
        } else {
            // No hay fila seleccionada, maneja la situación en consecuencia
            JOptionPane.showMessageDialog(null, "Seleccione un registro para ver sus detalles");
        }
    }    
    
    
    //Funciuon para mostrar la barra lateral. Modificar para que muestre la barra lateral del usuario correspondiente
    private void MostrarPanelMenuLateral(JPanel p){
        

        
        p.setSize(250,690);
        p.setLocation(0,0);
        
        MenuLateralPanel.removeAll();
        MenuLateralPanel.add(p,BorderLayout.CENTER);
        MenuLateralPanel.revalidate();
        MenuLateralPanel.repaint();
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
                
            case "Coordinador del personal de administracion":
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
        TablaPersonal = new javax.swing.JTable();
        BotonAgregar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        BG.add(MenuLateralPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 690));

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
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        PanelInfoFechaLayout.setVerticalGroup(
            PanelInfoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoFechaLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(PanelInfoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        BG.add(PanelInfoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 790, 140));

        PanelContenido.setBackground(new java.awt.Color(255, 255, 255));

        TablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaPersonal);

        BotonAgregar.setBackground(new java.awt.Color(255, 255, 255));
        BotonAgregar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
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

        BotonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        BotonBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseClicked(evt);
            }
        });
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 70)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 97, 150));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Brillos.png"))); // NOI18N
        jLabel7.setText("Personal");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BotonActualizar.setBackground(new java.awt.Color(255, 255, 255));
        BotonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelContenidoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelContenidoLayout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 158, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*public void setIniAdmin(InicioAdmin IniAdmin){
        this.IniAdmin = IniAdmin;
    }*/
    
    public static String fechaActual(){
    Date fecha= new Date();
        SimpleDateFormat mostrar_fecha= new SimpleDateFormat("dd/MM/YYYY");
        return mostrar_fecha.format(fecha);
    }
    
    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarPersonal VRP = new VentanaRegistrarPersonal();
        MostrarPanel(VRP);
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        // TODO add your handling code here:
        Eliminar();

    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseClicked
        // TODO add your handling code here:
        VentanaBuscarPersonal VBP = new VentanaBuscarPersonal();
        MostrarPanel(VBP);
    }//GEN-LAST:event_BotonBuscarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PasarValoresPanelDetallesMensaje();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        // TODO add your handling code here:
        Actualizar();
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void MostrarPanel(JPanel p){
        
        p.setSize(790,470);
        p.setLocation(0,0);
        
        PanelContenido.removeAll();
        PanelContenido.add(p,BorderLayout.CENTER);
        PanelContenido.revalidate();
        PanelContenido.repaint();
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
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Hora;
    private javax.swing.JPanel MenuLateralPanel;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JPanel PanelInfoFecha;
    private javax.swing.JTable TablaPersonal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
