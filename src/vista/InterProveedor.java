/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.Ctrl_Proveedor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import modelo.Proveedor;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class InterProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterProveedor
     */
    public InterProveedor() {
        initComponents();
        this.setTitle("New Supplier");
        this.setSize(new Dimension(600, 320));
                this.getContentPane().setBackground(Color.pink);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SEmpresa = new javax.swing.JTextField();
        STlf = new javax.swing.JTextField();
        SDireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("New Supplier");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Company");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tlf nº");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 80, -1));

        SEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(SEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 230, -1));
        getContentPane().add(STlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 129, 230, -1));
        getContentPane().add(SDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 230, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setText("Submit!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Proveedor proveedor = new Proveedor();
    Ctrl_Proveedor controlProveedor = new Ctrl_Proveedor();

    // Verificar si todos los campos están llenos
    if (SEmpresa.getText().trim().isEmpty() ||
        STlf.getText().trim().isEmpty() ||
        SDireccion.getText().trim().isEmpty()) {

        JOptionPane.showMessageDialog(null, "Fill all the fields");
    } else {
        // Verificar si el proveedor ya existe
        if (!controlProveedor.existeProveedor(SEmpresa.getText().trim())) {
            try {
                proveedor.setEmpresa(SEmpresa.getText().trim());

                // Verificar si el teléfono es un número válido y positivo
                try {
                    String telefono = STlf.getText().trim();
                    if (telefono.length() < 9 || !telefono.matches("\\d+")) {
                        JOptionPane.showMessageDialog(null, "Phone number must be at least 9 digits and positive");
                        return;
                    }
                    proveedor.setTelefono(telefono);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Phone number must be a valid number");
                    return;
                }

                proveedor.setDireccion(SDireccion.getText().trim());

                // Intentar guardar el proveedor en la base de datos
                if (controlProveedor.guardar(proveedor)) {
                    JOptionPane.showMessageDialog(null, "Supplier saved!");
                    this.Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error saving the supplier");
                }
            } catch (HeadlessException e) {
                System.out.println("Error en: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "The supplier already exists");
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEmpresaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SDireccion;
    private javax.swing.JTextField SEmpresa;
    private javax.swing.JTextField STlf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void Limpiar(){
        SEmpresa.setText("");
        STlf.setText("");
        SDireccion.setText("");
    }
}