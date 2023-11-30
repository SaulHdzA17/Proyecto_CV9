/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventana;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author jauregui
 */
public class MenuLateral_IC extends javax.swing.JPanel {

    /**
     * Creates new form MenuLateral_ICE
     */
    public MenuLateral_IC() {
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

        jLabel7 = new javax.swing.JLabel();
        BotonInicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonItems = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BotonReportes = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BotonMensajes = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(224, 229, 233));
        setPreferredSize(new java.awt.Dimension(250, 680));
        setSize(new java.awt.Dimension(250, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo-3.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 220));

        BotonInicio.setBackground(new java.awt.Color(159, 195, 231));
        BotonInicio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BotonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonInicioMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inicio");

        javax.swing.GroupLayout BotonInicioLayout = new javax.swing.GroupLayout(BotonInicio);
        BotonInicio.setLayout(BotonInicioLayout);
        BotonInicioLayout.setHorizontalGroup(
            BotonInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        BotonInicioLayout.setVerticalGroup(
            BotonInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonInicioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        add(BotonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 249, 250, 50));

        BotonItems.setBackground(new java.awt.Color(159, 195, 231));
        BotonItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonItemsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonItemsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonItemsMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Items");

        javax.swing.GroupLayout BotonItemsLayout = new javax.swing.GroupLayout(BotonItems);
        BotonItems.setLayout(BotonItemsLayout);
        BotonItemsLayout.setHorizontalGroup(
            BotonItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonItemsLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        BotonItemsLayout.setVerticalGroup(
            BotonItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonItemsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add(BotonItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 50));

        BotonReportes.setBackground(new java.awt.Color(159, 195, 231));
        BotonReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonReportesMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Reportes");

        javax.swing.GroupLayout BotonReportesLayout = new javax.swing.GroupLayout(BotonReportes);
        BotonReportes.setLayout(BotonReportesLayout);
        BotonReportesLayout.setHorizontalGroup(
            BotonReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonReportesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BotonReportesLayout.setVerticalGroup(
            BotonReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonReportesLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(15, 15, 15))
        );

        add(BotonReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 45));

        BotonMensajes.setBackground(new java.awt.Color(159, 195, 231));
        BotonMensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMensajesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonMensajesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonMensajesMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mensajes");

        javax.swing.GroupLayout BotonMensajesLayout = new javax.swing.GroupLayout(BotonMensajes);
        BotonMensajes.setLayout(BotonMensajesLayout);
        BotonMensajesLayout.setHorizontalGroup(
            BotonMensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonMensajesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotonMensajesLayout.setVerticalGroup(
            BotonMensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonMensajesLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(15, 15, 15))
        );

        add(BotonMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 190, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseClicked
        // TODO add your handling code here:
        JFrame ventanacontenedora = (JFrame) SwingUtilities.getWindowAncestor(this);

        if(ventanacontenedora != null){
            if(ventanacontenedora instanceof InicioAdmin){
                System.out.print("El panel esta en inicioadmin");
            }else if(ventanacontenedora instanceof Items || ventanacontenedora instanceof Mensajes  || ventanacontenedora instanceof Reportes){
                System.out.println("El panel esta en: "+ ventanacontenedora);
                ventanacontenedora.dispose();
                InicioAdmin iniadmin = new InicioAdmin();
                iniadmin.setVisible(true);

            }
        }
    }//GEN-LAST:event_BotonInicioMouseClicked

    private void BotonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseEntered
        // TODO add your handling code here:
        Color nuevoColor = new Color(16,106,182);
        BotonInicio.setBackground(nuevoColor);
    }//GEN-LAST:event_BotonInicioMouseEntered

    private void BotonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseExited
        // TODO add your handling code here:

        Color nuevoColor = new Color(18,113,199);
        BotonInicio.setBackground(nuevoColor);
    }//GEN-LAST:event_BotonInicioMouseExited

    private void BotonItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonItemsMouseClicked
        // TODO add your handling code here:
        JFrame ventanacontenedora = (JFrame) SwingUtilities.getWindowAncestor(this);

        if(ventanacontenedora != null){
            if(ventanacontenedora instanceof Items){
                System.out.print("El panel esta en inicioadmin");
            }else if(ventanacontenedora instanceof InicioAdmin || ventanacontenedora instanceof Mensajes  || ventanacontenedora instanceof Reportes){
                System.out.println("El panel esta en: "+ ventanacontenedora);
                ventanacontenedora.dispose();
                InicioAdmin iniadmin = new InicioAdmin();
                iniadmin.setVisible(true);

            }
        }
    }//GEN-LAST:event_BotonItemsMouseClicked

    private void BotonItemsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonItemsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonItemsMouseEntered

    private void BotonItemsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonItemsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonItemsMouseExited

    private void BotonReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonReportesMouseClicked
        // TODO add your handling code here:

        JFrame ventanacontenedora = (JFrame) SwingUtilities.getWindowAncestor(this);

        if(ventanacontenedora != null){
            if(ventanacontenedora instanceof Reportes){
                System.out.print("El panel esta en: "+ventanacontenedora);
            }else if(ventanacontenedora instanceof Items || ventanacontenedora instanceof InicioAdmin  || ventanacontenedora instanceof Mensajes){
                //Se cierra la ventana en la que se esta para que se visualice la otra
                System.out.println("El panel esta en: "+ ventanacontenedora);
                ventanacontenedora.dispose();

                //Mando a llamar la pantalla y la establezco para que se visualice
                Reportes R = new Reportes();
                R.setVisible(true);

            }
        }
    }//GEN-LAST:event_BotonReportesMouseClicked

    private void BotonReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonReportesMouseEntered
        // TODO add your handling code here:
        Color nuevoColor = new Color(16,106,182);
        BotonReportes.setBackground(nuevoColor);
    }//GEN-LAST:event_BotonReportesMouseEntered

    private void BotonReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonReportesMouseExited
        // TODO add your handling code here:
        Color nuevoColor = new Color(18,113,199);
        BotonReportes.setBackground(nuevoColor);
    }//GEN-LAST:event_BotonReportesMouseExited

    private void BotonMensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMensajesMouseClicked
        // TODO add your handling code here:
        JFrame ventanacontenedora = (JFrame) SwingUtilities.getWindowAncestor(this);

        if(ventanacontenedora != null){
            if(ventanacontenedora instanceof Mensajes){
                System.out.print("El panel esta en Mensajes");
            }else if(ventanacontenedora instanceof Items   || ventanacontenedora instanceof Reportes || ventanacontenedora instanceof InicioAdmin){
                System.out.println("El panel esta en: "+ ventanacontenedora);
                ventanacontenedora.dispose();
                Mensajes mensajes = new Mensajes();
                mensajes.setVisible(true);

            }
        }
    }//GEN-LAST:event_BotonMensajesMouseClicked

    private void BotonMensajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMensajesMouseEntered
        // TODO add your handling code here:
        Color nuevoColor = new Color(16,106,182);
        BotonMensajes.setBackground(nuevoColor);
    }//GEN-LAST:event_BotonMensajesMouseEntered

    private void BotonMensajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMensajesMouseExited
        // TODO add your handling code here:
        Color nuevoColor = new Color(18,113,199);
        BotonMensajes.setBackground(nuevoColor);
    }//GEN-LAST:event_BotonMensajesMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonInicio;
    private javax.swing.JPanel BotonItems;
    private javax.swing.JPanel BotonMensajes;
    private javax.swing.JPanel BotonReportes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
