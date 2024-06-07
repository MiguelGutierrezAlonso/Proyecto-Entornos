/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change esta licencia
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package modelo;

/**
 * La clase Producto representa un producto en el sistema.
 * Incluye información sobre el ID del producto, nombre, cantidad, precio de compra, precio de venta, categoría y proveedor.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class Producto {
    
    private int ID_Producto;
    private String Nombre;
    private int Cantidad;
    private double Precio_Compra;
    private double Precio_Venta;
    private String Categoria;
    private int ID_Proveedor;

    /**
     * Constructor por defecto de la clase Producto.
     * Inicializa todos los atributos con valores predeterminados.
     */
    public Producto() {
        this.ID_Producto = 0;
        this.Nombre = "";
        this.Cantidad = 0;
        this.Precio_Compra = 0;
        this.Precio_Venta = 0;
        this.Categoria = "";
        this.ID_Proveedor = 0;
    }

    /**
     * Constructor con parámetros de la clase Producto.
     * 
     * @param ID_Producto ID del producto.
     * @param Nombre Nombre del producto.
     * @param Cantidad Cantidad disponible del producto.
     * @param Precio_Compra Precio de compra del producto.
     * @param Precio_Venta Precio de venta del producto.
     * @param Categoria Categoría del producto.
     * @param ID_Proveedor ID del proveedor del producto.
     */
    public Producto(int ID_Producto, String Nombre, int Cantidad, double Precio_Compra, double Precio_Venta, String Categoria, int ID_Proveedor) {
        this.ID_Producto = ID_Producto;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio_Compra = Precio_Compra;
        this.Precio_Venta = Precio_Venta;
        this.Categoria = Categoria;
        this.ID_Proveedor = ID_Proveedor;
    }

    /**
     * Obtiene el ID del producto.
     * 
     * @return ID del producto.
     */
    public int getID_Producto() {
        return ID_Producto;
    }

    /**
     * Establece el ID del producto.
     * 
     * @param ID_Producto Nuevo ID del producto.
     */
    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return Nombre del producto.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre del producto.
     * 
     * @param Nombre Nuevo nombre del producto.
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Obtiene la cantidad disponible del producto.
     * 
     * @return Cantidad del producto.
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * Establece la cantidad disponible del producto.
     * 
     * @param Cantidad Nueva cantidad del producto.
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * Obtiene el precio de compra del producto.
     * 
     * @return Precio de compra del producto.
     */
    public double getPrecio_Compra() {
        return Precio_Compra;
    }

    /**
     * Establece el precio de compra del producto.
     * 
     * @param Precio_Compra Nuevo precio de compra del producto.
     */
    public void setPrecio_Compra(double Precio_Compra) {
        this.Precio_Compra = Precio_Compra;
    }

    /**
     * Obtiene el precio de venta del producto.
     * 
     * @return Precio de venta del producto.
     */
    public double getPrecio_Venta() {
        return Precio_Venta;
    }

    /**
     * Establece el precio de venta del producto.
     * 
     * @param Precio_Venta Nuevo precio de venta del producto.
     */
    public void setPrecio_Venta(double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    /**
     * Obtiene la categoría del producto.
     * 
     * @return Categoría del producto.
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * Establece la categoría del producto.
     * 
     * @param Categoria Nueva categoría del producto.
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * Obtiene el ID del proveedor del producto.
     * 
     * @return ID del proveedor del producto.
     */
    public int getID_Proveedor() {
        return ID_Proveedor;
    }

    /**
     * Establece el ID del proveedor del producto.
     * 
     * @param ID_Proveedor Nuevo ID del proveedor del producto.
     */
    public void setID_Proveedor(int ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }
}
