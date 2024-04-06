
package supertlon.vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import org.supertlon.funcionalidad.*; 

public class GestionProfesorCrearClase extends javax.swing.JFrame {
    private Supertlon controlador;
    public GestionProfesorCrearClase(Supertlon supertlon) {
        this.controlador = supertlon;
        initComponents();
        initEventHandlers();
        cargarProfesoresEnComboBox();
        
    }
        private void initEventHandlers() {
        btnCrearunaClase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCrearunaClaseActionPerformed(e);
            }
        });
    }
    
        private void cargarProfesoresEnComboBox() {
        List<Profesor> listaDeProfesores = controlador.getProfesores();

        for (Profesor profesor : listaDeProfesores) {
            JComboBoxprofesorNombre.addItem(profesor);
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        jComboBoxSede = new javax.swing.JComboBox<>();
        jComboBoxTipodeEj = new javax.swing.JComboBox<>();
        jComboBoxOnline = new javax.swing.JComboBox<>();
        btnCrearunaClase = new javax.swing.JButton();
        jComboBoxEmplazamiento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDiaClase = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHoraFin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCantAlumnos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxMembresia = new javax.swing.JComboBox<>();
        JComboBoxprofesorNombre = new javax.swing.JComboBox<>();
        btnSalir2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/city.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Profesores");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel5.setText("Crear Clase");

        txtHoraInicio.setText("hhmm");
        txtHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraInicioActionPerformed(evt);
            }
        });

        jComboBoxSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belgrano", "Recoleta" }));
        jComboBoxSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSedeActionPerformed(evt);
            }
        });

        jComboBoxTipodeEj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crossfit", "Yoga", "Kangoo jumping", "Gimnasia postural", "Aero combat" }));
        jComboBoxTipodeEj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipodeEjActionPerformed(evt);
            }
        });

        jComboBoxOnline.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jComboBoxOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOnlineActionPerformed(evt);
            }
        });

        btnCrearunaClase.setBackground(new java.awt.Color(51, 153, 255));
        btnCrearunaClase.setForeground(new java.awt.Color(51, 51, 51));
        btnCrearunaClase.setText("Crear una Clase");
        btnCrearunaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearunaClaseActionPerformed(evt);
            }
        });

        jComboBoxEmplazamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salon", "Pileta", "Aire libre" }));
        jComboBoxEmplazamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmplazamientoActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione Profesor:");

        jLabel3.setText("Hora de inicio?");

        jLabel4.setText("Selecione Sede:");

        jLabel6.setText("Hora de fin?");

        txtDiaClase.setText("yyyy-mm-dd");
        txtDiaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaClaseActionPerformed(evt);
            }
        });

        jLabel8.setText("Dia de la clase?");

        txtHoraFin.setText("hhmm");
        txtHoraFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraFinActionPerformed(evt);
            }
        });

        jLabel9.setText("Es online?");

        jLabel10.setText("Tipó de ejercicio:");

        jLabel11.setText("Emplazamiento:");

        jLabel12.setText("Nivel de membresia requerido:");

        txtCantAlumnos.setText("ingrese cantidad de alumnos");
        txtCantAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantAlumnosActionPerformed(evt);
            }
        });

        jLabel13.setText("Cantidad de Alumnos:");

        jComboBoxMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "Oro", "Platinum" }));
        jComboBoxMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMembresiaActionPerformed(evt);
            }
        });

        JComboBoxprofesorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxprofesorNombreActionPerformed(evt);
            }
        });

        btnSalir2.setBackground(new java.awt.Color(204, 51, 0));
        btnSalir2.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(238, 238, 238))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDiaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxSede, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxTipodeEj, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(jComboBoxEmplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCantAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCrearunaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JComboBoxprofesorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(JComboBoxprofesorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSede, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipodeEj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxEmplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrearunaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraInicioActionPerformed

    private void jComboBoxSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSedeActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSedeActionPerformed

    private void jComboBoxTipodeEjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipodeEjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipodeEjActionPerformed

    private void jComboBoxOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOnlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOnlineActionPerformed

    private void btnCrearunaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearunaClaseActionPerformed
        // TODO add your handling code here:
        String nombreProfe = JComboBoxprofesorNombre.getSelectedItem().toString();
        String sede = jComboBoxSede.getSelectedItem().toString();
        int horaIni = Integer.parseInt(txtHoraInicio.getText());
        int horaFin = Integer.parseInt(txtHoraFin.getText());
        String diaDeClase = txtDiaClase.getText();
        LocalDate fecha = LocalDate.parse(diaDeClase);
        String tipoEj = jComboBoxTipodeEj.getSelectedItem().toString();
        String online= jComboBoxOnline.getSelectedItem().toString();
        boolean onl;
        
        if("Si".equals(online)){
            onl=true;
        
        } 
        else {
            onl=false;
        }
        String emoplazamiento= jComboBoxEmplazamiento.getSelectedItem().toString();
        int cantAlum = Integer.parseInt(txtCantAlumnos.getText());
        String membresia= jComboBoxMembresia.getSelectedItem().toString();
        
        String confirmacion;
     
        confirmacion = Clase.crearClase( nombreProfe, sede, horaIni, horaFin, fecha, tipoEj, onl, emoplazamiento, cantAlum, membresia);
        
        if( "Clase creada correctamente".equals(confirmacion)){
            JOptionPane.showMessageDialog(this, "Clase agendada con exito", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Clase no puede ser agendada", "Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_btnCrearunaClaseActionPerformed
    }
    private void jComboBoxEmplazamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmplazamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEmplazamientoActionPerformed

    private void txtDiaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaClaseActionPerformed

    private void txtHoraFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraFinActionPerformed

    private void txtCantAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantAlumnosActionPerformed

    private void jComboBoxMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMembresiaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jComboBoxMembresiaActionPerformed

    private void JComboBoxprofesorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxprofesorNombreActionPerformed
        // TODO add your handling code here:
        List<Profesor> listaDeProfesores = controlador.getProfesores();

    if (!listaDeProfesores.isEmpty()) {
       
    } else {
        
        JOptionPane.showMessageDialog(this, "No hay profesores disponibles.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_JComboBoxprofesorNombreActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        // TODO add your handling code here:
        this.dispose(); 

        GestionProfesores admWindow = new GestionProfesores(controlador);

        admWindow.setVisible(true);
        admWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalir2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Profesor> JComboBoxprofesorNombre;
    private javax.swing.JButton btnCrearunaClase;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JComboBox<String> jComboBoxEmplazamiento;
    private javax.swing.JComboBox<String> jComboBoxMembresia;
    private javax.swing.JComboBox<String> jComboBoxOnline;
    private javax.swing.JComboBox<String> jComboBoxSede;
    private javax.swing.JComboBox<String> jComboBoxTipodeEj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCantAlumnos;
    private javax.swing.JTextField txtDiaClase;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    // End of variables declaration//GEN-END:variables
}
