/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.google.gson.Gson;
import coolrest.CoolRestRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectofinalclienteservidor.ClientePOJO;
import proyectofinalclienteservidor.URLDefinition;

/**
 *
 * @author Santiago
 */
public class CrearCliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public CrearCliente() {
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

        lblIdentificacion = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblMeses = new javax.swing.JLabel();
        lblTarifa = new javax.swing.JLabel();
        lblFechaDePago = new javax.swing.JLabel();
        lblRutina = new javax.swing.JLabel();
        txtFIdentificacion = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtFEdad = new javax.swing.JTextField();
        txtFMesesEnElGym = new javax.swing.JTextField();
        btnRutina = new javax.swing.JButton();
        lblNombreGrande = new javax.swing.JLabel();
        txtFTarifaMensual = new javax.swing.JTextField();
        DateFechaDePago = new com.toedter.calendar.JDateChooser();
        lblColones = new javax.swing.JLabel();
        btnCrearUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdentificacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblIdentificacion.setText("Identificacion:");

        lblName.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblName.setText("Nombre Completo");

        lblEdad.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblEdad.setText("Edad:");

        lblMeses.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblMeses.setText("Meses en el Gimnasio");

        lblTarifa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblTarifa.setText("Tarifa mensual:");

        lblFechaDePago.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblFechaDePago.setText("Fecha de pago:");

        lblRutina.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblRutina.setText("Rutina de ejercicio:");

        btnRutina.setText("Editar Rutina");
        btnRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutinaActionPerformed(evt);
            }
        });

        lblNombreGrande.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        lblNombreGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreGrande.setText("Crear Cliente");

        lblColones.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblColones.setText("₡");

        btnCrearUser.setText("Crear usuario");
        btnCrearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFechaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMeses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFEdad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFMesesEnElGym, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DateFechaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRutina)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblColones)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFTarifaMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtFIdentificacion)
                            .addComponent(btnCrearUser)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblNombreGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreGrande)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdentificacion)
                    .addComponent(txtFIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEdad)
                    .addComponent(txtFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMeses)
                    .addComponent(txtFMesesEnElGym, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTarifa)
                    .addComponent(txtFTarifaMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaDePago)
                    .addComponent(DateFechaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutina)
                    .addComponent(btnRutina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearUser)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutinaActionPerformed
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");
        System.out.println(this.DateFechaDePago.getDate() == null);
        Date fecha = this.DateFechaDePago.getDate();
        String strFecha = formatoFecha.format(fecha);
        System.out.println(strFecha);
    }//GEN-LAST:event_btnRutinaActionPerformed

    private void btnCrearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUserActionPerformed
        try {
            // TODO add your handling code here:
            String id = this.txtFIdentificacion.getText();
            int edad = Integer.parseInt(this.txtFEdad.getText());
            String name = this.txtFName.getText();
            int meses = Integer.parseInt(this.txtFMesesEnElGym.getText());
            double tarifa = Double.parseDouble(this.txtFTarifaMensual.getText());
            Date date = this.DateFechaDePago.getDate();
            ClientePOJO cliente = new ClientePOJO(name, edad, id, meses, tarifa, date);
            
            CoolRestRequest rest = new CoolRestRequest();
            rest.postResource(URLDefinition.Cliente.getUrl(), new Gson().toJson(cliente));
        } catch (InterruptedException ex) {
            Logger.getLogger(CrearCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(CrearCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearUserActionPerformed

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
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateFechaDePago;
    private javax.swing.JButton btnCrearUser;
    private javax.swing.JButton btnRutina;
    private javax.swing.JLabel lblColones;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblFechaDePago;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblMeses;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNombreGrande;
    private javax.swing.JLabel lblRutina;
    private javax.swing.JLabel lblTarifa;
    private javax.swing.JTextField txtFEdad;
    private javax.swing.JTextField txtFIdentificacion;
    private javax.swing.JTextField txtFMesesEnElGym;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFTarifaMensual;
    // End of variables declaration//GEN-END:variables
}
