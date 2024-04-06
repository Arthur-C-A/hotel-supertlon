
package supertlon.vistas;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.supertlon.funcionalidad.Supertlon;
import org.supertlon.funcionalidad.NivelMembresia;

public class GestionAdministradorCrearNivelMembresia extends javax.swing.JFrame {
    private Supertlon controlador;


    public GestionAdministradorCrearNivelMembresia(Supertlon supertlon) {
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
        txtNombre = new javax.swing.JTextField();
        txtPrestigio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnCrearMembresia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMembresia = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnEliminarMembresia = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel8.setText("Lista de Membresias");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

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
        jLabel5.setText("Administracion de Membresias");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 330, 30));

        txtPrestigio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrestigioActionPerformed(evt);
            }
        });
        bg.add(txtPrestigio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 330, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel9.setText("Nivel de Prestigio de la Membresia");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        bg.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 330, 30));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel11.setText("Costo de la Membresia");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btnCrearMembresia.setBackground(new java.awt.Color(51, 153, 255));
        btnCrearMembresia.setForeground(new java.awt.Color(51, 51, 51));
        btnCrearMembresia.setText("Crear Membresia");
        btnCrearMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMembresiaActionPerformed(evt);
            }
        });
        bg.add(btnCrearMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 160, 50));

        tablaMembresia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMembresia);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 370, 190));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel10.setText("Nombre del Nivel de Membresia");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btnEliminarMembresia.setText("Eliminar Membresia");
        btnEliminarMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMembresiaActionPerformed(evt);
            }
        });
        bg.add(btnEliminarMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 160, 40));

        btnSalir2.setBackground(new java.awt.Color(204, 51, 0));
        btnSalir2.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });
        bg.add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 160, 50));

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
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrestigioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrestigioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrestigioActionPerformed

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void btnCrearMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMembresiaActionPerformed
         try {
        String nombre = txtNombre.getText();
        String prestigioStr = txtPrestigio.getText();
        String costoStr = txtCosto.getText();

        // Validar que los campos no estén vacíos
        if (nombre.isEmpty() || prestigioStr.isEmpty() || costoStr.isEmpty()) {
            mostrarMensaje("Por favor complete todos los campos.", "Error", "Campos Vacíos");
            return;
        }
        
        int prestigio = Integer.parseInt(prestigioStr);
        int costo = Integer.parseInt(costoStr);
        
        NivelMembresia nuevoNivel = controlador.crearNivelMembresia(nombre, prestigio, costo);
        controlador.agregarNivelMembresia(nuevoNivel);
        controlador.getNivelesMembresia().add(nuevoNivel);

        mostrarMensaje("Nivel de membresía creado con éxito.", "Info", "Creación Exitosa");
        
        txtNombre.setText("");
        txtPrestigio.setText("");
        txtCosto.setText("");
        
        // Depuración: Imprimir el contenido de la lista y del HashMap
        System.out.println("Lista de nivelesMembresia después de agregar el nuevo nivel:");
        controlador.getNivelesMembresia();
        
        cargarTabla();
        
    } catch (NumberFormatException e) {
        // Ocurrió un error al convertir prestigio o costo a entero
        mostrarMensaje("Por favor ingrese valores numéricos válidos para Prestigio y Costo.", "Error", "Error de Conversión");
    }          
    }//GEN-LAST:event_btnCrearMembresiaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMembresiaActionPerformed
        if(tablaMembresia.getRowCount() > 0) {
            if(tablaMembresia.getSelectedRow()!=-1) {
                String nombre = String.valueOf(tablaMembresia.getValueAt(tablaMembresia.getSelectedRow(),0));

                controlador.borrarMembresia(nombre);
                mostrarMensaje("Membresia borrada correctamente", "Info", "Borrado Exitoso");
                cargarTabla();
            }
            else {
                mostrarMensaje("No se selecciono una membresia para eliminar", "Error", "Error al eliminar");
            }
        }
        else {
            mostrarMensaje("La tabla esta vacia, no se puede eliminar", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarMembresiaActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        // TODO add your handling code here:
        this.dispose(); //Ivan Original: Agrege esto que es para que, cuando abris una ventana, se cierre la anterior, si hace bugs o algo lo sacamos.

        GestionProfesores admWindow = new GestionProfesores(controlador);

        admWindow.setVisible(true);
        admWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalir2ActionPerformed
    
    private void cargarTabla() {
        
        DefaultTableModel modeloTabla = new DefaultTableModel () {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"Nombre", "Prestigio", "Costo"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        List<NivelMembresia> listaDeNiveles = controlador.getNivelesMembresia();

        if (listaDeNiveles != null) {
            for (NivelMembresia nivel : listaDeNiveles) {
            String nombreNivel = nivel.getNombre();
            Object[] object = {nivel.getNombre(), nivel.getPrestigio(), nivel.getCostoMembresia()};

            modeloTabla.addRow(object);
    }
        }
        tablaMembresia.setModel(modeloTabla);
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
    private javax.swing.JButton btnCrearMembresia;
    private javax.swing.JButton btnEliminarMembresia;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMembresia;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrestigio;
    // End of variables declaration//GEN-END:variables
}

