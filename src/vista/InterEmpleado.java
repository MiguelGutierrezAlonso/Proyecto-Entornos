/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import java.awt.Dimension;
import controlador.Ctrl_Usuario;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 * Esta clase proporciona la interfaz gráfica para crear un nuevo empleado en el
 * sistema. El formulario permite ingresar los detalles del empleado, como
 * nombre, apellido, teléfono, etc. Una vez que se ingresan los datos, el
 * usuario puede enviar el formulario para guardar los detalles del empleado en
 * la base de datos.
 *
 * @author Miguel
 * @since 2024-06-07
 */
public class InterEmpleado extends javax.swing.JInternalFrame {

    /**
     * Crea un nuevo formulario InterEmpleado.
     */
    public InterEmpleado() {
        initComponents();
        this.setSize(new Dimension(600, 420));
        this.setTitle("New User");
        this.getContentPane().setBackground(Color.pink);

    }

    /**
     * Este método es llamado desde dentro del constructor para inicializar el
     * formulario. ADVERTENCIA: No modifique este código. El contenido de este
     * método es siempre regenerado por el Editor de Formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ENombre = new javax.swing.JTextField();
        EApellido = new javax.swing.JTextField();
        ETlf = new javax.swing.JTextField();
        EUsuario = new javax.swing.JTextField();
        EPassword = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        EID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ESueldo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EDireccion = new javax.swing.JTextField();
        EAdmin = new javax.swing.JCheckBox();

        setClosable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("Create Employee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Surname");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tlf nº");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 80, -1));

        ENombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENombreActionPerformed(evt);
            }
        });
        getContentPane().add(ENombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 260, -1));
        getContentPane().add(EApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 260, -1));
        getContentPane().add(ETlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, -1));
        getContentPane().add(EUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 260, -1));
        getContentPane().add(EPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 260, -1));

        Submit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Submit.setText("Submit!");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ID nº");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, -1));

        EID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIDActionPerformed(evt);
            }
        });
        getContentPane().add(EID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 260, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Salary");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 80, -1));

        ESueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESueldoActionPerformed(evt);
            }
        });
        getContentPane().add(ESueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 260, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Address");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 80, -1));

        EDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(EDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 260, -1));

        EAdmin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        EAdmin.setText("Admin");
        EAdmin.setToolTipText("");
        EAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAdminActionPerformed(evt);
            }
        });
        getContentPane().add(EAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ENombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENombreActionPerformed

    /**
     * Maneja el evento de clic en el botón "Submit". Este método se activa
     * cuando el usuario hace clic en el botón "Submit" para enviar los datos
     * del empleado. Verifica si todos los campos están llenos y válidos. Si lo
     * están, crea un nuevo objeto de tipo Usuario con los datos ingresados, y
     * utiliza un objeto de tipo Ctrl_Usuario para guardar los detalles del
     * usuario en la base de datos. Si el usuario ya existe en la base de datos,
     * muestra un mensaje de error. Si los campos están incompletos o contienen
     * datos no válidos, muestra un mensaje de advertencia correspondiente. Si
     * se guarda correctamente, muestra un mensaje de confirmación y limpia los
     * campos del formulario.
     *
     * @param evt El evento de acción que desencadena este método (clic en el
     * botón "Submit").
     */
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

        Usuario usuario = new Usuario();
        Ctrl_Usuario controlUsuario = new Ctrl_Usuario();

        // Verificar si todos los campos están llenos
        if (EID.getText().trim().isEmpty()
                || ENombre.getText().trim().isEmpty()
                || EApellido.getText().trim().isEmpty()
                || ETlf.getText().trim().isEmpty()
                || EUsuario.getText().trim().isEmpty()
                || EPassword.getText().trim().isEmpty()
                || ESueldo.getText().trim().isEmpty()
                || EDireccion.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Fill all the fields");
            return;
        }

        if (EUsuario.getText().trim().length() < 9 || EPassword.getText().trim().length() < 9) {
            JOptionPane.showMessageDialog(null, "Username and password must be at least 9 characters long");
            return;
        }

        double sueldo;
        try {
            String PrecioCom = ESueldo.getText().trim();
            if (PrecioCom.contains(",")) {
                PrecioCom = PrecioCom.replace(",", ".");
            }
            sueldo = Double.parseDouble(PrecioCom);
            if (sueldo <= 0) {
                JOptionPane.showMessageDialog(null, "Salary must be greater than 0");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please, fill the salary field with a number");
            return;
        }

        try {
            int telefono = Integer.parseInt(ETlf.getText().trim());
            if (telefono <= 0) {
                JOptionPane.showMessageDialog(null, "Phone number must be greater than 0");
                return;
            }
            if (telefono < 99999999) {
                JOptionPane.showMessageDialog(null, "The phone number must have at least 9 digits");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please, fill the phone number field with a valid number");
            return;
        }

        if (!controlUsuario.existeCliente(EID.getText().trim())) {
            try {
                usuario.setNidentidad(EID.getText().trim());
                usuario.setNombre(ENombre.getText().trim());
                usuario.setApellido(EApellido.getText().trim());
                usuario.setTelefono(ETlf.getText().trim());
                usuario.setUsuario(EUsuario.getText().trim());
                usuario.setPassword(EPassword.getText().trim());
                usuario.setSueldo(sueldo);
                usuario.setDireccion(EDireccion.getText().trim());

                // Establecer si es administrador o no
                usuario.setAdmin(EAdmin.isSelected());

                if (controlUsuario.guardar(usuario)) {
                    JOptionPane.showMessageDialog(null, "User saved!");
                    this.Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error saving the user");
                }
            } catch (HeadlessException e) {
                System.out.println("Error en: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "User already exists!");
        }


    }//GEN-LAST:event_SubmitActionPerformed

    private void EIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EIDActionPerformed

    private void ESueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ESueldoActionPerformed

    private void EDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EDireccionActionPerformed

    private void EAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox EAdmin;
    private javax.swing.JTextField EApellido;
    private javax.swing.JTextField EDireccion;
    private javax.swing.JTextField EID;
    private javax.swing.JTextField ENombre;
    private javax.swing.JTextField EPassword;
    private javax.swing.JTextField ESueldo;
    private javax.swing.JTextField ETlf;
    private javax.swing.JTextField EUsuario;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para limpiar todos los campos del formulario.
     */
    private void Limpiar() {
        EID.setText("");
        ENombre.setText("");
        EApellido.setText("");
        ETlf.setText("");
        EUsuario.setText("");
        EPassword.setText("");
        ESueldo.setText("");
        EDireccion.setText("");
    }

}
