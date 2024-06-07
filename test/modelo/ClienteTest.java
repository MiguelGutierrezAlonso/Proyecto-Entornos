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
public class ClienteTest {
    
    /**
     *
     */
    public ClienteTest() {
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
     * Test of getID_Cliente method, of class Cliente.
     */
    @Test
    public void testGetID_Cliente() {
        System.out.println("getID_Cliente");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getID_Cliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of setID_Cliente method, of class Cliente.
     */
    @Test
    public void testSetID_Cliente() {
        System.out.println("setID_Cliente");
        int ID_Cliente = 0;
        Cliente instance = new Cliente();
        instance.setID_Cliente(ID_Cliente);
    }

    /**
     * Test of getNIdentidad method, of class Cliente.
     */
    @Test
    public void testGetNIdentidad() {
        System.out.println("getNIdentidad");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNIdentidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNIdentidad method, of class Cliente.
     */
    @Test
    public void testSetNIdentidad() {
        System.out.println("setNIdentidad");
        String NIdentidad = "";
        Cliente instance = new Cliente();
        instance.setNIdentidad(NIdentidad);
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(Nombre);
    }

    /**
     * Test of getApellido method, of class Cliente.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApellido method, of class Cliente.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String Apellido = "";
        Cliente instance = new Cliente();
        instance.setApellido(Apellido);
    }

    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefono method, of class Cliente.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String Telefono = "";
        Cliente instance = new Cliente();
        instance.setTelefono(Telefono);
    }

    /**
     * Test of getDireccion method, of class Cliente.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDireccion method, of class Cliente.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String Direccion = "";
        Cliente instance = new Cliente();
        instance.setDireccion(Direccion);
    }
    
}
