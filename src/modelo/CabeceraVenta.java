/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * La clase CabeceraVenta representa la cabecera de una venta en el sistema.
 * Incluye información sobre el pedido, el cliente, la fecha de la venta y el precio total.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class CabeceraVenta {
    
    private int idPedido;
    private int idCliente;
    private String fecha;
    private double precioTotal;

    /**
     * Constructor por defecto que inicializa los atributos a valores por defecto.
     */
    public CabeceraVenta() {
        this.idPedido = 0;
        this.idCliente = 0;
        this.fecha = "";
        this.precioTotal = 0.0;
    }

    /**
     * Constructor que inicializa los atributos con los valores proporcionados.
     * 
     * @param idPedido el identificador del pedido
     * @param idCliente el identificador del cliente
     * @param fecha la fecha de la venta
     * @param precioTotal el precio total de la venta
     */
    public CabeceraVenta(int idPedido, int idCliente, String fecha, double precioTotal) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
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
     * Obtiene el identificador del cliente.
     * 
     * @return el identificador del cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Establece el identificador del cliente.
     * 
     * @param idCliente el identificador del cliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Obtiene la fecha de la venta.
     * 
     * @return la fecha de la venta
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la venta.
     * 
     * @param fecha la fecha de la venta
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el precio total de la venta.
     * 
     * @return el precio total de la venta
     */
    public double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Establece el precio total de la venta.
     * 
     * @param precioTotal el precio total de la venta
     */
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
