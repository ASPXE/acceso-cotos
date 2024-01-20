/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.view;

import com.proyecto.controller.VigilantesDAOJDBC;
import com.proyecto.objects.VigilantesDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bañales
 */

// Backend hecho por aspxe
public class login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    private VigilantesDAOJDBC vigilante;
    public VigilantesDTO vigilanteT;
    
    public login() {
        initComponents();
        this.vigilante = new VigilantesDAOJDBC();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPasswd = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(930, 536));
        setMinimumSize(new java.awt.Dimension(930, 536));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo50%.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(320, 536));
        jLabel1.setMinimumSize(new java.awt.Dimension(320, 536));
        jLabel1.setPreferredSize(new java.awt.Dimension(320, 536));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 320, 536);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(610, 536));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 536));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(186, 182, 72, 19);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(186, 257, 88, 19);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        txtUsuario.setMaximumSize(new java.awt.Dimension(200, 34));
        txtUsuario.setMinimumSize(new java.awt.Dimension(200, 34));
        txtUsuario.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(186, 205, 200, 34);

        txtPasswd.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        txtPasswd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        txtPasswd.setMaximumSize(new java.awt.Dimension(200, 34));
        txtPasswd.setMinimumSize(new java.awt.Dimension(200, 34));
        txtPasswd.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel1.add(txtPasswd);
        txtPasswd.setBounds(186, 283, 200, 34);

        btnIngresar.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iniciar (1).png"))); // NOI18N
        btnIngresar.setText("  Iniciar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(220, 350, 120, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/usuario.jpeg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 70, 90, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(320, 0, 610, 536);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        
        boolean esValido = false;
        
        try{
            esValido = this.vigilante.validarUsuario(txtUsuario.getText(), txtPasswd.getText());
            this.vigilanteT = this.vigilante.recuperarId(txtUsuario.getText(), txtPasswd.getText());
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de validar Vigilantes: "+e);
        }
        
        if(esValido){
            System.out.println("Bienvenido/a");
            JOptionPane.showMessageDialog(this, "Bienvenido/a", "Credenciales correctas", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            this.setEnabled(false);
            MenuInicio menu = new MenuInicio(this.vigilanteT);
            menu.setVisible(true);
            menu.setEnabled(true);
            
        }else{
            System.out.println("Usuario o contraseña incorrectos.");
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Credenciales inválidas", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
    private void vaciarCampos(){
        txtUsuario.setText("");
        txtUsuario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPasswd;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
