/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supertlon.vistas;

import org.supertlon.funcionalidad.Supertlon;
import org.supertlon.funcionalidad.*; 

/**
 *
 * @author Ivar
 */
public class GestionProfesoresArticulosBusquedaMenu extends javax.swing.JFrame {

    /**
     * Creates new form GestionProfesoresArticulosBusquedaMenu
     */
    private Supertlon controlador;
    public GestionProfesoresArticulosBusquedaMenu(Supertlon supertlon) {
        this.controlador = supertlon;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCargarAmortPorUso = new javax.swing.JButton();
        btnCargarAmortPorFecha = new javax.swing.JButton();
        btnSalir5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Profesores");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/city.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel5.setText("Busqueda Articulos y Amotizaciones Acumuladas");

        btnCargarAmortPorUso.setBackground(new java.awt.Color(51, 153, 255));
        btnCargarAmortPorUso.setForeground(new java.awt.Color(51, 51, 51));
        btnCargarAmortPorUso.setText("Cargar Amortizacion Por Uso");
        btnCargarAmortPorUso.setActionCommand("Crear");
        btnCargarAmortPorUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarAmortPorUsoActionPerformed(evt);
            }
        });

        btnCargarAmortPorFecha.setBackground(new java.awt.Color(51, 153, 255));
        btnCargarAmortPorFecha.setForeground(new java.awt.Color(51, 51, 51));
        btnCargarAmortPorFecha.setText("Cargar Amortizacion Por Fecha");
        btnCargarAmortPorFecha.setActionCommand("Crear");
        btnCargarAmortPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarAmortPorFechaActionPerformed(evt);
            }
        });

        btnSalir5.setBackground(new java.awt.Color(204, 51, 0));
        btnSalir5.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir5.setText("Volver");
        btnSalir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCargarAmortPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCargarAmortPorUso, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(86, 86, 86)
                .addComponent(btnCargarAmortPorUso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnCargarAmortPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarAmortPorUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarAmortPorUsoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GestionProfesoresArticulosBusqueda gestprof = new GestionProfesoresArticulosBusqueda(controlador);
        gestprof.setVisible(true);
        gestprof.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCargarAmortPorUsoActionPerformed

    private void btnCargarAmortPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarAmortPorFechaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GestionProfesoresArticulosBusqueda2 gestprof = new  GestionProfesoresArticulosBusqueda2(controlador);
        gestprof.setVisible(true);
        gestprof.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCargarAmortPorFechaActionPerformed

    private void btnSalir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir5ActionPerformed
        // TODO add your handling code here:
        this.dispose(); //Ivan Original: Agrege esto que es para que, cuando abris una ventana, se cierre la anterior, si hace bugs o algo lo sacamos.

        GestionSoporteTecnicoMenu admWindow = new GestionSoporteTecnicoMenu(controlador);

        admWindow.setVisible(true);
        admWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalir5ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarAmortPorFecha;
    private javax.swing.JButton btnCargarAmortPorUso;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JButton btnSalir3;
    private javax.swing.JButton btnSalir4;
    private javax.swing.JButton btnSalir5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
