/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.view;

import com.cotos.view.Visitantes;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Bañales
 */
public class MenuInicio extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicio
     */
    public MenuInicio() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jpanelMenu = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 620));
        setMinimumSize(new java.awt.Dimension(1100, 620));
        setPreferredSize(new java.awt.Dimension(1100, 620));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(140, 193, 219));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 620));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 620));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/perro-policia (1).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 30, 110, 110);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EYE SECURITY");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 140, 140, 22);

        jButton1.setBackground(new java.awt.Color(77, 98, 115));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registro Entradas");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        jButton1.setMaximumSize(new java.awt.Dimension(130, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(130, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(130, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 200, 200, 90);

        jButton2.setBackground(new java.awt.Color(77, 98, 115));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/carpeta-de-busqueda (1).png"))); // NOI18N
        jButton2.setText(" Busqueda");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        jButton2.setMaximumSize(new java.awt.Dimension(130, 30));
        jButton2.setMinimumSize(new java.awt.Dimension(130, 30));
        jButton2.setPreferredSize(new java.awt.Dimension(130, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 290, 200, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 200, 620);

        jpanelMenu.setBackground(new java.awt.Color(228, 239, 255));
        jpanelMenu.setMaximumSize(new java.awt.Dimension(900, 620));
        jpanelMenu.setMinimumSize(new java.awt.Dimension(900, 620));
        jpanelMenu.setPreferredSize(new java.awt.Dimension(900, 620));
        jpanelMenu.setLayout(null);
        getContentPane().add(jpanelMenu);
        jpanelMenu.setBounds(200, 0, 900, 620);
        jpanelMenu.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Visitantes visita = new Visitantes();
        ShowPanel(visita);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Busqueda buscar= new Busqueda();
        ShowPanel(buscar);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanelMenu;
    // End of variables declaration//GEN-END:variables

        private void ShowPanel (JPanel panel){
        panel.setSize(900, 620);
        panel.setLocation(0, 0);
        jpanelMenu.removeAll();
        jpanelMenu.add(panel, BorderLayout.CENTER);
        jpanelMenu.revalidate();
        jpanelMenu.repaint();
    }


}