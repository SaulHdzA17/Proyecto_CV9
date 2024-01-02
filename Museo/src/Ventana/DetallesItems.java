/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventana;

import javax.swing.SwingUtilities;

/**
 *
 * @author jauregui
 */
public class DetallesItems extends javax.swing.JPanel {

    /**
     * Creates new form DetallesSala
     */
    public DetallesItems(String N, String C, String D, String E, String P) {
        initComponents();
        Nombre.setText(N);
        Clasificacion.setText(C);
        Descripcion.setText(D);
        Estado.setText(E);
        Prestamo.setText(P);
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
        jlabel = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        Clasificacion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtRegresar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Estado = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Prestamo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 97, 150));
        jLabel1.setText("Ítem");
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 21, -1, -1));

        jlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel.setText("Nombre");
        BG.add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 90, -1, -1));

        Nombre.setEditable(false);
        Nombre.setBorder(null);
        Nombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        BG.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 113, 280, 23));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 142, 280, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Clasificación");
        BG.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 158, -1, -1));

        Clasificacion.setEditable(false);
        Clasificacion.setBorder(null);
        BG.add(Clasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 181, 280, 26));
        BG.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 213, 280, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Descripción");
        BG.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 229, -1, -1));

        txtRegresar.setBackground(new java.awt.Color(255, 255, 255));
        txtRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        txtRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegresarActionPerformed(evt);
            }
        });
        BG.add(txtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 416, 45, 47));
        BG.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 290, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Estado");
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        Estado.setEditable(false);
        Estado.setBorder(null);
        BG.add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 270, 20));
        BG.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 270, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Préstamo");
        BG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        Prestamo.setEditable(false);
        Prestamo.setBorder(null);
        Prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestamoActionPerformed(evt);
            }
        });
        BG.add(Prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 270, 20));
        BG.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 270, 10));

        Descripcion.setEditable(false);
        Descripcion.setColumns(20);
        Descripcion.setRows(5);
        Descripcion.setBorder(null);
        jScrollPane1.setViewportView(Descripcion);

        BG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void txtRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegresarActionPerformed
        // TODO add your handling code here:
        RegresarVentanaanterior();
    }//GEN-LAST:event_txtRegresarActionPerformed

    private void PrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrestamoActionPerformed

    private void RegresarVentanaanterior(){
        // Cerrar el panel actual
        java.awt.Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof java.awt.Frame) {
            java.awt.Frame frame = (java.awt.Frame) window;
            frame.dispose();  // Cierra la ventana actual
        }

        // Mostrar la ventana anterior (Mensajes)
        Items a = new Items();
        a.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JTextField Clasificacion;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JTextField Estado;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Prestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlabel;
    private javax.swing.JButton txtRegresar;
    // End of variables declaration//GEN-END:variables
}
