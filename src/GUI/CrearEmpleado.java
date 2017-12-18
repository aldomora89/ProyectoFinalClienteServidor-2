/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.google.gson.Gson;
import coolrest.CoolRestRequest;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinalclienteservidor.EmpleadoPOJO;
import proyectofinalclienteservidor.URLDefinition;

/**
 *
 * @author Santiago
 */
public class CrearEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form CrearEmpleado
     */
    public CrearEmpleado() {
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

        lblSalario = new javax.swing.JLabel();
        lblNombreGrande = new javax.swing.JLabel();
        lblIdentificacion = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblColones = new javax.swing.JLabel();
        txtFID = new javax.swing.JTextField();
        txtFNombre = new javax.swing.JTextField();
        txtFEdad = new javax.swing.JTextField();
        txtFSalario = new javax.swing.JTextField();
        btnCrearEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblSalario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblSalario.setText("Salario Mensual:");

        lblNombreGrande.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        lblNombreGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreGrande.setText("Crear Cliente");

        lblIdentificacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblIdentificacion.setText("Identificacion:");

        lblName.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblName.setText("Nombre Completo");

        lblEdad.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblEdad.setText("Edad:");

        lblColones.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblColones.setText("₡");

        btnCrearEmpleado.setText("Crear usuario");
        btnCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblColones)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCrearEmpleado))))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreGrande)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblIdentificacion)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(txtFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalario)
                            .addComponent(txtFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColones))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnCrearEmpleado)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoActionPerformed
        try {
            String id = this.txtFID.getText();
            int edad = Integer.parseInt(this.txtFEdad.getText());
            String name = this.txtFNombre.getText();
            double salario = Double.parseDouble(this.txtFSalario.getText());
            EmpleadoPOJO empleado = new EmpleadoPOJO(name, edad, id, salario);
            
            CoolRestRequest rest = new CoolRestRequest();
            String resultado = rest.getResource(URLDefinition.Info.getUrl() + "?dato=" + "ExisteUsuario" + "&id=" + id);
            System.out.println(resultado);
            
            if(resultado.equals("Agregar")){
                rest = new CoolRestRequest();
                rest.postResource(URLDefinition.Empleado.getUrl(), new Gson().toJson(empleado));
                JOptionPane.showMessageDialog(this, "El usuario ha sido agregado.");
                this.dispose();
            } else{
                JOptionPane.showMessageDialog(this, resultado);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(CrearEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(CrearEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(CrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearEmpleado;
    private javax.swing.JLabel lblColones;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNombreGrande;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField txtFEdad;
    private javax.swing.JTextField txtFID;
    private javax.swing.JTextField txtFNombre;
    private javax.swing.JTextField txtFSalario;
    // End of variables declaration//GEN-END:variables
}
