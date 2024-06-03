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
import modelo.CabeceraVenta;
import modelo.DetalleVenta;

public class Ctrl_RegistrarVenta {
    
    public static int idCabeceraRegistrada;
    java.math.BigDecimal iDColVar;
    
    public boolean guardar(CabeceraVenta objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try{
            
            PreparedStatement consulta = cn.prepareStatement(
            "INSERT INTO ventas (id_cliente, fecha, preciototal) VALUES (?,?,?)", 
            Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, objeto.getIdCliente());
            consulta.setString(2, objeto.getFecha());
            consulta.setDouble(3, objeto.getPrecioTotal());

            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            ResultSet rs = consulta.getGeneratedKeys();
            while(rs.next()){
                iDColVar = rs.getBigDecimal(1);
                idCabeceraRegistrada = iDColVar.intValue();
            }
            
            cn.close();
        } catch (SQLException e){
            System.out.println("Error al guardar la venta " + e);
        }
        
        return respuesta;
    }
    public boolean guardarDetalle(DetalleVenta objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try{
            
            PreparedStatement consulta = cn.prepareStatement("insert into detalles values(?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, idCabeceraRegistrada);
            consulta.setInt(3, objeto.getIdProducto());
            consulta.setInt(4, objeto.getCantidad());
            consulta.setDouble(5, objeto.getPrecioUnitario());
            consulta.setDouble(6, objeto.getPrecioTotal());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            cn.close();
        } catch (SQLException e){
            System.out.println("Error al guardar los detalles de la venta " + e);
        }
        
        return respuesta;
    }
}
