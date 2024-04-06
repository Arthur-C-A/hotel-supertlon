
package supertlon.vistas;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.supertlon.funcionalidad.NivelMembresia;
import org.supertlon.funcionalidad.Profesor;
import org.supertlon.funcionalidad.Supertlon;


public class GestionAdministradorCrearProfesores extends javax.swing.JFrame {
    private Supertlon controlador;


    public GestionAdministradorCrearProfesores(Supertlon supertlon) {
        this.controlador = supertlon;
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCrearProfesor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProfesor = new javax.swing.JTable();
        btnEliminarSede = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Lista de Profesores");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Administrador");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/Fitness-Club-logo-illustration-Fitness-centre-Ads-3038.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, -50, 170, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/city.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 120, 100));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/favicon.png"))); // NOI18N
        jLabel4.setText("SuperTlon");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Administracion de Profesores");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        btnSalir.setBackground(new java.awt.Color(204, 51, 0));
        btnSalir.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 160, 50));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 330, 30));

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });
        bg.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sueldo del Profesor");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        btnCrearProfesor.setBackground(new java.awt.Color(51, 153, 255));
        btnCrearProfesor.setForeground(new java.awt.Color(51, 51, 51));
        btnCrearProfesor.setText("Contratar Profesor");
        btnCrearProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProfesorActionPerformed(evt);
            }
        });
        bg.add(btnCrearProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, 50));

        tablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProfesor);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 380, 200));

        btnEliminarSede.setText("Despedir Profesor");
        btnEliminarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSedeActionPerformed(evt);
            }
        });
        bg.add(btnEliminarSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 160, 40));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre del Profesor");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose(); //Ivan Original: Agrege esto que es para que, cuando abris una ventana, se cierre la anterior, si hace bugs o algo lo sacamos.
        
        GestionProfesores admWindow = new GestionProfesores(controlador);
        
        admWindow.setVisible(true);
        admWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void btnCrearProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProfesorActionPerformed
        try {
        String nombre = txtNombre.getText();
        String sueldoStr = txtSueldo.getText();
        
        if (nombre.isEmpty() || sueldoStr.isEmpty()) {
            mostrarMensaje("Por favor complete todos los campos.", "Error", "Campos Vacíos");
            return;
        }
        int sueldo = Integer.parseInt(sueldoStr);
        
        // Creas el profesor aquí y lo devuelves
        Profesor nuevoProfesor = controlador.crearProfesor(nombre, sueldo);
        
        // Agregas el profesor a la lista
        controlador.agregarProfesor(nuevoProfesor);

        mostrarMensaje("Profesor contratado con éxito.", "Info", "Creación Exitosa");

        txtNombre.setText("");
        txtSueldo.setText("");
        
        cargarTabla();      
    } catch (NumberFormatException e) {
        // Ocurrió un error al convertir sueldo a entero
        mostrarMensaje("Por favor ingrese un valor numérico válido para el sueldo.", "Error", "Error de Conversión");
    }
    }//GEN-LAST:event_btnCrearProfesorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSedeActionPerformed
        if(tablaProfesor.getRowCount() > 0) {
            if(tablaProfesor.getSelectedRow()!=-1) {
                String nombre = String.valueOf(tablaProfesor.getValueAt(tablaProfesor.getSelectedRow(),0));

                controlador.borrarProfesor(nombre);
                mostrarMensaje("Profesor dado de baja correctamente", "Info", "Borrado Exitoso");
                cargarTabla();
            }
            else {
                mostrarMensaje("No se selecciono un profesor para dar de baja", "Error", "Error al eliminar");
            }
        }
        else {
            mostrarMensaje("La tabla esta vacia, no se puede eliminar", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarSedeActionPerformed
    
    private void cargarTabla() {
        
        DefaultTableModel modeloTabla = new DefaultTableModel () {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"Nombre", "Sueldo"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        List<Profesor> listaDeProfesores = controlador.getProfesores();

    if (listaDeProfesores != null) {
        for (Profesor profesor : listaDeProfesores) {
            String nombreProfesor = profesor.getNombre();
            int sueldoProfesor = profesor.getSueldo();
            Object[] object = {nombreProfesor, sueldoProfesor};

            modeloTabla.addRow(object);
        }
    }
    tablaProfesor.setModel(modeloTabla);
}
    public void mostrarMensaje (String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCrearProfesor;
    private javax.swing.JButton btnEliminarSede;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProfesor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
