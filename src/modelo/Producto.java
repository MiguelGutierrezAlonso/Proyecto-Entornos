/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class Producto {
    
    private int ID_Producto;
    private String Nombre;
    private int Cantidad;
    private double Precio_Compra;
    private double Precio_Venta;
    private String Categoria;
    private int ID_Proveedor;
    
    public Producto(){
        this.ID_Producto = 0;
        this.Nombre = "";
        this.Cantidad = 0;
        this.Precio_Compra = 0;
        this.Precio_Venta = 0;
        this.Categoria = "";
        this.ID_Proveedor = 0;
    }

    public Producto(int ID_Producto, String Nombre, int Cantidad, double Precio_Compra, double Precio_Venta, String Categoria, int ID_Proveedor) {
        this.ID_Producto = ID_Producto;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio_Compra = Precio_Compra;
        this.Precio_Venta = Precio_Venta;
        this.Categoria = Categoria;
        this.ID_Proveedor = ID_Proveedor;
    }

    

    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio_Compra() {
        return Precio_Compra;
    }

    public void setPrecio_Compra(double Precio_Compra) {
        this.Precio_Compra = Precio_Compra;
    }

    public double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getID_Proveedor() {
        return ID_Proveedor;
    }

    public void setID_Proveedor(int ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }
    
    
    
}
