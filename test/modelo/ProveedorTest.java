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
public class ProveedorTest {
    
    /**
     *
     */
    public ProveedorTest() {
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
     * Test of getID_Proveedor method, of class Proveedor.
     */
    @Test
    public void testGetID_Proveedor() {
        System.out.println("getID_Proveedor");
        Proveedor instance = new Proveedor();
        int expResult = 0;
        int result = instance.getID_Proveedor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setID_Proveedor method, of class Proveedor.
     */
    @Test
    public void testSetID_Proveedor() {
        System.out.println("setID_Proveedor");
        int ID_Proveedor = 0;
        Proveedor instance = new Proveedor();
        instance.setID_Proveedor(ID_Proveedor);
    }

    /**
     * Test of getEmpresa method, of class Proveedor.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmpresa method, of class Proveedor.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        String Empresa = "";
        Proveedor instance = new Proveedor();
        instance.setEmpresa(Empresa);
    }

    /**
     * Test of getTelefono method, of class Proveedor.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefono method, of class Proveedor.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String Telefono = "";
        Proveedor instance = new Proveedor();
        instance.setTelefono(Telefono);
    }

    /**
     * Test of getDireccion method, of class Proveedor.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDireccion method, of class Proveedor.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String Direccion = "";
        Proveedor instance = new Proveedor();
        instance.setDireccion(Direccion);
    }
    
}
