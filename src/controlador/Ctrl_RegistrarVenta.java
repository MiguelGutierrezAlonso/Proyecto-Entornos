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
import modelo.CabeceraVenta;
import modelo.DetalleVenta;

/**
 * Clase que controla el registro de ventas en la base de datos.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class Ctrl_RegistrarVenta {
    
    /**
     * Variable estática para almacenar el ID de la cabecera registrada.
     */
    public static int idCabeceraRegistrada;
    
    /**
     * Objeto BigDecimal utilizado para obtener el ID generado por la base de datos.
     */
    java.math.BigDecimal iDColVar;
    
    /**
     * Método para guardar la cabecera de una venta en la base de datos.
     * 
     * @param objeto El objeto CabeceraVenta a guardar.
     * @return true si la cabecera se guarda correctamente, false en caso contrario.
     */
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
    
    /**
     * Método para guardar los detalles de una venta en la base de datos.
     * 
     * @param objeto El objeto DetalleVenta a guardar.
     * @return true si los detalles se guardan correctamente, false en caso contrario.
     */
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
