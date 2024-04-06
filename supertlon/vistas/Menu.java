
package supertlon.vistas;

import org.supertlon.funcionalidad.Supertlon;


public class Menu extends javax.swing.JFrame {
    private Supertlon controlador;
   
    public Menu(Supertlon controlador) {
        this.controlador = controlador;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnAdm = new javax.swing.JButton();
        btnIngresar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SuperTlon");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/Fitness-Club-logo-illustration-Fitness-centre-Ads-3038.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 170, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/city.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 500));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/favicon.png"))); // NOI18N
        jLabel4.setText("SuperTlon");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel5.setText("Sistema de Gestion SuperTlon");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(51, 102, 255));
        btnIngresar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Gestión Cliente");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        bg.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 370, 70));

        btnAdm.setBackground(new java.awt.Color(51, 102, 255));
        btnAdm.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnAdm.setForeground(new java.awt.Color(255, 255, 255));
        btnAdm.setText("Soporte Tecnico");
        btnAdm.setActionCommand("Gestión");
        btnAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmActionPerformed(evt);
            }
        });
        bg.add(btnAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 370, 70));

        btnIngresar2.setBackground(new java.awt.Color(51, 102, 255));
        btnIngresar2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnIngresar2.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar2.setText("Gestión Administrativa");
        btnIngresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar2ActionPerformed(evt);
            }
        });
        bg.add(btnIngresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 370, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        GestionUsuario cargarUsuario = new GestionUsuario(controlador); // Pasa la referencia a Supertlon
    cargarUsuario.setVisible(true);
    cargarUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmActionPerformed
        if (controlador != null) {
        GestionSoporteTecnicoMenu admWindow = new GestionSoporteTecnicoMenu(controlador);
        admWindow.setVisible(true);
        admWindow.setLocationRelativeTo(null);
        } else {
        System.out.println("Error: controlador es nulo al crear Menu");
        }
    }//GEN-LAST:event_btnAdmActionPerformed

    private void btnIngresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar2ActionPerformed
        // TODO add your handling code here:
            if (controlador != null) {
        GestionProfesores admWindow = new GestionProfesores(controlador);
        admWindow.setVisible(true);
        admWindow.setLocationRelativeTo(null);
        } else {
        System.out.println("Error: controlador es nulo al crear Menu");
        }
   
    }//GEN-LAST:event_btnIngresar2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAdm;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
