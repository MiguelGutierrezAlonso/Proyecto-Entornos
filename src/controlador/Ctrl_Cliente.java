/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author ESTIMADO USUARIO
 */
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Cliente;

public class Ctrl_Cliente {
    
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
