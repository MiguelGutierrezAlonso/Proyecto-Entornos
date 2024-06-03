/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class InterProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterProducto
     */
    int obtenerProveedor = 0;

    public InterProducto() {
        initComponents();
        this.setTitle("New Producto");
        this.setSize(new Dimension(600, 320));
        this.getContentPane().setBackground(Color.pink);
        this.CargarProveedor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        PrecioC = new javax.swing.JTextField();
        PrecioV = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        Categoria = new javax.swing.JComboBox<>();
        Submit = new javax.swing.JButton();
        PProveedor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("New Product");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Supplier");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Purchase price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sale Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 140, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Product Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 140, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 140, -1));

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 220, -1));

        PrecioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioCActionPerformed(evt);
            }
        });
        getContentPane().add(PrecioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 220, -1));

        PrecioV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioVActionPerformed(evt);
            }
        });
        getContentPane().add(PrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 220, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 220, -1));

        Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Beef", "Pork", "Chicken", "Saussage", "Cheese", "Other" }));
        getContentPane().add(Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 220, -1));

        Submit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Submit.setText("Submit!");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 130, 30));

        PProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(PProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 220, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Category");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void PrecioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioCActionPerformed

    private void PrecioVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioVActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

        Producto producto = new Producto();
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        String categoria = "";
        String proveedor = "";

        Object selectedItem = Categoria.getSelectedItem();
        if (selectedItem != null) {
            categoria = selectedItem.toString().trim();
        }

        if (PProveedor.getSelectedItem() != null) {
            proveedor = PProveedor.getSelectedItem().toString().trim();
        }

        // Verificar si todos los campos están llenos
        if (cantidad.getText().trim().isEmpty()
                || nombre.getText().trim().isEmpty()
                || categoria.equalsIgnoreCase("Select Category")
                || proveedor.isEmpty()
                || PrecioC.getText().trim().isEmpty()
                || PrecioV.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Fill all the fields");
        } else if (!controlProducto.existeProducto(nombre.getText().trim())) {
            try {
                producto.setNombre(nombre.getText().trim());

                // Verificar si la cantidad es un número válido y positivo
                int cantidadProducto;
                try {
                    cantidadProducto = Integer.parseInt(cantidad.getText().trim());
                    if (cantidadProducto <= 0) {
                        JOptionPane.showMessageDialog(null, "Quantity must be a positive number");
                        return;
                    }
                    producto.setCantidad(cantidadProducto);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Quantity must be a valid number");
                    return;
                }

                producto.setCategoria(categoria);

                // Verificar si el precio de compra es un número válido y positivo
                double PrecioCo;
                try {
                    String PrecioCom = PrecioC.getText().trim().replace(",", ".");
                    PrecioCo = Double.parseDouble(PrecioCom);
                    if (PrecioCo <= 0) {
                        JOptionPane.showMessageDialog(null, "Purchase price must be a positive number");
                        return;
                    }
                    producto.setPrecio_Compra(PrecioCo);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please, fill the purchase price field with a valid number");
                    return;
                }

                // Verificar si el precio de venta es un número válido y positivo
                double PrecioVe;
                try {
                    String PrecioVen = PrecioV.getText().trim().replace(",", ".");
                    PrecioVe = Double.parseDouble(PrecioVen);
                    if (PrecioVe <= 0) {
                        JOptionPane.showMessageDialog(null, "Sale price must be a positive number");
                        return;
                    }
                    producto.setPrecio_Venta(PrecioVe);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please, fill the sale price field with a valid number");
                    return;
                }

                // Obtener el ID del proveedor seleccionado
                int idProveedor = idProveedor(); // Asumiendo que este método existe y devuelve el ID del proveedor
                producto.setID_Proveedor(idProveedor);

                if (controlProducto.guardar(producto)) {
                    JOptionPane.showMessageDialog(null, "Product saved!");
                    this.CargarProveedor(); // Asumiendo que este método recarga la lista de proveedores
                    this.Limpiar(); // Asumiendo que este método limpia los campos del formulario
                } else {
                    JOptionPane.showMessageDialog(null, "Error saving the product");
                }
            } catch (HeadlessException e) {
                System.out.println("Error en: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "The product already exists");
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void PProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Categoria;
    private javax.swing.JComboBox<String> PProveedor;
    private javax.swing.JTextField PrecioC;
    private javax.swing.JTextField PrecioV;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        nombre.setText("");
        cantidad.setText("");
        PrecioC.setText("");
        PrecioV.setText("");
    }

    private void CargarProveedor() {
        Connection cn = Conexion.conectar();
        String sql = "select * from proveedores";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            PProveedor.removeAllItems();
            PProveedor.addItem("Seleccione proveedor:");
            while (rs.next()) {
                PProveedor.addItem(rs.getString("empresa"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar proveedores");
        }
    }

    private int idProveedor() {
        String sql = "select * from proveedores where empresa = '" + this.PProveedor.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerProveedor = rs.getInt("id_Proveedor");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener id proveedor");
        }
        return obtenerProveedor;
    }
}