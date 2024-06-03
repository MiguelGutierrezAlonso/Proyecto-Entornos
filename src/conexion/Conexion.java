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
*
* @author Miguelín
*/
public class Conexion {
 
    //conexion local
    public static Connection conectar() {
        try {
            String mydb = "jdbc:mysql://localhost:3306/Carniceria?serverTimezone=UTC&useSSL=false";
            Connection cn = DriverManager.getConnection(mydb, "root", "DAW123");
            return cn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error with the database" + e);
        }
        return null;
    }
}