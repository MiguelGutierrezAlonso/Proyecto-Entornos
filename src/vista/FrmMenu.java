/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import modelo.Listado;

/**
 * Esta clase representa la ventana principal del sistema, que proporciona
 * acceso a diferentes funcionalidades.
 *
 * @author Miguel
 * @since 2024-06-07
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Panel de escritorio para gestionar las ventanas internas.
     */
    public static JDesktopPane jDesktopPane_menu;

    /**
     * Crea una nueva instancia de FrmMenu.
     */
    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setLocationRelativeTo(null);
        this.setTitle("Carnicería");

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPaneConFondo();
        jDesktopPane_menu.setBackground(Color.pink);

        int width = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, width, (height - 110));
        this.add(jDesktopPane_menu);

    }

    /**
     * Inicializa los componentes de la interfaz de usuario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_usera = new javax.swing.JMenuItem();
        jMenuItem_userm = new javax.swing.JMenuItem();
        jMenuItem_userl = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_clienta = new javax.swing.JMenuItem();
        jMenuItem_clientm = new javax.swing.JMenuItem();
        jMenuItem_clientl = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_producta = new javax.swing.JMenuItem();
        jMenuItem_productm = new javax.swing.JMenuItem();
        jMenuItem_productl = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_ordera = new javax.swing.JMenuItem();
        jMenuItem_orderl = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_suppliera = new javax.swing.JMenuItem();
        jMenuItem_supplierm = new javax.swing.JMenuItem();
        jMenuItem_supplierl = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 153));
        jMenuBar1.setBorder(null);

        jMenu1.setBackground(new java.awt.Color(255, 153, 153));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-carnicero-50.png"))); // NOI18N
        jMenu1.setText("Employees");
        jMenu1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_usera.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_usera.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_usera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-más-50.png"))); // NOI18N
        jMenuItem_usera.setText("New User");
        jMenuItem_usera.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_usera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_useraActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_usera);

        jMenuItem_userm.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_userm.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_userm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-ajustes-50.png"))); // NOI18N
        jMenuItem_userm.setText("User Management");
        jMenuItem_userm.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_userm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_usermActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_userm);

        jMenuItem_userl.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_userl.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_userl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-orden-de-compra-50.png"))); // NOI18N
        jMenuItem_userl.setText("Employees List");
        jMenuItem_userl.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_userl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_userlActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_userl);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 153, 153));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-presupuesto-50.png"))); // NOI18N
        jMenu2.setText("Clients");
        jMenu2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_clienta.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_clienta.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_clienta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-más-50.png"))); // NOI18N
        jMenuItem_clienta.setText("New Client");
        jMenuItem_clienta.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_clienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_clientaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_clienta);

        jMenuItem_clientm.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_clientm.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_clientm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-ajustes-50.png"))); // NOI18N
        jMenuItem_clientm.setText("Client Management");
        jMenuItem_clientm.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_clientm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_clientmActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_clientm);

        jMenuItem_clientl.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_clientl.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_clientl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-orden-de-compra-50.png"))); // NOI18N
        jMenuItem_clientl.setText("Client List");
        jMenuItem_clientl.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_clientl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_clientlActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_clientl);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 153, 153));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-bistec-poco-hecho-50.png"))); // NOI18N
        jMenu3.setText("Products");
        jMenu3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_producta.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_producta.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_producta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-más-50.png"))); // NOI18N
        jMenuItem_producta.setText("New Product");
        jMenuItem_producta.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_producta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_productaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_producta);

        jMenuItem_productm.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_productm.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_productm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-ajustes-50.png"))); // NOI18N
        jMenuItem_productm.setText("Product Management");
        jMenuItem_productm.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_productm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_productmActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_productm);

        jMenuItem_productl.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_productl.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_productl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-orden-de-compra-50.png"))); // NOI18N
        jMenuItem_productl.setText("Products List");
        jMenuItem_productl.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_productl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_productlActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_productl);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 153, 153));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-orden-de-compra-50.png"))); // NOI18N
        jMenu4.setText("Orders");
        jMenu4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_ordera.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_ordera.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_ordera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-más-50.png"))); // NOI18N
        jMenuItem_ordera.setText("New Order");
        jMenuItem_ordera.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_ordera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_orderaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_ordera);

        jMenuItem_orderl.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_orderl.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_orderl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-orden-de-compra-50.png"))); // NOI18N
        jMenuItem_orderl.setText("Orders List");
        jMenuItem_orderl.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_orderl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_orderlActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_orderl);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(255, 153, 153));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-proveedor-50.png"))); // NOI18N
        jMenu5.setText("Suppliers");
        jMenu5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_suppliera.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_suppliera.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_suppliera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-más-50.png"))); // NOI18N
        jMenuItem_suppliera.setText("New Supplier");
        jMenuItem_suppliera.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_suppliera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_supplieraActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_suppliera);

        jMenuItem_supplierm.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_supplierm.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_supplierm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-ajustes-50.png"))); // NOI18N
        jMenuItem_supplierm.setText("Supplier Management");
        jMenuItem_supplierm.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_supplierm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_suppliermActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_supplierm);

        jMenuItem_supplierl.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_supplierl.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_supplierl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-orden-de-compra-50.png"))); // NOI18N
        jMenuItem_supplierl.setText("Suppliers list");
        jMenuItem_supplierl.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_supplierl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_supplierlActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_supplierl);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(255, 153, 153));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-ventana-abierta-50.png"))); // NOI18N
        jMenu6.setText("Log Out");
        jMenu6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_logout.setBackground(new java.awt.Color(255, 153, 153));
        jMenuItem_logout.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuItem_logout.setText("Log Out");
        jMenuItem_logout.setPreferredSize(new java.awt.Dimension(200, 50));
        jMenuItem_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_logoutActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_logout);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_usermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_usermActionPerformed
        InterGestEmpleado intergestempleado = new InterGestEmpleado();
        jDesktopPane_menu.add(intergestempleado);
        intergestempleado.setVisible(true);
    }//GEN-LAST:event_jMenuItem_usermActionPerformed

    private void jMenuItem_clientmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_clientmActionPerformed
        InterGestCliente intergestcliente = new InterGestCliente();
        jDesktopPane_menu.add(intergestcliente);
        intergestcliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_clientmActionPerformed

    private void jMenuItem_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_logoutActionPerformed
        FrmLogin frmlogin = new FrmLogin();
        frmlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_logoutActionPerformed

    private void jMenuItem_productaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_productaActionPerformed
        InterProducto interproducto = new InterProducto();
        jDesktopPane_menu.add(interproducto);
        interproducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_productaActionPerformed

    private void jMenuItem_productmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_productmActionPerformed
        InterGestProducto interGestProducto = new InterGestProducto();
        jDesktopPane_menu.add(interGestProducto);
        interGestProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_productmActionPerformed

    private void jMenuItem_supplieraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_supplieraActionPerformed
        InterProveedor interproveedor = new InterProveedor();
        jDesktopPane_menu.add(interproveedor);
        interproveedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem_supplieraActionPerformed

    private void jMenuItem_suppliermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_suppliermActionPerformed
        InterGestProveedor intergestproveedor = new InterGestProveedor();
        jDesktopPane_menu.add(intergestproveedor);
        intergestproveedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem_suppliermActionPerformed

    private void jMenuItem_clientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_clientaActionPerformed
        InterCliente intercliente = new InterCliente();
        jDesktopPane_menu.add(intercliente);
        intercliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_clientaActionPerformed

    private void jMenuItem_useraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_useraActionPerformed
        InterEmpleado interempleado = new InterEmpleado();
        jDesktopPane_menu.add(interempleado);
        interempleado.setVisible(true);
    }//GEN-LAST:event_jMenuItem_useraActionPerformed

    private void jMenuItem_orderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_orderaActionPerformed
        InterFactura interFactura = new InterFactura();
        jDesktopPane_menu.add(interFactura);
        interFactura.setVisible(true);
    }//GEN-LAST:event_jMenuItem_orderaActionPerformed

    private void jMenuItem_userlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_userlActionPerformed
        Listado listado = new Listado();
        listado.listaEmpleados();
    }//GEN-LAST:event_jMenuItem_userlActionPerformed

    private void jMenuItem_clientlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_clientlActionPerformed
        Listado listado = new Listado();
        listado.listaClientes();
    }//GEN-LAST:event_jMenuItem_clientlActionPerformed

    private void jMenuItem_productlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_productlActionPerformed
        Listado listado = new Listado();
        listado.listaProductos();
    }//GEN-LAST:event_jMenuItem_productlActionPerformed

    private void jMenuItem_orderlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_orderlActionPerformed
        Listado listado = new Listado();
        listado.listaVentas();
    }//GEN-LAST:event_jMenuItem_orderlActionPerformed

    private void jMenuItem_supplierlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_supplierlActionPerformed
        Listado listado = new Listado();
        listado.listaProveedores();
    }//GEN-LAST:event_jMenuItem_supplierlActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_clienta;
    private javax.swing.JMenuItem jMenuItem_clientl;
    private javax.swing.JMenuItem jMenuItem_clientm;
    private javax.swing.JMenuItem jMenuItem_logout;
    private javax.swing.JMenuItem jMenuItem_ordera;
    private javax.swing.JMenuItem jMenuItem_orderl;
    private javax.swing.JMenuItem jMenuItem_producta;
    private javax.swing.JMenuItem jMenuItem_productl;
    private javax.swing.JMenuItem jMenuItem_productm;
    private javax.swing.JMenuItem jMenuItem_suppliera;
    private javax.swing.JMenuItem jMenuItem_supplierl;
    private javax.swing.JMenuItem jMenuItem_supplierm;
    private javax.swing.JMenuItem jMenuItem_usera;
    private javax.swing.JMenuItem jMenuItem_userl;
    private javax.swing.JMenuItem jMenuItem_userm;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    public class JDesktopPaneConFondo extends JDesktopPane {

        private Image imagenFondo;

        /**
         * Clase interna que extiende JDesktopPane y permite establecer un fondo
         * para el panel de escritorio.
         */
        public JDesktopPaneConFondo() {
            // Carga la imagen de fondo
            ImageIcon icono = new ImageIcon("img/fondo.jpg"); // Reemplaza "ruta_de_la_imagen.jpg" con la ruta de tu imagen
            imagenFondo = icono.getImage();

            // Establece el tamaño del JDesktopPane
            this.setPreferredSize(new Dimension(800, 600));
        }

        /**
         *
         * @param g
         */
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Dibuja la imagen de fondo
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
