/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import conexion.Conexion;
import controlador.Ctrl_RegistrarVenta;
import controlador.VentaPDF;
import java.awt.Color;
import java.awt.Dimension;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CabeceraVenta;
import modelo.DetalleVenta;

/**
 * Interfaz gráfica para realizar una nueva orden de venta. Esta clase permite
 * al usuario seleccionar clientes, agregar productos y realizar operaciones de
 * venta.
 *
 * @author Miguel
 * @since 2024-06-07
 */
public class InterFactura extends javax.swing.JInternalFrame {

    /**
     * Modelo de tabla para mostrar los productos seleccionados.
     */
    private DefaultTableModel modeloDatosProductos;

    /**
     * Lista de productos seleccionados para la venta.
     */
    ArrayList<DetalleVenta> listaProductos = new ArrayList<>();

    /**
     * Producto actual seleccionado.
     */
    private DetalleVenta producto;

    /**
     * Identificador del cliente seleccionado.
     */
    private int idCliente = 0;

    /**
     * Identificador del producto seleccionado.
     */
    private int idProducto = 0;

    /**
     * Nombre del producto seleccionado.
     */
    private String nombre = "";

    /**
     * Cantidad de existencias del producto en la base de datos.
     */
    private int cantidadProductoBBDD = 0;

    /**
     * Precio unitario del producto seleccionado.
     */
    private double precioUnitario = 0;

    /**
     * Cantidad de unidades del producto a vender.
     */
    private int cantidad = 0;

    /**
     * Total a pagar por la venta actual.
     */
    private double totalPagar = 0;

    /**
     * Total a pagar por todas las ventas.
     */
    private double totalPagarGeneral = 0;

    /**
     * Identificador auxiliar para los detalles de venta.
     */
    private int auxIdDetalle = 1;

    /**
     * Constructor de la clase InterFactura. Inicializa la interfaz gráfica y
     * carga los datos iniciales.
     */
    public InterFactura() {
        initComponents();
        this.setTitle("New Order");
        this.setSize(new Dimension(800, 600));
        this.CargarComboClientes();
        this.CargarComboProductos();
        this.inicializarTablaProducto();
        this.getContentPane().setBackground(Color.pink);

        FPagado.setEnabled(false);
        CalcularCambio.setEnabled(false);

        FPrecioTotal.setText("0.0");

    }

    /**
     * Inicializa el modelo de la tabla de productos.
     */
    private void inicializarTablaProducto() {
        modeloDatosProductos = new DefaultTableModel();
        modeloDatosProductos.addColumn("Nª");
        modeloDatosProductos.addColumn("Name");
        modeloDatosProductos.addColumn("Quantity");
        modeloDatosProductos.addColumn("Unitary Price");
        modeloDatosProductos.addColumn("Total Price");
        modeloDatosProductos.addColumn("Delete?");

        this.FTabla.setModel(modeloDatosProductos);
    }

    /**
     * Actualiza la tabla de productos con la lista actualizada.
     */
    private void listaTablaProductos() {
        this.modeloDatosProductos.setRowCount(listaProductos.size());
        for (int i = 0; i < listaProductos.size(); i++) {
            this.modeloDatosProductos.setValueAt(i + 1, i, 0);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getNombre(), i, 1);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getCantidad(), i, 2);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getPrecioUnitario(), i, 3);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getPrecioTotal(), i, 4);
            this.modeloDatosProductos.setValueAt("Eliminar", i, 5);
        }
        FTabla.setModel(modeloDatosProductos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FClienteD = new javax.swing.JComboBox<>();
        FProductoD = new javax.swing.JComboBox<>();
        FClienteB = new javax.swing.JTextField();
        BuscaCliente = new javax.swing.JButton();
        FProductoC = new javax.swing.JTextField();
        AnadeCantidad = new javax.swing.JButton();
        CalcularCambio = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FTabla = new javax.swing.JTable();
        FPrecioTotal = new javax.swing.JTextField();
        FPagado = new javax.swing.JTextField();
        FDevolver = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("New Order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Client");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 60, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("Product");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("Total price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("Paid");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 80, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setText("Return");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 80, -1));

        FClienteD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(FClienteD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, -1));

        FProductoD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(FProductoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 170, -1));

        FClienteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FClienteBActionPerformed(evt);
            }
        });
        getContentPane().add(FClienteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 140, -1));

        BuscaCliente.setText("Search");
        BuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BuscaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));
        getContentPane().add(FProductoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 70, -1));

        AnadeCantidad.setText("Add");
        AnadeCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadeCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(AnadeCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        CalcularCambio.setText("Exchange");
        CalcularCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularCambioActionPerformed(evt);
            }
        });
        getContentPane().add(CalcularCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 90, -1));

        Guardar.setText("Save!");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 518, 90, -1));

        FTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        FTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 650, 370));

        FPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPrecioTotalActionPerformed(evt);
            }
        });
        getContentPane().add(FPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 120, -1));
        getContentPane().add(FPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 120, -1));
        getContentPane().add(FDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FClienteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FClienteBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FClienteBActionPerformed

    private void FPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPrecioTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FPrecioTotalActionPerformed

    /**
     * Realiza la búsqueda del cliente en la base de datos a partir del ID
     * proporcionado en el campo de texto. Si se encuentra el cliente, actualiza
     * el combo de clientes seleccionados. Si no se encuentra el cliente,
     * muestra un mensaje de advertencia.
     *
     * @param evt Evento de acción que desencadena la búsqueda del cliente.
     */
    private void BuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaClienteActionPerformed

        try {
            int clienteBuscar = Integer.parseInt(FClienteB.getText().trim());
            Connection cn = Conexion.conectar();
            String sql = "Select nombre, apellido from clientes where id_cliente = " + clienteBuscar;
            Statement st;

            try {
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {
                    String nombreCompleto = rs.getString("nombre") + " " + rs.getString("apellido");
                    FClienteD.setSelectedItem(nombreCompleto);
                } else {
                    FClienteD.setSelectedItem("Select a client");
                    JOptionPane.showMessageDialog(null, "Client or ID not found");
                }
                FClienteB.setText("");
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error finding the client: " + e);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid client ID");
            FClienteB.setText("");
        }

    }//GEN-LAST:event_BuscaClienteActionPerformed

    /**
     * Agrega la cantidad especificada del producto seleccionado a la lista de
     * productos de la venta. Verifica la disponibilidad en stock antes de
     * agregar el producto. Actualiza la tabla de productos y el total a pagar.
     *
     * @param evt Evento de acción que desencadena la adición de cantidad de
     * producto.
     */
    private void AnadeCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadeCantidadActionPerformed
        String combo = this.FProductoD.getSelectedItem().toString();

        if (combo.equalsIgnoreCase("Select the product")) {
            JOptionPane.showMessageDialog(null, "Select a product");
        } else {
            if (!FProductoC.getText().isEmpty()) {
                boolean validacion = validar(FProductoC.getText());
                if (validacion == true) {
                    if (Integer.parseInt(FProductoC.getText()) > 0) {
                        cantidad = Integer.parseInt(FProductoC.getText());
                        this.DatosDelProducto();

                        if (cantidad <= cantidadProductoBBDD) {

                            totalPagar = precioUnitario * cantidad;

                            totalPagar = (double) Math.round(totalPagar * 100) / 100;

                            producto = new DetalleVenta(auxIdDetalle, 1, idProducto, nombre, Integer.parseInt(FProductoC.getText()),
                                    precioUnitario, totalPagar);

                            listaProductos.add(producto);
                            JOptionPane.showMessageDialog(null, "Product saved");
                            auxIdDetalle++;
                            FDevolver.setText("");
                            this.CargarComboProductos();

                            this.CalcularTotalPagar();

                            FPagado.setEnabled(true);
                            CalcularCambio.setEnabled(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Do not pass the stock");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Select a positive integer value");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Non numeric values are not allowed");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Select a quantity of products");
            }
        }
        this.listaTablaProductos();
    }//GEN-LAST:event_AnadeCantidadActionPerformed

    /**
     * Calcula el cambio a devolver al cliente según el monto pagado y el total
     * a pagar. Muestra un mensaje de advertencia si el monto pagado es
     * insuficiente.
     *
     * @param evt Evento de acción que desencadena el cálculo del cambio.
     */
    private void CalcularCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularCambioActionPerformed
        if (!FPagado.getText().isEmpty()) {
            boolean validacion = validarDouble(FPagado.getText());
            if (validacion == true) {
                double efc = Double.parseDouble(FPagado.getText().trim());
                double top = Double.parseDouble(FPrecioTotal.getText().trim());

                if (efc < top) {
                    JOptionPane.showMessageDialog(null, "Not enough money");
                } else {
                    double cambio = (efc - top);
                    double cambi = (double) Math.round(cambio * 100) / 100;
                    String camb = String.valueOf(cambi);
                    FDevolver.setText(camb);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Non numeric values are not allowed");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fill the field of paid ammount");
        }
    }//GEN-LAST:event_CalcularCambioActionPerformed

    int idArrayList = 0;

    /**
     * Maneja el evento de clic en la tabla de productos. Permite eliminar un
     * producto de la lista de productos de la venta. Actualiza la tabla de
     * productos y el total a pagar.
     *
     * @param evt Evento de clic en la tabla de productos.
     */
    private void FTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FTablaMouseClicked
        int fila_point = FTabla.rowAtPoint(evt.getPoint());
        int columna_point = 0;
        if (fila_point > -1) {
            idArrayList = (int) modeloDatosProductos.getValueAt(fila_point, columna_point);
        }
        int opcion = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this product?");

        switch (opcion) {
            case 0:
                listaProductos.remove(idArrayList - 1);
                this.CalcularTotalPagar();
                this.listaTablaProductos();
                break;
            case 1:
                break;
            default:
                break;
        }
    }//GEN-LAST:event_FTablaMouseClicked

    /**
     * Guarda la orden de venta en la base de datos junto con los detalles de la
     * venta. Genera una factura en formato PDF. Actualiza el stock de productos
     * en la base de datos. Reinicia los campos y la lista de productos para una
     * nueva venta.
     *
     * @param evt Evento de acción que desencadena el guardado de la orden de
     * venta.
     */
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        CabeceraVenta cabeceraVenta = new CabeceraVenta();
        DetalleVenta detalleVenta = new DetalleVenta();
        Ctrl_RegistrarVenta controlVenta = new Ctrl_RegistrarVenta();

        String fechaActual = "";
        Date date = new Date();
        fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);

        if (!FClienteD.getSelectedItem().equals("Select a client")) {
            if (listaProductos.size() > 0) {

                this.ObtenerIdCliente();
                cabeceraVenta.setIdPedido(0);
                cabeceraVenta.setIdCliente(idCliente);
                cabeceraVenta.setFecha(fechaActual);
                cabeceraVenta.setPrecioTotal(Double.parseDouble(FPrecioTotal.getText()));

                if (controlVenta.guardar(cabeceraVenta)) {
                    JOptionPane.showMessageDialog(null, "Order Saved");

                    VentaPDF pdf = new VentaPDF();
                    pdf.DatosCliente(idCliente);
                    pdf.generarFacturaPDF();

                    for (DetalleVenta elemento : listaProductos) {
                        detalleVenta.setIdDetalle(0);
                        detalleVenta.setIdPedido(0);
                        detalleVenta.setIdProducto(elemento.getIdProducto());
                        detalleVenta.setCantidad(elemento.getCantidad());
                        detalleVenta.setPrecioUnitario(elemento.getPrecioUnitario());
                        detalleVenta.setPrecioTotal(elemento.getPrecioTotal());

                        if (controlVenta.guardarDetalle(detalleVenta)) {
                            System.out.println("Details registered");

                            FPrecioTotal.setText("0.0");
                            FPagado.setText("0.0");
                            FDevolver.setText("0.0");
                            auxIdDetalle = 1;

                            this.CargarComboClientes();
                            this.CargarComboProductos();
                            this.RestarStockProductos(elemento.getIdProducto(), elemento.getCantidad());
                        } else {
                            JOptionPane.showMessageDialog(null, "Error saving the order details");
                        }
                    }
                    listaProductos.clear();
                    listaTablaProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error saving the order");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Select a product");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a client");
        }

    }//GEN-LAST:event_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnadeCantidad;
    private javax.swing.JButton BuscaCliente;
    private javax.swing.JButton CalcularCambio;
    private javax.swing.JTextField FClienteB;
    private javax.swing.JComboBox<String> FClienteD;
    private javax.swing.JTextField FDevolver;
    private javax.swing.JTextField FPagado;
    public static javax.swing.JTextField FPrecioTotal;
    private javax.swing.JTextField FProductoC;
    private javax.swing.JComboBox<String> FProductoD;
    public static javax.swing.JTable FTabla;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * Carga la lista de clientes desde la base de datos y la muestra en el
     * combo de clientes.
     */
    private void CargarComboClientes() {
        Connection cn = Conexion.conectar();
        String sql = "select * from clientes";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FClienteD.removeAllItems();
            FClienteD.addItem("Select a client");
            while (rs.next()) {
                String nombreCompleto = rs.getString("nombre") + " " + rs.getString("apellido");
                FClienteD.addItem(nombreCompleto);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error searching the clients" + e);
        }
    }

    /**
     * Carga la lista de productos desde la base de datos y la muestra en el
     * combo de productos.
     */
    private void CargarComboProductos() {
        Connection cn = Conexion.conectar();
        String sql = "select * from productos";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FProductoD.removeAllItems();
            FProductoD.addItem("Select the product");
            while (rs.next()) {
                FProductoD.addItem(rs.getString("nombre"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error searching the product" + e);
        }
    }

    /**
     * Valida si el valor especificado es un número entero válido.
     *
     * @param valor Valor a validar.
     * @return true si el valor es un número entero válido, false de lo
     * contrario.
     */
    private boolean validar(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Valida si el valor especificado es un número decimal válido.
     *
     * @param valor Valor a validar.
     * @return true si el valor es un número decimal válido, false de lo
     * contrario.
     */
    private boolean validarDouble(String valor) {
        try {
            double num = Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Obtiene los detalles del producto seleccionado de la base de datos y los
     * almacena en variables locales.
     */
    private void DatosDelProducto() {
        try {
            String sql = "select * from productos where nombre = '" + this.FProductoD.getSelectedItem() + "'";
            Connection cn = Conexion.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                idProducto = rs.getInt("id_producto");
                nombre = rs.getString("nombre");
                cantidadProductoBBDD = rs.getInt("cantidad");
                precioUnitario = rs.getDouble("precio_venta");
            }

        } catch (SQLException e) {
            System.out.println("Error obtaining the product data" + e);
        }
    }

    /**
     * Calcula el total a pagar por la venta actual sumando los precios totales
     * de todos los productos. Actualiza el campo de precio total.
     */
    private void CalcularTotalPagar() {
        totalPagarGeneral = 0;

        for (DetalleVenta elemento : listaProductos) {
            totalPagarGeneral += elemento.getPrecioTotal();
        }

        totalPagarGeneral = (double) Math.round(totalPagarGeneral * 100) / 100;

        FPrecioTotal.setText(String.valueOf(totalPagarGeneral));
    }

    /**
     * Obtiene el identificador del cliente seleccionado del combo de clientes.
     */
    private void ObtenerIdCliente() {
        try {
            String sql = "select * from clientes where concat(nombre, ' ', apellido) = '" + this.FClienteD.getSelectedItem() + "'";
            Connection cn = Conexion.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                idCliente = rs.getInt("id_cliente");
            }
        } catch (SQLException e) {
            System.out.println("Error finding the client id");
        }
    }

    /**
     * Resta la cantidad especificada del stock del producto en la base de
     * datos.
     *
     * @param idProducto Identificador del producto.
     * @param cantidad Cantidad a restar del stock.
     */
    private void RestarStockProductos(int idProducto, int cantidad) {
        int cantidadProductosBBDD = 0;
        try {
            Connection cn = Conexion.conectar();
            String sql = "select id_producto, cantidad from productos where id_producto = '" + idProducto + "'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cantidadProductosBBDD = rs.getInt("cantidad");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al restar stock " + e);
        }
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("update productos set cantidad =? where id_producto = '" + idProducto + "'");
            int cantidadNueva = cantidadProductosBBDD - cantidad;
            consulta.setInt(1, cantidadNueva);
            if (consulta.executeUpdate() > 0) {
                System.out.println("Actualizacion correcta");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al restar cantidad " + e);
        }
    }

}
