/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supertlon.vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.supertlon.funcionalidad.*; //Acá importo el paquete donde estan las clases

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;



public class GestionUsuario extends javax.swing.JFrame {


    private Alumno alu; //Instancia de Alumno, es decir est es el objeto (alu)
    private ListModel<String> modeloLista; //Instancia del modelo de lista para su uso en 
    //Otros metodos que lo requieran
    private Clase clase;
    private DefaultTableModel mt ;
    private Supertlon controlador;

    

    
    
    public GestionUsuario(Supertlon controlador) {
        this.controlador = controlador;
    initComponents();
    mt = new DefaultTableModel(new Object[]{"Alumno", "Membresia", "Sede", "Fecha","Hora Inicio", "Hora Fin"}, 0);
    tblDate.setModel(mt);
    clase = new Clase(new Date(34), 0, 0);

    // Este bloque de código agrega un listener al JComboBox2
    jComboBox2.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jComboBox2ItemStateChanged(evt);
        }
    });

    inicializarComboBox();

                  
        
    }
    
    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {                                           
    // Aquí puedes manejar los cambios en la selección de la sede
    String nombreSedeSeleccionada = jComboBox2.getSelectedItem().toString();
    // Puedes realizar acciones adicionales según la sede seleccionada
}
    
    private void inicializarComboBox() {
   try {
        if (this.controlador != null) {
            List<Sede> sedes = this.controlador.getSedes();

            // Crear un modelo de ComboBox de String
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

            // Agregar nombres de sedes al modelo
            for (Sede sede : sedes) {
                model.addElement(sede.getNombre());
            }

            // Establecer el modelo en el JComboBox
            jComboBox2.setModel(model);

            // Seleccionar la primera sede por defecto (puedes cambiar esto según tus necesidades)
            if (sedes.size() > 0) {
                jComboBox2.setSelectedItem(sedes.get(0).getNombre());
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    
    @SuppressWarnings("unchecked")
   



    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        textArea1 = new java.awt.TextArea();
        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMembresia = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        btnCarga = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnHora = new java.awt.Button();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDate = new javax.swing.JTable();
        bg = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agendar Clase");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 366, 88));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alumno:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 118, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Membresia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMembresiaActionPerformed(evt);
            }
        });
        jPanel1.add(txtMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 118, 30));

        btnEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        btnSalir2.setBackground(new java.awt.Color(204, 51, 0));
        btnSalir2.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 160, 30));

        btnCarga.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnCarga.setText("Cargar Datos");
        btnCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 118, -1));

        btnModificar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 90, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Horario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sede deseada");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 110, 30));

        btnHora.setBackground(new java.awt.Color(255, 255, 255));
        btnHora.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnHora.setLabel("Hora a reservar");
        btnHora.setName(""); // NOI18N
        btnHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraActionPerformed(evt);
            }
        });
        jPanel1.add(btnHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 330, 110, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        tblDate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Alumno", "Memebresia", "Sede deseada", "Horario IN", "Horario OUT"
            }
        ));
        jScrollPane2.setViewportView(tblDate);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 580, 300));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/images/pexels-photo-7635710.jpeg"))); // NOI18N
        bg.setToolTipText("");
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMembresiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMembresiaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
        
            int filaSeleccionada = tblDate.getSelectedRow();

             if (filaSeleccionada != -1) {
            
             mt.removeRow(filaSeleccionada);
             } else {
            
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para eliminar.");
            }

        
        

        
        txtNombre.setText("");
        txtMembresia.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed
    
      
    
    
    private void btnCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaActionPerformed
        // TODO add your handling code here:
        
        alu = new Alumno(txtNombre.getText(), txtMembresia.getText());

    if (btnCarga.isEnabled()) {
        

        if (modeloLista instanceof DefaultListModel) {
            DefaultListModel<String> defaultListModel = (DefaultListModel<String>) modeloLista;
            defaultListModel.addElement(alu.getDatos());
            
            
            Object[] fila = {alu.getNombre(), alu.getMembresia(), jComboBox2.getSelectedItem(), clase.getDiad(), clase.getComienzoClase(),clase.getTerminaClase()};
            mt.addRow(fila);
        } else {
            DefaultListModel<String> nuevoModelo = new DefaultListModel<>();
            nuevoModelo.addElement(alu.getDatos());
            
            
            
            Object[] fila = {alu.getNombre(), alu.getMembresia(), jComboBox2.getSelectedItem(), clase.getDiad(), clase.getComienzoClase(),clase.getTerminaClase()};
            mt.addRow(fila);
        }

       
        txtNombre.setText("");
        txtMembresia.setText("");      
    }
    }//GEN-LAST:event_btnCargaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        
        

    
        

        int filaSeleccionada = tblDate.getSelectedRow();

    if (filaSeleccionada != -1) {
       
        String nombre = txtNombre.getText();
        String membresia = txtMembresia.getText();
        String sede = jComboBox2.getSelectedItem().toString();

       
        mt.setValueAt(nombre, filaSeleccionada, 0);
        mt.setValueAt(membresia, filaSeleccionada, 1);
        mt.setValueAt(sede, filaSeleccionada, 2);
        mt.setValueAt(clase.getDiad(), filaSeleccionada, 3);
        mt.setValueAt(clase.getComienzoClase(), filaSeleccionada, 4);
        mt.setValueAt(clase.getTerminaClase(), filaSeleccionada, 5);

        // Limpia los campos de texto
        txtNombre.setText("");
        txtMembresia.setText("");
    } else {
        
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para modificar.");
    }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
            
             String nombreSedeSeleccionada = jComboBox2.getSelectedItem().toString();
    
 
    Sede sedeSeleccionada = null;
    for (Sede sede : controlador.getSedes()) {
        if (sede.getNombre().equals(nombreSedeSeleccionada)) {
            sedeSeleccionada = sede;
            break;
        }
    }
    
 
    if (sedeSeleccionada != null) {
        clase.setSede(sedeSeleccionada);
    } else {
       
        JOptionPane.showMessageDialog(null, "No se encontró la sede seleccionada.");
    };
             
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btnHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraActionPerformed
        // TODO add your handling code here:
        
            
             
             
        Date fecha = null;
    String fechaSeleccionada = JOptionPane.showInputDialog(null, "Ingrese la fecha (formato dd/MM/yyyy):");

    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

    try {
        fecha = formatoFecha.parse(fechaSeleccionada);

        String horaEntrada = JOptionPane.showInputDialog(this, "Ingrese la hora de ingreso (formato HH:mm):");
        String horaSalida = JOptionPane.showInputDialog(this, "Ingrese hora de salida (formato HH:mm):");

        if (horaEntrada != null && !horaEntrada.isEmpty()) {
     
            String[] partesHoraInicio = horaEntrada.split(":");
            String[] partesHoraFin = horaSalida.split(":");

        
            int horaInicio = Integer.parseInt(partesHoraInicio[0]);
            int minutoInicio = Integer.parseInt(partesHoraInicio[1]);
            int horaFin = Integer.parseInt(partesHoraFin[0]);
            int minutoFin = Integer.parseInt(partesHoraFin[1]);

            
            clase = new Clase(fecha, horaInicio, horaFin);

          
            clase.setSede((Sede) jComboBox2.getSelectedItem());
        }
    } catch (ParseException ex) {
        Logger.getLogger(GestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }
        
                
    
        
    }//GEN-LAST:event_btnHoraActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        // TODO add your handling code here:
        this.dispose(); //Ivan Original: Agrege esto que es para que, cuando abris una ventana, se cierre la anterior, si hace bugs o algo lo sacamos.

        Menu admWindow = new Menu(controlador);

        admWindow.setVisible(true);
        admWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalir2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnCarga;
    private javax.swing.JButton btnEliminar;
    private java.awt.Button btnHora;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tblDate;
    private java.awt.TextArea textArea1;
    private javax.swing.JTextField txtMembresia;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
