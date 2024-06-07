/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
/**
 * La clase Conexion proporciona un método para establecer una conexión con una base de datos MySQL.
 * 
 * @author Miguel
 * @since 2024-06-07
 */
public class Conexion {
 
    /**
     * Establece una conexión con la base de datos MySQL especificada.
     * 
     * @return una conexión a la base de datos, o {@code null} si ocurre un error
     */
    public static Connection conectar() {
        try {
            String mydb = "jdbc:mysql://localhost:3306/Carniceria?serverTimezone=UTC&useSSL=false";
            Connection cn = DriverManager.getConnection(mydb, "root", "DAW123");
            return cn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos: " + e);
        }
        return null;
    }
}
