/*
 * Este archivo está sujeto a los términos y condiciones del contrato de licencia incluido en el software que lo acompaña.
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Proveedor;

/**
 * Clase que controla las operaciones relacionadas con los proveedores en la base de datos.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class Ctrl_Proveedor {
    
    /**
     * Método para guardar un proveedor en la base de datos.
     * 
     * @param objeto El objeto Proveedor a guardar.
     * @return true si el proveedor se guarda correctamente, false en caso contrario.
     */
    public boolean guardar(Proveedor objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try{
            
            PreparedStatement consulta = cn.prepareStatement("insert into proveedores(Empresa, Telefono, Direccion) values(?,?,?)");
            consulta.setString(1, objeto.getEmpresa());
            consulta.setString(2, objeto.getTelefono());
            consulta.setString(3, objeto.getDireccion());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            cn.close();
        } catch (SQLException e){
            System.out.println("Error al guardar el proveedor " + e);
        }
        
        return respuesta;
    }
    
    /**
     * Método para verificar si un proveedor ya existe en la base de datos.
     * 
     * @param proveedor El nombre del proveedor a verificar.
     * @return true si el proveedor existe, false en caso contrario.
     */
    public boolean existeProveedor(String proveedor){
        boolean respuesta = false;
        String sql = "select empresa from proveedores where empresa = '" + proveedor + "';";
        Statement st;
        
        try{
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                respuesta = true;
            }
        } catch (SQLException e){
            System.out.println("Error al consultar proveedor: " + e);
        }
        return respuesta;
    }
    
    /**
     * Método para actualizar un proveedor en la base de datos.
     * 
     * @param objeto El objeto Proveedor con los datos actualizados.
     * @param idproveedor El ID del proveedor a actualizar.
     * @return true si la actualización se realiza correctamente, false en caso contrario.
     */
    public boolean actualizar(Proveedor objeto, int idproveedor){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try{
            
            PreparedStatement consulta = cn.prepareStatement("update proveedores set empresa=?, telefono=?, direccion=? where id_proveedor ='"+idproveedor+"'");
            consulta.setString(1, objeto.getEmpresa());
            consulta.setString(2, objeto.getTelefono());
            consulta.setString(3, objeto.getDireccion());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            cn.close();
        } catch (SQLException e){
            System.out.println("Error al actualizar el proveedor " + e);
        }
        
        return respuesta;
    }
}
