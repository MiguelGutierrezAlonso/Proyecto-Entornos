/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class Usuario {

    private int idUsuario;
    private String nidentidad;
    private String nombre;
    private String apellido;
    private String telefono;
    private String password;
    private String usuario;
    private double sueldo;
    private String direccion;
    private boolean admin; // Nuevo atributo

    public Usuario() {
        this.idUsuario = 0;
        this.nidentidad = "";
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.usuario = "";
        this.password = "";
        this.sueldo = 0;
        this.direccion = "";
        this.admin = false; // Inicialización del nuevo atributo
    }

    public Usuario(int idUsuario, String nidentidad, String nombre, String apellido, String telefono, String password, String usuario, double sueldo, String direccion, boolean administrador) {
        this.idUsuario = idUsuario;
        this.nidentidad = nidentidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.password = password;
        this.usuario = usuario;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.admin = admin; // Inicialización del nuevo atributo
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNidentidad() {
        return nidentidad;
    }

    public void setNidentidad(String nidentidad) {
        this.nidentidad = nidentidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isAdmin() { // Getter para administrador
        return admin;
    }

    public void setAdmin(boolean administrador) { // Setter para administrador
        this.admin = administrador;
    }
}
