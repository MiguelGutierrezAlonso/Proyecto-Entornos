/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class Ctrl_Usuario {

    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "select usuario, password from Empleados where Usuario = '" + objeto.getUsuario() + "' and Password = '" + Encriptar(objeto.getPassword()) + "'";
        Statement st;
        
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("The user does not exist");
            JOptionPane.showMessageDialog(null, "The user does not exist");
        }

        return respuesta;
    }

    public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "insert into Empleados(NIdentidad, Nombre, Apellido, Telefono, Usuario, Password, Sueldo, Direccion, Admin) values(?,?,?,?,?,?,?,?,?)"
            );
            consulta.setString(1, objeto.getNidentidad());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getTelefono());
            consulta.setString(5, objeto.getUsuario());
            consulta.setString(6, Encriptar(objeto.getPassword()));
            consulta.setDouble(7, objeto.getSueldo());
            consulta.setString(8, objeto.getDireccion());
            consulta.setBoolean(9, objeto.isAdmin());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el usuario " + e);
        }

        return respuesta;
    }

    public boolean existeCliente(String usuario) {
        boolean respuesta = false;
        String sql = "select NIdentidad from clientes where NIdentidad = '" + usuario + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario: " + e);
        }
        return respuesta;
    }

    public boolean actualizar(Usuario objeto, int idusuario) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();

    try {
        // Obtener la contraseña actual del usuario
        String consultaContraseña = "SELECT Password FROM Empleados WHERE ID_Empleado = ?";
        PreparedStatement consultaPassword = cn.prepareStatement(consultaContraseña);
        consultaPassword.setInt(1, idusuario);
        ResultSet rs = consultaPassword.executeQuery();
        String contraseñaActual = "";
        if (rs.next()) {
            contraseñaActual = rs.getString("Password");
        }

        // Determinar si la nueva contraseña es igual a la actual (sin encriptar)
        boolean actualizarContraseña = !objeto.getPassword().equals(contraseñaActual);

        // Preparar la consulta de actualización
        PreparedStatement consulta = cn.prepareStatement(
            "UPDATE Empleados SET NIdentidad=?, Nombre=?, Apellido=?, Telefono=?, Usuario=?, Password=?, Sueldo=?, Direccion=?, Admin=? WHERE ID_Empleado = ?"
        );
        consulta.setString(1, objeto.getNidentidad());
        consulta.setString(2, objeto.getNombre());
        consulta.setString(3, objeto.getApellido());
        consulta.setString(4, objeto.getTelefono());
        consulta.setString(5, objeto.getUsuario());
        
        if (actualizarContraseña) {
            // Si la nueva contraseña es diferente, se encripta
            consulta.setString(6, Encriptar(objeto.getPassword()));
        } else {
            // Si es la misma, se deja como está
            consulta.setString(6, contraseñaActual);
        }
        
        consulta.setDouble(7, objeto.getSueldo());
        consulta.setString(8, objeto.getDireccion());
        consulta.setBoolean(9, objeto.isAdmin());
        consulta.setInt(10, idusuario);

        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }

        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al actualizar el usuario " + e);
    }

    return respuesta;
}


    public boolean eliminar(int idusuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("delete from Empleados where ID_Empleado = ?");
            consulta.setInt(1, idusuario);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            System.out.println("User deleted");
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error deleting the user" + e);
        }

        return respuesta;
    }

    public String obtenerRolUsuario(Usuario usuario) {
        String rol = "";
        Connection cn = Conexion.conectar();
        String sql = "SELECT Admin FROM Empleados WHERE Usuario = ? AND Password = ?";
        try {
            PreparedStatement consulta = cn.prepareStatement(sql);
            consulta.setString(1, usuario.getUsuario());
            consulta.setString(2, Encriptar(usuario.getPassword()));
            ResultSet rs = consulta.executeQuery();
            if (rs.next()) {
                rol = rs.getBoolean("Admin") ? "Admin" : "User";
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el rol del usuario: " + e);
        }
        return rol;
    }

    public String Encriptar(String password) {
        try {
            // Crear un objeto MessageDigest para SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Aplicar el algoritmo de hash a la contraseña
            byte[] hash = digest.digest(password.getBytes());

            // Convertir el hash byte[] a una cadena hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean authenticatePassword(String inputPassword, String hashedPassword) {
            String hash = Encriptar(inputPassword);
            return hash.equals(hashedPassword);
    }

}
