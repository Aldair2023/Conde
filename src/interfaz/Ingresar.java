/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import clases.Helper;
import clases.Usuario;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gcoronad2
 */
public class Ingresar extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar
     */
    String user_admin = "admin";
    String pass_admin = "admin123";
    String ruta;
    ObjectOutputStream salida;
    Usuario u;
    
    public Ingresar() {
        initComponents();
        ruta = "src/datos/usuario.txt";
        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        cmdOk = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdCambiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INGRESAR");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("USUARIO:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel3.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel3.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, 30));

        cmdOk.setText("Ok");
        cmdOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOkActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 30));

        cmdSalir.setText("Cancelar");
        jPanel3.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 240));

        cmdCambiar.setText("Cambiar usuario de administrador");
        cmdCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(325, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOkActionPerformed
        // TODO add your handling code here:
        String user, pass;
        user = txtUser.getText();
        pass = txtPass.getText();
        u.setUser(user_admin);
        u.setUser(pass_admin);
        try {
            u.guardar(salida);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (!user.equals(user_admin) && !pass.equals(pass_admin)) {
            Helper.mensaje(this, "Usuario y contraseña incorrectos", 3);
            txtUser.requestFocusInWindow();
            txtUser.selectAll();
            txtPass.selectAll();
        }
        else if (!user.equals(user_admin)) {
            Helper.mensaje(this, "Usuario Incorrecto", 3);
            txtUser.requestFocusInWindow();
            txtUser.selectAll();
        }
        else if (!pass.equals(pass_admin)) {
            Helper.mensaje(this, "Contraseña Incorrecta", 3);
            txtPass.requestFocusInWindow();
            txtPass.selectAll();
        }
        else {
            Helper.mensaje(this, "Sesión ingresada correctamente", 1);
            Principal p = new Principal();
            p.setVisible(true);
            this.dispose();
            
        }
    }//GEN-LAST:event_cmdOkActionPerformed

    private void cmdCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCambiarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCambiar;
    private javax.swing.JButton cmdOk;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
