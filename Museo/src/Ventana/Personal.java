/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;
import javax.swing.JPanel;
import java.awt.BorderLayout;


/**
 *
 * @author jauregui
 */
public class Personal extends javax.swing.JFrame {

    //Variables para las ventanas
    //private InicioAdmin IniAdmin = new InicioAdmin();
    
    /**
     * Creates new form Personal
     */
    public Personal() {
        initComponents();
        MenuLateral ML = new MenuLateral();
        MostrarPanelMenuLateral(ML);
        
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
        PanelContenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();

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

        PanelInfoFecha.setBackground(new java.awt.Color(25, 130, 215));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hoy es 25 de Octubre del 2023");

        javax.swing.GroupLayout PanelInfoFechaLayout = new javax.swing.GroupLayout(PanelInfoFecha);
        PanelInfoFecha.setLayout(PanelInfoFechaLayout);
        PanelInfoFechaLayout.setHorizontalGroup(
            PanelInfoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoFechaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelInfoFechaLayout.setVerticalGroup(
            PanelInfoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoFechaLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(30, 30, 30))
        );

        BG.add(PanelInfoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 790, 140));

        PanelContenido.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Jose", "Jose235as", "234", "ASD", "ASD", "2002", "20", null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Usuario", "Contraseña", "CURP", "RFC", "Año contratacion", "Edad", "Rol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Personal");

        BotonAgregar.setBackground(new java.awt.Color(11, 83, 160));
        BotonAgregar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        BotonActualizar.setBackground(new java.awt.Color(11, 83, 160));
        BotonActualizar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizar.setText("Actualizar");

        BotonBorrar.setBackground(new java.awt.Color(11, 83, 160));
        BotonBorrar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonBorrar.setText("Borrar");

        BotonBuscar.setBackground(new java.awt.Color(11, 83, 160));
        BotonBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        BotonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscar.setText("Buscar");

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    /*public void setIniAdmin(InicioAdmin IniAdmin){
        this.IniAdmin = IniAdmin;
    }*/
    
    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarPersonal VRP = new VentanaRegistrarPersonal();
        MostrarPanel(VRP);
    }//GEN-LAST:event_BotonAgregarActionPerformed

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
    private javax.swing.JPanel MenuLateralPanel;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JPanel PanelInfoFecha;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
