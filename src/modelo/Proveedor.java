/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package modelo;

/**
 * La clase Proveedor representa un proveedor en el sistema.
 * Incluye información sobre el ID del proveedor, empresa, teléfono y dirección.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class Proveedor {
    private int ID_Proveedor;
    private String Empresa;
    private String Telefono;
    private String Direccion;
    
    /**
     * Constructor por defecto de la clase Proveedor.
     * Inicializa todos los atributos con valores predeterminados.
     */
    public Proveedor() {
        this.ID_Proveedor = 0;
        this.Empresa = "";
        this.Telefono = "";
        this.Direccion = "";
    }
    
    /**
     * Constructor con parámetros de la clase Proveedor.
     * 
     * @param ID_Proveedor ID del proveedor.
     * @param Empresa Nombre de la empresa del proveedor.
     * @param Telefono Teléfono de contacto del proveedor.
     * @param Direccion Dirección del proveedor.
     */
    public Proveedor(int ID_Proveedor, String Empresa, String Telefono, String Direccion) {
        this.ID_Proveedor = ID_Proveedor;
        this.Empresa = Empresa;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    /**
     * Obtiene el ID del proveedor.
     * 
     * @return ID del proveedor.
     */
    public int getID_Proveedor() {
        return ID_Proveedor;
    }

    /**
     * Establece el ID del proveedor.
     * 
     * @param ID_Proveedor Nuevo ID del proveedor.
     */
    public void setID_Proveedor(int ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }

    /**
     * Obtiene el nombre de la empresa del proveedor.
     * 
     * @return Nombre de la empresa del proveedor.
     */
    public String getEmpresa() {
        return Empresa;
    }

    /**
     * Establece el nombre de la empresa del proveedor.
     * 
     * @param Empresa Nuevo nombre de la empresa del proveedor.
     */
    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    /**
     * Obtiene el teléfono de contacto del proveedor.
     * 
     * @return Teléfono de contacto del proveedor.
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * Establece el teléfono de contacto del proveedor.
     * 
     * @param Telefono Nuevo teléfono de contacto del proveedor.
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * Obtiene la dirección del proveedor.
     * 
     * @return Dirección del proveedor.
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * Establece la dirección del proveedor.
     * 
     * @param Direccion Nueva dirección del proveedor.
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
}
