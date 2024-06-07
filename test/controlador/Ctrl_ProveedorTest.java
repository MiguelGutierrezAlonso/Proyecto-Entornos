/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controlador;

import modelo.Proveedor;
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
public class Ctrl_ProveedorTest {
    
    /**
     *
     */
    public Ctrl_ProveedorTest() {
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
     * Test of guardar method, of class Ctrl_Proveedor.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        Proveedor objeto = new Proveedor();
        Ctrl_Proveedor instance = new Ctrl_Proveedor();
        boolean expResult = true;
        boolean result = instance.guardar(objeto);
        assertEquals(expResult, result);
    }

    /**
     * Test of existeProveedor method, of class Ctrl_Proveedor.
     */
    @Test
    public void testExisteProveedor() {
        System.out.println("existeProveedor");
        String proveedor = "";
        Ctrl_Proveedor instance = new Ctrl_Proveedor();
        boolean expResult = true;
        boolean result = instance.existeProveedor(proveedor);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class Ctrl_Proveedor.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Proveedor objeto = new Proveedor();
        int idproveedor = 0;
        Ctrl_Proveedor instance = new Ctrl_Proveedor();
        boolean expResult = false;
        boolean result = instance.actualizar(objeto, idproveedor);
        assertEquals(expResult, result);
    }
    
}
