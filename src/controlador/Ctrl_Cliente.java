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
import modelo.Cliente;

/**
 * Clase que controla las operaciones relacionadas con los clientes en la base de datos.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class Ctrl_Cliente {
    
    /**
     * Método para guardar un cliente en la base de datos.
     * 
     * @param objeto El objeto Cliente a guardar.
     * @return true si el cliente se guarda correctamente, false en caso contrario.
     */
    public boolean guardar(Cliente objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try{
            
            PreparedStatement consulta = cn.prepareStatement("insert into clientes(NIdentidad, Nombre, Apellido, Telefono, Direccion) values(?,?,?,?,?)");
            consulta.setString(1, objeto.getNIdentidad());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getTelefono());
            consulta.setString(5, objeto.getDireccion());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            cn.close();
        } catch (SQLException e){
            System.out.println("Error al guardar el cliente " + e);
        }
        
        return respuesta;
    }
    
    /**
     * Método para verificar si un cliente ya existe en la base de datos.
     * 
     * @param cliente El número de identidad del cliente a verificar.
     * @return true si el cliente existe, false en caso contrario.
     */
    public boolean existeCliente(String cliente){
        boolean respuesta = false;
        String sql = "select NIdentidad from clientes where NIdentidad = '" + cliente + "';";
        Statement st;
        
        try{
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                respuesta = true;
            }
        } catch (SQLException e){
            System.out.println("Error al consultar cliente: " + e);
        }
        return respuesta;
    }
        
    /**
     * Método para actualizar un cliente en la base de datos.
     * 
     * @param objeto El objeto Cliente con los datos actualizados.
     * @param idcliente El ID del cliente a actualizar.
     * @return true si la actualización se realiza correctamente, false en caso contrario.
     */
    public boolean actualizar(Cliente objeto, int idcliente){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try{
            
            PreparedStatement consulta = cn.prepareStatement("update clientes set NIdentidad=?, Nombre=?, Apellido=?, Telefono=?, Direccion=? where id_cliente ='"+idcliente+"'");
            consulta.setString(1, objeto.getNIdentidad());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getTelefono());
            consulta.setString(5, objeto.getDireccion());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            cn.close();
        } catch (SQLException e){
            System.out.println("Error al actualizar el cliente " + e);
        }
        
        return respuesta;
    }
    
    /**
     * Método para eliminar un cliente de la base de datos.
     * 
     * @param idcliente El ID del cliente a eliminar.
     * @return true si el cliente se elimina correctamente, false en caso contrario.
     */
    public boolean eliminar(int idcliente){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try{
            PreparedStatement consulta = cn.prepareStatement("delete from clientes where id_cliente ='"+idcliente+"'");
            consulta.executeUpdate();
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            System.out.println("Client deleted");
            cn.close();
        } catch (SQLException e){
            System.out.println("Error deleting the client" + e);
        }
        
        return respuesta;
    }
    
}
