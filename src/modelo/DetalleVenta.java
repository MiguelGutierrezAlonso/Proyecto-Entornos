/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit esta plantilla
 */
package modelo;

/**
 * La clase DetalleVenta representa el detalle de una venta en el sistema.
 * Incluye información sobre el detalle del pedido, el producto, la cantidad y los precios.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class DetalleVenta {
    
    private int idDetalle;
    private int idPedido;
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double precioTotal;
    
    /**
     * Constructor por defecto que inicializa los atributos a valores por defecto.
     */
    public DetalleVenta() {
        idDetalle = 0;
        idPedido = 0;
        idProducto = 0;
        nombre = "";
        cantidad = 0;
        precioUnitario = 0;
        precioTotal = 0;
    }

    /**
     * Constructor que inicializa los atributos con los valores proporcionados.
     * 
     * @param idDetalle el identificador del detalle
     * @param idPedido el identificador del pedido
     * @param idProducto el identificador del producto
     * @param nombre el nombre del producto
     * @param cantidad la cantidad de producto
     * @param precioUnitario el precio unitario del producto
     * @param precioTotal el precio total del producto
     */
    public DetalleVenta(int idDetalle, int idPedido, int idProducto, String nombre, int cantidad, double precioUnitario, double precioTotal) {
        this.idDetalle = idDetalle;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
    }

    /**
     * Obtiene el identificador del detalle.
     * 
     * @return el identificador del detalle
     */
    public int getIdDetalle() {
        return idDetalle;
    }

    /**
     * Establece el identificador del detalle.
     * 
     * @param idDetalle el identificador del detalle
     */
    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    /**
     * Obtiene el identificador del pedido.
     * 
     * @return el identificador del pedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Establece el identificador del pedido.
     * 
     * @param idPedido el identificador del pedido
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Obtiene el identificador del producto.
     * 
     * @return el identificador del producto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Establece el identificador del producto.
     * 
     * @param idProducto el identificador del producto
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * 
     * @param nombre el nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad del producto.
     * 
     * @return la cantidad del producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del producto.
     * 
     * @param cantidad la cantidad del producto
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el precio unitario del producto.
     * 
     * @return el precio unitario del producto
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Establece el precio unitario del producto.
     * 
     * @param precioUnitario el precio unitario del producto
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Obtiene el precio total del producto.
     * 
     * @return el precio total del producto
     */
    public double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Establece el precio total del producto.
     * 
     * @param precioTotal el precio total del producto
     */
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
