
package supertlon.vistas;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.supertlon.funcionalidad.NivelMembresia;
import org.supertlon.funcionalidad.Sede;
import org.supertlon.funcionalidad.Supertlon;


public class GestionAdministradorCrearSede extends javax.swing.JFrame {
    private Supertlon controlador;
    private NivelMembresia nivelSeleccionado;
    
    
     String opcionSeleccionada;
     String direccionIngresada;
    
    public GestionAdministradorCrearSede(Supertlon supertlon) {
    this.controlador = supertlon;
    initComponents();
    inicializarComboBox();
    
    }
    
    private void inicializarComboBox() {
    try {
        if (this.controlador != null) {
            List<NivelMembresia> niveles = this.controlador.getNivelesMembresia();
            DefaultComboBoxModel<NivelMembresia> model = new DefaultComboBoxModel<>(niveles.toArray(new NivelMembresia[0]));
            
            jComboBoxMembresia.setModel(model);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
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
        txtNombre = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxMembresia = new javax.swing.JComboBox<>();
        btnCrearSede = new javax.swing.JButton();
        btnEliminarSede = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSedes = new javax.swing.JTable();
        btnSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel8.setText("Nombre de la Sede");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

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
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/favicon.png"))); // NOI18N
        jLabel4.setText("SuperTlon");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel5.setText("Administracion de Sedes");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 330, 30));

        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });
        bg.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 330, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel9.setText("Lista de Sedes");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel10.setText("Nivel Minimo de Membresia de la Sede");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jComboBoxMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMembresiaActionPerformed(evt);
            }
        });
        bg.add(jComboBoxMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 330, 30));

        btnCrearSede.setBackground(new java.awt.Color(51, 153, 255));
        btnCrearSede.setForeground(new java.awt.Color(51, 51, 51));
        btnCrearSede.setText("Crear Sede");
        btnCrearSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearSedeActionPerformed(evt);
            }
        });
        bg.add(btnCrearSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 160, 50));

        btnEliminarSede.setText("Eliminar Sede");
        btnEliminarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSedeActionPerformed(evt);
            }
        });
        bg.add(btnEliminarSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 120, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel12.setText("Capacidad de la Sede");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        tablaSedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaSedes);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 370, 200));

        btnSalir1.setBackground(new java.awt.Color(204, 51, 0));
        btnSalir1.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        bg.add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 110, 30));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void jComboBoxMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMembresiaActionPerformed
        NivelMembresia nivelSeleccionado = (NivelMembresia) jComboBoxMembresia.getSelectedItem();

    }//GEN-LAST:event_jComboBoxMembresiaActionPerformed

    private void btnCrearSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearSedeActionPerformed
        try {
        String nombre = txtNombre.getText();
        String capacidadStr = txtCapacidad.getText();
        int capacidad;

        
        if (capacidadStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese una capacidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        capacidad = Integer.parseInt(capacidadStr);
        
        if (controlador.existeSede(nombre)) {
            JOptionPane.showMessageDialog(this,"Ya existe una sede con el nombre ingresado. Por favor, elija otro nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        NivelMembresia nivelSeleccionado = (NivelMembresia) jComboBoxMembresia.getSelectedItem();
        

        Sede nuevaSede = controlador.crearSede(nombre, capacidad, nivelSeleccionado);
        controlador.agregarSede(nuevaSede);

        jComboBoxMembresiaActionPerformed(null);

        JOptionPane optionPane = new JOptionPane("Sede guardada con éxito!");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Guardado Exitoso!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

        cargarTabla();
    } catch (NumberFormatException e) {
        // Ocurrió un error al convertir la capacidad a entero
        JOptionPane.showMessageDialog(this, "Por favor ingrese una capacidad válida (número entero).", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnCrearSedeActionPerformed

    private void btnEliminarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSedeActionPerformed
        if(tablaSedes.getRowCount() > 0) {
            if(tablaSedes.getSelectedRow()!=-1) {
                String nombre = String.valueOf(tablaSedes.getValueAt(tablaSedes.getSelectedRow(),0));
                
                controlador.borrarSede(nombre);
                mostrarMensaje("Sede borrada correctamente", "Info", "Borrado Exitoso");
                cargarTabla();
            }
            else {
                mostrarMensaje("No se selecciono una sede para eliminar", "Error", "Error al eliminar");
            }
        }
        else {
            mostrarMensaje("La tabla esta vacia, no se puede eliminar", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarSedeActionPerformed
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
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        // TODO add your handling code here:
        this.dispose(); //Ivan Original: Agrege esto que es para que, cuando abris una ventana, se cierre la anterior, si hace bugs o algo lo sacamos.

        GestionSoporteTecnicoMenu admWindow = new GestionSoporteTecnicoMenu(controlador);

        admWindow.setVisible(true);
        admWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalir1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCrearSede;
    private javax.swing.JButton btnEliminarSede;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JComboBox<NivelMembresia> jComboBoxMembresia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaSedes;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        DefaultTableModel modeloTabla = new DefaultTableModel () {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"Nombre", "Capacidad", "NivelMembresia"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        
        List<Sede> sedes = controlador.getSedes();
        
        if (sedes !=null) {
            for (Sede sede : sedes) {
               String nombreNivel = sede.getNivelMinimoMembresia().getNombre();
               Object[] object = {sede.getNombre(), sede.getCapacidad(), nombreNivel};
               
               modeloTabla.addRow(object);
            }
        }
        tablaSedes.setModel(modeloTabla);
    }
    
    
}
