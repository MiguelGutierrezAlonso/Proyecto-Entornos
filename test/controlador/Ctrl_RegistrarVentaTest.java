/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controlador;

import modelo.CabeceraVenta;
import modelo.DetalleVenta;
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
public class Ctrl_RegistrarVentaTest {
    
    /**
     *
     */
    public Ctrl_RegistrarVentaTest() {
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
     * Test of guardar method, of class Ctrl_RegistrarVenta.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        CabeceraVenta objeto = new CabeceraVenta();
        Ctrl_RegistrarVenta instance = new Ctrl_RegistrarVenta();
        boolean expResult = false;
        boolean result = instance.guardar(objeto);
        assertEquals(expResult, result);
    }

    /**
     * Test of guardarDetalle method, of class Ctrl_RegistrarVenta.
     */
    @Test
    public void testGuardarDetalle() {
        System.out.println("guardarDetalle");
        DetalleVenta objeto = new DetalleVenta();
        Ctrl_RegistrarVenta instance = new Ctrl_RegistrarVenta();
        boolean expResult = true;
        boolean result = instance.guardarDetalle(objeto);
        assertEquals(expResult, result);
    }
    
}
