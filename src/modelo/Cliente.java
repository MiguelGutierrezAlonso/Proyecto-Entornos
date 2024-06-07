/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * La clase Cliente representa a un cliente en el sistema.
 * Incluye información sobre el cliente, como su ID, nombre, apellido, teléfono y dirección.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class Cliente {
    
    private int ID_Cliente;
    private String NIdentidad;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Direccion;

    /**
     * Constructor por defecto que inicializa los atributos a valores por defecto.
     */
    public Cliente() {
        this.ID_Cliente = 0;
        this.NIdentidad = "";
        this.Nombre = "";
        this.Apellido = "";
        this.Telefono = "";
        this.Direccion = "";
    }
    
    /**
     * Constructor que inicializa los atributos con los valores proporcionados.
     * 
     * @param ID_Cliente el identificador del cliente
     * @param NIdentidad el número de identidad del cliente
     * @param Nombre el nombre del cliente
     * @param Apellido el apellido del cliente
     * @param Telefono el teléfono del cliente
     * @param Direccion la dirección del cliente
     */
    public Cliente(int ID_Cliente, String NIdentidad, String Nombre, String Apellido, String Telefono, String Direccion) {
        this.ID_Cliente = ID_Cliente;
        this.NIdentidad = NIdentidad;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    /**
     * Obtiene el identificador del cliente.
     * 
     * @return el identificador del cliente
     */
    public int getID_Cliente() {
        return ID_Cliente;
    }

    /**
     * Establece el identificador del cliente.
     * 
     * @param ID_Cliente el identificador del cliente
     */
    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    /**
     * Obtiene el número de identidad del cliente.
     * 
     * @return el número de identidad del cliente
     */
    public String getNIdentidad() {
        return NIdentidad;
    }

    /**
     * Establece el número de identidad del cliente.
     * 
     * @param NIdentidad el número de identidad del cliente
     */
    public void setNIdentidad(String NIdentidad) {
        this.NIdentidad = NIdentidad;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return el nombre del cliente
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param Nombre el nombre del cliente
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Obtiene el apellido del cliente.
     * 
     * @return el apellido del cliente
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * Establece el apellido del cliente.
     * 
     * @param Apellido el apellido del cliente
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * Obtiene el teléfono del cliente.
     * 
     * @return el teléfono del cliente
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * Establece el teléfono del cliente.
     * 
     * @param Telefono el teléfono del cliente
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * Obtiene la dirección del cliente.
     * 
     * @return la dirección del cliente
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * Establece la dirección del cliente.
     * 
     * @param Direccion la dirección del cliente
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
}
