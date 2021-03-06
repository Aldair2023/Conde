/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import clases.Helper;
import clases.Trabajador;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author gcoronad2
 */
public class AgregarTrabajador extends javax.swing.JDialog {
    /**
     * Creates new form Agregar
     */
    String rutaT, rutaC;
    ObjectOutputStream salida;
    LinkedList<Trabajador> trabajadores;
    int aux = 0;
    public AgregarTrabajador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rutaT = "src/datos/trabajadores.txt";
        rutaC = "src/datos/clientes.txt";
        try {
            trabajadores = Helper.traerDatos(rutaT);
            salida = new ObjectOutputStream(new FileOutputStream(rutaT));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Helper.volcado(salida, trabajadores);
        Helper.llenarTablaTrabajadores(tblTrabajadores, rutaT);
        
        JButton botonesH[]={cmdBuscar};
        JButton botonesD[]={cmdGuardar, cmdEliminar, cmdCancelar};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumTel = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        rbtM = new javax.swing.JRadioButton();
        rbtF = new javax.swing.JRadioButton();
        rbtI = new javax.swing.JRadioButton();
        cmdBuscar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrabajadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR TRABAJADOR");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Cédula:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 37, -1, -1));

        txtCc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCcKeyTyped(evt);
            }
        });
        jPanel2.add(txtCc, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 30, 140, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 81, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 75, 140, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 125, -1, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 120, 140, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Sexo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 125, -1, -1));
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 140, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Teléfono:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 81, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Dirección:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 37, -1, -1));

        txtNumTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumTelKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 75, 140, 27));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btgSexo.add(rbtM);
        rbtM.setText("M");
        jPanel5.add(rbtM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        btgSexo.add(rbtF);
        rbtF.setText("F");
        jPanel5.add(rbtF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, -1, -1));

        btgSexo.add(rbtI);
        rbtI.setText("I");
        jPanel5.add(rbtI, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 140, 30));

        cmdBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 185, 90, 35));

        cmdGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 185, 90, 35));

        cmdEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 185, 90, 35));

        cmdCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 185, 90, 35));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 660, 250));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Trabajadores"));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cédula", "Nombre", "Apellido", "Dirección", "Teléfono", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTrabajadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTrabajadores);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 240));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 660, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(711, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        // TODO add your handling code here:
        String nombre_encargado, nombre_encargado_cliente;
        int i, op;
        trabajadores = Helper.traerDatos(rutaT);
        i = tblTrabajadores.getSelectedRow();
        nombre_encargado = trabajadores.get(i).getNombre();
        nombre_encargado_cliente = Helper.traerClienteEncargado(nombre_encargado, rutaC);
        if (nombre_encargado.equals(nombre_encargado_cliente)) {
            Helper.mensaje(this, "No puedes eliminar un trabajador que tiene clientes.", 3);
        }
        else {
            op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar a este trabajador?", "ELIMINAR", JOptionPane.YES_NO_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                trabajadores.remove(i);
                try {
                    salida = new ObjectOutputStream(new FileOutputStream(rutaT));
                } catch (FileNotFoundException ex) {
                    System.out.println(ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                Helper.mensaje(this, "Trabajador eliminado exitosamente.", 1);
                Helper.volcado(salida, trabajadores);
                Helper.llenarTablaTrabajadores(tblTrabajadores, rutaT);
                txtCc.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtAddress.setText("");
                txtNumTel.setText("");
                btgSexo.clearSelection();
                txtCc.requestFocusInWindow();
                JButton botonesH[]={cmdBuscar,cmdCancelar};
                JButton botonesD[]={cmdEliminar,cmdGuardar};
                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
            }
        }
        
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        // TODO add your handling code here:
        if (txtNombre.getText().isEmpty()){
            Helper.mensaje(this, "Ingrese un nombre.",2);
            txtNombre.requestFocusInWindow();
        }
        else if (txtApellido.getText().isEmpty()) {
            Helper.mensaje(this, "Ingrese un apellido.",2);
            txtApellido.requestFocusInWindow();
        }
        else if (txtAddress.getText().isEmpty()) {
            Helper.mensaje(this, "Ingrese una dirección.",2);
            txtAddress.requestFocusInWindow();
        }
        else if (txtNumTel.getText().isEmpty()) {
            Helper.mensaje(this, "Ingrese un teléfono.",2);
            txtNumTel.requestFocusInWindow();
        }
        else if ( !(rbtM.isSelected() || rbtF.isSelected() || rbtI.isSelected()) ) {
            Helper.mensaje(this, "Seleccione un sexo, por favor.",2);
        }
        else {
            String cc, nombre, apellido, address, num_tel, sexo="";
            cc = txtCc.getText();
            nombre = txtNombre.getText();
            apellido = txtApellido.getText();
            address = txtAddress.getText();
            num_tel = txtNumTel.getText();
            if (rbtM.isSelected()) {
                sexo = "Masculino";
            }
            if(rbtF.isSelected()) {
                sexo = "Femenino";
            }
            if(rbtI.isSelected()) {
                sexo = "Indefinido";
            }
            LinkedList<Trabajador> trabajadoresModificado;
            try {
                if (aux == 0) {
                    Trabajador t = new Trabajador(cc, nombre, apellido, address, num_tel, sexo);
                    t.guardar(salida);
                    Helper.mensaje(this, "Trabajador guardado exitosamente.", 1);
                }
                else {
                    trabajadoresModificado = Helper.modificarTrabajador(rutaT, cc, nombre, apellido, address, num_tel, sexo);
                    salida = new ObjectOutputStream(new FileOutputStream(rutaT));
                    Helper.volcado(salida, trabajadoresModificado);
                    aux = 0;
                    Helper.mensaje(this, "Trabajador actualizado correctamente.", 1);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            Helper.llenarTablaTrabajadores(tblTrabajadores, rutaT);
            txtCc.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtAddress.setText("");
            txtNumTel.setText("");
            btgSexo.clearSelection();
            txtCc.requestFocusInWindow();
            JButton botonesH[]={cmdBuscar,cmdCancelar};
            JButton botonesD[]={cmdEliminar,cmdGuardar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        // TODO add your handling code here:
        txtCc.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtAddress.setText("");
        txtNumTel.setText("");
        btgSexo.clearSelection();
        txtCc.requestFocusInWindow();
        
        JButton botonesH[]={cmdBuscar};
        JButton botonesD[]={cmdGuardar, cmdEliminar, cmdCancelar};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void tblTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTrabajadoresMouseClicked
        // TODO add your handling code here:
        int i;
        Trabajador t;
        trabajadores = Helper.traerDatos(rutaT);
        i = tblTrabajadores.getSelectedRow();
        t = trabajadores.get(i);
        txtCc.setText(t.getCc());
        txtNombre.setText(t.getNombre());
        txtApellido.setText(t.getApellido());
        txtAddress.setText(t.getAddress());
        txtNumTel.setText(t.getNum_tel());
        switch (t.getSexo()) {
            case "Masculino":
                btgSexo.setSelected(rbtM.getModel(), true);
                break;
            case "Femenino":
                btgSexo.setSelected(rbtF.getModel(), true);
                break;
            case "Indefinido":
                btgSexo.setSelected(rbtI.getModel(), true);
                break;
        }
        aux = 1;
        JButton botonesH[]={cmdEliminar,cmdGuardar,cmdCancelar};
        JButton botonesD[]={cmdBuscar};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_tblTrabajadoresMouseClicked

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        // TODO add your handling code here:
        if (txtCc.getText().isEmpty()) {
            Helper.mensaje(this, "Ingrese una cédula.", 3);
            txtCc.requestFocusInWindow();
        }
        else if (Integer.parseInt(txtCc.getText()) < 1000) {
            Helper.mensaje(this, "Ingrese 4 dígitos como mínimo", 2);
            txtCc.selectAll();
            txtCc.requestFocusInWindow();
        }
        else {
            String cc;
            cc = txtCc.getText();
            Trabajador t;
            if (Helper.buscarTrabajadorCedula(cc, rutaT)) {
                Helper.mensaje(this, "Se encontró un trabajador con la cédula ingresada.", 1);
                t = Helper.traerTrabajadorCedula(cc, rutaT);
                txtNombre.setText(t.getNombre());
                txtApellido.setText(t.getApellido());
                txtAddress.setText(t.getAddress());
                txtNumTel.setText(t.getNum_tel());
                switch (t.getSexo()) {
                    case "Masculino":
                        rbtM.setSelected(true);
                        break;
                    case "Femenino":
                        rbtF.setSelected(true);
                        break;
                    case "Indefinido":
                        rbtI.setSelected(true);
                        break;
                } 
                aux = 1;
            }
            else {
                Helper.mensaje(this, "No hay trabajadores con la cédula ingresada. Puede continuar", 1);
                txtNombre.requestFocusInWindow();
                aux = 0;
            }
            JButton botonesH[]={cmdGuardar,cmdCancelar};
            JButton botonesD[]={cmdBuscar, cmdEliminar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void txtCcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCcKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        Helper.ingresarSoloNums(c, evt);
    }//GEN-LAST:event_txtCcKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        Helper.ingresarSoloLetras(c, evt); 
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        Helper.ingresarSoloLetras(c, evt);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNumTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumTelKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        Helper.ingresarSoloNums(c, evt);
    }//GEN-LAST:event_txtNumTelKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarTrabajador dialog = new AgregarTrabajador(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSexo;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtF;
    private javax.swing.JRadioButton rbtI;
    private javax.swing.JRadioButton rbtM;
    private javax.swing.JTable tblTrabajadores;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumTel;
    // End of variables declaration//GEN-END:variables
}
