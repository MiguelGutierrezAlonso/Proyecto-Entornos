/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

/**
 * Interfaz gráfica para la creación de un nuevo cliente.
 * Esta clase permite ingresar los datos de un nuevo cliente, como su número de identidad,
 * nombre, apellido, número de teléfono y dirección.
 * Una vez que se ingresan los datos, se puede guardar el cliente.
 *
 * @author Miguel
 * @since 2024-06-07
 */
import controlador.Ctrl_Cliente;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class InterCliente extends javax.swing.JInternalFrame {

    /**
     * Constructor de la clase InterCliente.
     * Inicializa los componentes de la interfaz gráfica y establece el título y el tamaño.
     */
    public InterCliente() {
        initComponents();
        this.setTitle("New Client");
        this.setSize(new Dimension(600, 320));
        this.getContentPane().setBackground(Color.pink);

    }

    /**
     * Este método es llamado desde el constructor para inicializar los componentes de la interfaz gráfica.
     * ADVERTENCIA: No modifique este código. El contenido de este método es siempre regenerado por el Editor de Formularios.
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
        CNI = new javax.swing.JTextField();
        CNombre = new javax.swing.JTextField();
        CApellido = new javax.swing.JTextField();
        CTlf = new javax.swing.JTextField();
        CDireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("New Client");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Identity number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Surname");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tlf Nº");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 120, -1));
        getContentPane().add(CNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 270, -1));

        CNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNombreActionPerformed(evt);
            }
        });
        getContentPane().add(CNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 270, -1));
        getContentPane().add(CApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 270, -1));
        getContentPane().add(CTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 270, -1));
        getContentPane().add(CDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 270, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setText("Submit!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNombreActionPerformed
    
    /**
     * Maneja el evento de clic en el botón "Enviar".
     * Este método se ejecuta cuando el usuario hace clic en el botón "Enviar".
     * Recopila los datos ingresados por el usuario, valida que todos los campos estén completos
     * y luego crea un nuevo objeto Cliente con los datos ingresados. Se realiza una verificación
     * para asegurarse de que el cliente no exista previamente en la base de datos antes de guardarlo.
     * Si los datos son válidos y el cliente se guarda correctamente, se muestra un mensaje de éxito
     * y se limpian los campos de entrada.
     * Si se produce un error durante el proceso de guardado, se muestra un mensaje de error.
     * Si algún campo está vacío, se muestra un mensaje de advertencia solicitando que se completen
     * todos los campos necesarios.
     * Si el número de teléfono ingresado no es válido, se muestran mensajes de error correspondientes.
     *
     * @param evt El evento que desencadena esta acción, en este caso, el clic del botón "Enviar".
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cliente cliente = new Cliente();
        Ctrl_Cliente controlCliente = new Ctrl_Cliente();

        if (CNI.getText().trim().isEmpty()
                || CNombre.getText().trim().isEmpty()
                || CApellido.getText().trim().isEmpty()
                || CTlf.getText().trim().isEmpty()
                || CDireccion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill all the fields");
        } else {
            if (!controlCliente.existeCliente(CNI.getText().trim())) {
                try {
                    int telefono = Integer.parseInt(CTlf.getText().trim());
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
                try {
                    cliente.setNIdentidad(CNI.getText().trim());
                    cliente.setNombre(CNombre.getText().trim());
                    cliente.setApellido(CApellido.getText().trim());
                    cliente.setTelefono(CTlf.getText().trim());
                    cliente.setDireccion(CDireccion.getText().trim());

                    if (controlCliente.guardar(cliente)) {
                        JOptionPane.showMessageDialog(null, "Client saved!");
                        this.Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error saving the client");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    System.out.println("Error en: " + e);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CApellido;
    private javax.swing.JTextField CDireccion;
    private javax.swing.JTextField CNI;
    private javax.swing.JTextField CNombre;
    private javax.swing.JTextField CTlf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
    /**
     * Metodo para limpiar todos los campos de texto
     */
    private void Limpiar() {
        CNI.setText("");
        CNombre.setText("");
        CApellido.setText("");
        CTlf.setText("");
        CDireccion.setText("");
    }

}
