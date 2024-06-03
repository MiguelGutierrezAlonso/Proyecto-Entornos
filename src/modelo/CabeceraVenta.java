/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class CabeceraVenta {
    
    private int idPedido;
    private int idCliente;
    private String fecha;
    private double precioTotal;

    
    public CabeceraVenta(){
        this.idPedido = 0;
        this.idCliente = 0;
        this.fecha = "";
        this.precioTotal = 0.0;
    }

    public CabeceraVenta(int idPedido, int idCliente, String fecha, double precioTotal, String direccion) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }


   
    
}
