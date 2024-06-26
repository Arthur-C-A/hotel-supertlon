/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supertlon.vistas;

import org.supertlon.funcionalidad.Supertlon;

/**
 *
 * @author Ivar
 */
public class GestionAdministrativa extends javax.swing.JFrame {

    /**
     * Creates new form GestionAdministrativa
     */
    private Supertlon controlador;
    public GestionAdministrativa(Supertlon controlador1) {
        this.controlador = controlador;
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

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCrearMembresia = new javax.swing.JButton();
        btnAgendarClase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/favicon.png"))); // NOI18N
        jLabel4.setText("SuperTlon");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/city.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        btnCrearMembresia.setBackground(new java.awt.Color(51, 102, 255));
        btnCrearMembresia.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCrearMembresia.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearMembresia.setText("Crear Membresia");
        btnCrearMembresia.setActionCommand("Gestión");
        btnCrearMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMembresiaActionPerformed(evt);
            }
        });

        btnAgendarClase.setBackground(new java.awt.Color(51, 102, 255));
        btnAgendarClase.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAgendarClase.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendarClase.setText("Agendar Clase");
        btnAgendarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgendarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnAgendarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMembresiaActionPerformed
        if (controlador != null) {
            GestionAdministradorCrearNivelMembresia admWindow = new GestionAdministradorCrearNivelMembresia(controlador);
            admWindow.setVisible(true);
            admWindow.setLocationRelativeTo(null);
        } else {
            System.out.println("Error: controlador es nulo al crear Menu");
        }
    }//GEN-LAST:event_btnCrearMembresiaActionPerformed

    private void btnAgendarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarClaseActionPerformed
        // TODO add your handling code here:
        if (controlador != null) {
            GestionProfesorCrearClase admWindow = new GestionProfesorCrearClase(controlador);
            admWindow.setVisible(true);
            admWindow.setLocationRelativeTo(null);
        } else {
            System.out.println("Error: controlador es nulo al crear Menu");
        }

    }//GEN-LAST:event_btnAgendarClaseActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarClase;
    private javax.swing.JButton btnCrearMembresia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
