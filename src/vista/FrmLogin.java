/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Ctrl_Usuario;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.Usuario;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * Ventana de inicio de sesión para el sistema de ventas "Gutierrez Meats".
 * Permite a los usuarios iniciar sesión con su nombre de usuario y contraseña.
 * También proporciona un enlace para abrir el manual de usuario.
 *
 * @author Miguel
 * @since 2024-06-07
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Crea una nueva instancia de la ventana de inicio de sesión. Configura la
     * apariencia y la ubicación de la ventana.
     */
    public FrmLogin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Login - Sistema de ventas");
        this.setSize(new Dimension(705, 533));
    }

    /**
     * Obtiene el icono de la aplicación.
     *
     * @return El icono de la aplicación.
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ImagenCarniceria.png"));
        return retValue;
    }

    /**
     * Método generado automáticamente que inicializa los componentes de la
     * interfaz. Advertencia: ¡NO modifique este código! El contenido de este
     * método se regenera automáticamente cada vez que se modifica el diseño del
     * formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        User_Login = new javax.swing.JTextField();
        Password_Login = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton_Login = new javax.swing.JButton();
        Manual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel1.setText("Gutierrez Meats");

        jLabel3.setText("Author: Miguel Gutierrez");

        jLabel2.setText("Author: Miguel Gutirrez");

        jLabel4.setText("Author: Miguel Gutierrez");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImagenCarniceria.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addGap(135, 135, 135)
                .addComponent(jLabel4)
                .addGap(249, 249, 249)
                .addComponent(jLabel2)
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        User_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_LoginActionPerformed(evt);
            }
        });
        User_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                User_LoginKeyPressed(evt);
            }
        });

        Password_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_LoginActionPerformed(evt);
            }
        });
        Password_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Password_LoginKeyPressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuario-masculino-en-círculo-50.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-candado-2-50.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoInicio-removebg-preview.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jButton_Login.setText("Login!");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        Manual.setText("User's manual");
        Manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Password_Login)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_Login)
                        .addGap(82, 82, 82))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_Login)
                        .addGap(135, 135, 135))
                    .addComponent(Manual, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(52, 52, 52)
                .addComponent(jButton_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Manual, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción realizada cuando se presiona el botón "Login". Intenta iniciar
     * sesión con el nombre de usuario y la contraseña proporcionados. Si el
     * inicio de sesión es exitoso, redirige al usuario al menú correspondiente
     * según su rol. Si falla el inicio de sesión, muestra un mensaje de error.
     *
     * @param evt El evento que desencadena esta acción.
     */
    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        this.Login();
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void Password_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_LoginActionPerformed

    private void User_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_User_LoginKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            Password_Login.requestFocus();
        }
    }//GEN-LAST:event_User_LoginKeyPressed

    private void Password_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Password_LoginKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            this.Login();
        }
    }//GEN-LAST:event_Password_LoginKeyPressed

    private void User_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_LoginActionPerformed

    private void ManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualActionPerformed
        try {
            // Obtener la ruta absoluta del archivo PDF
            String filePath = "Manual.pdf";

            // Crear un objeto File con la ruta del archivo PDF
            File file = new File(filePath);

            // Comprobar si el archivo existe y es un archivo
            if (file.exists() && file.isFile()) {
                // Abrir el archivo PDF con el programa predeterminado del sistema
                Desktop.getDesktop().open(file);
            } else {
                // Mostrar un mensaje de error si el archivo no existe o no es válido
                JOptionPane.showMessageDialog(null, "The manual file does not exist.");
            }
        } catch (IOException e) {
            // Manejar cualquier excepción que ocurra durante la apertura del archivo
            JOptionPane.showMessageDialog(null, "An error occurred while opening the manual: " + e.getMessage());
        }
    }//GEN-LAST:event_ManualActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Manual;
    private javax.swing.JPasswordField Password_Login;
    private javax.swing.JTextField User_Login;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    /**
     * Intenta iniciar sesión con el nombre de usuario y la contraseña
     * proporcionados. Si ambos campos de texto de usuario y contraseña no están
     * vacíos, se intenta iniciar sesión. Si el inicio de sesión es exitoso, se
     * determina el rol del usuario y se redirige al menú correspondiente. Si el
     * inicio de sesión falla, se muestra un mensaje de error.
     */
    private void Login() {
        if (!User_Login.getText().isEmpty() && !Password_Login.getText().isEmpty()) {

            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            Usuario usuario = new Usuario();
            usuario.setUsuario(User_Login.getText().trim());
            usuario.setPassword(Password_Login.getText().trim());

            if (controlUsuario.loginUser(usuario)) {
                // Si el inicio de sesión es exitoso, obtener el rol del usuario
                String rol = controlUsuario.obtenerRolUsuario(usuario);

                // Redireccionar al menú correspondiente según el rol del usuario
                switch (rol.toLowerCase()) {
                    case "admin":
                        FrmMenu menu = new FrmMenu();
                        menu.setVisible(true);
                        break;
                    case "user":
                        FrmMenuPlebs menuPleb = new FrmMenuPlebs();
                        menuPleb.setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Unknown user role!");
                }
                // Cerrar la ventana actual de inicio de sesión
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "User or password are incorrect");
            }

        } else {
            JOptionPane.showMessageDialog(null, "One of the fields is empty!");
        }
    }
}
