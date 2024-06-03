/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class Proveedor {
    private int ID_Proveedor;
    private String Empresa;
    private String Telefono;
    private String Direccion;
    
    public Proveedor(){
        this.ID_Proveedor = 0;
        this.Empresa = "";
        this.Telefono = "";
        this.Direccion = "";
    }
    
    public Proveedor(int ID_Proveedor, String Empresa, String Telefono, String Direccion){
        this.ID_Proveedor = ID_Proveedor;
        this.Empresa = Empresa;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public int getID_Proveedor() {
        return ID_Proveedor;
    }

    public void setID_Proveedor(int ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
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
