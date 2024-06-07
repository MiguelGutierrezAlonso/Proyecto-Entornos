/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import conexion.Conexion;
import java.awt.Dimension;
import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase proporciona una interfaz para la gestión de productos.
 * Permite la visualización, actualización, eliminación y búsqueda de productos en una base de datos.
 * El usuario puede interactuar con la interfaz para realizar estas operaciones.
 * La clase se encarga de la interacción con la base de datos y la actualización de la interfaz gráfica.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class InterGestProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterGestProducto
     */
    private int ID_Producto;
    int obtenerProveedor = 0;

    /**
     * Crea una nueva instancia de la interfaz de gestión de productos.
     * Inicializa la interfaz gráfica y establece el tamaño, título y color de
     * fondo.
     */
    public InterGestProducto() {
        initComponents();
        this.setSize(new Dimension(800, 370));
        this.setTitle("Product management");
        this.CargarTablaProductos();
        this.CargarProveedor();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PPC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PPV = new javax.swing.JTextField();
        PCategoria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        PProveedor = new javax.swing.JComboBox<>();
        Search = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTableProductos.getColumnModel().getColumn(1).setPreferredWidth(120);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 450, 270));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("Product Management");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        Update.setBackground(new java.awt.Color(153, 255, 153));
        Update.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 290, -1, -1));

        Delete.setBackground(new java.awt.Color(255, 51, 51));
        Delete.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Purchase Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Sale Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 110, -1));
        getContentPane().add(PNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 110, -1));
        getContentPane().add(PCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Category");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 110, -1));
        getContentPane().add(PPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Product Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 110, -1));
        getContentPane().add(PPV, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 160, -1));

        PCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Beef", "Pork", "Chicken", "Saussage", "Cheese", "Other" }));
        getContentPane().add(PCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 160, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Supplier");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 110, -1));

        PProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Beef", "Pork", "Chicken", "Saussage", "Cheese", "Other" }));
        getContentPane().add(PProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 160, -1));

        Search.setBackground(new java.awt.Color(51, 255, 204));
        Search.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Actualiza la información de un producto en la base de datos.
     * Comprueba que todos los campos estén completos y válidos antes de realizar la actualización.
     * Si la actualización es exitosa, limpia los campos y actualiza la tabla de productos.
     * 
     * @param evt El evento que desencadena la acción de actualización.
     */
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        // Verificar si el nombre del producto no está vacío
        if (PNombre.getText().trim().isEmpty()
                || PCantidad.getText().trim().isEmpty()
                || PPC.getText().trim().isEmpty()
                || PPV.getText().trim().isEmpty()
                || PCategoria.getSelectedItem() == null
                || PCategoria.getSelectedItem().toString().trim().equalsIgnoreCase("Select Category")) {

            JOptionPane.showMessageDialog(null, "Fill all the fields");
        } else {
            Producto producto = new Producto();
            Ctrl_Producto controlProducto = new Ctrl_Producto();

            producto.setNombre(PNombre.getText().trim());

            // Verificar si la cantidad es un número válido y positivo
            try {
                int cantidadProducto = Integer.parseInt(PCantidad.getText().trim());
                if (cantidadProducto <= 0) {
                    JOptionPane.showMessageDialog(null, "Quantity must be a positive number");
                    return;
                }
                producto.setCantidad(cantidadProducto);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Quantity must be a valid number");
                return;
            }

            // Verificar si el precio de compra es un número válido y positivo
            try {
                double precioCompra = Double.parseDouble(PPC.getText().trim().replace(",", "."));
                if (precioCompra <= 0) {
                    JOptionPane.showMessageDialog(null, "Purchase price must be a positive number");
                    return;
                }
                producto.setPrecio_Compra(precioCompra);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please, fill the purchase price field with a valid number");
                return;
            }

            // Verificar si el precio de venta es un número válido y positivo
            try {
                double precioVenta = Double.parseDouble(PPV.getText().trim().replace(",", "."));
                if (precioVenta <= 0) {
                    JOptionPane.showMessageDialog(null, "Sale price must be a positive number");
                    return;
                }
                producto.setPrecio_Venta(precioVenta);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please, fill the sale price field with a valid number");
                return;
            }

            producto.setCategoria(PCategoria.getSelectedItem().toString().trim());

            // Obtener el ID del proveedor seleccionado
            int idProveedor = obtenerIdProveedorSeleccionado();
            producto.setID_Proveedor(idProveedor);

            // Intentar actualizar el producto en la base de datos
            if (controlProducto.actualizar(producto, idproducto)) {
                JOptionPane.showMessageDialog(null, "Update Successful");
                LimpiarCampos();
                CargarTablaProductos();
            } else {
                JOptionPane.showMessageDialog(null, "Update Denied");
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed

    /**
     * Elimina un producto de la base de datos.
     * Verifica si se ha seleccionado un producto antes de eliminarlo.
     * Si la eliminación es exitosa, limpia los campos y actualiza la tabla de productos.
     * 
     * @param evt El evento que desencadena la acción de eliminación.
     */
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if (!PNombre.getText().isEmpty()) {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this product?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                Producto producto = new Producto();
                Ctrl_Producto controlProducto = new Ctrl_Producto();

                producto.setNombre(PNombre.getText().trim());
                producto.setCantidad(Integer.parseInt(PCantidad.getText().trim()));
                producto.setPrecio_Compra(Double.parseDouble(PPC.getText().trim()));
                producto.setPrecio_Venta(Double.parseDouble(PPV.getText().trim()));
                producto.setCategoria(PCategoria.getSelectedItem().toString().trim());

                if (!controlProducto.eliminar(idproducto)) {
                    JOptionPane.showMessageDialog(null, "Delete Successful");
                    PNombre.setText("");
                    PCantidad.setText("");
                    PPC.setText("");
                    PPV.setText("");
                    PCategoria.setSelectedIndex(0);
                    this.CargarTablaProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "Delete Denied");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Deletion Cancelled");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a product");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    /**
     * Busca un producto en la base de datos por su nombre.
     * Muestra los detalles del producto si se encuentra.
     * 
     * @param evt El evento que desencadena la acción de búsqueda.
     */
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String identityNumber = PNombre.getText();
        if (!identityNumber.isEmpty()) {
            EnviarDatosNombreMarcado(identityNumber);
        } else {
            JOptionPane.showMessageDialog(null, "Couldn't find the product");
        }
    }//GEN-LAST:event_SearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField PCantidad;
    private javax.swing.JComboBox<String> PCategoria;
    private javax.swing.JTextField PNombre;
    private javax.swing.JTextField PPC;
    private javax.swing.JTextField PPV;
    private javax.swing.JComboBox<String> PProveedor;
    private javax.swing.JButton Search;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables

    int idproducto = 0;
    String nombre = "";
    int cantidad = 0;
    double pc = 0;
    double pv = 0;
    String categoria = "";

    /**
     * Carga la tabla de productos con los datos de la base de datos.
     * Permite la visualización de los productos disponibles.
     */
    private void CargarTablaProductos() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select p.id_Producto, p.nombre, p.cantidad, p.precio_compra, p.precio_venta, p.categoria, c.empresa from productos As p, proveedores As c where p.id_proveedor = c.id_proveedor;";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Quantity");
            model.addColumn("BuyPr");
            model.addColumn("SellPr");
            model.addColumn("Category");
            model.addColumn("Supplier");

            while (rs.next()) {
                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }

            InterGestProducto.jTableProductos.setModel(model); // Establecer el modelo en la tabla

            jTableProductos.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTableProductos.getColumnModel().getColumn(1).setPreferredWidth(140);

            InterGestProducto.jScrollPane2.setViewportView(InterGestProducto.jTableProductos);

            con.close();
        } catch (SQLException e) {
            System.out.println("Error filling the product table:" + e);
        }

        jTableProductos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTableProductos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idproducto = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosProductoSeleccionado(idproducto);
                }
            }
        });
    }

    /**
     * Envía los datos del producto seleccionado a los campos correspondientes en la interfaz.
     * 
     * @param idproducto El ID del producto seleccionado.
     */
    private void EnviarDatosProductoSeleccionado(int idproducto) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM productos WHERE id_producto = ?");
            pst.setInt(1, idproducto);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                PNombre.setText(rs.getString("Nombre"));
                PCantidad.setText(Integer.toString(rs.getInt("Cantidad")));
                PPC.setText(Double.toString(rs.getDouble("Precio_Compra")));
                PPV.setText(Double.toString(rs.getDouble("Precio_Venta")));
                PCategoria.setSelectedItem(rs.getString("Categoria"));
                int idProveedor = rs.getInt("ID_proveedor");
                String nombreProveedor = buscarNombreProveedor(idProveedor);
                PProveedor.setSelectedItem(relacionarProveedor(idProveedor));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error selecting the product" + e);
        }
    }

    /**
     * Busca el nombre de un proveedor en la base de datos por su ID.
     * 
     * @param idProveedor El ID del proveedor.
     * @return El nombre del proveedor.
     */
    private String buscarNombreProveedor(int idProveedor) {
        String nombreProveedor = "";
        String sql = "SELECT empresa FROM proveedores WHERE id_proveedor = ?";
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, idProveedor);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nombreProveedor = rs.getString("empresa");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar el nombre del proveedor: " + e);
        }
        return nombreProveedor;
    }

    /**
     * Relaciona un ID de proveedor con el nombre de la empresa.
     * 
     * @param idProveedor El ID del proveedor.
     * @return El nombre de la empresa del proveedor.
     */
    private String relacionarProveedor(int idProveedor) {
        String empresaProveedor = "";
        String sql = "SELECT empresa FROM proveedores WHERE id_proveedor = ?";
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, idProveedor);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                empresaProveedor = rs.getString("empresa");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el nombre del proveedor: " + e);
        }
        return empresaProveedor;
    }

    /**
     * Carga la lista desplegable de proveedores con los datos de la base de datos.
     */
    private void CargarProveedor() {
        Connection cn = Conexion.conectar();
        String sql = "select * from proveedores";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            PProveedor.removeAllItems();
            while (rs.next()) {
                PProveedor.addItem(rs.getString("empresa"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar proveedores");
        }
    }

    /**
     * Obtiene el ID del proveedor seleccionado en la lista desplegable.
     * 
     * @return El ID del proveedor seleccionado.
     */
    private int obtenerIdProveedorSeleccionado() {
        String empresaProveedor = PProveedor.getSelectedItem().toString();
        int idProveedor = obtenerIdProveedorDesdeBaseDeDatos(empresaProveedor);
        return idProveedor;
    }

    /**
     * Obtiene el ID del proveedor desde la base de datos utilizando el nombre de la empresa.
     * 
     * @param empresaProveedor El nombre de la empresa del proveedor.
     * @return El ID del proveedor.
     */
    private int obtenerIdProveedorDesdeBaseDeDatos(String empresaProveedor) {

        int idProveedor = 0;
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("SELECT id_proveedor FROM proveedores WHERE empresa = ?");
            pst.setString(1, empresaProveedor);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                idProveedor = rs.getInt("id_proveedor");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el ID del proveedor desde la base de datos: " + e);
        }
        return idProveedor;
    }

    /**
     * Envía los datos del producto seleccionado por su nombre a los campos correspondientes en la interfaz.
     * 
     * @param idproducto El nombre del producto seleccionado.
     */
    private void EnviarDatosNombreMarcado(String idproducto) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("select * from productos where nombre = '" + idproducto + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                PNombre.setText(rs.getString("Nombre"));
                PCantidad.setText(Integer.toString(rs.getInt("Cantidad")));
                PPC.setText(Double.toString(rs.getDouble("Precio_Compra")));
                PPV.setText(Double.toString(rs.getDouble("Precio_Venta")));
                PCategoria.setSelectedItem(rs.getString("Categoria"));
                int idProveedor = rs.getInt("ID_proveedor");
                String nombreProveedor = buscarNombreProveedor(idProveedor);
                PProveedor.setSelectedItem(relacionarProveedor(idProveedor));
            } else {
                JOptionPane.showMessageDialog(null, "Couldnt find the Product");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error selecting the product" + e);
            JOptionPane.showMessageDialog(null, "Couldnt find the product");
        }
    }

    /**
     * Limpia todos los campos de la interfaz.
     */
    private void LimpiarCampos() {
        PNombre.setText("");
        PCantidad.setText("");
        PPC.setText("");
        PPV.setText("");
        PCategoria.setSelectedIndex(0);
    }
}
