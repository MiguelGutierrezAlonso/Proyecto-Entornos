/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.Ctrl_Usuario;
import modelo.Usuario;
import conexion.Conexion;
import java.awt.Dimension;
import conexion.Conexion;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class InterGestEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterGestEmpleado
     */
    public InterGestEmpleado() {
        initComponents();
        this.setSize(new Dimension(1150, 495));
        this.setTitle("Product management");
        this.CargarTablaUsuarios();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ENombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ETlf = new javax.swing.JTextField();
        EUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        EPassword = new javax.swing.JTextField();
        ESueldo = new javax.swing.JTextField();
        EDireccion = new javax.swing.JTextField();
        EAdmin = new javax.swing.JCheckBox();
        Search = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 770, 390));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("User Management");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        Update.setBackground(new java.awt.Color(153, 255, 153));
        Update.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, -1, -1));

        Delete.setBackground(new java.awt.Color(255, 51, 51));
        Delete.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Surname");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 110, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tlf nº");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 110, -1));
        getContentPane().add(EID, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 110, -1));
        getContentPane().add(ENombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("User");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 110, -1));
        getContentPane().add(EApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Identity number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 130, -1));
        getContentPane().add(ETlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, 160, -1));
        getContentPane().add(EUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 160, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 110, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Salary");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 110, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Address");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 110, -1));
        getContentPane().add(EPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, 160, -1));
        getContentPane().add(ESueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 290, 160, -1));
        getContentPane().add(EDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 330, 160, -1));

        EAdmin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        EAdmin.setText("Admin");
        EAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAdminActionPerformed(evt);
            }
        });
        getContentPane().add(EAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 370, 80, -1));

        Search.setBackground(new java.awt.Color(51, 255, 204));
        Search.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 410, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

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
        } else if (EUsuario.getText().trim().length() < 9) {
            JOptionPane.showMessageDialog(null, "Username must be at least 9 characters long");
        } else if (EPassword.getText().trim().length() < 9) {
            JOptionPane.showMessageDialog(null, "Password must be at least 9 characters long");
        } else if (ETlf.getText().trim().length() < 9 || !ETlf.getText().trim().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Phone number must be at least 9 digits and positive");
        } else {
            Usuario usuario = new Usuario();
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();

            usuario.setNidentidad(EID.getText().trim());
            usuario.setNombre(ENombre.getText().trim());
            usuario.setApellido(EApellido.getText().trim());
            usuario.setTelefono(ETlf.getText().trim());
            usuario.setUsuario(EUsuario.getText().trim());
            usuario.setPassword(EPassword.getText().trim());

            String PrecioCom = ESueldo.getText().trim();
            double PrecioCo;

            // Verificar si el sueldo es un número válido
            try {
                if (PrecioCom.contains(",")) {
                    PrecioCom = PrecioCom.replace(",", ".");
                }
                PrecioCo = Double.parseDouble(PrecioCom);

                if (PrecioCo <= 0) {
                    JOptionPane.showMessageDialog(null, "Salary must be a positive number");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please, fill the salary field with a number");
                return;
            }

            usuario.setSueldo(PrecioCo);
            usuario.setDireccion(EDireccion.getText().trim());
            usuario.setAdmin(EAdmin.isSelected());

            if (controlUsuario.actualizar(usuario, idusuario)) {  // Asegurarse de pasar idusuario para la actualización
                JOptionPane.showMessageDialog(null, "Update Successful");
                LimpiarCampos();
                CargarTablaUsuarios();  // Asumiendo que existe un método para recargar la tabla de usuarios
            } else {
                JOptionPane.showMessageDialog(null, "Update Denied");
            }
        }

    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if (!EID.getText().isEmpty()) {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                Usuario usuario = new Usuario();
                Ctrl_Usuario controlUsuario = new Ctrl_Usuario();

                usuario.setNidentidad(EID.getText().trim());
                usuario.setNombre(ENombre.getText().trim());
                usuario.setApellido(EApellido.getText().trim());
                usuario.setTelefono(ETlf.getText().trim());
                usuario.setUsuario(EUsuario.getText().trim());
                usuario.setPassword(EPassword.getText().trim());
                usuario.setSueldo(Double.parseDouble(ESueldo.getText().trim()));
                usuario.setDireccion(EDireccion.getText().trim());

                if (controlUsuario.eliminar(idusuario)) {
                    JOptionPane.showMessageDialog(null, "Delete Successful");
                    LimpiarCampos();
                    CargarTablaUsuarios();
                } else {
                    JOptionPane.showMessageDialog(null, "Delete Denied");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Deletion Cancelled");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a user");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void EAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAdminActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String identityNumber = EID.getText();
        if (!identityNumber.isEmpty()) {
            EnviarDatosDNIMarcado(identityNumber);
        } else {
            JOptionPane.showMessageDialog(null, "Couldn't find the user");
        }
    }//GEN-LAST:event_SearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JCheckBox EAdmin;
    private javax.swing.JTextField EApellido;
    private javax.swing.JTextField EDireccion;
    private javax.swing.JTextField EID;
    private javax.swing.JTextField ENombre;
    private javax.swing.JTextField EPassword;
    private javax.swing.JTextField ESueldo;
    private javax.swing.JTextField ETlf;
    private javax.swing.JTextField EUsuario;
    private javax.swing.JButton Search;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables

    int idusuario = 0;
    String nidentidad = "";
    String nombre = "";
    String apellido = "";
    String telefono = "";
    String usuario = "";
    String password = "";
    double sueldo = 0;
    String direccion = "";

    private void CargarTablaUsuarios() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select id_empleado, NIdentidad, Nombre, Apellido, Telefono, Usuario, Password, Sueldo, Direccion, Admin from Empleados";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            model.addColumn("ID");
            model.addColumn("ID Nº");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Tlf nº");
            model.addColumn("Username");
            model.addColumn("Password");
            model.addColumn("Salary");
            model.addColumn("Address");
            model.addColumn("Admin"); // Agregar una columna para mostrar si es administrador

            while (rs.next()) {
                Object fila[] = new Object[10]; // Ajustar el tamaño del arreglo a 10 columnas
                for (int i = 0; i < 9; i++) {
                    fila[i] = rs.getObject(i + 1);
                    System.out.println("Columna " + i + ": " + fila[i]); // Imprimir los valores obtenidos
                }
                // Obtener el valor de Administrador y mostrarlo como "Si" o "No"
                fila[9] = rs.getBoolean("Admin") ? "Yes" : "No";
                model.addRow(fila);
            }

            InterGestEmpleado.jTableUsuarios.setModel(model);

            jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(40);

            InterGestEmpleado.jScrollPane1.setViewportView(InterGestEmpleado.jTableUsuarios);

            con.close();
        } catch (SQLException e) {
            System.out.println("Error filling the user table:" + e);
        }

        jTableUsuarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTableUsuarios.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idusuario = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosUsuarioSeleccionado(idusuario);
                }
            }
        });
    }

    private void EnviarDatosUsuarioSeleccionado(int idusuario) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("select * from empleados where id_empleado = ?");
            pst.setInt(1, idusuario);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                EID.setText(rs.getString("NIdentidad"));
                ENombre.setText(rs.getString("Nombre"));
                EApellido.setText(rs.getString("Apellido"));
                ETlf.setText(rs.getString("Telefono"));
                EUsuario.setText(rs.getString("Usuario"));
                EPassword.setText(rs.getString("Password"));
                ESueldo.setText(Double.toString(rs.getDouble("Sueldo")));
                EDireccion.setText(rs.getString("Direccion"));
                EAdmin.setSelected(rs.getBoolean("Admin"));
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error selecting the client" + e);
        }
    }

    private void EnviarDatosDNIMarcado(String idusuario) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("select * from empleados where NIdentidad = '" + idusuario + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                EID.setText(rs.getString("NIdentidad"));
                ENombre.setText(rs.getString("Nombre"));
                EApellido.setText(rs.getString("Apellido"));
                ETlf.setText(rs.getString("Telefono"));
                EUsuario.setText(rs.getString("Usuario"));
                EPassword.setText(rs.getString("Password"));
                ESueldo.setText(Double.toString(rs.getDouble("Sueldo")));
                EDireccion.setText(rs.getString("Direccion"));
                EAdmin.setSelected(rs.getBoolean("Admin"));
            } else {
                JOptionPane.showMessageDialog(null, "Couldnt find the employee");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error selecting the employee" + e);
            JOptionPane.showMessageDialog(null, "Couldnt find the employee");
        }
    }

    private void LimpiarCampos() {
        EID.setText("");
        ENombre.setText("");
        EApellido.setText("");
        ETlf.setText("");
        EUsuario.setText("");
        EPassword.setText("");
        ESueldo.setText("");
        EDireccion.setText("");
        EAdmin.setSelected(false); // Desmarcar el checkbox
    }

}
