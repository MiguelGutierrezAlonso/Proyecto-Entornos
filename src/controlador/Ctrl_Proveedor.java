/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 *
 * @author ESTIMADO USUARIO
 */
public class Ctrl_Proveedor {
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
