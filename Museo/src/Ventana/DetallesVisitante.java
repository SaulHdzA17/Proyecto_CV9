/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventana;

import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Image;




/**
 *
 * @author jauregui
 */
public class DetallesVisitante extends javax.swing.JPanel {

    /**
     * Creates new form DetallesVisitante
     */
    public DetallesVisitante(String nombre, String telefono, String correo, String direccion,ImageIcon foto, String motivo, String desc, String fecha) {
        initComponents();
        
        Nombre.setText(nombre);
        txttelefono.setText(telefono);
        txtcorreo.setText(correo);
        txtdireccion.setText(direccion); 
        
        Image imagen = foto.getImage();
        Image nuevaImagen = imagen.getScaledInstance(300, 150, Image.SCALE_SMOOTH); 
        ImageIcon imagenajustada = new ImageIcon(nuevaImagen);
        labelfoto.setIcon(imagenajustada);
 
        txtmotivo.setText(motivo);
        txtdesc.setText(desc);
        txtfecha.setText(fecha);
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
        jLabel4 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRegresar = new javax.swing.JButton();
        txtcorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        labelfoto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtmotivo = new javax.swing.JTextArea();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 97, 150));
        jLabel1.setText("Detalles del visitante");
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 13, -1, -1));

        jlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel.setText("Nombre");
        BG.add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 74, -1, -1));

        Nombre.setEditable(false);
        Nombre.setBorder(null);
        Nombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        BG.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 97, 304, 23));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");
        BG.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 142, -1, -1));

        txttelefono.setEditable(false);
        txttelefono.setBorder(null);
        BG.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 165, 304, 22));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Correo Electronico");
        BG.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 207, -1, -1));

        txtRegresar.setBackground(new java.awt.Color(255, 255, 255));
        txtRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        txtRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegresarActionPerformed(evt);
            }
        });
        BG.add(txtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 385, 45, 47));

        txtcorreo.setEditable(false);
        txtcorreo.setBorder(null);
        BG.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 230, 304, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Direccion");
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 264, -1, -1));

        txtdireccion.setEditable(false);
        txtdireccion.setBorder(null);
        BG.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 287, 304, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Motivo");
        BG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 325, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Descripcion del visitante");
        BG.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 74, -1, -1));

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        BG.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 0, 8, 460));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 126, 304, 10));
        BG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 189, 304, 10));
        BG.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 309, 304, 10));
        BG.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 248, 304, 10));

        txtdesc.setEditable(false);
        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        jScrollPane2.setViewportView(txtdesc);

        BG.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 97, 267, -1));

        jLabel6.setText("Identifiacion");
        BG.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 259, -1, -1));
        BG.add(labelfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 281, 330, 180));

        jLabel8.setText("Fecha");
        BG.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 199, -1, -1));

        txtfecha.setEditable(false);
        txtfecha.setText("jTextField1");
        txtfecha.setBorder(null);
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });
        BG.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 221, 267, -1));
        BG.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 243, 267, 10));

        txtmotivo.setEditable(false);
        txtmotivo.setColumns(20);
        txtmotivo.setRows(5);
        jScrollPane3.setViewportView(txtmotivo);

        BG.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 348, 304, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void txtRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegresarActionPerformed
        // TODO add your handling code here:
        RegresarVentanaanterior();
    }//GEN-LAST:event_txtRegresarActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

        private void RegresarVentanaanterior(){
        // Cerrar el panel actual
        java.awt.Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof java.awt.Frame) {
            java.awt.Frame frame = (java.awt.Frame) window;
            frame.dispose();  // Cierra la ventana actual
        }

        // Mostrar la ventana anterior (Mensajes)
        DatosAcceso da = new DatosAcceso();
        da.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel labelfoto;
    private javax.swing.JButton txtRegresar;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextArea txtmotivo;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}