/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controlador;

import modelo.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class Ctrl_UsuarioTest {
    
    /**
     *
     */
    public Ctrl_UsuarioTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of loginUser method, of class Ctrl_Usuario.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        Usuario objeto = new Usuario();
        Ctrl_Usuario instance = new Ctrl_Usuario();
        boolean expResult = true;
        boolean result = instance.loginUser(objeto);
        assertEquals(expResult, result);
    }

    /**
     * Test of guardar method, of class Ctrl_Usuario.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        Usuario objeto = new Usuario();
        Ctrl_Usuario instance = new Ctrl_Usuario();
        boolean expResult = true;
        boolean result = instance.guardar(objeto);
        assertEquals(expResult, result);
    }

    /**
     * Test of existeCliente method, of class Ctrl_Usuario.
     */
    @Test
    public void testExisteCliente() {
        System.out.println("existeCliente");
        String usuario = "";
        Ctrl_Usuario instance = new Ctrl_Usuario();
        boolean expResult = true;
        boolean result = instance.existeCliente(usuario);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class Ctrl_Usuario.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Usuario objeto = new Usuario();
        int idusuario = 0;
        Ctrl_Usuario instance = new Ctrl_Usuario();
        boolean expResult = false;
        boolean result = instance.actualizar(objeto, idusuario);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminar method, of class Ctrl_Usuario.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int idusuario = 0;
        Ctrl_Usuario instance = new Ctrl_Usuario();
        boolean expResult = false;
        boolean result = instance.eliminar(idusuario);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerRolUsuario method, of class Ctrl_Usuario.
     */
    @Test
    public void testObtenerRolUsuario() {
        System.out.println("obtenerRolUsuario");
        Usuario usuario = new Usuario();
        Ctrl_Usuario instance = new Ctrl_Usuario();
        String expResult = "User";
        String result = instance.obtenerRolUsuario(usuario);
        assertEquals(expResult, result);
    }

    /**
     * Test of Encriptar method, of class Ctrl_Usuario.
     */
    @Test
    public void testEncriptar() {
        System.out.println("Encriptar");
        String password = "";
        Ctrl_Usuario instance = new Ctrl_Usuario();
        String expResult = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        String result = instance.Encriptar(password);
        assertEquals(expResult, result);
    }

    /**
     * Test of authenticatePassword method, of class Ctrl_Usuario.
     */
    @Test
    public void testAuthenticatePassword() {
        System.out.println("authenticatePassword");
        String inputPassword = "";
        String hashedPassword = "";
        Ctrl_Usuario instance = new Ctrl_Usuario();
        boolean expResult = false;
        boolean result = instance.authenticatePassword(inputPassword, hashedPassword);
        assertEquals(expResult, result);
    }
    
}
