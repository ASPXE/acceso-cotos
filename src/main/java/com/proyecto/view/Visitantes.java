/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.proyecto.view;

import com.proyecto.controller.VisitasDAOJDBC;
import com.proyecto.objects.VisitasDTO;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author pabloochoagutierrez
 */

// Backend hecho por aspxe
public class Visitantes extends javax.swing.JPanel {

    /**
     * Creates new form Visitantes
     */
    
    private int idVigilantes;
    
    public Visitantes() {
        initComponents();
        
        //Opciones Servicios
        txtDependencia.setEnabled(false);
        txtNumEmp.setEnabled(false);
        pnlDis.setEnabled(false);
        lblServ.setEnabled(false);
        lblDep.setEnabled(false);
        lblNumEm.setEnabled(false);
        
        //Opciones Visitantes
        txtNombre.setEnabled(false);
        lblNombre.setEnabled(false);
        txtNumcasa.setEnabled(false);
        lblNum.setEnabled(false);
        txtMatricula.setEnabled(false);
        lblMatricula.setEnabled(false);
        
        //Tabla Visitantes
        tblVisitantes.setEnabled(false);
        //Tabla Proveedor
        tblServicios.setVisible(false);
        
        buttonGroup1.add(radioEntrada);
        buttonGroup1.add(radioSalida);
        
        radioEntrada.setEnabled(false);
        radioSalida.setEnabled(false);
        
    }
    
    public Visitantes(int idVigilantes){
        
        initComponents();
        
        //Opciones Servicios
        txtDependencia.setEnabled(false);
        txtNumEmp.setEnabled(false);
        pnlDis.setEnabled(false);
        lblServ.setEnabled(false);
        lblDep.setEnabled(false);
        lblNumEm.setEnabled(false);
        
        //Opciones Visitantes
        txtNombre.setEnabled(false);
        lblNombre.setEnabled(false);
        txtNumcasa.setEnabled(false);
        lblNum.setEnabled(false);
        txtMatricula.setEnabled(false);
        lblMatricula.setEnabled(false);
        
        //Tabla Visitantes
        tblVisitantes.setEnabled(false);
        //Tabla Proveedor
        tblServicios.setVisible(false);
        
        buttonGroup1.add(radioEntrada);
        buttonGroup1.add(radioSalida);
        
        radioEntrada.setEnabled(false);
        radioSalida.setEnabled(false);
        this.idVigilantes = idVigilantes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnEntradas = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNum = new javax.swing.JLabel();
        txtNumcasa = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        rbtnVisitantes = new javax.swing.JRadioButton();
        rbtnServicios = new javax.swing.JRadioButton();
        pnlDis = new javax.swing.JPanel();
        lblServ = new javax.swing.JLabel();
        lblDep = new javax.swing.JLabel();
        lblNumEm = new javax.swing.JLabel();
        txtNumEmp = new javax.swing.JTextField();
        txtDependencia = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVisitantes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        radioEntrada = new javax.swing.JRadioButton();
        radioSalida = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(228, 239, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(140, 193, 219));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO DE ENTRADAS");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(280, 30, 390, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 100);

        jPanel3.setBackground(new java.awt.Color(140, 193, 219));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(null);
        jPanel3.add(jPanel4);
        jPanel4.setBounds(30, 220, 780, 10);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 210, 460, 10);

        lblNombre.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre);
        lblNombre.setBounds(60, 190, 100, 19);

        txtNombre.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jPanel1.add(txtNombre);
        txtNombre.setBounds(30, 230, 130, 30);

        lblNum.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblNum.setText("#Num Casa");
        jPanel1.add(lblNum);
        lblNum.setBounds(200, 190, 130, 19);

        txtNumcasa.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtNumcasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        txtNumcasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumcasaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumcasa);
        txtNumcasa.setBounds(210, 230, 81, 30);

        lblMatricula.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblMatricula.setText("Matricula");
        jPanel1.add(lblMatricula);
        lblMatricula.setBounds(370, 190, 100, 19);

        txtMatricula.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtMatricula.setText("JAD-092-BD2");
        txtMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jPanel1.add(txtMatricula);
        txtMatricula.setBounds(360, 230, 100, 30);

        rbtnEntradas.add(rbtnVisitantes);
        rbtnVisitantes.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        rbtnVisitantes.setText("Visitantes");
        rbtnVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnVisitantesActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnVisitantes);
        rbtnVisitantes.setBounds(60, 130, 140, 23);

        rbtnEntradas.add(rbtnServicios);
        rbtnServicios.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        rbtnServicios.setText("Servicios");
        rbtnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnServiciosActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnServicios);
        rbtnServicios.setBounds(190, 130, 140, 23);

        pnlDis.setBackground(new java.awt.Color(140, 193, 219));

        javax.swing.GroupLayout pnlDisLayout = new javax.swing.GroupLayout(pnlDis);
        pnlDis.setLayout(pnlDisLayout);
        pnlDisLayout.setHorizontalGroup(
            pnlDisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        pnlDisLayout.setVerticalGroup(
            pnlDisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(pnlDis);
        pnlDis.setBounds(30, 350, 780, 10);

        lblServ.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblServ.setText("Servico Privado / Publico");
        jPanel1.add(lblServ);
        lblServ.setBounds(30, 290, 320, 22);

        lblDep.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblDep.setText("Dependencia");
        jPanel1.add(lblDep);
        lblDep.setBounds(100, 330, 150, 19);

        lblNumEm.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblNumEm.setText("#Num Empleado");
        jPanel1.add(lblNumEm);
        lblNumEm.setBounds(300, 330, 150, 19);

        txtNumEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jPanel1.add(txtNumEmp);
        txtNumEmp.setBounds(320, 370, 100, 30);

        txtDependencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        txtDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDependenciaActionPerformed(evt);
            }
        });
        jPanel1.add(txtDependencia);
        txtDependencia.setBounds(90, 370, 120, 30);

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 3));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(630, 460, 110, 40);

        tblVisitantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Num Int", "Calle", "NombrePersona", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(tblVisitantes);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 430, 500, 160);

        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "#Num Empleado", "Dependencia"
            }
        ));
        jScrollPane3.setViewportView(tblServicios);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(50, 430, 500, 160);

        radioEntrada.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        radioEntrada.setText("Entrada");
        radioEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(radioEntrada);
        radioEntrada.setBounds(550, 200, 90, 26);

        radioSalida.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        radioSalida.setText("Salida");
        radioSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(radioSalida);
        radioSalida.setBounds(710, 200, 76, 26);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumcasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumcasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumcasaActionPerformed

    private void rbtnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnServiciosActionPerformed
        //Opciones Servicio Mostrar
        txtDependencia.setEnabled(true);
        txtNumEmp.setEnabled(true);
        pnlDis.setEnabled(true);
        lblServ.setEnabled(true);
        lblDep.setEnabled(true);
        lblNumEm.setEnabled(true);
        //Opciones Visitantes Ocultar
        txtNombre.setEnabled(true);
        lblNombre.setEnabled(true);
        txtNumcasa.setEnabled(true);
        lblNum.setEnabled(false);
        txtMatricula.setEnabled(false);
        lblMatricula.setEnabled(false);
        //Tabla servicos
        tblServicios.setVisible(true);
        //Tabla Visitantes
        tblVisitantes.setVisible(false);
        radioEntrada.setEnabled(true);
        radioSalida.setEnabled(true);
    }//GEN-LAST:event_rbtnServiciosActionPerformed

    private void txtDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDependenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDependenciaActionPerformed

    private void rbtnVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnVisitantesActionPerformed
         //Opciones Servicios Ocultar
        txtDependencia.setEnabled(false);
        txtNumEmp.setEnabled(false);
        pnlDis.setEnabled(false);
        lblServ.setEnabled(false);
        lblDep.setEnabled(false);
        lblNumEm.setEnabled(false);
        //Opciones Visitantes Ocultar
        txtNombre.setEnabled(true);
        lblNombre.setEnabled(true);
        txtNumcasa.setEnabled(true);
        lblNum.setEnabled(true);
        txtMatricula.setEnabled(true);
        lblMatricula.setEnabled(true);
        //Tabla Servicios
        tblServicios.setVisible(false);
        //Tabla Visitantes
        tblVisitantes.setVisible(true);
        radioEntrada.setEnabled(true);
        radioSalida.setEnabled(true);
    }//GEN-LAST:event_rbtnVisitantesActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        long currentTimeMillis = System.currentTimeMillis();
        Timestamp fecha = new Timestamp(currentTimeMillis);
        VisitasDTO visitante = new VisitasDTO();
        VisitasDAOJDBC visitanteInsertar = new VisitasDAOJDBC();
        int registros = 0;
        
        if(radioEntrada.isSelected()){
            visitante.setFechaEntrada(fecha);
        }else if(radioSalida.isSelected()){
            visitante.setFechaSalida(fecha);
        }
        
        if(rbtnServicios.isSelected()){
            validarEntradaSalida();
            visitante.setNombres(txtNombre.getText());
            visitante.setDependencia(txtDependencia.getText());
            visitante.setCedula(txtNumEmp.getText());
            visitante.setNumeroCasa(Integer.parseInt(txtNumcasa.getText()));
            visitante.setVigilante(this.idVigilantes);
        }else if(rbtnVisitantes.isSelected()){
            validarEntradaSalida();
            visitante.setNombres(txtNombre.getText());
            visitante.setNumeroCasa(Integer.parseInt(txtNumcasa.getText()));
            visitante.setMatriculaVehiculo(txtMatricula.getText());
            visitante.setVigilante(this.idVigilantes);
            
        }
        
        try{
            registros = visitanteInsertar.insertAll(visitante);
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de insertar en Visitas: "+e);
        }
        
        if(registros != 0){
            JOptionPane.showMessageDialog(this, "¡Visita registrada exitosamente!", "Registro insertado", JOptionPane.INFORMATION_MESSAGE);
        }
        
        limpiarCampos();
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void radioEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEntradaActionPerformed
        // TODO add your handling code here:
        
        if(radioEntrada.isSelected()){
            radioSalida.setSelected(false);
        }
        
    }//GEN-LAST:event_radioEntradaActionPerformed

    private void radioSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSalidaActionPerformed
        // TODO add your handling code here:
        
        if(radioSalida.isSelected()){
            radioEntrada.setSelected(false);
        }
    }//GEN-LAST:event_radioSalidaActionPerformed

    public void validarEntradaSalida(){
        if(radioEntrada.isSelected()){
            System.out.println("Entrada seleccionada");
        }else if(radioSalida.isSelected()){
            System.out.println("Salida seleccionada");
        }else{
            System.out.println("No ha seleccionado si es entrada o salida");
            JOptionPane.showMessageDialog(this, "No seleccionó"
                    + " si es entrada o salida", "Información requerida", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limpiarCampos(){
        
        txtDependencia.setText("");
        txtMatricula.setText("");
        txtNombre.setText("");
        txtNumEmp.setText("");
        txtNumcasa.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDep;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblNumEm;
    private javax.swing.JLabel lblServ;
    private javax.swing.JPanel pnlDis;
    private javax.swing.JRadioButton radioEntrada;
    private javax.swing.JRadioButton radioSalida;
    private javax.swing.ButtonGroup rbtnEntradas;
    private javax.swing.JRadioButton rbtnServicios;
    private javax.swing.JRadioButton rbtnVisitantes;
    private javax.swing.JTable tblServicios;
    private javax.swing.JTable tblVisitantes;
    private javax.swing.JTextField txtDependencia;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumEmp;
    private javax.swing.JTextField txtNumcasa;
    // End of variables declaration//GEN-END:variables
}
