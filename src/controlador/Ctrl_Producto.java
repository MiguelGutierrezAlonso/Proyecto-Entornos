/*
 * Este archivo está sujeto a los términos y condiciones del contrato de licencia incluido en el software que lo acompaña.
 */
package controlador;

import conexion.Conexion;
import modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase que controla las operaciones relacionadas con los productos en la base de datos.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class Ctrl_Producto {
    
    /**
     * Método para guardar un producto en la base de datos.
     * 
     * @param objeto El objeto Producto a guardar.
     * @return true si el producto se guarda correctamente, false en caso contrario.
     */
    public boolean guardar(Producto objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try{
            
            PreparedStatement consulta = cn.prepareStatement("insert into productos(Nombre, Cantidad, Precio_Compra, Precio_Venta, Categoria, ID_Proveedor) values(?,?,?,?,?,?)");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio_Compra());
            consulta.setDouble(4, objeto.getPrecio_Venta());
            consulta.setString(5, objeto.getCategoria());
            consulta.setInt(6, objeto.getID_Proveedor());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            cn.close();
        } catch (SQLException e){
            System.out.println("Error al guardar el producto " + e);
        }
        
        return respuesta;
    }
    
    /**
     * Método para verificar si un producto ya existe en la base de datos.
     * 
     * @param producto El nombre del producto a verificar.
     * @return true si el producto existe, false en caso contrario.
     */
    public boolean existeProducto(String producto){
        boolean respuesta = false;
        String sql = "select nombre from productos where nombre = '" + producto + "';";
        Statement st;
        
        try{
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                respuesta = true;
            }
        } catch (SQLException e){
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;
    }
    
    /**
     * Método para actualizar un producto en la base de datos.
     * 
     * @param objeto El objeto Producto con los datos actualizados.
     * @param idproducto El ID del producto a actualizar.
     * @return true si la actualización se realiza correctamente, false en caso contrario.
     */
    public boolean actualizar(Producto objeto, int idproducto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try{
            PreparedStatement consulta = cn.prepareStatement("UPDATE productos SET nombre=?, cantidad=?, precio_compra=?, precio_venta=?, categoria=?, id_proveedor=? WHERE id_producto=?");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio_Compra());
            consulta.setDouble(4, objeto.getPrecio_Venta());
            consulta.setString(5, objeto.getCategoria());
            consulta.setInt(6, objeto.getID_Proveedor());
            consulta.setInt(7, idproducto); // Utiliza el ID del producto proporcionado

            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }

            cn.close();
        } catch (SQLException e){
            System.out.println("Error al actualizar el producto: " + e);
        }

        return respuesta;
    }
    
    /**
     * Método para eliminar un producto de la base de datos.
     * 
     * @param idproducto El ID del producto a eliminar.
     * @return true si el producto se elimina correctamente, false en caso contrario.
     */
    public boolean eliminar(int idproducto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try{
            PreparedStatement consulta = cn.prepareStatement("delete from productos where id_producto ='"+idproducto+"'");
            consulta.executeUpdate();
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            System.out.println("Product deleted");
            cn.close();
        } catch (SQLException e){
            System.out.println("Error al eliminar el producto " + e);
        }
        
        return respuesta;
    }
    
    /**
     * Método para actualizar el stock de un producto en la base de datos.
     * 
     * @param objeto El objeto Producto con la cantidad actualizada.
     * @param idProducto El ID del producto cuyo stock se actualizará.
     * @return true si la actualización del stock se realiza correctamente, false en caso contrario.
     */
    public boolean actualizarStock(Producto objeto, int idProducto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try{
            PreparedStatement consulta = cn.prepareStatement("update productos set cantidad=? where id_producto = '" + idProducto + "'");
            consulta.setInt(1, objeto.getCantidad());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            cn.close();
        } catch(SQLException e){
            System.out.println("Error al actualizar el stock");
        }
        return respuesta;
    }
    
}
