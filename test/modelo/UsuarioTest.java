/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

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
public class UsuarioTest {
    
    /**
     *
     */
    public UsuarioTest() {
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
     * Test of getIdUsuario method, of class Usuario.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getIdUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdUsuario method, of class Usuario.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        int idUsuario = 0;
        Usuario instance = new Usuario();
        instance.setIdUsuario(idUsuario);
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
    }

    /**
     * Test of getApellido method, of class Usuario.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApellido method, of class Usuario.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Usuario instance = new Usuario();
        instance.setApellido(apellido);
    }

    /**
     * Test of getPassword method, of class Usuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Usuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Usuario instance = new Usuario();
        instance.setPassword(password);
    }

    /**
     * Test of getUsuario method, of class Usuario.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsuario method, of class Usuario.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        Usuario instance = new Usuario();
        instance.setUsuario(usuario);
    }

    /**
     * Test of getTelefono method, of class Usuario.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefono method, of class Usuario.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Usuario instance = new Usuario();
        instance.setTelefono(telefono);
    }

    /**
     * Test of getNidentidad method, of class Usuario.
     */
    @Test
    public void testGetNidentidad() {
        System.out.println("getNidentidad");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNidentidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNidentidad method, of class Usuario.
     */
    @Test
    public void testSetNidentidad() {
        System.out.println("setNidentidad");
        String nidentidad = "";
        Usuario instance = new Usuario();
        instance.setNidentidad(nidentidad);
    }

    /**
     * Test of getSueldo method, of class Usuario.
     */
    @Test
    public void testGetSueldo() {
        System.out.println("getSueldo");
        Usuario instance = new Usuario();
        double expResult = 0.0;
        double result = instance.getSueldo();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setSueldo method, of class Usuario.
     */
    @Test
    public void testSetSueldo() {
        System.out.println("setSueldo");
        double sueldo = 0.0;
        Usuario instance = new Usuario();
        instance.setSueldo(sueldo);
    }

    /**
     * Test of getDireccion method, of class Usuario.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDireccion method, of class Usuario.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Usuario instance = new Usuario();
        instance.setDireccion(direccion);
    }

    /**
     * Test of isAdmin method, of class Usuario.
     */
    @Test
    public void testIsAdmin() {
        System.out.println("isAdmin");
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.isAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdmin method, of class Usuario.
     */
    @Test
    public void testSetAdmin() {
        System.out.println("setAdmin");
        boolean administrador = false;
        Usuario instance = new Usuario();
        instance.setAdmin(administrador);
    }
    
}
