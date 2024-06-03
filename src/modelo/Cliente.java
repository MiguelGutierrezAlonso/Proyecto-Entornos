/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class Cliente {
    
    private int ID_Cliente;
    private String NIdentidad;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Direccion;

    public Cliente(){
        this.ID_Cliente = 0;
        this.NIdentidad = "";
        this.Nombre = "";
        this.Apellido = "";
        this.Telefono = "";
        this.Direccion = "";
    }
    
    public Cliente(int ID_Cliente, String NIdentidad, String Nombre, String Apellido, String Telefono, String Direccion) {
        this.ID_Cliente = ID_Cliente;
        this.NIdentidad = NIdentidad;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNIdentidad() {
        return NIdentidad;
    }

    public void setNIdentidad(String NIdentidad) {
        this.NIdentidad = NIdentidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
}
